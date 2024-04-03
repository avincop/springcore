import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainSession extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		HttpSession session = req.getSession();
		String fname1=req.getParameter("fname");
		String lname1=req.getParameter("lname");

		//pw.println("session id-" + session.getId());
		session.setAttribute("one", fname1);
		session.setAttribute("two", lname1);
		pw.write(" <a href= 'MainSession2'>servlet2</a>");
		
		
		
		
		
		
		
       /// session.invalidate();
       // pw.println("<br>");
		//HttpSession session1 = req.getSession(false);
		//pw.println(session);

//		pw.println("session1 id-" + session1.getId());
//		pw.println("<br>");
//		pw.println(session.getId()==session1.getId());
	}
}
