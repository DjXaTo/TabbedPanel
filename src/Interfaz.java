
import java.text.DecimalFormat;

/**
 *
 * @author AlbertoManuel
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * declaración de variables. Hemos utilizado un decimal format, para que
     * a la hora de sumar y generar numeros aleatorios no sean tan grandes
     * decimalmente y lo hemos decicido poner siempre en numeros naturales
     */
    private double numarriba;
    private double numabajo;
    private double random;
    DecimalFormat f = new DecimalFormat("0");

    public Interfaz() {
       initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelSuma = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtarriba = new javax.swing.JFormattedTextField();
        txtabajo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btnSumar = new javax.swing.JButton();
        panelGenerador = new javax.swing.JPanel();
        numeroaleatorio = new javax.swing.JLabel();
        btnGenerarRandom = new javax.swing.JButton();
        panelSubpaneles = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelSub1 = new javax.swing.JPanel();
        panelSub2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sumando 1:");

        jLabel2.setText("Sumando 2:");

        jLabel3.setText("Resultado:");

        txtResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSumaLayout = new javax.swing.GroupLayout(panelSuma);
        panelSuma.setLayout(panelSumaLayout);
        panelSumaLayout.setHorizontalGroup(
            panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSumaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSumaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSumaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtarriba, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                    .addGroup(panelSumaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtabajo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSumaLayout.setVerticalGroup(
            panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSumaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSumaLayout.createSequentialGroup()
                        .addGroup(panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtarriba))
                        .addGap(18, 18, 18)
                        .addGroup(panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtabajo))
                        .addGap(19, 19, 19))
                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(165, 165, 165))
        );

        jTabbedPane1.addTab("Suma", panelSuma);

        numeroaleatorio.setText("Aquí se generara el número random");

        btnGenerarRandom.setText("Generar");
        btnGenerarRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRandomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGeneradorLayout = new javax.swing.GroupLayout(panelGenerador);
        panelGenerador.setLayout(panelGeneradorLayout);
        panelGeneradorLayout.setHorizontalGroup(
            panelGeneradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarRandom, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(numeroaleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGeneradorLayout.setVerticalGroup(
            panelGeneradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroaleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Generador de números random", panelGenerador);

        javax.swing.GroupLayout panelSub1Layout = new javax.swing.GroupLayout(panelSub1);
        panelSub1.setLayout(panelSub1Layout);
        panelSub1Layout.setHorizontalGroup(
            panelSub1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        panelSub1Layout.setVerticalGroup(
            panelSub1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Subpanel 1", panelSub1);

        javax.swing.GroupLayout panelSub2Layout = new javax.swing.GroupLayout(panelSub2);
        panelSub2.setLayout(panelSub2Layout);
        panelSub2Layout.setHorizontalGroup(
            panelSub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        panelSub2Layout.setVerticalGroup(
            panelSub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Subpanel 2", panelSub2);

        javax.swing.GroupLayout panelSubpanelesLayout = new javax.swing.GroupLayout(panelSubpaneles);
        panelSubpaneles.setLayout(panelSubpanelesLayout);
        panelSubpanelesLayout.setHorizontalGroup(
            panelSubpanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        panelSubpanelesLayout.setVerticalGroup(
            panelSubpanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Sub-paneles", panelSubpaneles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        /**
         * Las variables que creamos anteriormente (numarriba y numabajo), 
         * recoge automatimente lo que escribamos en el textshield y los convierte
         * a double. Por ultimo al textshield de resultado le hacemos un set
         * de la suma de numarriba y numabajo
         */
        numarriba = Double.parseDouble(txtarriba.getText());
        numabajo = Double.parseDouble(txtabajo.getText());
        
        txtResultado.setText(String.valueOf(f.format(numarriba+numabajo)));
        
        
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnGenerarRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRandomActionPerformed
        /*
        * Utilizamos math random en el action performed del boton generar, para
        * que genero numero aleatorios hasta un maximo de 10000 que le hemos y
        * se lo asignamos a la variable random, luego le hacemos al texshield 
        * de arriba la asignacion de la variable random
        */
        
         random = Math.random()*10000;
         numeroaleatorio.setText(String.valueOf(f.format(random)));
         
        
    }//GEN-LAST:event_btnGenerarRandomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarRandom;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel numeroaleatorio;
    private javax.swing.JPanel panelGenerador;
    private javax.swing.JPanel panelSub1;
    private javax.swing.JPanel panelSub2;
    private javax.swing.JPanel panelSubpaneles;
    private javax.swing.JPanel panelSuma;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JFormattedTextField txtabajo;
    private javax.swing.JFormattedTextField txtarriba;
    // End of variables declaration//GEN-END:variables
}
