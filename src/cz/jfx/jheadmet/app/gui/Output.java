package cz.jfx.jheadmet.app.gui;

import javax.swing.ImageIcon;

/**
 *
 * @author Felix
 */
public class Output extends javax.swing.JFrame {

    /**
     * Creates new form Output
     */
    public Output() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/cz/jfx/jheadmet/resources/nuclear.png")).getImage());
        setLocation(300, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Output");
        setLocationByPlatform(true);

        output.setColumns(20);
        output.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param message
     * @param args the command line arguments
     */
    public void add(String message) {
        this.output.setText(this.output.getText() + message + "\n");
    }

    public void clear() {
        this.output.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    // End of variables declaration//GEN-END:variables
}
