package web;

import domain.Lol;
import domain.Overwatch;
import domain.Psychopass;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

@WebServlet(name = "result", urlPatterns = "/result")
public class ResultServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        String tnoStr = request.getParameter("tno");
        String answer = request.getParameter("answer");
        String firstName = answer.substring(0,1);
        String midName = answer.substring(1,2);
        String lastName = answer.substring(2);
        Writer writer = response.getWriter();

        int tno = Integer.parseInt(tnoStr);

        if (tno == 1){
            Lol lol = new Lol();
            String fullName = lol.getName(firstName, midName, lastName);
            writer.write(fullName);
        }
        else if (tno == 2){
            Overwatch overwatch = new Overwatch();
            String fullName = overwatch.getName(firstName, midName, lastName);
            writer.write(fullName);
        }
        else if (tno == 3){
            Psychopass psychopass = new Psychopass();
            String fullName = psychopass.getName(firstName, midName, lastName);
            writer.write(fullName);
        }






    }
}
