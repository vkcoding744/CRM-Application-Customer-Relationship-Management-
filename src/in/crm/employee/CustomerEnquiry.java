
package in.crm.employee;

import in.crm.helper.DisplayName;
import in.crm.helper.ErrorDialog;
import in.crm.helper.SuccessDialog;
import in.crm.service.CustomerEnquiryService;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ListModel;


public class CustomerEnquiry extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCallEnquiry
     */
    ResultSet rs;
    public CustomerEnquiry(ResultSet rs) {
        initComponents();
         this.rs=rs;
         DisplayName.displayName(rs, jLabel4);
                
    }

     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel5.setText("Welcome :");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel4.setText("_________________");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Back");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel1.setText("Phone No :");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel2.setText("Interested Course :");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel6.setText("Name :");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel7.setText("Discussion :");

        jButton1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton1.setText("Add Enquiry");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inquiry Type", "Call", "Web", "Social Network" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status", "Open (1)", "Registered - Closed (2)", "Interested - Closed (3)", "Not Interested - Closed (4)" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Follow Up Date");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel9.setText("Customer Enquiry Form");

        jList1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "C", "C++", "Java", "Spring & SpringBoot" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 155, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 155, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        setVisible(false);
        new EmployeePanel(rs).setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                             
           //get all value  and add enquiry
        String phoneno = jTextField2.getText();
        String name = jTextField1.getText();
        
        String interester_course = "";
        int[] arr = jList1.getSelectedIndices();
        ListModel listModel =  jList1.getModel();
       
       for(int i=0; i<arr.length; i++)
       {
           interester_course = interester_course + listModel.getElementAt(arr[i])+" , ";
       }
       
       String discussion = jTextArea1.getText();
       
       String enquiry_type = (String) jComboBox1.getSelectedItem();
       String status_code1 = (String) jComboBox2.getSelectedItem();
       
       int status_code = 0;
       
       if(status_code1.equals("Open (1)"))
       {
           status_code = 1;
       }
       else if(status_code1.equals("Registered - Closed (2)"))
       {
          status_code = 2;
       }
       else if(status_code1.equals("Interested - Closed (3)"))
       {
          status_code = 3;
       }
       else if(status_code1.equals("Interested  - Closed (4)"))
       {
          status_code = 4;
       }
       
        Date  data =  jDateChooser1.getDate();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String followup_date = sdf1.format(data);
         
       LocalDateTime date = LocalDateTime.now();  
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
      String enquiry_date = date.format(format);   
      System.out.println(enquiry_date);    
  
       LocalDateTime time = LocalDateTime.now();  
      DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");  
      String enquiry_time = time.format(format1);   
      System.out.println(enquiry_time);    
      
       // Creating object of customerEnquiryService class
        try
        {
                CustomerEnquiryService custenqserivce = new CustomerEnquiryService();
                boolean status1 =  custenqserivce.insertCustEnqService(phoneno, name, interester_course, discussion, enquiry_type, status_code, enquiry_date, enquiry_time, rs.getString("email"));
                boolean status2 = custenqserivce.insertOrUpdateFollowupService(phoneno, followup_date);
       if(status1  && status2)
        {
            SuccessDialog.openSuccessDialog(rootPane, "Enquiry added Successfully");
            
            jTextArea1.setText("");
            jTextField1.setText("");
            jTextField2.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jDateChooser1.setDate(null);
            jList1.clearSelection();
        }  
        else 
        {
            ErrorDialog.openErrorDialog(rootPane, "Enquiry insertion failed due to some error", "Error");
        }
        } catch (Exception e) 
        {
            e.printStackTrace();
            ErrorDialog.openErrorDialog(rootPane, "Enquiry insertion failed due to some error", "Error");
        }
       
     
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
    
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerEnquiry(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
