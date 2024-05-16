/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazPrincipal;

import Escudero.Alert;
import InterfazPrincipal.Clases.CitasMedicas;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import dataConexion.ConexionBD;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import login.RegistroIngreso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author aldry
 */
public class FrmAgendamiento extends javax.swing.JFrame {
    
    
    private FrmInterfazPrincipal principal;
    private ConexionBD conexion;
    
       
     
    public SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private ArrayList<Persona> paciente = new ArrayList<Persona>();
    private ArrayList<CitasMedicas>citas = new ArrayList<CitasMedicas>();
    
     private int contadorCitas = 1;
     int numeroCitas;
     String documentoPaciente;
     String nombreyApellidoPaciente;
     Date fechaNacimientoPaciente;
     String afiliadoPaciente;
     String nombreMedico;
     String tipoEspecialidad;
     Date fechaCita;
     String horaCita;
     String ConsultorioCita;
     String EstadoCitas;
     
     
     
     int coPago; 
     int COPAGO_EPS_SANITAS = 47700;
     int COPAGO_MUTUAL_SER = 45000;
     int COPAGO_COOSALUD = 40000;
     int COPAGO_SALUD_TOTAL = 50000;
     
     
    
    public FrmAgendamiento(FrmInterfazPrincipal interfazPrincipal) {
        initComponents(); 
        
        citas = new ArrayList<CitasMedicas>();
        this.setLocationRelativeTo(this);
        this.principal = interfazPrincipal;
        this.paciente = this.principal.obtenerListadoPaciente();
        conexion = new ConexionBD();
        conexion.conectar();
        
        llenarComboboxEspecialidades();
        
        comboTipoCita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                llenarComboMedicos();
            }
        });
        
        comboMedicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarHorariosDisponibles();
            }
        });
    }

/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public ArrayList<Persona> getPacientes() {
        return paciente;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtFiltradoDocumento = new javax.swing.JTextField();
        btnFiltrarPorDocumento = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtGeneroAgenda = new javax.swing.JTextField();
        txtafiliadoagenda = new javax.swing.JTextField();
        lbDatosMedicos = new javax.swing.JLabel();
        comboTipoCita = new javax.swing.JComboBox<>();
        comboMedicos = new javax.swing.JComboBox<>();
        comboHoras = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();
        btnAgendar = new javax.swing.JButton();
        btnGestionarCitas = new javax.swing.JButton();
        jdFechaNacimientoAgenda = new com.toedter.calendar.JDateChooser();
        comboIPS = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agendamiento de Citas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        txtFiltradoDocumento.setBackground(new java.awt.Color(242, 242, 242));
        txtFiltradoDocumento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFiltradoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paciente por Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 14))); // NOI18N
        txtFiltradoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltradoDocumentoActionPerformed(evt);
            }
        });

        btnFiltrarPorDocumento.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        btnFiltrarPorDocumento.setText("Filtrar");
        btnFiltrarPorDocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFiltrarPorDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPorDocumentoActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(242, 242, 242));
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre y Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 14))); // NOI18N

        txtGeneroAgenda.setBackground(new java.awt.Color(242, 242, 242));
        txtGeneroAgenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGeneroAgenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 14))); // NOI18N

        txtafiliadoagenda.setBackground(new java.awt.Color(242, 242, 242));
        txtafiliadoagenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtafiliadoagenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Afiliado a", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 14))); // NOI18N

        lbDatosMedicos.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        lbDatosMedicos.setText("Datos medicos");

        comboTipoCita.setBackground(new java.awt.Color(242, 242, 242));
        comboTipoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboTipoCita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Cita / Especialidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 14))); // NOI18N
        comboTipoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoCitaActionPerformed(evt);
            }
        });

        comboMedicos.setBackground(new java.awt.Color(242, 242, 242));
        comboMedicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medico Disponible segun especialidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 14))); // NOI18N
        comboMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicosActionPerformed(evt);
            }
        });

        comboHoras.setBackground(new java.awt.Color(242, 242, 242));
        comboHoras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horas Disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 12))); // NOI18N

        jdFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de la Cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 12))); // NOI18N

        btnAgendar.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        btnAgendar.setText("Agendar Cita");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnGestionarCitas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        btnGestionarCitas.setText("Gestionar Citas");
        btnGestionarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarCitasActionPerformed(evt);
            }
        });

        jdFechaNacimientoAgenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 14))); // NOI18N

        comboIPS.setBackground(new java.awt.Color(242, 242, 242));
        comboIPS.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        comboIPS.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion IPS"));

        txtCorreo.setBackground(new java.awt.Color(242, 242, 242));
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 0, 14))); // NOI18N

        jButton1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGeneroAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdFechaNacimientoAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtafiliadoagenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFiltradoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnFiltrarPorDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboTipoCita, javax.swing.GroupLayout.Alignment.TRAILING, 0, 267, Short.MAX_VALUE)
                            .addComponent(jdFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(comboIPS, javax.swing.GroupLayout.Alignment.TRAILING, 0, 267, Short.MAX_VALUE)
                            .addComponent(lbDatosMedicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboMedicos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboHoras, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnGestionarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbDatosMedicos)
                        .addGap(18, 18, 18)
                        .addComponent(comboTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(comboHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboIPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFechaNacimientoAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtFiltradoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFiltrarPorDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGeneroAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGestionarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtafiliadoagenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDireccionesIPS(String epsNombre) {
        comboIPS.removeAllItems(); // Limpiar items previos

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AgendamientoCitas", "root", "1084");
             PreparedStatement stmt = conn.prepareStatement("SELECT d.direccion FROM eps_ips ei JOIN direccionips d ON ei.direccionips_id = d.id JOIN eps e ON ei.eps_id = e.id WHERE e.nombre_eps = ?")) {

            stmt.setString(1, epsNombre);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                comboIPS.addItem(rs.getString("direccion"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    private void btnFiltrarPorDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPorDocumentoActionPerformed
        String numeroDocumento = txtFiltradoDocumento.getText().trim();
        if (!numeroDocumento.isEmpty()) {
            buscarPacientePorDocumento(numeroDocumento);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número de documento.", "Documento Vacío", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnFiltrarPorDocumentoActionPerformed

    
    public void buscarPacientePorDocumento(String numeroDocumento) {
            try {
            Connection conn = conexion.getConnection();
            String sql = "SELECT p.nombre, g.nombre_genero, p.correo, p.fechaNacimiento, e.nombre_eps " +
                         "FROM paciente p " +
                         "JOIN genero g ON p.genero_id = g.id " +
                         "JOIN eps e ON p.eps_id = e.id " +
                         "WHERE p.documento = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, numeroDocumento);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String genero = rs.getString("nombre_genero");
                String correo = rs.getString("correo");
                Date fechaNacimiento = rs.getDate("fechaNacimiento");
                String nombreEps = rs.getString("nombre_eps");

                // Mostrar los datos obtenidos en la interfaz o hacer lo que necesites
                txtNombre.setText(nombre);
                txtGeneroAgenda.setText(genero);
                txtCorreo.setText(correo);
                jdFechaNacimientoAgenda.setDate(fechaNacimiento);
                txtafiliadoagenda.setText(nombreEps);

                // Verificar la EPS y cargar las direcciones IPS correspondientes si es necesario
                if (nombreEps != null && !nombreEps.isEmpty()) {
                    cargarDireccionesIPS(nombreEps);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún paciente con el documento ingresado.", "Paciente no encontrado", JOptionPane.INFORMATION_MESSAGE);
            }

            stmt.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar paciente por documento: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void comboTipoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoCitaActionPerformed

    }//GEN-LAST:event_comboTipoCitaActionPerformed

     
    private void comboMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMedicosActionPerformed

    

    
    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed

        // Obtener los datos ingresados por el usuario desde el formulario
        String nombrePaciente = txtNombre.getText().trim();
        String nombreMedico = comboMedicos.getSelectedItem().toString();
        Date fechaCita = jdFecha.getDate();
        String horaCita = comboHoras.getSelectedItem().toString();
        String direccionIPS = comboIPS.getSelectedItem().toString();
        String estadoCita = "Programada"; // Puedes establecer el estado inicial como pendiente

        // Validar que se hayan ingresado todos los datos necesarios
        if (nombrePaciente.isEmpty() || nombreMedico.isEmpty() || fechaCita == null || horaCita.isEmpty() || direccionIPS.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos antes de agendar la cita.", "Datos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Establecer conexión con la base de datos (suponiendo que 'conexion' es tu objeto de conexión)
            Connection conn = conexion.getConnection();

            // Llamar al procedimiento almacenado 'sp_insertar_cita' utilizando un CallableStatement
            String sql = "{CALL sp_insertar_cita(?, ?, ?, ?, ?, ?)}";
            CallableStatement stmt = conn.prepareCall(sql);

            // Establecer los parámetros del procedimiento almacenado con los nombres directamente
            stmt.setString(1, nombrePaciente);
            stmt.setString(2, nombreMedico);
            stmt.setDate(3, new java.sql.Date(fechaCita.getTime())); // Convertir java.util.Date a java.sql.Date
            stmt.setTime(4, java.sql.Time.valueOf(horaCita)); // Convertir hora de String a java.sql.Time
            stmt.setString(5, direccionIPS);
            stmt.setString(6, estadoCita);

            // Ejecutar el procedimiento almacenado
            stmt.execute();

            // Obtener los resultados de la consulta adicional para obtener nombre del paciente, nombre del médico y dirección IPS
            ResultSet rs = stmt.getResultSet();
            if (rs.next()) {
                String nombrePacienteResult = rs.getString("nombre_paciente");
                String nombreMedicoResult = rs.getString("nombre_medico");
                String direccionIPSResult = rs.getString("direccion_ips");

                // Mostrar mensaje de éxito junto con la información adicional
                String mensajeExito = String.format("Cita agendada correctamente.\n\nPaciente: %s\nMédico: %s\nDirección IPS: %s", nombrePacienteResult, nombreMedicoResult, direccionIPSResult);
                JOptionPane.showMessageDialog(this, mensajeExito, "Cita Agendada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al obtener los detalles de la cita.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al agendar la cita: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // Mostrar detalles del error en consola
        }
        
    }//GEN-LAST:event_btnAgendarActionPerformed

    
    private void btnGestionarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarCitasActionPerformed
        // TODO add your handling code here:
        
        FrmGestionCitas gestion = new FrmGestionCitas(citas);
        gestion.setVisible(true);
        gestion.pack();
        gestion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGestionarCitasActionPerformed

    private void txtFiltradoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltradoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltradoDocumentoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void llenarComboboxEspecialidades() {
        String query = "SELECT nombre_especialidad FROM especialidad";
        
        try {
            Connection conn = conexion.getConnection(); // Obtener la conexión de la clase ConexionBD
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Limpiar el combobox antes de agregar nuevos elementos
            comboTipoCita.removeAllItems();

            // Iterar sobre los resultados y agregar cada especialidad al combobox
            while (resultSet.next()) {
                String especialidad = resultSet.getString("nombre_especialidad");
                comboTipoCita.addItem(especialidad);
            }

            // Cerrar recursos
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones (mostrar mensaje de error, etc.)
        }
    }
    
    
    private int obtenerIdEspecialidad(String especialidad) {
        
        if (especialidad.equalsIgnoreCase("Medicina General")) {
        return 1;
        } else if (especialidad.equalsIgnoreCase("Pediatria")) {
            return 2;
        } else if (especialidad.equalsIgnoreCase("Ginecologica")) {
            return 3;
        } else if (especialidad.equalsIgnoreCase("Cardiologia")) {
            return 4;
        } else if (especialidad.equalsIgnoreCase("Dermatologia")) {
            return 5;
        } else if (especialidad.equalsIgnoreCase("Medicina interna")) {
            return 6;
        } else if (especialidad.equalsIgnoreCase("Ortopedia")) {
            return 7;
        } else if (especialidad.equalsIgnoreCase("Otorrinolaringo")) {
            return 8;
        } else if (especialidad.equalsIgnoreCase("Neurocirugia")) {
            return 9;
        }
        
        return -1;
    }
    
    private void llenarComboMedicos() {
        String especialidadSeleccionada = comboTipoCita.getSelectedItem().toString();
        int especialidadId = obtenerIdEspecialidad(especialidadSeleccionada);

        System.out.println("Especialidad seleccionada: " + especialidadSeleccionada);
        System.out.println("ID de Especialidad: " + especialidadId);

        comboMedicos.removeAllItems();
        try {
            ArrayList<String> nombresMedicos = conexion.obtenerNombresMedicosPorEspecialidad(especialidadId);
            System.out.println("Nombres de Médicos: " + nombresMedicos);

            for (String nombreMedico : nombresMedicos) {
                comboMedicos.addItem(nombreMedico);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al obtener los médicos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargarHorariosDisponibles() {
        comboHoras.removeAllItems();
        String nombreMedico = comboMedicos.getSelectedItem().toString();

        try {
            int medicoId = conexion.obtenerIdMedico(nombreMedico); // Implementa este método según tu lógica
            ArrayList<String> horariosDisponibles = conexion.obtenerHorariosDisponiblesPorMedico(medicoId);

            for (String hora : horariosDisponibles) {
                comboHoras.addItem(hora);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los horarios disponibles: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    public static void main(String args[]) {
       
//        new FrmAgendamiento().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnFiltrarPorDocumento;
    private javax.swing.JButton btnGestionarCitas;
    private javax.swing.JComboBox<String> comboHoras;
    private javax.swing.JComboBox<String> comboIPS;
    private javax.swing.JComboBox<String> comboMedicos;
    private javax.swing.JComboBox<String> comboTipoCita;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdFecha;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoAgenda;
    private javax.swing.JLabel lbDatosMedicos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFiltradoDocumento;
    private javax.swing.JTextField txtGeneroAgenda;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtafiliadoagenda;
    // End of variables declaration//GEN-END:variables

}
