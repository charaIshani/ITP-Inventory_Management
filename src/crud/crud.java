package crud;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;


import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class crud extends javax.swing.JFrame {

    public crud() {
        initComponents(); 
        table_update();
       
    }
        Connection con1;
        PreparedStatement insert;
     
        Connection con;
        PreparedStatement pst;
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtcategory = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtstate = new javax.swing.JTextField();
        labvalname = new javax.swing.JLabel();
        labvalcategory = new javax.swing.JLabel();
        labvalquantity = new javax.swing.JLabel();
        labvalstate = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnreport = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");
        setBackground(new java.awt.Color(0, 51, 51));
        setMinimumSize(new java.awt.Dimension(1370, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 255, 153));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 0), 2, true));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Item Category", "Quntity", "State"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(153, 204, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 700, 320));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Item Name");

        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });

        txtcategory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtcategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcategoryKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("item Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");

        txtquantity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtquantityKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/photos/add.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/photos/remove.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/photos/update.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("State");

        txtstate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstateActionPerformed(evt);
            }
        });
        txtstate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstateKeyReleased(evt);
            }
        });

        labvalname.setForeground(new java.awt.Color(204, 0, 51));

        labvalcategory.setForeground(new java.awt.Color(204, 0, 51));

        labvalquantity.setForeground(new java.awt.Color(204, 0, 51));

        labvalstate.setForeground(new java.awt.Color(204, 0, 51));

        jButton5.setBackground(new java.awt.Color(153, 204, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Demo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labvalquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labvalcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labvalname, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(884, 884, 884)
                                .addComponent(labvalstate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtstate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                                .addComponent(txtquantity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcategory, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton3)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labvalname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labvalcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labvalquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(labvalstate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 560, 480));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Inventory Management");

        jButton4.setBackground(new java.awt.Color(153, 204, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/photos/logout.png"))); // NOI18N
        jButton4.setText("LogOut");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(419, 419, 419)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        btnPrint.setBackground(new java.awt.Color(153, 204, 0));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/photos/print.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 520, 300, 60));

        jTextField1.setBackground(new java.awt.Color(153, 255, 153));
        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Type item Code here to search............");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 700, 40));

        btnreport.setBackground(new java.awt.Color(153, 204, 0));
        btnreport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/photos/report.png"))); // NOI18N
        btnreport.setText("Generate Report");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });
        getContentPane().add(btnreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 340, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/photos/000.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1370, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
 //*************************************************Add Button*******************************************************************************
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
           String name =txtname.getText();
           String category =txtcategory.getText();
           String quantity =txtquantity.getText();
           String state =txtstate.getText();
           
           if(txtname.getText().trim().isEmpty()){
               labvalname.setText("Name Field is Empty");
           }
           
           else if (txtcategory.getText().trim().isEmpty()){
               labvalcategory.setText("Category Field is Empty");
           }
           
           else if (txtquantity.getText().trim().isEmpty()){
               labvalquantity.setText("Quantity is Empty");
           }
           
            else if (txtstate.getText().trim().isEmpty()){
               labvalstate.setText("State is Empty");
           }
            
           else {
                try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management","root","");
            insert = con1.prepareStatement("insert into inventory (itemName,itemCategory,quantity,state)values(?,?,?,?)");
            insert.setString(1,name);
            insert.setString(2,category);
            insert.setString(3,quantity);
            insert.setString(4,state);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Do you want to Add Item?");
            
            txtname.setText("");
            txtcategory.setText("");
            txtquantity.setText("");
            txtstate.setText("");
            
            table_update();
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
            Logger.getLogger(crud.class.getName()).log(Level.SEVERE, null, ex);
            }              
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

   //*************************************************Delete Button***************************************************************************************
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
            try { 
            int itemCode = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete this Item?","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
  
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management","root","");
                insert = con1.prepareStatement("delete from inventory where itemCode = ?");
        
                insert.setInt(1,itemCode);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Are You Sure ?");
                txtname.setText("");
                txtcategory.setText("");
                txtquantity.setText("");
                txtstate.setText("");

            table_update();
           }
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {  
        }   
    }//GEN-LAST:event_jButton2ActionPerformed

    //*******************************************Row selection*****************************************************************
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        txtname.setText(model.getValueAt(selectedIndex, 1).toString());
        txtcategory.setText(model.getValueAt(selectedIndex, 2).toString());
        txtquantity.setText(model.getValueAt(selectedIndex, 3).toString());
        txtstate.setText(model.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

//*************************************************Update Button**********************************************************    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedIndex = jTable1.getSelectedRow();
          
            if(txtname.getText().trim().isEmpty()){
               labvalname.setText("Name Fields are Empty");
            }
            else if (txtcategory.getText().trim().isEmpty()){
               labvalcategory.setText("CategoryFields are Empty");
            }
            else if (txtquantity.getText().trim().isEmpty()){
               labvalquantity.setText("Quantity are Empty");
            }
            else if (txtstate.getText().trim().isEmpty()){
               labvalstate.setText("State are Empty");
            }
            else{
                 try {   
                
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            String name =txtname.getText();
            String category =txtcategory.getText();
            String quantity =txtquantity.getText();
            String state =txtstate.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management","root","");
            insert = con1.prepareStatement("update inventory set itemName= ?,itemCategory= ?,quantity= ?,state= ? where itemCode= ?");
            insert.setString(1,name);
            insert.setString(2,category);
            insert.setString(3,quantity);
            insert.setString(4,state);
            insert.setInt(5,id);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Do you want to Update this Item?");
            txtname.setText("");
            txtcategory.setText("");
            txtquantity.setText("");
            txtstate.setText("");
          
            table_update();
            
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }   
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstateActionPerformed
   
    }//GEN-LAST:event_txtstateActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
       labvalname.setText("");
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtcategoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcategoryKeyReleased
        labvalcategory.setText("");
    }//GEN-LAST:event_txtcategoryKeyReleased

    private void txtquantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquantityKeyReleased
        labvalquantity.setText("");
    }//GEN-LAST:event_txtquantityKeyReleased

    private void txtstateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstateKeyReleased
        labvalstate.setText("");
    }//GEN-LAST:event_txtstateKeyReleased

    //***********************************Print Button***************************************************
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        MessageFormat header = new MessageFormat("Inventory Management Report");
        MessageFormat footer = new MessageFormat("Page(1)");
        
        try{
            jTable1.print(JTable.PrintMode.NORMAL,header,footer); 
        }catch(Exception e){   
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
     
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        DefaultTableModel table =(DefaultTableModel)jTable1.getModel();
        String search = jTextField1.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));   
    }//GEN-LAST:event_jTextField1KeyReleased

    //************************************************Search Bar******************************************************
    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().equals("Type item Code here to search............")){
            jTextField1.setText("");
        }
        
        jTextField1.setForeground(Color.RED);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
     if(jTextField1.getText().equals("")){
            jTextField1.setText("Type item Code here to search............");
        }
        jTextField1.setForeground(new Color(236,240,241));
    }//GEN-LAST:event_jTextField1FocusLost

//**************************************************Generate Report Button*******************************************************
    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        String path ="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        
        if(x == JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+"Store Report.pdf"));
            
            doc.open();
            PdfPTable tbl =  new PdfPTable(3);
            
            //Adding header
            tbl.addCell("Item Code");
            tbl.addCell("Item Name");
            //tbl.addCell("Item Category");
            tbl.addCell("Quentity");
            //tbl.addCell("State");
            
            
            for (int i =0; i<jTable1.getRowCount();i++){
                String code = jTable1.getValueAt(i, 0).toString();
                String name = jTable1.getValueAt(i, 1).toString();
                //String category = jTable1.getValueAt(i, 2).toString();
                String quentity = jTable1.getValueAt(i, 3).toString();
                //String state = jTable1.getValueAt(i, 4).toString();
                
                tbl.addCell(code);
                tbl.addCell(name);
                //tbl.addCell(category);
                tbl.addCell(quentity);
                //tbl.addCell(state);
                    
            }
            doc.add(tbl);
            
            JOptionPane.showMessageDialog(null,"Downloaded pdf","",JOptionPane.WARNING_MESSAGE);
          
        }
            catch( FileNotFoundException ex){
                Logger.getLogger(crud.class.getName());
            } 
            catch ( DocumentException ex){
                Logger.getLogger(crud.class.getName());
                
                //.log(Level.SEVERE,null,ex
            }
           
        doc.close();
               
    }//GEN-LAST:event_btnreportActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtname.setText("Shampoo");
        txtcategory.setText("Bathroom Equipment");
        txtquantity.setText("150");
        txtstate.setText("Bellose");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void table_update() {
        int CC;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/inventory_management","root","");
            insert = con1.prepareStatement("SELECT * FROM inventory");
            ResultSet Rs = insert.executeQuery();
            
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
           
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("itemCode"));
                    v2.add(Rs.getString("itemName"));
                    v2.add(Rs.getString("itemCategory"));
                    v2.add(Rs.getString("quantity"));
                    v2.add(Rs.getString("state"));
                }

                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }

    //****************************************************************Button Round*********************************************************************************
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        //*******************************************************************************************************************************************************
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labvalcategory;
    private javax.swing.JLabel labvalname;
    private javax.swing.JLabel labvalquantity;
    private javax.swing.JLabel labvalstate;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txtstate;
    // End of variables declaration//GEN-END:variables
}
