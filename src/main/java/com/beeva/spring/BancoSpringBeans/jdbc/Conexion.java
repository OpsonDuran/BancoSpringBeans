package com.beeva.spring.BancoSpringBeans.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
	
	 
	public boolean Conexion(String database,String usuario,String password){
		Connection connection = null;
	    try{
	    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database+"",""+usuario+"",""+password+"");
	    	System.out.println("Conectado");
	    	return true;
	    }catch(SQLException e){
	    	System.out.println("Fallo ls conexion DX :(");
	    	e.printStackTrace();
	    	return false;
	    }
	}
	
	
	
	
}
