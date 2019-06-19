package filter;

import entity.Authentication;
import service.AuthenticationService;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.sql.SQLException;

@WebFilter(filterName = "AuthFilter")
public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String email = request.getParameter("user");
        String password = request.getParameter("pass");
         //
        Authentication authentication = new Authentication();
        AuthenticationService authenticationService = new AuthenticationService();

        try {
            authentication = authenticationService.checkUser(email,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String role = authentication.getRole();

        //
        HttpSession session = request.getSession();

        if(session!= null &&
        session.getAttribute("email") != null &&
                session.getAttribute("password") != null &&
                session.getAttribute("role") != null
        ){
            moveToMenu(request,response,role);

        }else if (authentication.getPassword().equals(password) &&
                authentication.getLogin().equals(email)
        ){
           request.getSession().setAttribute("password",authentication.getPassword());
           request.getSession().setAttribute("email",authentication.getLogin());
           request.getSession().setAttribute("role",authentication.getRole());

            moveToMenu(request,response,authentication.getRole());
        } else{
            moveToMenu(request,response,"unknown");
        }
    }
    private void moveToMenu(ServletRequest request, ServletResponse response, String role )
            throws ServletException, IOException {
    if(role.equals("admin")){
            request.getRequestDispatcher("Admin.jsp").forward(request,response);
        }else if(role.equals("user")){
            request.getRequestDispatcher("User.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
