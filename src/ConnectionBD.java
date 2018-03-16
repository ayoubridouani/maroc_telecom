import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionBD {
	private Connection con;
	private Statement  stmt;
	public ConnectionBD() {
		try {
			Class.forName(new String("com.mysql.jdbc.Driver"));
			con = DriverManager.getConnection(new String("jdbc:mysql://localhost/miniProjetJava"),"root","");
			stmt = con.createStatement();
		}catch(Exception error) {
		}
	}
	public int verifierDonner(String x, String y) throws SQLException {
		int a=0;
		ResultSet rs = stmt.executeQuery("select * from forfait where numTele = '" + x + "' and codeFidelio= '" + y + "'");
		while(rs.next()) {
			++a;
		}
		rs.beforeFirst();
		return a;
	}
	public int verifierDonner2(String x1, String y1,String x2, String y2,String x3, String y3) throws SQLException {
		int a=0;
		ResultSet rs = stmt.executeQuery("select * from forfait where "
				+ "typeCarte = " + "'" + x1
				+ "' and nomBank = " + "'" + y1
				+ "' and numCarte = " + "'" + x2
				+ "' and moisExperie = " + "'" + y2
				+ "' and AnneExperie = " + "'" + x3
				+ "' and codeCarte = " + "'" + y3 + "'");
		while(rs.next()) {
			a++;
		}
		rs.beforeFirst();
		return a;
	}
}