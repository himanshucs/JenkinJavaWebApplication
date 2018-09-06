package com.JenkinJavaWebApplication.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.JenkinJavaWebApplication.Beans.BuildDefBean;

public class BuildDb {

	String s1=null;
    
	public String insertuser(BuildDefBean rb)
	{
		MyDb db=new MyDb();
		Connection con = db.getCon();
		try {
			Statement stmt =con.createStatement();
			stmt.executeUpdate("INSERT INTO builddefinition(buildparameter1,buildparameter2,buildparameter3,buildparameter4,buildparameter5,buildparameter6,buildparameter7,buildparameter8,buildparameter9)"
					+ " values ('"+rb.getBuildparameter1()+"','"+rb.getBuildparameter2()+"','"+rb.getBuildparameter3()+"','"+rb.getBuildparameter4()+"','"+rb.getBuildparameter5()+"','"+rb.getBuildparameter6()+"','"+rb.getBuildparameter7()+"','"+rb.getBuildparameter8()+"','"+rb.getBuildparameter9()+"')");
		    s1="Data inserted";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
	}
}
