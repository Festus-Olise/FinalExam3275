package finals;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SavingsInterfaceImpl implements SavingsInterface {

    public Connection con1;

    public SavingsInterfaceImpl(Connection con1) throws SQLException {
        this.con1 = con1;
    }

    @Override
    public void update (Customer cust) throws ClassNotFoundException, SQLException {

        String quer1 = "INSERT INTO Category VALUES (?, ?)";
        PreparedStatement query = con1.prepareStatement((quer1));

        query.setString(1, cust.getCustno());
        query.setString(2, cust.getCustname());
        query.setDouble(3, cust.getCdep());
        query.setInt(4, cust.getNyears());
        query.setString(5, cust.getSavtype());


        query.executeUpdate();

        System.out.println("One record added");
    }

    @Override
    public Customer edit(Customer cust, String custData) throws SQLException, ClassNotFoundException {
        PreparedStatement query;
        query = con1.prepareStatement("Update category set custno=?, custname=?, cdep=?, " +
                "nyears=?, savtype=? where custno=?");
        query.setString(1, cust.getCustno());
        query.setString(2, cust.getCustname());
        query.setDouble(3, cust.getCdep());
        query.setInt(4, cust.getNyears());
        query.setString(5, cust.getSavtype());
        query.setString(6, custData);

        query.executeUpdate();

        System.out.println("One record edited");

        return cust;
    }

    @Override
    public void delete(String custno) throws SQLException {
        String quer1 = "Delete from Category where custno = ?";
        PreparedStatement query = con1.prepareStatement(quer1);
        query.setString(1, custno);
        query.executeUpdate();

        System.out.println("One record deleted");

    }

    @Override
    public void display() throws ClassNotFoundException, SQLException {
        String quer1 = "Select * from category";
        PreparedStatement query = con1.prepareStatement(quer1);

        ResultSet rs = query.executeQuery();

        Customer obj1;

        //While there is data, display record
        while (rs.next()){

            obj1 = new Customer(rs.getString("custno"), rs.getString("custname"), rs.getDouble("cdep"), rs.getInt("nyears"), rs.getString("savtype"));

            System.out.println();

            System.out.print("Customer Number: " + obj1.getCustno() + " ");
            System.out.print("Customer Name:  " + obj1.getCustname() + " ");
            System.out.print("Customer Deposit:  " + obj1.getCdep() + " ");
            System.out.print("Number of years:  " + obj1.getNyears() + " ");
            System.out.print("Savings Type:  " + obj1.getSavtype() + " ");
        }


    }

}
