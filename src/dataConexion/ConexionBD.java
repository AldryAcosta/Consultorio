
package dataConexion;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;


public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/AgendamientoCitas";
    private static final String USER = "root";
    private static final String PASSWORD = "3002366628as";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void conectar() {
        try {
            // Establecer la conexión a la base de datos
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    
    public ArrayList<String> obtenerNombresMedicosPorEspecialidad(int especialidadId) throws SQLException {
        ArrayList<String> nombresMedicos = new ArrayList<>();
        String query = "SELECT nombre FROM medico WHERE especialidad_id = ?";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, especialidadId);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                nombresMedicos.add(resultSet.getString("nombre"));
            }
        }
        
        return nombresMedicos;
    }
    
    public int obtenerIdMedico(String nombreMedico) throws SQLException {
        int medicoId = -1;
        String query = "SELECT id FROM medico WHERE nombre = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nombreMedico);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                medicoId = resultSet.getInt("id");
            }
        }

        return medicoId;
    }
    
    public ArrayList<String> obtenerHorariosDisponiblesPorMedico(int medicoId) throws SQLException {
        ArrayList<String> horariosDisponibles = new ArrayList<>();

        String query = "SELECT hora FROM horario WHERE medico_id = ? AND disponible = true";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, medicoId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String hora = resultSet.getString("hora");
                horariosDisponibles.add(hora);
            }
        }

        return horariosDisponibles;
    }
    
    public ArrayList<String> obtenerDireccionesIPS(String epsNombre) {
        ArrayList<String> direcciones = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT d.direccion FROM eps_ips ei JOIN direccionips d ON ei.direccionips_id = d.id JOIN eps e ON ei.eps_id = e.id WHERE e.nombre_eps = ?")) {

            stmt.setString(1, epsNombre);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                direcciones.add(rs.getString("direccion"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return direcciones;
    }
}
