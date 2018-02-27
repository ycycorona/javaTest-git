

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (
    name = "OtherTypeContent",
    urlPatterns = {"/other-type-content"},
    loadOnStartup = 1
)

public class OtherTypeContent extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        System.out.println("请求OtherTypeContent");

        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        PrintWriter write = response.getWriter();
        write.append("{'name': 'ycy'}");

    }

}