package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import util.AccountService;

/**
 *
 * @author 843876
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //HttpSession session = request.getSession();
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //String username = request.getParameter("username");
        //String password = request.getParameter("password");
        //AccountService AS = new AccountService();
        //if (AS.login(username, password) == null){
        //    request.setAttribute("message", "Incorrect login");
        //}
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request, response);
        //response.sendRedirect("Home");

    }
}
