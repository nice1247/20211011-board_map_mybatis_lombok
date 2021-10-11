package co.nero.prj.comm;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataSource {
	private static DataSource dataSource = new DataSource();

	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password;

	private DataSource() {config();			//singleton class 로 외부에서 생성자를 만들지 못하게
	}

	public static DataSource getInstance() {
		return dataSource;
	}

	private void config() {
		Properties properties = new Properties();
		//getClass - class 객체를 가져오겠다.
		String resource = getClass().getResource("/db.properties").getPath(); // 이 클래스에 /db~를 가져오겠다. getpath는 String값으로 변환
		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
//		config();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
