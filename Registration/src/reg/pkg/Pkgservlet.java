package reg.pkg;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pkgservlet
 */
@WebServlet("/Pkg")
public class Pkgservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pkgservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	String date,dispatcher=null;
	int weight;
	date=request.getParameter("date");
	weight=Integer.parseInt(request.getParameter("weight"));

	System.out.println("date :" +date);
	System.out.println("weight :" +weight);
	if(validate(date,weight)){
	dispatcher=("final.jsp");
	}
	else{
		dispatcher=("error2.jsp");
	}
	RequestDispatcher reqdisp=request.getRequestDispatcher(dispatcher);
	reqdisp.forward(request, response);
	}
	
	
	boolean validate(String date,int weight)
	{ // dd/mm/yy string split fn.. 
		boolean bool=true;
		String []parts=date.split("/");
		int part1= Integer.parseInt(parts[0]);
		int part2=Integer.parseInt(parts[1]);
		int part3=Integer.parseInt(parts[2]);
		
		@SuppressWarnings("deprecation")
		Date d1 = new Date(part3-1900,part2-1,part1);
		Date d2 = new Date();
		System.out.println(d1);
	    System.out.println(d2);
		
	if((d1!=null&&(d1.compareTo(d2)<0))){

		System.out.println("Not a valid date");	
		bool=false;
		}
	
	else{
		System.out.println("valid date");
		 bool=true;		
	}
	

	return bool;
	}
	
}
