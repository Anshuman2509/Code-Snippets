package com.auto;

import java.sql.SQLException;
import java.util.List;

import com.auto.dao.DatabaseConnections;
import com.auto.model.Car;

public class ApiTransferMain {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			List<Car> cars= DatabaseConnections.getOracleConnection();
			DatabaseConnections.truncateSQLServer();
			DatabaseConnections.getSQLServerConnection(cars);
			DatabaseConnections.truncateMYSQL();
			DatabaseConnections.getMYSQLConnection(cars);
		}catch (SQLException  e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Completed");
		
	}

}
