/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazPrincipal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import Escudero.Alert;
import dataConexion.ConexionBD;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import login.FrmRegistrer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class FrmRegistrarPersona extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrarPersona
     */
   
    private FrmInterfazPrincipal principal;
    private ConexionBD conexion;
    
    
    
    
    ArrayList<Persona>medico;
    
    private String nombreYapellido;
    private String documento;
    private Date fechaNacimiento;
    private String genero;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String Afiliacion;
    private String id;
    private String consultorio;
    private String especialidad;
    private String lugar;
    
    
    public FrmRegistrarPersona(FrmInterfazPrincipal interfazPrincipal) {
        initComponents();
        this.principal = interfazPrincipal;
        this.setLocationRelativeTo(this);
        medico = new ArrayList();
        conexion = new ConexionBD();
        conexion.conectar();
        
        llenarComboBoxGenero();
        llenarComboBoxAfiliados();
        
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegresarActionPerformed(evt);
        }
    });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbPaciente1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        dtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        comboGenero = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrarPaciente = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        comboAfiliados = new javax.swing.JComboBox<>();
        btnAgendarCitaPorRegistro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 106));

        lbPaciente1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbPaciente1.setText("Paciente");
        lbPaciente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(lbPaciente1)
                .addGap(304, 304, 304))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lbPaciente1)
                .addContainerGap())
        );

        txtNombre.setBackground(new java.awt.Color(242, 242, 242));
        txtNombre.setAutoscrolls(false);
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre y Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtDocumento.setBackground(new java.awt.Color(242, 242, 242));
        txtDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtDireccion.setBackground(new java.awt.Color(242, 242, 242));
        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtTelefono.setBackground(new java.awt.Color(242, 242, 242));
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        dtFechaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        comboGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtCorreo.setBackground(new java.awt.Color(242, 242, 242));
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo Electronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        btnRegistrarPaciente.setText("Registrar Paciente");
        btnRegistrarPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPacienteActionPerformed(evt);
            }
        });

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        comboAfiliados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboAfiliados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Afiliado a:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        btnAgendarCitaPorRegistro.setText("Agendar Cita");
        btnAgendarCitaPorRegistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgendarCitaPorRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCitaPorRegistroActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCorreo))
                .addGap(235, 235, 235))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnRegresar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(txtDireccion)
                    .addComponent(txtDocumento)
                    .addComponent(txtNombre))
                .addGap(72, 72, 72)
                .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnRegistrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnAgendarCitaPorRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnRegresar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendarCitaPorRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 258;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void btnRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteActionPerformed
        // Obtener los datos ingresados por el usuario desde los componentes
        String nombre = txtNombre.getText().trim();
        String documento = txtDocumento.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String correo = txtCorreo.getText().trim();
        Date fechaNacimiento = dtFechaNacimiento.getDate();
        String genero = comboGenero.getSelectedItem().toString();
        String afiliacion = comboAfiliados.getSelectedItem().toString();

        // Validar que todos los campos obligatorios estén completos
        if (nombre.isEmpty() || documento.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || correo.isEmpty() || fechaNacimiento == null || genero.isEmpty() || afiliacion.isEmpty()) {
            Alert.showMessageError("Error", "Por favor complete todos los campos.");
            return;
        }

        // Validar que los datos ingresados sean válidos
        if (!esNombreValido(nombre)) {
            Alert.showMessageError("Error", "Ingrese un nombre válido (solo letras).");
            return;
        }

        if (!esDocumentoValido(documento)) {
            Alert.showMessageError("Error", "Ingrese un documento válido (solo números).");
            return;
        }

        if (!esTelefonoValido(telefono)) {
            Alert.showMessageError("Error", "Ingrese un teléfono válido.");
            return;
        }

        if (!esCorreoValido(correo)) {
            Alert.showMessageError("Error", "Ingrese un correo electrónico válido.");
            return;
        }

        if (!esFechaNacimientoValida(fechaNacimiento)) {
            Alert.showMessageError("Error", "La fecha de nacimiento no es válida.");
            return;
        }

        // Proceder con la inserción en la base de datos
        guardarPacienteEnBaseDeDatos(nombre, documento, direccion, telefono, correo, fechaNacimiento, genero, afiliacion);
        
    }//GEN-LAST:event_btnRegistrarPacienteActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtNombre.setText("");
        txtDocumento.setText("");
        dtFechaNacimiento.setDate(null);
        txtDireccion.setText("");
        txtTelefono.setText("");
        comboGenero.setSelectedIndex(0);
        comboAfiliados.setSelectedIndex(0);
        txtCorreo.setText("");
        
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnAgendarCitaPorRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaPorRegistroActionPerformed
        FrmAgendamiento frmAgendamiento = new FrmAgendamiento(this.principal);
        frmAgendamiento.setVisible(true);
        frmAgendamiento.pack();
        frmAgendamiento.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAgendarCitaPorRegistroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmInterfazPrincipal frmInterfazPrincipal = new FrmInterfazPrincipal();
        frmInterfazPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    
    private void llenarComboBoxGenero() {
        // Limpia el comboGenero
        comboGenero.removeAllItems();

        ConexionBD conexion = new ConexionBD();
        conexion.conectar(); // Establece la conexión con la base de datos

        try {
            // Consulta SQL para obtener los nombres de género
            String query = "SELECT nombre_genero FROM genero;";

            // Ejecutar la consulta y obtener resultados
            ResultSet rs = conexion.getConnection().createStatement().executeQuery(query);

            // Recorrer los resultados y agregarlos al comboGenero
            while (rs.next()) {
                String nombreGenero = rs.getString("nombre_genero");
                comboGenero.addItem(nombreGenero);
            }

            rs.close(); // Cierra el ResultSet
        } catch (SQLException e) {
            e.printStackTrace();
            Alert.showMessageError("Error", "Error al obtener géneros desde la base de datos.");
        } finally {
            conexion.desconectar(); // Cierra la conexión
        }
    }
    
    private void llenarComboBoxAfiliados() {
        // Limpia el comboAfiliados
        comboAfiliados.removeAllItems();

        ConexionBD conexion = new ConexionBD();
        conexion.conectar(); // Establece la conexión con la base de datos

        try {
            // Consulta SQL para obtener los nombres de EPS
            String query = "SELECT nombre_eps FROM eps;";

            // Ejecutar la consulta y obtener resultados
            ResultSet rs = conexion.getConnection().createStatement().executeQuery(query);

            // Recorrer los resultados y agregarlos al comboAfiliados
            while (rs.next()) {
                String nombreEps = rs.getString("nombre_eps");
                comboAfiliados.addItem(nombreEps);
            }

            rs.close(); // Cierra el ResultSet
        } catch (SQLException e) {
            e.printStackTrace();
            Alert.showMessageError("Error", "Error al obtener afiliaciones desde la base de datos.");
        } finally {
            conexion.desconectar(); // Cierra la conexión
        }
    }
    
    
    private void guardarPacienteEnBaseDeDatos(String nombre, String documento, String direccion, String telefono, String correo, Date fechaNacimiento, String genero, String afiliacion) {
        try {
            // Establecer conexión con la base de datos
            ConexionBD conexion = new ConexionBD();
            conexion.conectar();

            // Preparar la consulta SQL para insertar un nuevo paciente
            String query = "INSERT INTO paciente (nombre, documento, direccion, telefono, correo, fechaNacimiento, genero_id, eps_id) VALUES (?, ?, ?, ?, ?, ?, (SELECT id FROM genero WHERE nombre_genero = ?), (SELECT id FROM eps WHERE nombre_eps = ?));";

            // Crear una sentencia preparada para ejecutar la consulta SQL
            PreparedStatement statement = conexion.getConnection().prepareStatement(query);

            // Establecer los parámetros de la consulta con los valores del paciente
            statement.setString(1, nombre);
            statement.setString(2, documento);
            statement.setString(3, direccion);
            statement.setString(4, telefono);
            statement.setString(5, correo);
            statement.setDate(6, new java.sql.Date(fechaNacimiento.getTime())); // Convertir Date a java.sql.Date
            statement.setString(7, genero);
            statement.setString(8, afiliacion);

            // Ejecutar la consulta SQL para insertar el nuevo paciente
            int filasInsertadas = statement.executeUpdate();

            if (filasInsertadas > 0) {
                Alert.showMessageSuccess("Éxito", "Paciente registrado correctamente.");
            } else {
                Alert.showMessageError("Error", "Error al registrar paciente en la base de datos.");
            }

            // Cerrar la conexión
            conexion.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
            Alert.showMessageError("Error", "Este paciente ya se encuentra registrado");
        }
    }
    
    private boolean esFechaNacimientoValida(Date fechaNacimiento) {
        // Validar si la fecha de nacimiento es antes de la fecha actual
        Date fechaActual = new Date();
        return fechaNacimiento != null && fechaNacimiento.before(fechaActual);
    }
        private boolean esCorreoValido(String correo) {
        return correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
        private boolean esTelefonoValido(String telefono) {
        return telefono.matches("[0-9()+-]+"); // Permite números, paréntesis, guiones y signo más
    }
        private boolean esDocumentoValido(String documento) {
        return documento.matches("\\d+"); // Verifica si la cadena contiene solo dígitos
    }
        private boolean esNombreValido(String nombre) {
        return nombre.matches("[a-zA-Z]+");
    }
    public static void main(String args[]) {
        
        FrmInterfazPrincipal principal = new FrmInterfazPrincipal();
        new FrmRegistrarPersona(principal).setVisible(true);
        ArrayList<Persona>paciente = new ArrayList();
        ArrayList<Persona>medico = new ArrayList();
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarCitaPorRegistro;
    private javax.swing.JButton btnRegistrarPaciente;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JComboBox<String> comboAfiliados;
    private javax.swing.JComboBox<String> comboGenero;
    private com.toedter.calendar.JDateChooser dtFechaNacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbPaciente1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
