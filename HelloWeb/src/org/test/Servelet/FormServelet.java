package org.test.Servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.test.bean.User;

/**
 * Servlet implementation class FormServelet
 */
@WebServlet("/FormServelet")
public class FormServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//not sure but have to use getSession and then getattribute to get bean object.
		User user = (User)request.getSession().getAttribute("user");
		PrintWriter out = response.getWriter();
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		out.println("First Name: "+request.getParameter("firstName"));
		out.println("Last Name: "+request.getParameter("lastName"));
		out.println("Gender: "+request.getParameter("Gender"));
		out.print("Language: ");
		String[] lang = request.getParameterValues("Language");
		if(lang != null) {
			for(int i = 0;i < lang.length; i++) {
				out.print(lang[i]+" ");
			}
		}
		else {
			out.print("No language selected");
		}
		out.println("");
		out.println("Country: "+request.getParameter("Country"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
