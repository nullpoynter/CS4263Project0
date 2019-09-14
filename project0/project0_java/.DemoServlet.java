package myapp;
import number.randomNum;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* This class implements child class and throws output to the index.html file
*  in json format.
*/
public class DemoServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {

      String randomNumber = randomNum.num();                            //implements child randomNum class returned type to new variable
    resp.setContentType("application/json");                            //sets the output format type to be json
    resp.getWriter().println("{ \"returnNum\": "+randomNumber+" }");    //returns the object
  }

