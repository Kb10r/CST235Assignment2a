package assignment;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    @Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("************* this is the init***********");	}

	/**
	 * @see Servlet#destroy()
	 */
    @Override
	public void destroy() {
    	System.out.println("|||||||||||Destroy ||||||||||||");
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    // http://localhost:8080/assignment2a/TestServlet?firstname=Connor&lastname=Rolstad
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("************** THIS IS GET **************");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		
		if(firstname == null || firstname.isEmpty() || lastname == null || lastname.isEmpty()) {
			
		} else {
			request.setAttribute("firstname", firstname);
			request.setAttribute("lastname", lastname);
			request.getRequestDispatcher("TestResponse.jsp").forward(request, response);
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
