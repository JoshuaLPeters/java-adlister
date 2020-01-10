import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BonusSimpleFormServlet", urlPatterns = "/order-form")
public class BonusSimpleFormServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setHeader("content-type","text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Order Form</h1>");
        writer.println("<form method=\"POST\" action=\"/java_adlister_war_exploded/order-summary\" >\n" +
                "    Product: <input type=\"text\" name=\"product\"/><br/>\n" +
                "    Quantity: <input type=\"text\" name=\"quantity\"/><br/>\n" +
                "    <input type=\"submit\" />\n" +
                "</form>");
    }
}