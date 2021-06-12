package com.auto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.auto.model.Car;

public class DatabaseConnections {
	public static List<Car> getOracleConnection() throws SQLException, ClassNotFoundException {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1","rough","password");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from automobile");
		List<Car> cars=new ArrayList<Car>();
		while(resultSet.next()) {
			Car car=new Car();
			car.setId(resultSet.getInt(1));
			car.setName(resultSet.getString(2));
			car.setCountry(resultSet.getString(3));
			car.setContinent(resultSet.getString(4));
			car.setParent(resultSet.getString(5));
			car.setType(resultSet.getString(6));
			car.setPrice(resultSet.getInt(7));
			cars.add(car);
		}
		connection.close();
		return cars;
	}
	
	public static void getSQLServerConnection(List<Car> cars) throws SQLException, ClassNotFoundException {
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection=DriverManager.getConnection("jdbc:sqlserver://LAPTOP-N7KRSFO3;databaseName=rough;integratedSecurity=true");
		int counter=0;
		PreparedStatement preparedStatement=connection.prepareStatement("insert into dbo.automobile values(?,?,?,?,?,?,?)");
		for(counter=0;counter<cars.size();counter++) {
			preparedStatement.setInt(1, cars.get(counter).getId());
			preparedStatement.setString(2, cars.get(counter).getName());
			preparedStatement.setString(3, cars.get(counter).getCountry());
			preparedStatement.setString(4, cars.get(counter).getContinent());
			preparedStatement.setString(5, cars.get(counter).getParent());
			preparedStatement.setString(6, cars.get(counter).getType());
			preparedStatement.setInt(7, cars.get(counter).getPrice());
			preparedStatement.executeUpdate();
		}
		preparedStatement.close();
		connection.close();
		System.out.println("No of records inserted in Microsoft SQL Server automobile table "+counter);
	}
	
	public static void getMYSQLConnection(List<Car> cars) throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/rough?useSSL=false","root","password");
		int counter=0;
		PreparedStatement preparedStatement=connection.prepareStatement("insert into automobile values(?,?,?,?,?,?,?)");
		for(counter=0;counter<cars.size();counter++) {
			preparedStatement.setInt(1, cars.get(counter).getId());
			preparedStatement.setString(2, cars.get(counter).getName());
			preparedStatement.setString(3, cars.get(counter).getCountry());
			preparedStatement.setString(4, cars.get(counter).getContinent());
			preparedStatement.setString(5, cars.get(counter).getParent());
			preparedStatement.setString(6, cars.get(counter).getType());
			preparedStatement.setInt(7, cars.get(counter).getPrice());
			preparedStatement.executeUpdate();
		}
		preparedStatement.close();
		connection.close();
		System.out.println("No of records inserted in MYSQL automobile table "+counter);
	}
	public static void truncateSQLServer() throws SQLException {
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection=DriverManager.getConnection("jdbc:sqlserver://LAPTOP-N7KRSFO3;databaseName=rough;integratedSecurity=true");
		PreparedStatement preparedStatement=connection.prepareStatement("truncate table dbo.automobile");
		preparedStatement.executeUpdate();
		preparedStatement.close();
		connection.close();
	}
	
	public static void truncateMYSQL() throws SQLException {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/rough?useSSL=false","root","password");
	    PreparedStatement preparedStatement=connection.prepareStatement("truncate table automobile");
	    preparedStatement.executeUpdate();
	    preparedStatement.close();
	    connection.close();
		
	}
}
