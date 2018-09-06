package com.JenkinJavaWebApplication.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JenkinJavaWebApplication.Beans.BuildDefBean;
import com.JenkinJavaWebApplication.Model.BuildDb;

/**
 * Servlet implementation class BuildDef
 */
public class BuildDef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuildDef() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	 	
			
			String buildparameter1 = request.getParameter("Build parameter1");
			String buildparameter2 = request.getParameter("Build parameter2");
			String buildparameter3 = request.getParameter("Build parameter3");
			String buildparameter4 = request.getParameter("Build parameter4");
			String buildparameter5 = request.getParameter("Build parameter5");
			String buildparameter6 = request.getParameter("Build parameter6");
			String buildparameter7 = request.getParameter("Build parameter7");
			String buildparameter8 = request.getParameter("Build parameter8");
			String buildparameter9 = request.getParameter("Build parameter9");
			
			BuildDefBean rb=new BuildDefBean();
			rb.setBuildparameter1(buildparameter1);
			rb.setBuildparameter2(buildparameter2);
			rb.setBuildparameter3(buildparameter3);
			rb.setBuildparameter4(buildparameter4);
			rb.setBuildparameter5(buildparameter5);
			rb.setBuildparameter6(buildparameter6);
			rb.setBuildparameter7(buildparameter7);
			rb.setBuildparameter8(buildparameter8);
			rb.setBuildparameter9(buildparameter9);
			BuildDb ud=new BuildDb();
			String s1=  ud.insertuser(rb);
		 System.out.println(s1);	

		
	}

}
