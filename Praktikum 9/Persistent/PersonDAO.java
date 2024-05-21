import java.sql.SQLException;

public interface PersonDAO {
    void savePerson(Person person) throws SQLException, ClassNotFoundException;
}
