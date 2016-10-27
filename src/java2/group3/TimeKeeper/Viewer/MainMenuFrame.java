/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.group3.TimeKeeper.Viewer;

import java.util.Locale;
import java.util.ResourceBundle;
import java2.group3.TimeKeeper.DataObjects.Employee;

/**
 *
 * @author Skyler Hiscock
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame
     * @param locale
     * @param bundleName
     * @param currentEmployee
     */
    public MainMenuFrame(Locale locale, String bundleName, Employee currentEmployee) {
        this.locale = locale;
        this.bundle = ResourceBundle.getBundle(bundleName, locale);
        this.currentEmployee = currentEmployee;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserHeader = new javax.swing.JLabel();
        lblProjectHeader = new javax.swing.JLabel();
        lblCurrentUser = new javax.swing.JLabel();
        lblCurrentProject = new javax.swing.JLabel();
        btnEnterTimeRecord = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(this.bundle.getString("gui_mainmenu_title")
        );

        lblUserHeader.setText(this.bundle.getString("gui_mainmenu_lblcurrentuser"));

        lblProjectHeader.setText(this.bundle.getString("gui_mainmenu_lblcurrentproject"));

        lblCurrentUser.setText(currentEmployee.getFirstName() + " " + currentEmployee.getLastName());

        lblCurrentProject.setText("jLabel2");

        btnEnterTimeRecord.setText(this.bundle.getString("gui_mainmenu_btnentertimerecord"));

        btnExit.setText(this.bundle.getString("gui_mainmenu_btnexit"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEnterTimeRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProjectHeader)
                            .addComponent(lblUserHeader))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurrentUser)
                            .addComponent(lblCurrentProject))
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserHeader)
                    .addComponent(lblCurrentUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjectHeader)
                    .addComponent(lblCurrentProject))
                .addGap(18, 18, 18)
                .addComponent(btnEnterTimeRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterTimeRecord;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblCurrentProject;
    private javax.swing.JLabel lblCurrentUser;
    private javax.swing.JLabel lblProjectHeader;
    private javax.swing.JLabel lblUserHeader;
    // End of variables declaration//GEN-END:variables
   
    
    private final ResourceBundle bundle;
    private final Locale locale;
    private final Employee currentEmployee;



}