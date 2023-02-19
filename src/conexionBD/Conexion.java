package conexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection connection = null;

    //Metodo de conexion a la DB
    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdhotel","root","");
            if(connection != null){ System.out.println("Conexion exitosa");}

        } catch (SQLException e) {
            System.err.println("Error en la connection" + e);
        }
        return connection;
    }
}