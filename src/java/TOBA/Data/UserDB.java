package TOBA.Data;
import java.sql.*;

import TOBA.Data.UserDB;
import TOBA.Business.User;


public class UserDB {

    public static void insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query
                = "INSERT INTO User (firstName, lastName, phone, address, "
                + "address, address2, city, st, zip, email, username, password"
                + "VALUES (?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, "
                + "?, ?, ?)";
                         
        try {
            ps.setString(1, user.getfirstName());
            ps.setString(2, user.getlastName());
            ps.setString(3, user.getphone());
            ps.setString(4, user.getaddress());
            ps.setString(5, user.getaddress2());
            ps.setString(6, user.getcity());
            ps.setString(7, user.getst());
            ps.setString(8, user.getzip());
            ps.setString(9, user.getemail());
            ps.setString(10, user.getusername());
            ps.setString(11, user.getpassword());
            
            ps.executeUpdate();
            
            //Get the user ID from the last INSERT statement.
            String identityQuery = "SELECT @@IDENTITY AS IDENTITY";
            Statement identityStatement = connection.createStatement();
            ResultSet identityResultSet = identityStatement.executeQuery(identityQuery);
            identityResultSet.next();
            String userID = identityResultSet.getString("IDENTITY");
            identityResultSet.close();
            identityStatement.close();

            // Set the user ID in the User object
            user.setId(userID);
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static void update(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "UPDATE User SET "
                + "firstName = ?, "
                + "lastName = ?, "
                + "phone = ?, "
                + "address = ?, "
                + "address2 = ?, "
                + "city = ?, "
                + "st = ?, "
                + "zip = ?, "
                + "username = ?, "
                + "password = ?, "
                + "WHERE email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(13, user.getfirstName());
            ps.setString(13, user.getlastName());
            ps.setString(13, user.getphone());
            ps.setString(13, user.getaddress());
            ps.setString(13, user.getaddress2());
            ps.setString(13, user.getcity());
            ps.setString(13, user.getst());
            ps.setString(13, user.getzip());
            ps.setString(13, user.getemail());
            ps.setString(13, user.getusername());
            ps.setString(13, user.getpassword());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static User selectUser(String email) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM User "
                + "WHERE Email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            User user = null;
            
            if (rs.next()) {
                user = new User();
                user.setId(rs.getString("UserID"));
                user.setfirstName(rs.getString("firstName"));
                user.setlastName(rs.getString("lastName"));
                user.setphone(rs.getString("phone"));
                user.setaddress(rs.getString("address"));
                user.setaddress2(rs.getString("address2"));
                user.setcity(rs.getString("city"));
                user.setst(rs.getString("st"));
                user.setzip(rs.getString("zip"));
                user.setemail(rs.getString("email"));
                user.setusername(rs.getString("username"));
                user.setpassword(rs.getString("password"));
            }
            return user;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static boolean emailExists(String email) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT email FROM User "
                + "WHERE email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }    
}