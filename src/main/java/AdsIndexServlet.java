import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/ads")
public class AdsIndexServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Ads adsDao = DaoFactory.getAdsDao();

        List<Ad> ads = adsDao.all();

//        List<Ad> ads = Arrays.asList(
////                new Ad(1, 1,  "Test Ad 1", "It's the test Ad 1" ),
////                new Ad(2, 1,  "Test Ad 2", "It's the test Ad 1" ),
////                new Ad(3, 1, "Test Ad 3", "It's the test Ad 1" )
////                );
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}
