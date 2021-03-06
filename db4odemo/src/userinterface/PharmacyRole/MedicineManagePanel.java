/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import MedicineCatelog.Medicine;
import MedicineCatelog.MedicineDetail;
import MedicineCatelog.MedicineDirectory;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class MedicineManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineManagePanel
     */

    private JPanel jpanel;
    private PharmacyOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private MedicineDirectory medicineDir;
    private Medicine medicine;
    public MedicineManagePanel(JPanel jpanel, UserAccount userAccount, PharmacyOrganization organization, Enterprise enterprise,EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.jpanel = jpanel;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.system=system;
        this.medicineDir=enterprise.getMedicineDir();
        //this.medicine=new Medicine();
        setCombo();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        catelogcombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        namefield = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        treatmentfield = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        descriptionfield = new javax.swing.JTextArea();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        backbtn2 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable2);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Disease Cataloge", "Medicine", "Treatment", "Description"
            }
        ));
        jScrollPane1.setViewportView(medicineTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 770, 172));

        jLabel1.setText("Disease Cataloge:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 97, -1, -1));

        catelogcombo.setModel(new javax.swing.DefaultComboBoxModel(new Object[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        catelogcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catelogcomboActionPerformed(evt);
            }
        });
        add(catelogcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 93, 220, -1));

        jLabel2.setText("Medicine Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 383, -1, -1));

        jLabel3.setText("Treatment:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 383, -1, -1));

        namefield.setColumns(20);
        namefield.setRows(5);
        jScrollPane2.setViewportView(namefield);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 417, 169, -1));

        treatmentfield.setColumns(20);
        treatmentfield.setRows(5);
        jScrollPane3.setViewportView(treatmentfield);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 417, 183, -1));

        jLabel4.setText("Description:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 383, -1, -1));

        descriptionfield.setColumns(20);
        descriptionfield.setRows(5);
        jScrollPane4.setViewportView(descriptionfield);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 417, 176, -1));

        addbtn.setText("Add medicine");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, 63));

        deletebtn.setText("Delete Medicine");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 139, 63));

        backbtn2.setBackground(new java.awt.Color(255, 255, 255));
        backbtn2.setText("back");
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });
        add(backbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void popTable(Medicine m){
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
        model.setRowCount(0);
        if(m==null){
            Object row[]=new Object[4];
                row[0]="";
                row[1]="";
                row[2]="";
                row[3]="";
                model.addRow(row);
            }else{
        for(MedicineDetail detail:m.getMedicinearr()){
            Object row[]=new Object[4];
            row[0]=m;
            row[1]=detail;
            row[2]=detail.getTreatment();
            row[3]=detail.getDescription();
            model.addRow(row);
        }
        }
    }
    public void setCombo(){
        catelogcombo.removeAllItems();
        for(Medicine m:medicineDir.getMedicines()){ 
            catelogcombo.addItem(m.getMedicineCatelog());
        }
    }
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        MedicineDetail detail=new MedicineDetail();
        String name=namefield.getText();
        String treatment=treatmentfield.getText();
        String description=descriptionfield.getText();
        if(name.equals("")||treatment.equals("")||description.equals("")){
            JOptionPane.showMessageDialog(null,"please enter three field");
            return;
        }
        detail.setName(name);
        detail.setTreatment(treatment);
        detail.setDescription(description);
        medicine.getMedicinearr().add(detail);
        namefield.setText("");
        treatmentfield.setText("");
        descriptionfield.setText("");
        popTable(medicine);
                
    }//GEN-LAST:event_addbtnActionPerformed

    private void catelogcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catelogcomboActionPerformed
        // TODO add your handling code here:
        //String medicinestr= (String) catelogcombo.getSelectedItem();
        this.medicine=null;
        System.out.println("combo select:"+(String) catelogcombo.getSelectedItem());
        for(Medicine m:medicineDir.getMedicines()){
            System.out.println("m:"+m);
            if(!m.getMedicineCatelog().equals((String) catelogcombo.getSelectedItem())){
                System.out.println("no");
            } else {
                System.out.println("yes");
                medicine=m;
                break;
            }
        }  
        System.out.println("catch medicine:"+medicine);
        //System.out.println("catch medicine2:"+medicine.getMedicineCatelog());
        popTable(medicine);
    }//GEN-LAST:event_catelogcomboActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int select=medicineTable.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "please select");
            return;
        }else{
            Medicine selectMedicine=(Medicine)medicineTable.getValueAt(select, 0);
            MedicineDetail medicineDetail=(MedicineDetail) medicineTable.getValueAt(select, 1);
           
            int a=JOptionPane.showConfirmDialog(null, "sure to delete?","confirm",JOptionPane.YES_NO_OPTION);
            if(a==JOptionPane.YES_OPTION){
                
                selectMedicine.getMedicinearr().remove(medicineDetail);
            }else if(a==JOptionPane.NO_OPTION){
                return;
            }
            
            popTable(selectMedicine);
            JOptionPane.showMessageDialog(null, "delete success");
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        // TODO add your handling code here:
         jpanel.remove(this);
        CardLayout layout = (CardLayout) jpanel.getLayout();
        layout.previous(jpanel);
    }//GEN-LAST:event_backbtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn2;
    private javax.swing.JComboBox<String> catelogcombo;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextArea descriptionfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable medicineTable;
    private javax.swing.JTextArea namefield;
    private javax.swing.JTextArea treatmentfield;
    // End of variables declaration//GEN-END:variables
}
