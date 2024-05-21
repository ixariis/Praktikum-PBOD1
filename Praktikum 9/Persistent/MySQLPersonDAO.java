import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person person) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3307/pbo";
        String user = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO person (name) VALUES (?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, person.getName());
                stmt.executeUpdate();
            }
        }
    }
}
