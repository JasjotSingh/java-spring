package org.test.Servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servelet1
 */
@WebServlet("/servelet1")
public class servelet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servelet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//response.getWriter().append("Served at: ").append(request.getContextPath()).append( request.getServletPath() );
		String pageName = request.getParameter("page");
		switch(pageName) {
		case "Login":
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			break;
		case "Signup":
			request.getRequestDispatcher("SignUp.jsp").forward(request, response);
			break;
		case "About":
			request.getRequestDispatcher("About.jsp").forward(request, response);
			break;
		case "JSPForm":
			request.getRequestDispatcher("Form.jsp").forward(request, response);
			break;
		case "ServeletForm":
			request.getRequestDispatcher("FormServelet.jsp").forward(request, response);
			break;
		case "setUserBean":
			request.getRequestDispatcher("SetUserBean.jsp").forward(request, response);
			break;
		case "getUserBean":
			request.getRequestDispatcher("GetUserBean.jsp").forward(request, response);
			break;
		default:
			out.println("URI messedup");
		}
	}

	

}
