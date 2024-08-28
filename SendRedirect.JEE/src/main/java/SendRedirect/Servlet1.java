package SendRedirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		HttpSession session = req.getSession();
		String email = req.getParameter("email");
		session.setAttribute("name", name); //Storing the data inside the session object, so i can use that data wherever i want.
		session.setAttribute("email", email);
		resp.sendRedirect("callingServlet2");
		
		
		

	}

}
