package br.unincor.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private String SERVER;
	private String PORT;
	private String DB_NAME;
	private String USER;
	private String PASSWORD;
	
	public Connection CON;
	
	public DBConnection() {
		super();
		SERVER = "192.168.56.101";
		PORT = "3306";
		DB_NAME = "va3_poo";
		USER = "aluno";
		PASSWORD = "aluno2017";
		CON = null;
	}
	
	public void openDBConnection(){
		try {
			CON=DriverManager.getConnection(getUrl());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void closeDBConnection(){
		try {
			if(CON!=null){
				CON.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private String getUrl(){
		return("jdbc:mysql://"+SERVER+":"+PORT+"/"+DB_NAME+"?useSSL=false&user="+USER+"&"+"password="+PASSWORD);
	}

}
