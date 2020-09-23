package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TouristPlace;
import service.ListOperations;


@WebServlet(urlPatterns= {"/list"})
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	// instantiating ListOpearations class 
	ListOperations listOperations = new ListOperations();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String destination = request.getParameter("travel");
		String rank = request.getParameter("rank");
		String add = request.getParameter("add");
		
		String sortbydestination = request.getParameter("sortbydestination");
		String sortbyrank = request.getParameter("sortbyrank");
		String remove = request.getParameter("delete");
		String reset = request.getParameter("reset");
		
		System.out.println("Entering into list");
		
		
		// adding tourist place values
		TouristPlace touristPlace = new TouristPlace(name, destination, rank);
		
		
		// adding all the tourist place object into list
		List<TouristPlace> list = listOperations.add(touristPlace);
		
		if(add!=null) {
			// Call the add method in list operations and store the return list in list variable
			System.out.println("calling add equals method");
		
			request.setAttribute("bucketList", list);
			request.setAttribute("message", "user added successfully");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(remove!=null) {
			// call the remove method and store the return list in a list variable
			list = listOperations.remove(touristPlace);
			request.setAttribute("bucketList", list);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		
		if(sortbydestination!=null) {
			// call the sortByDestination method and store the value in a list variable
			list = (List<TouristPlace>)listOperations.sortByDestination(list);
			request.setAttribute("bucketList", list);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(sortbyrank!=null) {
		// call the sortByRank method and store the value in a list variable
			list = (List<TouristPlace>)listOperations.sortByRank(list);
			request.setAttribute("bucketList",list);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

		if(reset!=null) {	
			// call the clear method and store the value in a list variable
			list = (List<TouristPlace>)listOperations.reset(list);
			request.setAttribute("bucketList",list);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}

	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}