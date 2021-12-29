package derivative;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler extends DataBaseConnection{
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException,SQLException{
        String connectionString = "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;

        dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbConnection;
    }

    public void writeDataToDB(String custName,String sellerName,String itemName,double cost){

        String insert_query = "INSERT INTO " + Const.USER_TABLE+"("+ Const.USER_CUSTNAME+","+Const.USER_SELLERNAME
               + ","+Const.USER_ITEMNAME+","+Const.USER_COST+")"+"VALUES(?,?,?,?)";



        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert_query);
            prSt.setString(1,custName);
            prSt.setString(2,sellerName);
            prSt.setString(3,itemName);
            prSt.setDouble(4, cost);

            prSt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
