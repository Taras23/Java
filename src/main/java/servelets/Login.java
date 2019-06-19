package servelets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

 //   String name = request.getParameter("user");
  //  String pass = request.getParameter("pass");
  //  if(name.equals("admin") && pass.equals("pass")){
  //      response.sendRedirect("User.jsp");
 //   }else{
  //      response.sendRedirect("index.jsp");
   // }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("password");
        session.removeAttribute("login");
        session.removeAttribute("role");

        response.sendRedirect("index.jsp");

    }
}
