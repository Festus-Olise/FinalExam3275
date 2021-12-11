package finals;

import java.sql.SQLException;


public interface SavingsInterface {

    public void update (Customer cust) throws ClassNotFoundException, SQLException;

    public Customer edit(Customer cust, String custno) throws SQLException, ClassNotFoundException;

    public void delete(String custno) throws SQLException;

    public void display() throws ClassNotFoundException, SQLException;

}
