package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class JDBC_Demo {

	private final static String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
	private final static String user = "postgres";
	private final static String password = "Abc@123";

	private static String createTableSQLString = "create table State (\r\n" + "	StateAbbr char(2) primary key,\r\n"
			+ "    Name varchar(50) not null\r\n" + ");";

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Client client = new Client();
		client.setGameName("dummy");
		client.setNumberOfPlayers(1234567);
		
		session.beginTransaction();
		session.saveOrUpdate(client);
		session.getTransaction().commit();

		// TODO Auto-generated method stub
		/*
		 * try { createTable(createTableSQLString); } catch (SQLException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

	/*
	 * public static void createTable(String createTableSQLString) throws
	 * SQLException {
	 * 
	 * // Connection con = getConnection();
	 * 
	 * try (Connection conn = DriverManager.getConnection(url, user, password)) {
	 * 
	 * if (conn != null) { System.out.println("Connected to the database!");
	 * 
	 * Statement statement = conn.createStatement(); ResultSet resultSet =
	 * statement.executeQuery(createTableSQLString);
	 * 
	 * } else { System.out.println("Failed to make connection!");
	 * 
	 * }
	 * 
	 * } catch (SQLException e) { System.err.format("SQL State: %s\n%s",
	 * e.getSQLState(), e.getMessage());
	 * 
	 * } catch (Exception e) { e.printStackTrace();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public static Connection getConnection() {
	 * 
	 * try (Connection conn = DriverManager.getConnection(url, user, password)) {
	 * 
	 * if (conn != null) { System.out.println("Connected to the database!"); return
	 * conn; } else { System.out.println("Failed to make connection!"); return null;
	 * }
	 * 
	 * } catch (SQLException e) { System.err.format("SQL State: %s\n%s",
	 * e.getSQLState(), e.getMessage()); return null; } catch (Exception e) {
	 * e.printStackTrace(); return null; }
	 * 
	 * }
	 */
}
