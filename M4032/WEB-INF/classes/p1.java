import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  

public class p1 extends HttpServlet{  
    private String message;
    public void init() throws ServletException{
        message="Hello World";
    }

public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html"); 

PrintWriter out=res.getWriter();
  

out.println("<h1>" + message + "<h1>");    
}  
public void destroy(){

}  
}  