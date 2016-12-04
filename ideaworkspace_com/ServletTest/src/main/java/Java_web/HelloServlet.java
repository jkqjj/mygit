package Java_web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>java</title></head>");
        out.println("<body>");
        out.println("<h1>hello world</h1>");
        out.println("</body>");
        out.println("</html");
    }
}
