import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class GUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());
    
    // generar tablas
    DefaultTableModel modeloNotas;
    DefaultTableModel modeloResumen;

    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        configuracion = new javax.swing.JLabel();
        estudiantes = new javax.swing.JLabel();
        notasEst = new javax.swing.JLabel();
        numeroEstudiantes = new javax.swing.JTextField();
        numeroNotas = new javax.swing.JTextField();
        crearTabla = new javax.swing.JButton();
        notasTab = new javax.swing.JLabel();
        resumenTab = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResumen = new javax.swing.JTable();
        grafica = new javax.swing.JLabel();
        graficaApRep = new javax.swing.JScrollPane();
        estadisticas = new javax.swing.JLabel();
        ApRep = new javax.swing.JLabel();
        calcularPromedios = new javax.swing.JButton();
        historicoEstudiante = new javax.swing.JButton();
        textoHistorico = new javax.swing.JTextField();
        historico = new javax.swing.JLabel();
        cargarCSV = new javax.swing.JButton();
        exportarCSV = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaNotas);

        configuracion.setText("Configuracion inicial");

        estudiantes.setText("Numero de estudiantes:");

        notasEst.setText("Número de notas:");

        numeroEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroEstudiantesActionPerformed(evt);
            }
        });

        numeroNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroNotasActionPerformed(evt);
            }
        });

        crearTabla.setText("Crear");
        crearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTablaActionPerformed(evt);
            }
        });

        notasTab.setText("Tabla de notas:");

        resumenTab.setText("Tabla de resumen:");

        tablaResumen.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaResumen);

        grafica.setText("Grafica:");

        estadisticas.setText("Estadisticas:");

        calcularPromedios.setText("Calcular promedios");
        calcularPromedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularPromediosActionPerformed(evt);
            }
        });

        historicoEstudiante.setText("Buscar");
        historicoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoEstudianteActionPerformed(evt);
            }
        });

        textoHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoHistoricoActionPerformed(evt);
            }
        });

        historico.setText("Historico de estudiante:");

        cargarCSV.setText("Cargar CSV");
        cargarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarCSVActionPerformed(evt);
            }
        });

        exportarCSV.setText("Exportar CSV");
        exportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarCSVActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(historico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoHistorico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(historicoEstudiante))
                    .addComponent(jScrollPane1)
                    .addComponent(configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(notasEst, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crearTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addComponent(notasTab, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resumenTab, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2)
                    .addComponent(calcularPromedios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargarCSV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exportarCSV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(limpiar))
                    .addComponent(grafica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graficaApRep)
                    .addComponent(estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApRep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configuracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estudiantes)
                    .addComponent(notasEst)
                    .addComponent(numeroEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearTabla)
                    .addComponent(cargarCSV)
                    .addComponent(exportarCSV)
                    .addComponent(limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notasTab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcularPromedios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resumenTab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(historicoEstudiante)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(historico)
                                .addComponent(textoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grafica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(graficaApRep, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadisticas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApRep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroEstudiantesActionPerformed

    private void numeroNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroNotasActionPerformed

    
    private void crearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTablaActionPerformed
     try {
            int nEst = Integer.parseInt(numeroEstudiantes.getText());
            int nNotas = Integer.parseInt(numeroNotas.getText());

            if (nEst <= 0 || nNotas <= 0) {
                JOptionPane.showMessageDialog(this, "Los valores deben ser mayores que 0");
                return;
            }

            String[] columnas = new String[nNotas + 1];
            columnas[0] = "Nombre";
            for (int i = 1; i <= nNotas; i++) {
                columnas[i] = "Nota " + i;
            }

            modeloNotas = new DefaultTableModel(columnas, 0);
            for (int i = 0; i < nEst; i++) {
                Object[] fila = new Object[nNotas + 1];
                fila[0] = "Estudiante " + (i + 1);
                modeloNotas.addRow(fila);
            }

            tablaNotas.setModel(modeloNotas);

            modeloResumen = new DefaultTableModel(new String[]{"Nombre", "Promedio", "Estado"}, 0);
            tablaResumen.setModel(modeloResumen);

            JOptionPane.showMessageDialog(this, "Tabla creada correctamente");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numericos validos");
        }                        
    }//GEN-LAST:event_crearTablaActionPerformed

    //promedios y excepciones vacias
    private void calcularPromediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularPromediosActionPerformed
     if (modeloNotas == null || modeloNotas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Primero cree o cargue una tabla de notas.");
            return;
        }

        modeloResumen.setRowCount(0);
        int aprobados = 0, reprobados = 0;

        for (int i = 0; i < modeloNotas.getRowCount(); i++) {
            String nombre = String.valueOf(modeloNotas.getValueAt(i, 0));
            double suma = 0;
            int nNotas = modeloNotas.getColumnCount() - 1;

            for (int j = 1; j <= nNotas; j++) {
                Object valor = modeloNotas.getValueAt(i, j);
                if (valor == null || valor.toString().isBlank()) valor = "0";
                try {
                    suma += Double.parseDouble(valor.toString());
                } catch (NumberFormatException e) {
                    suma += 0;
                }
            }

            //aprobados y reprobados
            double promedio = suma / nNotas;
            String estado = promedio >= 3.0 ? "APROBO" : "REPROBO";
            if (promedio >= 3.0) aprobados++; else reprobados++;

            modeloResumen.addRow(new Object[]{nombre, promedio, estado});

        }

        // grafico de torta
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Aprobados", aprobados);
        dataset.setValue("Reprobados", reprobados);

        JFreeChart chart = ChartFactory.createPieChart(
                "Porcentaje de Aprobados/Reprobados",
                dataset, 
                true, 
                true, 
                false);

        ChartPanel chartPanel = new ChartPanel(chart);
        graficaApRep.setViewportView(chartPanel);

        double total = aprobados + reprobados;
        if (total > 0) {
            double pA = (aprobados * 100.0) / total;
            double pR = (reprobados * 100.0) / total;
            ApRep.setText(String.format("Aprobo: %.1f%% | Reprobo: %.1f%%", pA, pR));
        } else {
            ApRep.setText("Sin datos para calcular estadisticas.");
        }                    
    }//GEN-LAST:event_calcularPromediosActionPerformed

    //recoleccion de datos e historial
    private void historicoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoEstudianteActionPerformed
    if (modeloNotas == null) {
            JOptionPane.showMessageDialog(this, "Primero cree o cargue una tabla.");
            return;
        }

        String nombre = textoHistorico.getText().trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del estudiante.");
            return;
        }

        boolean encontrado = false;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < modeloNotas.getRowCount(); i++) {
            if (modeloNotas.getValueAt(i, 0).equals(nombre)) {
                encontrado = true;
                for (int j = 1; j < modeloNotas.getColumnCount(); j++) {
                    Object valor = modeloNotas.getValueAt(i, j);
                    if (valor != null) {
                        try {
                            double nota = Double.parseDouble(valor.toString());
                            dataset.addValue(nota, "Notas", "Nota " + j);
                        } catch (NumberFormatException ignored) {}
                    }
                }
                break;
            }
        }

        if (encontrado) {
            JFreeChart chart = ChartFactory.createLineChart(
                    "Historico de " + nombre,
                    "Evaluaciones",
                    "Notas",
                    dataset,
                    PlotOrientation.VERTICAL,
                    false, true, false
            );

            ChartPanel chartPanel = new ChartPanel(chart);
            graficaApRep.setViewportView(chartPanel);
        } else {
            JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
        }                         
    }//GEN-LAST:event_historicoEstudianteActionPerformed

    //importr
    private void cargarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarCSVActionPerformed
    JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try (Scanner sc = new Scanner(file)) {
                List<String[]> filas = new ArrayList<>();
                while (sc.hasNextLine()) {
                    filas.add(sc.nextLine().split(","));
                }
                if (filas.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Archivo vacio.");
                    return;
                }

                String[] columnas = new String[filas.get(0).length];
                for (int i = 0; i < columnas.length; i++) columnas[i] = "Col " + (i + 1);

                modeloNotas = new DefaultTableModel(columnas, 0);
                for (String[] f : filas) modeloNotas.addRow(f);
                tablaNotas.setModel(modeloNotas);

                JOptionPane.showMessageDialog(this, "Archivo cargado correctamente.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo.");
            }
        }                                        
    }//GEN-LAST:event_cargarCSVActionPerformed

    //exportar
    private void exportarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarCSVActionPerformed
    if (modeloNotas == null) {
            JOptionPane.showMessageDialog(this, "No hay datos para exportar.");
            return;
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("NotasEstudiantes.csv"))) {
            for (int i = 0; i < modeloNotas.getRowCount(); i++) {
                for (int j = 0; j < modeloNotas.getColumnCount(); j++) {
                    pw.print(modeloNotas.getValueAt(i, j));
                    if (j < modeloNotas.getColumnCount() - 1) pw.print(",");
                }
                pw.println();
            }
            JOptionPane.showMessageDialog(this, "Datos exportados como NotasEstudiantes.csv");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al exportar CSV.");
        }
    }//GEN-LAST:event_exportarCSVActionPerformed
    //reiniciar valores, datos e histriales
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    if (modeloNotas != null) modeloNotas.setRowCount(0);
        if (modeloResumen != null) modeloResumen.setRowCount(0);
        graficaApRep.setViewportView(null);
        ApRep.setText("");
        textoHistorico.setText("");
        JOptionPane.showMessageDialog(this, "Formulario limpio.");
    }//GEN-LAST:event_limpiarActionPerformed

    private void textoHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoHistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoHistoricoActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApRep;
    private javax.swing.JButton calcularPromedios;
    private javax.swing.JButton cargarCSV;
    private javax.swing.JLabel configuracion;
    private javax.swing.JButton crearTabla;
    private javax.swing.JLabel estadisticas;
    private javax.swing.JLabel estudiantes;
    private javax.swing.JButton exportarCSV;
    private javax.swing.JLabel grafica;
    private javax.swing.JScrollPane graficaApRep;
    private javax.swing.JLabel historico;
    private javax.swing.JButton historicoEstudiante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel notasEst;
    private javax.swing.JLabel notasTab;
    private javax.swing.JTextField numeroEstudiantes;
    private javax.swing.JTextField numeroNotas;
    private javax.swing.JLabel resumenTab;
    private javax.swing.JTable tablaNotas;
    private javax.swing.JTable tablaResumen;
    private javax.swing.JTextField textoHistorico;
    // End of variables declaration//GEN-END:variables
}
