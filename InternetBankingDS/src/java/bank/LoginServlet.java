package bank;

import bank.database.DatabaseOperations;
import bank.model.Account;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    boolean pass_wrong = false;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ac_no = request.getParameter("account_number");
        String password = request.getParameter("password");

        System.out.println(password);

        try {
            DatabaseOperations operations = new DatabaseOperations();

            Account acc = operations.checkAccount(ac_no, password);
            if (acc == null) {
                request.setAttribute("passCorrect", "No");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            } else {
                // Setting Session variable for current User
                HttpSession session = request.getSession();
                session.setAttribute("userDetails", acc);

                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
