package SendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {
	@Override
	protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		String name = (String)session.getAttribute("name");
		String email = (String)session.getAttribute("email");


		out.println("Hello "+ name + " your name collected from servlet one and printed in servlet2.");
		out.println("Your email is "+email+" from servlet2");
		
	}
}
