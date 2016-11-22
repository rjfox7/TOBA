package toba.data;
package murach.data;

import toba.user.User;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.apache.tomcat.jni.Socket.pool;

public class UserDB {

    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatements ps = null;
        
        String query
                = "INSERT INTO User (Email, FirstName, LastName) "
                + "VALUES (?, ?, ?)";
        
            try {
                ps = (PreparedStatements) connection.prepareStatement(query);
            } catch (SQLException ex) {
                Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps.setString(1, user.getemail());
            ps.setString(2, user.getfirstName());
            ps.setString(3, user.getlastName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
    }
}

