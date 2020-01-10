import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BonusListenPostServlet", urlPatterns = "/order-summary")
public class BonusListenPostServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setHeader("content-type","text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Order Summary</h1>");
        String productOne = request.getParameter("product");
        writer.println(productOne);

    }
}
