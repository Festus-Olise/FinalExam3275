package finals;

import java.sql.DriverManager;
import java.sql.SQLException;



public class Connection1 {

    public java.sql.Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");


        return DriverManager.getConnection("jdbc:mysql://localhost/savings", "root", "");
    }


}
