import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class toRegisterServletPage extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("register.jsp").forward(request, response);
            //response.sendRedirect("register.jsp");
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

}
