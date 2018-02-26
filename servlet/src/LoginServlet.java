import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class LoginServlet extends HttpServlet {

    public void init(ServletConfig config){
        System.out.println("init of Hello Servlet");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        Enumeration enu=request.getParameterNames();

        while(enu.hasMoreElements())     {
            String parName=(String)enu.nextElement();
            System.out.println(parName);
        }

        String[] paraValues = request.getParameterValues("name");


        System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
        System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
        System.out.println("请求行中的参数部分: " + request.getQueryString());
        System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
        System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
        System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
        System.out.println("服务器的IP地址: " + request.getLocalAddr());
        System.out.println("服务器的主机名: " + request.getLocalName());
        System.out.println("得到客户机请求方式: " + request.getMethod());

        String html = null;

        System.out.println("name:" + name);
        System.out.println("password:" + password);

        if ("admin".equals(name) && "123".equals(password)){
            //html = "<div style='color:green'>login success</div>";
            //服务端跳转
            request.getRequestDispatcher("login_success.jsp").forward(request, response);
        } else {
            //html = "<div style='color:red'>login fail</div>";
            //浏览器跳转
            response.sendRedirect("login_fail.jsp");
        }

        /*PrintWriter pw = response.getWriter();
        response.setContentType("text/html; charset=UTF-8");
        pw.println(html);*/
    }
}