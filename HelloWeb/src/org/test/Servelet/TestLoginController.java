package org.test.Servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.test.bean.User;

/**
 * Servlet implementation class TestLoginController
 */
@WebServlet("/TestLoginController")
public class TestLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("userName").equals("User") && request.getParameter("password").equals("pass")) {
			request.getSession().invalidate();
			HttpSession session = request.getSession(true);
			request.getSession().setAttribute("user", new User());
			User user = (User)request.getSession().getAttribute("user");
			user.setFirstName("Jasjot");
			user.setLastName("Singh");
			session.setMaxInactiveInterval(0);
			response.sendRedirect("demo.jsp");
		}
		else {
			response.sendRedirect("Login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
