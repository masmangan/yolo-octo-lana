package pindorama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCTest {

	// http://jdbc.postgresql.org/documentation/head/connect.html
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("pindorama.properties"));
		String url = props.getProperty("url");
			
		Connection db = DriverManager.getConnection(url, props);
		System.out.println("Conectado!");
	}
}
