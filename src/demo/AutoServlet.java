package demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 143135s on 11/26/2015.
 */
@WebServlet(name = "AutoServlet", urlPatterns = "/auto")
public class AutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String term = request.getParameter("term");
            BookDAO dao = new BookDAO();
            List<Book> list = dao.searchBooks(term);
            Gson gson = new GsonBuilder().create();
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.println(gson.toJson(list));
            out.close();


    }
}
