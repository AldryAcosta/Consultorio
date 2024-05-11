
package InterfazPrincipal;

import Escudero.Alert;
import InterfazPrincipal.Clases.CitasMedicas;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TRSYR
 */
public class FrmGestionCitas extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestionCitas
     */
    public SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private FrmInterfazPrincipal principal;
    private FrmGestionCitas gestionCitas;
    private final ArrayList<CitasMedicas>citas;
    
    public FrmGestionCitas(ArrayList<CitasMedicas>citas) {
        initComponents();
        this.citas = citas;
        MostrarInfo(this.citas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboEstados = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistrosMedicos = new javax.swing.JTable();
        dateFinal = new com.toedter.calendar.JDateChooser();
        dateInicial = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnCitasporMedico = new javax.swing.JButton();
        comboMedico = new javax.swing.JComboBox<>();
        comboMeses = new javax.swing.JComboBox<>();
        btnRestablecer = new javax.swing.JButton();
        btnObtenerTotalCopagos = new javax.swing.JButton();
        txtResultadoCopago = new javax.swing.JTextField();
        btnFiltrarPorMesYAnio = new javax.swing.JButton();
        comboMesesCopago = new javax.swing.JComboBox<>();
        ComboAnioCopago = new javax.swing.JComboBox<>();
        lblTotalCopagosMesAnio = new javax.swing.JLabel();
        ComboAnio = new javax.swing.JComboBox<>();
        btnCalcularTotalCopagosAnio = new javax.swing.JButton();
        lblTotalCopagosAnio = new javax.swing.JLabel();
        btnFiltrarPorEstado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboCambiarEstados = new javax.swing.JComboBox<>();
        btnCambiarEstado = new javax.swing.JButton();
        txtNumeroCita = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 600));

        comboEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programada", "Activa", "Atendida", "Cancelada" }));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Estado");

        tbRegistrosMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbRegistrosMedicos);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Fecha Inicial");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Final");

        btnConsultar.setText("Reporte de citas");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnCitasporMedico.setText("Citas por medico");
        btnCitasporMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasporMedicoActionPerformed(evt);
            }
        });

        comboMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dra. Laura Lopez", "Dr. Manuel Torres", "Dra. Sofia Diaz", "Dr. Victor Ramirez", "Dra. Ana Maria Gomez", "Dr. Luis Hernandez", "Dra. Marta Perez", "Dr. Jose Gonzalez", "Dr. Jorge Martinez", "Dra. Andrea Fernandez", "Dr. Alejandro Garcia", "Dra. Patricia Castro", "Dr. Roberto Diaz", "Dr. Miguel Rodriguez", "Dra. Lucia Fernandez", "Dr. Pedro Sanchez", "Dra. Laura Martinez", "Dra. Maria Lopez", "Dr. Juan Perez" }));

        comboMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        btnRestablecer.setText("Reestablecer Registros");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        btnObtenerTotalCopagos.setText("Total Copagos");
        btnObtenerTotalCopagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerTotalCopagosActionPerformed(evt);
            }
        });

        btnFiltrarPorMesYAnio.setText("Filtrar por mes y año");
        btnFiltrarPorMesYAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPorMesYAnioActionPerformed(evt);
            }
        });

        comboMesesCopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agoato", "septiembre", "octubre", "noviembre", "diciembre" }));

        ComboAnioCopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025" }));

        lblTotalCopagosMesAnio.setText("(Resultado)");

        ComboAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026" }));

        btnCalcularTotalCopagosAnio.setText("Calcular por año");
        btnCalcularTotalCopagosAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalCopagosAnioActionPerformed(evt);
            }
        });

        lblTotalCopagosAnio.setText("(Resultado)");

        btnFiltrarPorEstado.setText("Filtrar Por Estado");
        btnFiltrarPorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPorEstadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cambiar Estado Individual");

        comboCambiarEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programada", "Activa", "Atendida", "Cancelada" }));

        btnCambiarEstado.setText("Cambiar");
        btnCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(654, 654, 654)
                .addComponent(comboMesesCopago, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(ComboAnioCopago, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(btnCitasporMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalCopagosMesAnio)
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnRestablecer)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCalcularTotalCopagosAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtResultadoCopago, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(comboEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFiltrarPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel3))
                                        .addComponent(dateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(btnConsultar)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addComponent(jLabel2))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(comboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(btnCambiarEstado))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumeroCita, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(comboCambiarEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnObtenerTotalCopagos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFiltrarPorMesYAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTotalCopagosAnio)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMesesCopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboAnioCopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotalCopagosMesAnio)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrarPorMesYAnio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCitasporMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltrarPorEstado))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalcularTotalCopagosAnio)
                            .addComponent(txtNumeroCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotalCopagosAnio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboCambiarEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCambiarEstado))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(dateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultadoCopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnObtenerTotalCopagos)
                .addGap(32, 32, 32)
                .addComponent(btnRestablecer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        if(this.validarInformacion()){
          ArrayList<CitasMedicas> citasFiltradas = new ArrayList<>();
          Date fechaInicial = this.dateInicial.getDate();
          Date fechaFinal   = this.dateFinal.getDate();
          
          Calendar callInicial = Calendar.getInstance();
          callInicial.setTime(fechaInicial);
          callInicial.set(callInicial.HOUR_OF_DAY, 0);      
          callInicial.set(callInicial.MINUTE, 0);
          callInicial.set(callInicial.SECOND, 0);
          callInicial.set(callInicial.MILLISECOND, 0);

          
          Calendar callFinal = Calendar.getInstance();
          callFinal.setTime(fechaFinal);
          callFinal.set(callFinal.HOUR_OF_DAY, 23);      
          callFinal.set(callFinal.MINUTE, 59);
          callFinal.set(callFinal.SECOND, 59);
          callFinal.set(callFinal.MILLISECOND, 999);
          
          
          
         
          for (CitasMedicas cita : citas) {
                if ((cita.getFechaCita().after(callInicial.getTime()) || cita.getFechaCita().equals(callInicial.getTime()))
                        && (cita.getFechaCita().before(callFinal.getTime()) || cita.getFechaCita().equals(callFinal.getTime()))) {
                    citasFiltradas.add(cita);
                }
            }
          
           this.MostrarInfo(citasFiltradas);
      }else{
          Alert.showMessageError("Consultorio", "Valide las fechas a buscar.",10,this);
      }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCitasporMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasporMedicoActionPerformed
        // TODO add your handling code here:
        // Obtener el nombre del médico seleccionado
        String nombreMedico = comboMedico.getSelectedItem().toString();
        // Obtener el mes seleccionado (0 = enero, 1 = febrero, ..., 11 = diciembre)
        int mesSeleccionado = comboMeses.getSelectedIndex();

        // Generar reporte de citas por médico en el mes seleccionado
        generarReporteCitasPorMedicoEnMes(nombreMedico, mesSeleccionado);
    }//GEN-LAST:event_btnCitasporMedicoActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        // TODO add your handling code here:
        
        MostrarInfo(citas);
    }//GEN-LAST:event_btnRestablecerActionPerformed

    private void btnObtenerTotalCopagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerTotalCopagosActionPerformed
        // TODO add your handling code here:
        int totalCopagos = calcularTotalCopagos(citas);
        txtResultadoCopago.setText("Total Copagos: " + totalCopagos);    
    }//GEN-LAST:event_btnObtenerTotalCopagosActionPerformed

    private void btnFiltrarPorMesYAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPorMesYAnioActionPerformed
        // TODO add your handling code here:
        String mesSeleccionado = (String) comboMesesCopago.getSelectedItem(); // Obtener el mes seleccionado como String
        String anioSeleccionadoStr = (String) ComboAnioCopago.getSelectedItem(); // Obtener el año seleccionado como String
        int anioSeleccionado = Integer.parseInt(anioSeleccionadoStr); // Convertir a Integer

        try {
            // Convertir el nombre del mes a su índice numérico
            int indiceMes = obtenerIndiceMes(mesSeleccionado);

            // Calcular el total de copagos para el mes y año seleccionados
            int totalCopagosMesAnio = calcularTotalCopagosPorMesYAnio(citas, indiceMes, anioSeleccionado);

            // Mostrar el total de copagos por mes y año en algún componente de tu interfaz (por ejemplo, un JLabel)
            lblTotalCopagosMesAnio.setText("Total Copagos " + mesSeleccionado + " " + anioSeleccionado + ": " + totalCopagosMesAnio);
        } catch (NumberFormatException e) {
            // Manejar la excepción si ocurre un error de conversión
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: El año seleccionado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFiltrarPorMesYAnioActionPerformed

    private void btnCalcularTotalCopagosAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalCopagosAnioActionPerformed
        // TODO add your handling code here:
        try {
            String anioSeleccionadoStr = (String) ComboAnio.getSelectedItem();
            int anioSeleccionado = Integer.parseInt(anioSeleccionadoStr);

            int totalCopagosAnio = calcularTotalCopagosPorAnio(citas, anioSeleccionado);
            lblTotalCopagosAnio.setText("Total Copagos " + anioSeleccionado + ": " + totalCopagosAnio);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: El año seleccionado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularTotalCopagosAnioActionPerformed

    private void btnFiltrarPorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPorEstadoActionPerformed
        // TODO add your handling code here:
        // Obtener el estado seleccionado en el JComboBox
        String estadoSeleccionado = (String) comboEstados.getSelectedItem();

        // Filtrar las citas por el estado seleccionado
        ArrayList<CitasMedicas> citasFiltradas = filtrarCitasPorEstado(citas, estadoSeleccionado);

        // Mostrar las citas filtradas en la tabla
        MostrarInfo(citasFiltradas);
    }//GEN-LAST:event_btnFiltrarPorEstadoActionPerformed

    private void btnCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoActionPerformed
        // TODO add your handling code here:
        String numeroCitaStr = txtNumeroCita.getText();

        // Verificar si el campo de texto está vacío
        if (numeroCitaStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número de cita", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Convertir el número de cita a entero
            int numeroCita = Integer.parseInt(numeroCitaStr);

            // Variable para mantener el estado de si se encontró la cita
            boolean citaEncontrada = false;

            // Recorrer la lista de citas y encontrar la cita con el número de cita especificado
            for (CitasMedicas cita : citas) {
                if (cita.getNumeroCita() == numeroCita) {
                    // Cambiar el estado de la cita
                    String nuevoEstado = comboCambiarEstados.getSelectedItem().toString();
                    cita.setEstadoCitas(nuevoEstado);
                    citaEncontrada = true;
                    break; // Salir del bucle una vez que se encuentra la cita
                }
            }

            // Verificar si se encontró la cita y se cambió el estado
            if (citaEncontrada) {
                // Actualizar la tabla después de cambiar el estado de la cita
                MostrarInfo(citas);
                JOptionPane.showMessageDialog(this, "Estado de cita cambiado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostrar mensaje si no se encontró la cita con el número especificado
                JOptionPane.showMessageDialog(this, "La cita con el número especificado no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si no se puede convertir a entero
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para la cita", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCambiarEstadoActionPerformed

    public String obtenerNuevoEstado() {
        // Aquí puedes mostrar un cuadro de diálogo o utilizar otro componente para que el usuario seleccione el nuevo estado
        String[] estadosPosibles = {"Programada", "Confirmada", "Cancelada", "En curso", "Completada"};

        // Utiliza un cuadro de diálogo de selección o un combo box para que el usuario elija el nuevo estado
        String nuevoEstadoSeleccionado = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el nuevo estado:",
                "Cambiar Estado de Cita",
                JOptionPane.PLAIN_MESSAGE,
                null,
                estadosPosibles,
                estadosPosibles[0]); // El estado predeterminado

        // Verifica si se seleccionó un nuevo estado y devuelve ese estado
        if (nuevoEstadoSeleccionado != null && nuevoEstadoSeleccionado.length() > 0) {
            return nuevoEstadoSeleccionado;
        } else {
            // Si no se selecciona ningún estado, puedes manejarlo según sea necesario (por ejemplo, devolver un estado predeterminado)
            return "Programada"; // Devuelve un estado predeterminado en caso de que no se seleccione ningún estado
        }
    }
    

    private int calcularTotalCopagosPorAnio(ArrayList<CitasMedicas> citas, int anio) {
        int totalCopagos = 0;
        for (CitasMedicas cita : citas) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(cita.getFechaCita());
            int anioCita = cal.get(Calendar.YEAR);

            // Comparar el año de la cita con el año seleccionado
            if (anioCita == anio) {
                totalCopagos += cita.getCoPago();
            }
        }
        return totalCopagos;
    }
    
    
    private int obtenerIndiceMes(String nombreMes) {
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Buscar el índice del nombre del mes en el array de nombres de meses
        for (int i = 0; i < nombresMeses.length; i++) {
            if (nombresMeses[i].equalsIgnoreCase(nombreMes)) {
                return i; // Devolver el índice del mes encontrado
            }
        }

        // Si no se encuentra el mes, devolver -1 o lanzar una excepción según tu lógica
        return -1; // Devolver -1 si no se encuentra el mes (manejo de errores)
    }
    
    
    public void MostrarInfo(ArrayList<CitasMedicas> citas){
        DefaultTableModel modelo = new DefaultTableModel(); 
        String encabezado[]={"Numero Cita","Estado","Documento","Nombre y Apellido","Afiliacion","Copago","Medico","Especialidad de Cita","Fecha Cita","Hora","Direccion"};
        modelo.setColumnIdentifiers(encabezado);
        int numeroCita = 1;
        
        for(int i=0; i < citas.size(); i++){
            modelo.addRow(new Object[]{numeroCita,citas.get(i).getEstadoCitas(),citas.get(i).getDocumentoPaciente(), citas.get(i).getNombreyApellidoPaciente(),
                 citas.get(i).getAfiliadoPaciente(),citas.get(i).getCoPago(),citas.get(i).getNombreMedico(), citas.get(i).getTipoEspecialidad(),
            citas.get(i).getFechaCita(), citas.get(i).getHoraCita(), citas.get(i).getConsultorioCita()});
            numeroCita++;
        }
        tbRegistrosMedicos.setModel(modelo);
    }
    
    /**
     * @param args the command line arguments
     */
    private boolean validarInformacion(){
        boolean result = true;
        
        if(this.dateInicial.getDate() == null){
            result = false;
        }
        
        if(this.dateFinal.getDate() == null){
             result = false;
        }
        
        return result;
    }
    
     private void generarReporteCitasPorMedicoEnMes(String nombreMedico, int mes) {
        ArrayList<CitasMedicas> citasFiltradas = new ArrayList<>();

        
        for (CitasMedicas cita : citas) {
            
            String nombreMedicoCita = cita.getNombreMedico();
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(cita.getFechaCita());
            int mesCita = cal.get(Calendar.MONTH);

            
            if (nombreMedicoCita.equals(nombreMedico) && mesCita == mes) {
                citasFiltradas.add(cita);
            }
        }
        MostrarInfo(citasFiltradas);
    }
     
     private int calcularTotalCopagos(ArrayList<CitasMedicas> citas) {
        int totalCopagos = 0;
        for (CitasMedicas cita : citas) {
            totalCopagos += cita.getCoPago();
        }
        return totalCopagos;
    }
     
     private int calcularTotalCopagosPorMesYAnio(ArrayList<CitasMedicas> citas, int mes, int anio) {
        int totalCopagos = 0;
        for (CitasMedicas cita : citas) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(cita.getFechaCita());
            int mesCita = cal.get(Calendar.MONTH);
            int anioCita = cal.get(Calendar.YEAR);

            // Comparar mes y año de la cita con el mes y año seleccionados
            if (mesCita == mes && anioCita == anio) {
                totalCopagos += cita.getCoPago();
            }
        }
        return totalCopagos;
    }
     
     private String obtenerNombreMes(int indiceMes) {
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return nombresMeses[indiceMes];
    }
     
     private ArrayList<CitasMedicas> filtrarCitasPorEstado(ArrayList<CitasMedicas> citas, String estado) {
        ArrayList<CitasMedicas> citasFiltradas = new ArrayList<>();

        for (CitasMedicas cita : citas) {
            if (cita.getEstadoCitas().equalsIgnoreCase(estado)) {
                citasFiltradas.add(cita);
            }
        }

        return citasFiltradas;
    }
  
    public static void main(String args[]) {
        ArrayList<CitasMedicas>citas = new ArrayList<CitasMedicas>();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboAnio;
    private javax.swing.JComboBox<String> ComboAnioCopago;
    private javax.swing.JButton btnCalcularTotalCopagosAnio;
    private javax.swing.JButton btnCambiarEstado;
    private javax.swing.JButton btnCitasporMedico;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnFiltrarPorEstado;
    private javax.swing.JButton btnFiltrarPorMesYAnio;
    private javax.swing.JButton btnObtenerTotalCopagos;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JComboBox<String> comboCambiarEstados;
    private javax.swing.JComboBox<String> comboEstados;
    private javax.swing.JComboBox<String> comboMedico;
    private javax.swing.JComboBox<String> comboMeses;
    private javax.swing.JComboBox<String> comboMesesCopago;
    private com.toedter.calendar.JDateChooser dateFinal;
    private com.toedter.calendar.JDateChooser dateInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalCopagosAnio;
    private javax.swing.JLabel lblTotalCopagosMesAnio;
    private javax.swing.JTable tbRegistrosMedicos;
    private javax.swing.JTextField txtNumeroCita;
    private javax.swing.JTextField txtResultadoCopago;
    // End of variables declaration//GEN-END:variables
}
