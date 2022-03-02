package sql_JDBC;

import java.sql.*;

public class SQL_Commands {

    /*
    * 1. create connection
    * 2. create statement / query
    * 3. Execute statement / query
    * 4. Store the data in ResultSet
    * 5. close connection
    * */
    public static void main(String[] args) throws SQLException {

        // 1.
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store","root","Java1010010[]");

        // 2.
        Statement statement = con.createStatement();

        String query = "select customer_id, first_name, city from customers order by customer_id;";

        // 3,4
        ResultSet rs = statement.executeQuery(query);                                 // it will execute the command and store in to the RS

        while (rs.next()){                                                            // if we do not know the number of data, we can use while loop
            int id = rs.getInt("customer_id");
            String name = rs.getString("first_name");                     // getInt if we are getting num of row / columns || get.String if we are getting string / char
            String city = rs.getString("city");

            System.out.println("-> "+ id+" "+name+" "+city);                // instead of printing we can also save it on the Map
        }

        // 5.
        con.close();

        System.out.println("\nQuery Executed....!");



    }
}
