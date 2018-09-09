package src.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "nameMake,", urlPatterns = "/nameMake")
public class NameActionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tnoStr = request.getParameter("tno");
        System.out.println(tnoStr);
        int tno = Integer.parseInt(tnoStr);
        response.sendRedirect("test" + tno + ".html");

    }
}
