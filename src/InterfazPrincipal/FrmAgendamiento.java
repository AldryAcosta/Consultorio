/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazPrincipal;

import Escudero.Alert;
import InterfazPrincipal.Clases.CitasMedicas;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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



/**
 *
 * @author aldry
 */
public class FrmAgendamiento extends javax.swing.JFrame {
    
    
    private FrmInterfazPrincipal principal;
    
       
     
    public SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private ArrayList<Persona> paciente = new ArrayList<Persona>();
    private ArrayList<CitasMedicas>citas = new ArrayList<CitasMedicas>();
    
     int NumeroCitas;
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
        
        
        
        
        if (this.paciente.isEmpty()) {
            Alert.showMessageError("Aviso", "No se han registrado pacientes. Registre al menos un paciente antes de agendar cita", 5);
        }
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
        txtDocumentoAgenda = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtGeneroAgenda = new javax.swing.JTextField();
        txtafiliadoagenda = new javax.swing.JTextField();
        lbDatosMedicos = new javax.swing.JLabel();
        comboTipoCita = new javax.swing.JComboBox<>();
        comboMedicos = new javax.swing.JComboBox<>();
        comboHoras = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textMotivo = new javax.swing.JTextArea();
        jdFecha = new com.toedter.calendar.JDateChooser();
        btnAgendar = new javax.swing.JButton();
        btnGestionarCitas = new javax.swing.JButton();
        jdFechaNacimientoAgenda = new com.toedter.calendar.JDateChooser();
        txtDireccionCita = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("Agendamiento de Citas");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        txtFiltradoDocumento.setBackground(new java.awt.Color(242, 242, 242));
        txtFiltradoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paciente por Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        btnFiltrarPorDocumento.setText("Filtrar");
        btnFiltrarPorDocumento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFiltrarPorDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPorDocumentoActionPerformed(evt);
            }
        });

        txtDocumentoAgenda.setBackground(new java.awt.Color(242, 242, 242));
        txtDocumentoAgenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDocumentoAgenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre y Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtGeneroAgenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGeneroAgenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        txtafiliadoagenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Afiliado a", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        lbDatosMedicos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbDatosMedicos.setText("Datos medicos");

        comboTipoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Medicina General", "Pediatria", "Ginecologica", "Cardiologia", "Dermatologia", "Medicina interna", "Ortopedia", "Otorrinolaringo", "Neurocirujias" }));
        comboTipoCita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Cita / Especialidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        comboTipoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoCitaActionPerformed(evt);
            }
        });

        comboMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        comboMedicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medico Disponible segun especialidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        comboMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicosActionPerformed(evt);
            }
        });

        comboHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        comboHoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Disponibles"));

        textMotivo.setColumns(20);
        textMotivo.setRows(5);
        textMotivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Motivo de cita"));
        jScrollPane1.setViewportView(textMotivo);

        btnAgendar.setText("Agendar Cita");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnGestionarCitas.setText("Gestionar Citas");
        btnGestionarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarCitasActionPerformed(evt);
            }
        });

        jdFechaNacimientoAgenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Nacimiento"));

        txtDireccionCita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion de la Cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(130, Short.MAX_VALUE)
                        .addComponent(btnFiltrarPorDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdFechaNacimientoAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDocumentoAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtGeneroAgenda)
                            .addComponent(txtafiliadoagenda)
                            .addComponent(txtFiltradoDocumento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboTipoCita, 0, 194, Short.MAX_VALUE)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 4, Short.MAX_VALUE)
                                        .addComponent(comboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboHoras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGestionarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtDireccionCita, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDatosMedicos)
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbDatosMedicos)
                        .addGap(15, 15, 15)
                        .addComponent(txtFiltradoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDireccionCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGestionarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltrarPorDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDocumentoAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGeneroAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdFechaNacimientoAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtafiliadoagenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarPorDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPorDocumentoActionPerformed
     for(int i =0; i < paciente.size();i++){
         if(paciente.get(i).getDocumento().equals(txtFiltradoDocumento.getText())){
             
             txtDocumentoAgenda.setText(paciente.get(i).getDocumento());
             txtNombre.setText(paciente.get(i).getNombreYapellido());
             txtGeneroAgenda.setText(paciente.get(i).getGenero());
             jdFechaNacimientoAgenda.setDate(paciente.get(i).getFechaNacimiento());
             
             
            String afiliacion = ((Paciente) paciente.get(i)).getAfiliacion();
            txtafiliadoagenda.setText(afiliacion);
        }else{
             Alert.showMessageError("Aviso", "No se encontro usuario registrado con ese documento");
         }
     }
    }//GEN-LAST:event_btnFiltrarPorDocumentoActionPerformed

    private void comboTipoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoCitaActionPerformed

        comboMedicos.removeAllItems();
    
        String especialidadSeleccionada = comboTipoCita.getSelectedItem().toString();
    
        switch (especialidadSeleccionada) {
            case "Medicina General":
                comboMedicos.addItem("Dr. Juan Perez");
                comboMedicos.addItem("Dra. Maria Lopez");
                comboMedicos.addItem("Dr. Ana Ramirez");
            break;
            case "Pediatria":
                comboMedicos.addItem("Dr. Carlos Ramirez");
                comboMedicos.addItem("Dra. Laura Martinez");
                comboMedicos.addItem("Dr. Pedro Sanchez");
            break;
            case "Ginecologica":
                comboMedicos.addItem("Dra. Lucia Fernandez");
                comboMedicos.addItem("Dr. Miguel Rodriguez");
            break;
            case "Cardiologia":
                comboMedicos.addItem("Dr. Roberto Diaz");
                comboMedicos.addItem("Dra. Patricia Castro");
            break;
            case "Dermatologia":
                comboMedicos.addItem("Dr. Alejandro Garcia");
                comboMedicos.addItem("Dra. Andrea Fernandez");
                comboMedicos.addItem("Dr. Jorge Martinez");
            break;
            case "Medicina interna":
                comboMedicos.addItem("Dr. Jose Gonzalez");
                comboMedicos.addItem("Dra. Marta Perez");
            break;
            case "Ortopedia":
             comboMedicos.addItem("Dr. Luis Hernandez");
                comboMedicos.addItem("Dra. Ana Maria Gomez");
            break;
            case "Otorrinolaringo":
                comboMedicos.addItem("Dr. Victor Ramirez");
             comboMedicos.addItem("Dra. Sofia Diaz");
            break;
            case "Neurocirugia":
                comboMedicos.addItem("Dr. Manuel Torres");
                comboMedicos.addItem("Dra. Laura Lopez");
            break;
            default:
                Alert.showMessageWarning("Advertencia", "Especialidad no encontrada");
            break;
        }
        
        comboMedicos.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (comboMedicos.getSelectedIndex() != -1) {
                    String doctorSeleccionado = comboMedicos.getSelectedItem().toString();
                    cargarHorasDisponibles(doctorSeleccionado);
                } else {
                comboHoras.removeAllItems();
                }
            }
        });
        
        if (comboMedicos.getSelectedIndex() != -1) {
            
            String doctorSeleccionado = comboMedicos.getSelectedItem().toString();

            
            cargarHorasDisponibles(doctorSeleccionado);
        } else {
            
            Alert.showMessageWarning("Advertencia", "Por favor, seleccione un médico.");
        }
    }//GEN-LAST:event_comboTipoCitaActionPerformed

     
    private void comboMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMedicosActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        // TODO add your handling code here:
        if(!txtDocumentoAgenda.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtGeneroAgenda.getText().isEmpty() && jdFechaNacimientoAgenda.getDate() != null && !txtafiliadoagenda.getText().isEmpty() && !comboTipoCita.getSelectedItem().equals("Seleccione") && !comboMedicos.getSelectedItem().equals("Seleccione") && jdFecha.getDate()!= null && !comboHoras.getSelectedItem().equals("Seleccione") && !txtDireccionCita.getText().isEmpty()) {

                documentoPaciente = txtDocumentoAgenda.getText().toUpperCase();
                nombreyApellidoPaciente = txtNombre.getText().toUpperCase();
                fechaNacimientoPaciente = jdFechaNacimientoAgenda.getDate();
                afiliadoPaciente = txtafiliadoagenda.getText().toUpperCase();
                nombreMedico = comboMedicos.getSelectedItem().toString();
                tipoEspecialidad = comboTipoCita.getSelectedItem().toString();
                fechaCita = jdFecha.getDate();
                horaCita = comboHoras.getSelectedItem().toString();
                ConsultorioCita = txtDireccionCita.getText().toUpperCase();
                String EstadoCitas = "Programada"; 
                
                
                if(afiliadoPaciente.equals("EPS SANITAS")){
                    coPago = COPAGO_EPS_SANITAS;
                }else if(afiliadoPaciente.equals("MUTUAL SER")){
                    coPago = COPAGO_MUTUAL_SER;
                }else if(afiliadoPaciente.equals("COOSALUD")){
                    coPago = COPAGO_COOSALUD;
                }else if(afiliadoPaciente.equals("SALUD TOTAL")){
                    coPago = COPAGO_SALUD_TOTAL;
                }else{
                    Alert.showMessageError("ERROR", "no existe esta EPS");
                }
            
                if (citas.isEmpty()) {
            
                CitasMedicas nuevaCita = new CitasMedicas(documentoPaciente, nombreyApellidoPaciente, fechaNacimientoPaciente, afiliadoPaciente,nombreMedico, tipoEspecialidad,fechaCita, horaCita, ConsultorioCita, EstadoCitas, coPago, NumeroCitas );
                citas.add(nuevaCita);

                Alert.showMessageSuccess("Felicidades", "La cita se ha agendado con éxito");
            } else {
           
                boolean citaExistente = false;
                for (int i = 0; i < citas.size(); i++) {
                
                    if (citas.get(i).getNombreMedico().equals(nombreMedico) &&
                        citas.get(i).getFechaCita().equals(fechaCita) &&
                        citas.get(i).getHoraCita().equals(horaCita)) {
                        citaExistente = true;
                        break;
                    }   
                }
                if (citaExistente) {
                  Alert.showMessageError("Aviso", "Ya hay una cita agendada para esta fecha y hora");
                } else {
                    citas.add(new CitasMedicas(documentoPaciente, nombreyApellidoPaciente, fechaNacimientoPaciente,
                                        afiliadoPaciente,nombreMedico, tipoEspecialidad, fechaCita, horaCita, ConsultorioCita, EstadoCitas, coPago, NumeroCitas ));
                    Alert.showMessageSuccess("Felicidades", "La cita se ha agendado con éxito");
                }
            }
            }else{
                Alert.showMessageError("Aviso", "Campos vacios");
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

    /**
     * @param args the command line arguments
     */
    
    
    
    
    private void cargarHorasDisponibles(String doctorSeleccionado) {
    
    comboHoras.removeAllItems();

    
    switch (doctorSeleccionado) {
    case "Dr. Juan Perez":
        comboHoras.addItem("9:00 AM");
        comboHoras.addItem("11:00 AM");
        comboHoras.addItem("2:00 PM");
        break;
    case "Dra. Maria Lopez":
        comboHoras.addItem("10:00 AM");
        comboHoras.addItem("1:00 PM");
        comboHoras.addItem("4:00 PM");
        break;
    case "Dr. Ana Ramirez":
        comboHoras.addItem("9:30 AM");
        comboHoras.addItem("12:00 PM");
        comboHoras.addItem("3:00 PM");
        break;
    case "Dr. Carlos Ramirez":
        comboHoras.addItem("10:00 AM");
        comboHoras.addItem("1:00 PM");
        comboHoras.addItem("3:00 PM");
        break;
    case "Dra. Laura Martinez":
        comboHoras.addItem("9:00 AM");
        comboHoras.addItem("11:00 AM");
        comboHoras.addItem("2:00 PM");
        break;
    case "Dr. Pedro Sanchez":
        comboHoras.addItem("10:30 AM");
        comboHoras.addItem("12:00 PM");
        comboHoras.addItem("4:00 PM");
        break;
    case "Dra. Lucia Fernandez":
        comboHoras.addItem("8:30 AM");
        comboHoras.addItem("10:30 AM");
        comboHoras.addItem("3:30 PM");
        break;
    case "Dr. Miguel Rodriguez":
        comboHoras.addItem("9:00 AM");
        comboHoras.addItem("12:00 PM");
        comboHoras.addItem("4:30 PM");
        break;
    case "Dr. Roberto Diaz":
        comboHoras.addItem("9:30 AM");
        comboHoras.addItem("11:30 AM");
        comboHoras.addItem("2:30 PM");
        break;
    case "Dra. Patricia Castro":
        comboHoras.addItem("10:00 AM");
        comboHoras.addItem("1:30 PM");
        comboHoras.addItem("3:30 PM");
        break;
    case "Dr. Alejandro Garcia":
        comboHoras.addItem("10:00 AM");
        comboHoras.addItem("12:00 PM");
        comboHoras.addItem("3:00 PM");
        break;
    case "Dra. Andrea Fernandez":
        comboHoras.addItem("9:00 AM");
        comboHoras.addItem("11:00 AM");
        comboHoras.addItem("2:00 PM");
        break;
        
    case "Dr. Jorge Martinez":
        comboHoras.addItem("9:30 AM");
        comboHoras.addItem("1:00 PM");
        comboHoras.addItem("4:00 PM");
        break;
    case "Dr. Jose Gonzalez":
        comboHoras.addItem("9:00 AM");
        comboHoras.addItem("12:00 PM");
        comboHoras.addItem("3:00 PM");
    break;
    
    case "Dra. Marta Perez":
        comboHoras.addItem("10:00 AM");
        comboHoras.addItem("11:00 AM");
        comboHoras.addItem("2:00 PM");
    break;
    
    case "Dr. Luis Hernandez":
        comboHoras.addItem("9:30 AM");
        comboHoras.addItem("11:00 AM");
        comboHoras.addItem("2:00 PM");
    break;
    
    case "Dra. Ana Maria Gomez":
        comboHoras.addItem("10:30 AM");
        comboHoras.addItem("12:00 PM");
        comboHoras.addItem("3:00 PM");
    break;
    
    case "Dr. Victor Ramirez":
        comboHoras.addItem("9:00 AM");
        comboHoras.addItem("11:00 AM");
        comboHoras.addItem("3:00 PM");
    break;
    
    case "Dra. Sofia Diaz":
        comboHoras.addItem("10:00 AM");
        comboHoras.addItem("12:00 PM");
        comboHoras.addItem("2:00 PM");
    break;
    
    case "Dr. Manuel Torres":
        comboHoras.addItem("9:30 AM");
        comboHoras.addItem("12:00 PM");
        comboHoras.addItem("3:00 PM");
    break;
    
    case "Dra. Laura Lopez":
        comboHoras.addItem("10:30 AM");
        comboHoras.addItem("11:00 AM");
        comboHoras.addItem("2:00 PM");
    break;
        
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
    private javax.swing.JComboBox<String> comboMedicos;
    private javax.swing.JComboBox<String> comboTipoCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdFecha;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoAgenda;
    private javax.swing.JLabel lbDatosMedicos;
    private javax.swing.JTextArea textMotivo;
    private javax.swing.JTextField txtDireccionCita;
    private javax.swing.JTextField txtDocumentoAgenda;
    private javax.swing.JTextField txtFiltradoDocumento;
    private javax.swing.JTextField txtGeneroAgenda;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtafiliadoagenda;
    // End of variables declaration//GEN-END:variables

}
