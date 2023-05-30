/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.talabatproject;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Yasmeen Abdelaziz
 */
public class Resturant_edit extends javax.swing.JFrame {

    public Resturant_edit() throws SQLException {
        initComponents();
        Open();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(12);
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(12, 12));
        jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

    }

    public void Open() throws SQLException {
        try(
            Connection con = my.talabatproject.Db.connect();
            PreparedStatement ps = con.prepareStatement("select * from Meals WHERE restaurant_name=?")){
            ps.setString(1,RestaurantOwner.getRestaurantname());
            ps.execute();
            ResultSet r = ps.executeQuery();
            if (r.next() == false) {
                jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                con.close();
            } else {
                meal1name.setText(r.getString("meal_name"));
                desc1.setText(r.getString("meal_description"));
                p1.setText(r.getString("meal_price"));
                Txt_path.setText(r.getString("meal_image"));
            }
            if (r.next() == false) {
                jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                con.close();
            } else {
                meal2name.setText(r.getString("meal_name"));
                desc2.setText(r.getString("meal_description"));
                p2.setText(r.getString("meal_price"));

            }
            if (r.next() == false) {
                jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                con.close();
            } else {
                meal3name.setText(r.getString("meal_name"));
                desc3.setText(r.getString("meal_description"));
                p3.setText(r.getString("meal_price"));
            }
            if (r.next() == false) {
                jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                con.close();
            } else {
                meal4name.setText(r.getString("meal_name"));
                desc4.setText(r.getString("meal_description"));
                p4.setText(r.getString("meal_price"));
                con.close();
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    int Image_Upload = -1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ordercounter = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addmeal = new javax.swing.JButton();
        Lbl_browse_order = new javax.swing.JButton();
        meal1name = new javax.swing.JLabel();
        meal2name = new javax.swing.JLabel();
        meal3name = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();
        p2 = new javax.swing.JTextField();
        p3 = new javax.swing.JTextField();
        delete1 = new javax.swing.JButton();
        edit1 = new javax.swing.JButton();
        edit2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        edit3 = new javax.swing.JButton();
        delete3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        desc3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        desc1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        desc2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Txt_path = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        meal4name = new javax.swing.JLabel();
        edit4 = new javax.swing.JButton();
        delete4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        desc4 = new javax.swing.JTextArea();
        p4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(664, 800));
        setMinimumSize(new java.awt.Dimension(664, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(664, 800));
        setResizable(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(652, 779));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(652, 779));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(652, 779));

        ordercounter.setBackground(new java.awt.Color(255, 255, 255));
        ordercounter.setMaximumSize(new java.awt.Dimension(650, 999));
        ordercounter.setMinimumSize(new java.awt.Dimension(650, 999));
        ordercounter.setPreferredSize(new java.awt.Dimension(650, 999));
        ordercounter.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 90, 0));

        addmeal.setBackground(new java.awt.Color(150, 63, 45));
        addmeal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addmeal.setForeground(new java.awt.Color(255, 255, 255));
        addmeal.setText("Add New Meal");
        addmeal.setBorder(null);
        addmeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addmealMouseClicked(evt);
            }
        });
        addmeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmealActionPerformed(evt);
            }
        });

        Lbl_browse_order.setText("Browse ");
        Lbl_browse_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lbl_browse_orderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(Lbl_browse_order, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(addmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_browse_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addmeal, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        meal1name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meal1name.setForeground(new java.awt.Color(51, 51, 51));
        meal1name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal1name.setText("Meal_1_Name");

        meal2name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meal2name.setForeground(new java.awt.Color(51, 51, 51));
        meal2name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal2name.setText("Meal_2_Name");

        meal3name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meal3name.setForeground(new java.awt.Color(51, 51, 51));
        meal3name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal3name.setText("Meal_3_Name");

        p1.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        p1.setForeground(new java.awt.Color(51, 51, 51));
        p1.setBorder(null);
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        p2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        p3.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });

        delete1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        edit1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit1.setText("Edit");
        edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit1ActionPerformed(evt);
            }
        });

        edit2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit2.setText("Edit");
        edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit2ActionPerformed(evt);
            }
        });

        delete2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete2.setText("Delete");
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });

        edit3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit3.setText("Edit");
        edit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit3ActionPerformed(evt);
            }
        });

        delete3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete3.setText("Delete");
        delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("EGP");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("EGP");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("EGP");

        desc3.setColumns(20);
        desc3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        desc3.setRows(5);
        jScrollPane2.setViewportView(desc3);

        desc1.setColumns(20);
        desc1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        desc1.setRows(5);
        jScrollPane4.setViewportView(desc1);

        desc2.setColumns(20);
        desc2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        desc2.setRows(5);
        jScrollPane5.setViewportView(desc2);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setText("PATH");

        Txt_path.setText("Txt_path");

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        meal4name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meal4name.setForeground(new java.awt.Color(51, 51, 51));
        meal4name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meal4name.setText("Meal_4_Name");

        edit4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit4.setText("Edit");
        edit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit4ActionPerformed(evt);
            }
        });

        delete4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete4.setText("Delete");
        delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete4ActionPerformed(evt);
            }
        });

        desc4.setColumns(20);
        desc4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        desc4.setRows(5);
        jScrollPane3.setViewportView(desc4);

        p4.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("EGP");

        javax.swing.GroupLayout ordercounterLayout = new javax.swing.GroupLayout(ordercounter);
        ordercounter.setLayout(ordercounterLayout);
        ordercounterLayout.setHorizontalGroup(
            ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(edit1)
                .addGap(15, 15, 15)
                .addComponent(meal1name, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(delete1))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Txt_path, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(edit2)
                .addGap(17, 17, 17)
                .addComponent(meal2name, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(delete2))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(edit3)
                .addGap(7, 7, 7)
                .addComponent(meal3name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(delete3))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(edit4)
                .addGap(7, 7, 7)
                .addComponent(meal4name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(delete4))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2))
        );
        ordercounterLayout.setVerticalGroup(
            ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordercounterLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meal1name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ordercounterLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit1)
                            .addComponent(delete1))))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_path, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meal2name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ordercounterLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit2)
                            .addComponent(delete2))))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit3)
                    .addComponent(meal3name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete3))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit4)
                    .addComponent(meal4name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete4))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(ordercounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setViewportView(ordercounter);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addmealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addmealMouseClicked
        // TODO add your handling code here:
        this.dispose();
        addmeal add = new addmeal();
        add.setVisible(true);
        add.pack();
        add.setLocationRelativeTo(null);
        add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_addmealMouseClicked

    private void addmealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmealActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_addmealActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        // TODO add your handling code here:
        String name = meal1name.getText();
        try {
            my.talabatproject.Db.delete(name);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit1ActionPerformed
        // TODO add your handling code here:
        int price = Integer.parseInt(p1.getText());
        String desc = desc1.getText(), name = meal1name.getText();
        if (Image_Upload == -1) {
            my.talabatproject.Db.Update(price, desc, name);
        } else {
            String image = Txt_path.getText();
            my.talabatproject.Db.Update(price, desc, name, image);
        }
    }//GEN-LAST:event_edit1ActionPerformed

    private void edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit2ActionPerformed
        // TODO add your handling code here:
        int price = Integer.parseInt(p2.getText());
        String desc = desc2.getText(), name = meal2name.getText();

        my.talabatproject.Db.Update(price, desc, name);
    }//GEN-LAST:event_edit2ActionPerformed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
        // TODO add your handling code here:
        String name = meal2name.getText();
        try {
            my.talabatproject.Db.delete(name);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_delete2ActionPerformed

    private void edit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit3ActionPerformed
        // TODO add your handling code here:
        int price = Integer.parseInt(p3.getText());
        String desc = desc3.getText(), name = meal3name.getText();
        System.out.println(price);
        System.out.println(desc);
        System.out.println(name);
        my.talabatproject.Db.Update(price, desc, name);
    }//GEN-LAST:event_edit3ActionPerformed

    private void delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete3ActionPerformed
        // TODO add your handling code here:
        String name = meal3name.getText();
        try {
            my.talabatproject.Db.delete(name);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_delete3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (evt.getSource() == jButton1) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("5 supported extensions", "jpg", "jpeg", "gif", "png", "jfif");
            chooser.setFileFilter(filter);
            int selected = chooser.showOpenDialog(null);
            if (selected == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                String fileName = file.getAbsolutePath();
                Txt_path.setText(fileName);
                JOptionPane.showMessageDialog(null, fileName);
                ImageIcon image = new ImageIcon(fileName);
                Image imfit = image.getImage();
                //            Image imgfit=imfit.getScaledInstance(Lbl_image_upload.getWidth(),Lbl_image_upload.getHeight(),Image.SCALE_SMOOTH);
                //            Lbl_image_upload.setIcon(new ImageIcon(imfit));

            }
            Image_Upload = 1;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void edit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit4ActionPerformed
        // TODO add your handling code here:
        int price = Integer.parseInt(p4.getText());
        String desc = desc4.getText(), name = meal4name.getText();
        my.talabatproject.Db.Update(price, desc, name);
    }//GEN-LAST:event_edit4ActionPerformed

    private void delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete4ActionPerformed
        // TODO add your handling code here:
        String name = meal4name.getText();
        try {
            my.talabatproject.Db.delete(name);
        } catch (SQLException ex) {
            ex.getMessage();
        }

    }//GEN-LAST:event_delete4ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4ActionPerformed

    private void Lbl_browse_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lbl_browse_orderActionPerformed
        // TODO add your handling code here:
           this.dispose();
       Owner_Browse_date add;
        try {
            add = new  Owner_Browse_date();
               add.setVisible(true);
        add.pack();
        add.setLocationRelativeTo(null);
        add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(Resturant_edit.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
    }//GEN-LAST:event_Lbl_browse_orderActionPerformed

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
            java.util.logging.Logger.getLogger(Resturant_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resturant_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resturant_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resturant_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Resturant_edit().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Resturant_edit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lbl_browse_order;
    private javax.swing.JTextField Txt_path;
    private javax.swing.JButton addmeal;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JButton delete3;
    private javax.swing.JButton delete4;
    private javax.swing.JTextArea desc1;
    private javax.swing.JTextArea desc2;
    private javax.swing.JTextArea desc3;
    private javax.swing.JTextArea desc4;
    private javax.swing.JButton edit1;
    private javax.swing.JButton edit2;
    private javax.swing.JButton edit3;
    private javax.swing.JButton edit4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel meal1name;
    private javax.swing.JLabel meal2name;
    private javax.swing.JLabel meal3name;
    private javax.swing.JLabel meal4name;
    private javax.swing.JPanel ordercounter;
    public javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    // End of variables declaration//GEN-END:variables
}
