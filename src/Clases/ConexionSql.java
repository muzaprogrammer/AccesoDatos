package Clases;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionSql {
    Connection conexion = null;
    static ConexionSql instancia = null;
    
    public ConexionSql() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=Registro;";
        conexion = DriverManager.getConnection(url, "sa", "1234");
    }
    public static ConexionSql getInstancia() throws Exception {
        if (instancia == null)
            instancia = new ConexionSql();//Creando la instancia de la clase
        return instancia;
    }
    public Connection getConexion() {
        return conexion;
    }
}
