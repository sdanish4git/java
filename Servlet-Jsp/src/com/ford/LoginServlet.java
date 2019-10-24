package com.ford;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("uname");
		String password=request.getParameter("upass");
		try {
		Connection con=DBConnection.getConnection();
		Statement st=con.createStatement();
		 
		 String query="SELECT * FROM USER";
		 
		 ResultSet rs=st.executeQuery(query);
		 request.setAttribute("UserList", rs);
		 RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		 rd.forward(request, response);
		 /*
		 while(rs.next() ) {
			 System.out.println(rs.getString(1)+"    "+rs.getString(2));
		 }
		 
		 
		if(userName.equals("shakil") && password.equals("123")) {
		response.getWriter().append("You are a valid user");
		}else {
			response.getWriter().append("Invalid user");	
		}
		
		rs.close();
		con.close();*/
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//System.out.println("This is Post method called");
	}

}
