package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import util.AccountService;
import util.User;

/**
 *
 * @author 843876
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String invalidate = request.getParameter("invalidate");//is null 
        if ((invalidate != null) && invalidate.equals("true")) {
            session.invalidate();
            request.setAttribute("message", "Logout Successful");
        }

        if (session.getId() != null) {
            response.sendRedirect("Home");
            return;
        }

        //if(user.getPassword().equal("null"));
        //getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        // response.sendRedirect("Home");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        request.setAttribute("username", username);
        request.setAttribute("password", password);
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        AccountService AS = new AccountService();
        if (AS.login(username, password) == null) {
            request.setAttribute("message", "Incorrect login");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request, response);

        } else {// User object, String password attribute is "null"
            session.setAttribute("username", username);
            //getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
            response.sendRedirect("Home");
        }

    }
}
