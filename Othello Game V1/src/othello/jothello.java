
package othello;

import java.awt.Button;
import static java.awt.Color.black;
import static java.awt.Color.green;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class jothello extends javax.swing.JFrame {

    int t =1;
    ImageIcon green1 = new ImageIcon("src/othello/green1.png");
    ImageIcon black1 = new ImageIcon("src/othello/black1.png");
    ImageIcon gr    = new ImageIcon("src/othello/gr.png");
    ImageIcon bl    = new ImageIcon("src/othello/bl.png");
    boolean turn = false ;
    JButton[][]b=new JButton[9][9];
    int end;
  
    public jothello() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b_1 = new javax.swing.JButton();
        b_2 = new javax.swing.JButton();
        b_3 = new javax.swing.JButton();
        b_4 = new javax.swing.JButton();
        b_5 = new javax.swing.JButton();
        b_6 = new javax.swing.JButton();
        b_7 = new javax.swing.JButton();
        b_8 = new javax.swing.JButton();
        b_9 = new javax.swing.JButton();
        b_10 = new javax.swing.JButton();
        b_11 = new javax.swing.JButton();
        b_12 = new javax.swing.JButton();
        b_13 = new javax.swing.JButton();
        b_14 = new javax.swing.JButton();
        b_15 = new javax.swing.JButton();
        b_16 = new javax.swing.JButton();
        b_17 = new javax.swing.JButton();
        b_18 = new javax.swing.JButton();
        b_19 = new javax.swing.JButton();
        b_20 = new javax.swing.JButton();
        b_21 = new javax.swing.JButton();
        b_22 = new javax.swing.JButton();
        b_23 = new javax.swing.JButton();
        b_24 = new javax.swing.JButton();
        b_25 = new javax.swing.JButton();
        b_26 = new javax.swing.JButton();
        b_27 = new javax.swing.JButton();
        b_28 = new javax.swing.JButton();
        b_29 = new javax.swing.JButton();
        b_30 = new javax.swing.JButton();
        b_31 = new javax.swing.JButton();
        b_32 = new javax.swing.JButton();
        b_33 = new javax.swing.JButton();
        b_34 = new javax.swing.JButton();
        b_35 = new javax.swing.JButton();
        b_36 = new javax.swing.JButton();
        b_37 = new javax.swing.JButton();
        b_38 = new javax.swing.JButton();
        b_39 = new javax.swing.JButton();
        b_40 = new javax.swing.JButton();
        b_41 = new javax.swing.JButton();
        b_42 = new javax.swing.JButton();
        b_43 = new javax.swing.JButton();
        b_44 = new javax.swing.JButton();
        b_45 = new javax.swing.JButton();
        b_46 = new javax.swing.JButton();
        b_47 = new javax.swing.JButton();
        b_48 = new javax.swing.JButton();
        b_49 = new javax.swing.JButton();
        b_50 = new javax.swing.JButton();
        b_51 = new javax.swing.JButton();
        b_52 = new javax.swing.JButton();
        b_53 = new javax.swing.JButton();
        b_54 = new javax.swing.JButton();
        b_55 = new javax.swing.JButton();
        b_56 = new javax.swing.JButton();
        b_57 = new javax.swing.JButton();
        b_58 = new javax.swing.JButton();
        b_59 = new javax.swing.JButton();
        b_60 = new javax.swing.JButton();
        b_61 = new javax.swing.JButton();
        b_62 = new javax.swing.JButton();
        b_63 = new javax.swing.JButton();
        b_64 = new javax.swing.JButton();
        start = new javax.swing.JButton();
        turnShow = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_1.setToolTipText("");
        b_1.setPreferredSize(new java.awt.Dimension(10, 25));
        b_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_1ActionPerformed(evt);
            }
        });

        b_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_2ActionPerformed(evt);
            }
        });

        b_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_3ActionPerformed(evt);
            }
        });

        b_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_4ActionPerformed(evt);
            }
        });

        b_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_5ActionPerformed(evt);
            }
        });

        b_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_6ActionPerformed(evt);
            }
        });

        b_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_7ActionPerformed(evt);
            }
        });

        b_8.setActionCommand("b_8");
        b_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_8ActionPerformed(evt);
            }
        });

        b_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_9ActionPerformed(evt);
            }
        });

        b_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_10ActionPerformed(evt);
            }
        });

        b_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_11ActionPerformed(evt);
            }
        });

        b_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_12ActionPerformed(evt);
            }
        });

        b_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_13ActionPerformed(evt);
            }
        });

        b_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_14ActionPerformed(evt);
            }
        });

        b_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_15ActionPerformed(evt);
            }
        });

        b_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_16ActionPerformed(evt);
            }
        });

        b_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_17ActionPerformed(evt);
            }
        });

        b_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_18ActionPerformed(evt);
            }
        });

        b_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_19ActionPerformed(evt);
            }
        });

        b_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_20ActionPerformed(evt);
            }
        });

        b_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_21ActionPerformed(evt);
            }
        });

        b_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_22ActionPerformed(evt);
            }
        });

        b_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_23ActionPerformed(evt);
            }
        });

        b_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_24ActionPerformed(evt);
            }
        });

        b_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_25ActionPerformed(evt);
            }
        });

        b_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_26ActionPerformed(evt);
            }
        });

        b_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_27ActionPerformed(evt);
            }
        });

        b_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_28ActionPerformed(evt);
            }
        });

        b_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_29ActionPerformed(evt);
            }
        });

        b_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_30ActionPerformed(evt);
            }
        });

        b_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_31ActionPerformed(evt);
            }
        });

        b_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_32ActionPerformed(evt);
            }
        });

        b_33.setToolTipText("");
        b_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_33ActionPerformed(evt);
            }
        });

        b_34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_34ActionPerformed(evt);
            }
        });

        b_35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_35ActionPerformed(evt);
            }
        });

        b_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_36ActionPerformed(evt);
            }
        });

        b_37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_37ActionPerformed(evt);
            }
        });

        b_38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_38ActionPerformed(evt);
            }
        });

        b_39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_39ActionPerformed(evt);
            }
        });

        b_40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_40ActionPerformed(evt);
            }
        });

        b_41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_41ActionPerformed(evt);
            }
        });

        b_42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_42ActionPerformed(evt);
            }
        });

        b_43.setToolTipText("");
        b_43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_43ActionPerformed(evt);
            }
        });

        b_44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_44ActionPerformed(evt);
            }
        });

        b_45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_45ActionPerformed(evt);
            }
        });

        b_46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_46ActionPerformed(evt);
            }
        });

        b_47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_47ActionPerformed(evt);
            }
        });

        b_48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_48ActionPerformed(evt);
            }
        });

        b_49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_49ActionPerformed(evt);
            }
        });

        b_50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_50ActionPerformed(evt);
            }
        });

        b_51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_51ActionPerformed(evt);
            }
        });

        b_52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_52ActionPerformed(evt);
            }
        });

        b_53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_53ActionPerformed(evt);
            }
        });

        b_54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_54ActionPerformed(evt);
            }
        });

        b_55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_55ActionPerformed(evt);
            }
        });

        b_56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_56ActionPerformed(evt);
            }
        });

        b_57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_57ActionPerformed(evt);
            }
        });

        b_58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_58ActionPerformed(evt);
            }
        });

        b_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_59ActionPerformed(evt);
            }
        });

        b_60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_60ActionPerformed(evt);
            }
        });

        b_61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_61ActionPerformed(evt);
            }
        });

        b_62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_62ActionPerformed(evt);
            }
        });

        b_63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_63ActionPerformed(evt);
            }
        });

        b_64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_64ActionPerformed(evt);
            }
        });

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        turnShow.setForeground(new java.awt.Color(0, 0, 255));
        turnShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnShow.setText("Turn show");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b_59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b_33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b_25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110)
                        .addComponent(turnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b_7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b_5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b_9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(b_13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b_17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(b_20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(b_22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(b_25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(b_26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(b_27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(b_28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(b_29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(b_30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(turnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(b_55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(b_57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(b_63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setForeground(new java.awt.Color(204, 0, 51));
        label1.setText("Othello");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_1ActionPerformed
       if(b_1.getIcon()==gr){
      setGreen(b_1, 1 , 1);
      b_1.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_1.getIcon()==bl){
      setBlack(b_1, 1, 1);
      b_1.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    }        
    }//GEN-LAST:event_b_1ActionPerformed

    private void b_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_2ActionPerformed
         if(b_2.getIcon()==gr){
      setGreen(b_2, 1, 2);
      b_2.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_2.getIcon()==bl){
      setBlack(b_2, 1, 2);
      b_2.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_2ActionPerformed

    private void b_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_3ActionPerformed
         if(b_3.getIcon()==gr){
      setGreen(b_3, 1, 3);
      b_3.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_3.getIcon()==bl){
      setBlack(b_3, 1, 3);
      b_3.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_3ActionPerformed

    private void b_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_4ActionPerformed
          if(b_4.getIcon()==gr){
      setGreen(b_4, 1, 4);
      b_4.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_4.getIcon()==bl){
      setBlack(b_4, 1, 4);
      b_4.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_4ActionPerformed

    private void b_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_5ActionPerformed
          if(b_5.getIcon()==gr){
      setGreen(b_5, 1, 5);
      b_5.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_5.getIcon()==bl){
      setBlack(b_5, 1, 5);
      b_5.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_5ActionPerformed

    private void b_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_6ActionPerformed
          if(b_6.getIcon()==gr){
      setGreen(b_6, 1, 6);
      b_6.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_6.getIcon()==bl){
      setBlack(b_6, 1, 6);
      b_6.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_6ActionPerformed

    private void b_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_7ActionPerformed
            if(b_7.getIcon()==gr){
      setGreen(b_7, 1, 7);
      b_7.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_7.getIcon()==bl){
      setBlack(b_7, 1, 7);
      b_7.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_7ActionPerformed

    private void b_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_8ActionPerformed
         if(b_8.getIcon()==gr){
      setGreen(b_8, 1, 8);
      b_8.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_8.getIcon()==bl){
      setBlack(b_8, 1, 8);
      b_8.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_8ActionPerformed

    private void b_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_9ActionPerformed
          if(b_9.getIcon()==gr){
      setGreen(b_9, 2, 1);
      b_9.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_9.getIcon()==bl){
      setBlack(b_9, 2, 1);
      b_9.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_9ActionPerformed

    private void b_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_10ActionPerformed
      if(b_10.getIcon()==gr){
      setGreen(b_10, 2, 2);
      b_10.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_10.getIcon()==bl){
      setBlack(b_10, 2, 2);
      b_10.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_10ActionPerformed

    private void b_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_11ActionPerformed
          if(b_11.getIcon()==gr){
      setGreen(b_11, 2, 3);
      b_11.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_11.getIcon()==bl){
      setBlack(b_11, 2, 3);
      b_11.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_11ActionPerformed

    private void b_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_12ActionPerformed
          if(b_12.getIcon()==gr){
      setGreen(b_12, 2, 4);
      b_12.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_12.getIcon()==bl){
      setBlack(b_12, 2, 4);
      b_12.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_12ActionPerformed

    private void b_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_13ActionPerformed
           if(b_13.getIcon()==gr){
      setGreen(b_13, 2, 5);
      b_13.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_13.getIcon()==bl){
      setBlack(b_13, 2, 5);
      b_13.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_13ActionPerformed

    private void b_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_14ActionPerformed
        if(b_14.getIcon()==gr){
      setGreen(b_14, 2, 6);
      b_14.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_14.getIcon()==bl){
      setBlack(b_14, 2, 6);
      b_14.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_14ActionPerformed

    private void b_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_15ActionPerformed
       if(b_15.getIcon()==gr){
      setGreen(b_15, 2, 7);
      b_15.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_15.getIcon()==bl){
      setBlack(b_15, 2, 7);
      b_15.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_15ActionPerformed

    private void b_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_16ActionPerformed
        if(b_16.getIcon()==gr){
      setGreen(b_16, 2, 8);
      b_16.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_16.getIcon()==bl){
      setBlack(b_16, 2, 8);
      b_16.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_16ActionPerformed

    private void b_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_17ActionPerformed
         if(b_17.getIcon()==gr){
      setGreen(b_17, 3, 1);
      b_17.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_17.getIcon()==bl){
      setBlack(b_17, 3, 1);
      b_17.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_17ActionPerformed

    private void b_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_18ActionPerformed
         if(b_18.getIcon()==gr){
      setGreen(b_18, 3, 2);
      b_18.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_18.getIcon()==bl){
      setBlack(b_18, 3, 2);
      b_18.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_18ActionPerformed

    private void b_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_19ActionPerformed
           if(b_19.getIcon()==gr){
      setGreen(b_19, 3, 3);
      b_19.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_19.getIcon()==bl){
      setBlack(b_19, 3, 3);
      b_19.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_19ActionPerformed

    private void b_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_20ActionPerformed
        if(b_20.getIcon()==gr){
      setGreen(b_20, 3, 4);
      b_20.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_20.getIcon()==bl){
      setBlack(b_20, 3, 4);
      b_20.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_20ActionPerformed

    private void b_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_21ActionPerformed
     if(b_21.getIcon()==gr){
      setGreen(b_21, 3, 5);
      b_21.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_21.getIcon()==bl){
      setBlack(b_21, 3, 5);
      b_21.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_21ActionPerformed

    private void b_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_22ActionPerformed
          if(b_22.getIcon()==gr){
      setGreen(b_22, 3, 6);
      b_22.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_22.getIcon()==bl){
      setBlack(b_22, 3, 6);
      b_22.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_22ActionPerformed

    private void b_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_23ActionPerformed
           if(b_23.getIcon()==gr){
      setGreen(b_23, 3, 7);
      b_23.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_23.getIcon()==bl){
      setBlack(b_23, 3, 7);
      b_23.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_23ActionPerformed

    private void b_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_24ActionPerformed
        if(b_24.getIcon()==gr){
      setGreen(b_24, 3, 8);
      b_24.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_24.getIcon()==bl){
      setBlack(b_24, 3, 8);
      b_24.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_24ActionPerformed

    private void b_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_25ActionPerformed
         if(b_25.getIcon()==gr){
      setGreen(b_25, 4, 1);
      b_25.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_25.getIcon()==bl){
      setBlack(b_25, 4, 1);
      b_25.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_25ActionPerformed

    private void b_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_26ActionPerformed
        if(b_26.getIcon()==gr){
      setGreen(b_26, 4, 2);
      b_26.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_26.getIcon()==bl){
      setBlack(b_26, 4, 2);
      b_26.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_26ActionPerformed

    private void b_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_27ActionPerformed
        if(b_27.getIcon()==gr){
      setGreen(b_27, 4, 3);
      b_27.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_27.getIcon()==bl){
      setBlack(b_27, 4, 3);
      b_27.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_27ActionPerformed

    private void b_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_28ActionPerformed
         if(b_28.getIcon()==gr){
      setGreen(b_28, 4, 4);
      b_28.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_28.getIcon()==bl){
      setBlack(b_28, 4, 4);
      b_28.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_28ActionPerformed

    private void b_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_29ActionPerformed
          if(b_29.getIcon()==gr){
      setGreen(b_29, 4, 5);
      b_29.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_29.getIcon()==bl){
      setBlack(b_29, 4, 5);
      b_29.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_29ActionPerformed

    private void b_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_30ActionPerformed
   if(b_30.getIcon()==gr){
      setGreen(b_30, 4, 6);
      b_30.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_30.getIcon()==bl){
      setBlack(b_30, 4, 6);
      b_30.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_30ActionPerformed

    private void b_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_31ActionPerformed
       if(b_31.getIcon()==gr){
      setGreen(b_31, 4, 7);
      b_31.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_31.getIcon()==bl){
      setBlack(b_31, 4, 7);
      b_31.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_31ActionPerformed

    private void b_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_32ActionPerformed
         if(b_32.getIcon()==gr){
      setGreen(b_32, 4, 8);
      b_32.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_32.getIcon()==bl){
      setBlack(b_32, 4, 8);
      b_32.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_32ActionPerformed

    private void b_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_33ActionPerformed
        if(b_33.getIcon()==gr){
      setGreen(b_33, 5, 1);
      b_33.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_33.getIcon()==bl){
      setBlack(b_33, 5, 1);
      b_33.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_33ActionPerformed

    private void b_34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_34ActionPerformed
         if(b_34.getIcon()==gr){
      setGreen(b_34, 5, 2);
      b_34.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_34.getIcon()==bl){
      setBlack(b_34, 5, 2);
      b_34.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_34ActionPerformed

    private void b_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_35ActionPerformed
         if(b_35.getIcon()==gr){
      setGreen(b_35, 5, 3);
      b_35.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_35.getIcon()==bl){
      setBlack(b_35, 5, 3);
      b_35.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_35ActionPerformed

    private void b_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_36ActionPerformed
       if(b_36.getIcon()==gr){
      setGreen(b_36, 5, 4);
      b_36.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_36.getIcon()==bl){
      setBlack(b_36, 5, 4);
      b_36.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_36ActionPerformed

    private void b_37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_37ActionPerformed
       if(b_37.getIcon()==gr){
      setGreen(b_37, 5, 5);
      b_37.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_37.getIcon()==bl){
      setBlack(b_37, 5, 5);
      b_37.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_37ActionPerformed

    private void b_38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_38ActionPerformed
       if(b_38.getIcon()==gr){
      setGreen(b_38, 5, 6);
      b_38.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_38.getIcon()==bl){
      setBlack(b_38, 5, 6);
      b_38.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_38ActionPerformed

    private void b_39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_39ActionPerformed
        if(b_39.getIcon()==gr){
      setGreen(b_39, 5, 7);
      b_39.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_39.getIcon()==bl){
      setBlack(b_39, 5, 7);
      b_39.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_39ActionPerformed

    private void b_40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_40ActionPerformed
        if(b_40.getIcon()==gr){
      setGreen(b_40, 5, 8);
      b_40.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_40.getIcon()==bl){
      setBlack(b_40, 5, 8);
      b_40.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_40ActionPerformed

    private void b_41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_41ActionPerformed
        if(b_41.getIcon()==gr){
      setGreen(b_41, 6, 1);
      b_41.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_41.getIcon()==bl){
      setBlack(b_41, 6, 1);
      b_41.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_41ActionPerformed

    private void b_42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_42ActionPerformed
         if(b_42.getIcon()==gr){
      setGreen(b_42, 6, 2);
      b_42.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_42.getIcon()==bl){
      setBlack(b_42, 6, 2);
      b_42.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_42ActionPerformed

    private void b_43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_43ActionPerformed
        if(b_43.getIcon()==gr){
      setGreen(b_43, 6, 3);
      b_43.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_43.getIcon()==bl){
      setBlack(b_43, 6, 3);
      b_43.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_43ActionPerformed

    private void b_44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_44ActionPerformed
           if(b_44.getIcon()==gr){
      setGreen(b_44, 6, 4);
      b_44.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_44.getIcon()==bl){
      setBlack(b_44, 6, 4);
      b_44.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_44ActionPerformed

    private void b_45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_45ActionPerformed
         if(b_45.getIcon()==gr){
      setGreen(b_45, 6, 5);
      b_45.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_45.getIcon()==bl){
      setBlack(b_45, 6, 5);
      b_45.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_45ActionPerformed

    private void b_46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_46ActionPerformed
         if(b_46.getIcon()==gr){
      setGreen(b_46, 6, 6);
      b_46.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_46.getIcon()==bl){
      setBlack(b_46, 6, 6);
      b_46.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_46ActionPerformed

    private void b_47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_47ActionPerformed
          if(b_47.getIcon()==gr){
      setGreen(b_47, 6, 7);
      b_47.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_47.getIcon()==bl){
      setBlack(b_47, 6, 7);
      b_47.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_47ActionPerformed

    private void b_48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_48ActionPerformed
        if(b_48.getIcon()==gr){
      setGreen(b_48, 6, 8);
      b_48.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_48.getIcon()==bl){
      setBlack(b_48, 6, 8);
      b_48.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_48ActionPerformed

    private void b_49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_49ActionPerformed
        if(b_49.getIcon()==gr){
      setGreen(b_49, 7, 1);
      b_49.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_49.getIcon()==bl){
      setBlack(b_49, 7, 1);
      b_49.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_49ActionPerformed

    private void b_50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_50ActionPerformed
       if(b_50.getIcon()==gr){
      setGreen(b_50, 7, 2);
      b_50.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_50.getIcon()==bl){
      setBlack(b_50, 7, 2);
      b_50.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_50ActionPerformed

    private void b_51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_51ActionPerformed
           if(b_51.getIcon()==gr){
      setGreen(b_51, 7, 3);
      b_51.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_51.getIcon()==bl){
      setBlack(b_51, 7, 3);
      b_51.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_51ActionPerformed

    private void b_52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_52ActionPerformed
       if(b_52.getIcon()==gr){
      setGreen(b_52, 7, 4);
      b_52.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_52.getIcon()==bl){
      setBlack(b_52, 7, 4);
      b_52.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_52ActionPerformed

    private void b_53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_53ActionPerformed
          if(b_53.getIcon()==gr){
      setGreen(b_53, 7, 5);
      b_53.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_53.getIcon()==bl){
      setBlack(b_53, 7, 5);
      b_53.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_53ActionPerformed

    private void b_54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_54ActionPerformed
          if(b_54.getIcon()==gr){
      setGreen(b_54, 7, 6);
      b_54.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_54.getIcon()==bl){
      setBlack(b_54, 7, 6);
      b_54.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_54ActionPerformed
    private void b_55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_55ActionPerformed
         if(b_55.getIcon()==gr){
      setGreen(b_55, 7, 7);
      b_55.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_55.getIcon()==bl){
      setBlack(b_55, 7, 7);
      b_55.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_55ActionPerformed

    private void b_56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_56ActionPerformed
      if(b_56.getIcon()==gr){
      setGreen(b_56, 7, 8);
      b_56.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_56.getIcon()==bl){
      setBlack(b_56, 7, 8);
      b_56.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_56ActionPerformed

    private void b_57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_57ActionPerformed
       if(b_57.getIcon()==gr){
      setGreen(b_57, 8, 1);
      b_57.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_57.getIcon()==bl){
      setBlack(b_57, 8, 1);
      b_57.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_57ActionPerformed

    private void b_58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_58ActionPerformed
        if(b_58.getIcon()==gr){
      setGreen(b_58, 8, 2);
      b_58.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_58.getIcon()==bl){
      setBlack(b_58, 8, 2);
      b_58.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_58ActionPerformed

    private void b_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_59ActionPerformed
       if(b_59.getIcon()==gr){
      setGreen(b_59, 8, 3);
      b_59.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_59.getIcon()==bl){
      setBlack(b_59, 8, 3);
      b_59.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_59ActionPerformed

    private void b_60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_60ActionPerformed
        if(b_60.getIcon()==gr){
      setGreen(b_60, 8, 4);
      b_60.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_60.getIcon()==bl){
      setBlack(b_60, 8, 4);
      b_60.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_60ActionPerformed

    private void b_61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_61ActionPerformed
       if(b_61.getIcon()==gr){
      setGreen(b_61, 8, 5);
      b_61.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_61.getIcon()==bl){
      setBlack(b_61, 8, 5);
      b_61.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_61ActionPerformed

    private void b_62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_62ActionPerformed
        if(b_62.getIcon()==gr){
      setGreen(b_62, 8, 6);
      b_62.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_62.getIcon()==bl){
      setBlack(b_62, 8, 6);
      b_62.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_62ActionPerformed

    private void b_63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_63ActionPerformed
          if(b_63.getIcon()==gr){
      setGreen(b_63, 8, 7);
      b_63.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_63.getIcon()==bl){
      setBlack(b_63, 8, 7);
      b_63.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_63ActionPerformed

    private void b_64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_64ActionPerformed
      if(b_64.getIcon()==gr){
      setGreen(b_64, 8, 8);
      b_64.setIcon(green1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerGreen();
      end++;
      if(end==60)
          End();
       }
        if(b_64.getIcon()==bl){
      setBlack(b_64, 8, 8);
      b_64.setIcon(black1);
      clearHelp();
      changeTurn();
      checkTurn();
      freeButton();
      BuggerBlack();
      end++;
      if(end==60)
          End();
    } 
    }//GEN-LAST:event_b_64ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        makeButton();
        b[4][4].setIcon(green1);
        b[4][5].setIcon(black1);
        b[5][4].setIcon(black1);
        b[5][5].setIcon(green1);
        freeButton();
        checkTurn();
        start.setEnabled(false);
    }//GEN-LAST:event_startActionPerformed


//     Methods 
    public void makeButton(){
        b[1][1] = b_1;
        b[1][2] = b_2;
        b[1][3] = b_3;
        b[1][4] = b_4;
        b[1][5] = b_5;
        b[1][6] = b_6;
        b[1][7] = b_7;
        b[1][8] = b_8;
        b[2][1] = b_9;
        b[2][2] = b_10;
        b[2][3] = b_11;
        b[2][4] = b_12;
        b[2][5] = b_13;
        b[2][6] = b_14;
        b[2][7] = b_15;
        b[2][8] = b_16;
        b[3][1] = b_17;
        b[3][2] = b_18;
        b[3][3] = b_19;
        b[3][4] = b_20;
        b[3][5] = b_21;
        b[3][6] = b_22;
        b[3][7] = b_23;
        b[3][8] = b_24;
        b[4][1] = b_25;
        b[4][2] = b_26;
        b[4][3] = b_27;
        b[4][4] = b_28;
        b[4][5] = b_29;
        b[4][6] = b_30;
        b[4][7] = b_31;
        b[4][8] = b_32;
        b[5][1] = b_33;
        b[5][2] = b_34;
        b[5][3] = b_35;
        b[5][4] = b_36;
        b[5][5] = b_37;
        b[5][6] = b_38;
        b[5][7] = b_39;
        b[5][8] = b_40;
        b[6][1] = b_41;
        b[6][2] = b_42;
        b[6][3] = b_43;
        b[6][4] = b_44;
        b[6][5] = b_45;
        b[6][6] = b_46;
        b[6][7] = b_47;
        b[6][8] = b_48;
        b[7][1] = b_49;
        b[7][2] = b_50;
        b[7][3] = b_51;
        b[7][4] = b_52;
        b[7][5] = b_53;
        b[7][6] = b_54;
        b[7][7] = b_55;
        b[7][8] = b_56;
        b[8][1] = b_57;
        b[8][2] = b_58;
        b[8][3] = b_59;
        b[8][4] = b_60;
        b[8][5] = b_61;
        b[8][6] = b_62;
        b[8][7] = b_63;
        b[8][8] = b_64;
    }
// ----------------------------------------------------------------//
    public void freeButton(){
        for(int i=1 ; i<=8 ; i++){
            for(int j=1 ; j<=8 ; j++){
                if((b[i][j].getIcon()!=green1)&&(b[i][j].getIcon()!=black1)){
// تا به اینجا خانه ی خالی مشخص می شود                    
                    for(int m=1 ; m<=8 ; m++){
                        for(int n=1 ; n<=8 ; n++ ){
                            int c =0 ;
// از اینجا به بعد هم خانه ی پر                            
                            if((b[m][n].getIcon()==green1)){  // start green
                            if(turn==true){
                            if((i==m)&&((j-n>=2)||(j-n<=-2))){ // satr
                                if(j>n){                       // p.one satr
                                    for(int k=n ; k<=j ; k++){
                                        if(b[i][k].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(j-n-1)){
                                        b[i][j].setIcon(gr);
                                    }
                                    }
                                else{                         //p.two satr
                                    for( int k=j ; k<=n ; k++){
                                        if(b[i][k].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(n-j-1)){
                                        b[i][j].setIcon(gr);
                                    }
                                }
                            }
                            if((j==n)&&((i-m>=2)||(i-m<=-2))){ // soton
                            c=0;
                            if(i>m){                           //p.one soton
                                for(int l=m ; l<=i ; l++){
                                    if(b[l][j].getIcon()==black1){
                                        c++;
                                    }
                                }
                                if(c==(i-m-1)){
                                    b[i][j].setIcon(gr);
                                }
                            }
                            else{                             //p.two soton
                                for( int l=i ; l<=m ; l++){
                                    if(b[l][j].getIcon()==black1){
                                        c++;
                                }
                            }
                             if(c==(m-i-1)){
                                    b[i][j].setIcon(gr);   
                            }
                            }
                            }
                            if((i-m==j-n)&&((i-m>=2)||(i-m<=-2))){   // R.movarab
                                c=0;
                                if(i<m){                             // p.one R.movarab
                                    for(int d=1; d<=m-i-1 ; d++){
                                        if(b[i+d][j+d].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(m-i-1)){
                                        b[i][j].setIcon(gr);
                                    }
                                }
                                else{                              // p.two R.movarab
                                    c=0;
                                    for(int d= 1 ; d<=i-m-1 ; d++){
                                        if(b[m+d][n+d].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(i-m-1)){
                                        b[i][j].setIcon(gr);
                                    }
                                } 
                            }
                            if((i+j==m+n)&&((i-m<=-2)||(i-m>=2))){    // L.movarab
                                c=0;
                                if(i<m){                              // p.one L.movarab
                                    for(int g=1 ; g<=m-i-1 ; g++){
                                        if(b[i+g][j-g].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(m-i-1)){
                                        b[i][j].setIcon(gr);
                                    }
                                }
                                else{                              //p.two L.movarab
                                    for(int g=1 ; g<=i-m-1 ; g++){
                                        if(b[i-g][j+g].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(i-m-1)){
                                        b[i][j].setIcon(gr);
                                    }
                                }
                            }
                            }
                            }
                            if((b[m][n].getIcon()==black1)){    //black
                                if(turn==false){
                                    c=0;
                              if((i==m)&&((j-n>=2)||(j-n<=-2))){ // satri
                                if(j>n){                         //p.one satri
                                    for(int k=n ; k<=j ; k++){
                                        if(b[i][k].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(j-n-1)){
                                        b[i][j].setIcon(bl);
                                    }
                                    c=0;
                                    }
                                else{                            //p.two satri
                                    c=0;
                                    for( int q=j ; q<=n ; q++){
                                        if(b[i][q].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(n-j-1)){
                                        b[i][j].setIcon(bl);
                                    }
                                }
                            }
                            if((j==n)&&((i-m>=2)||(i-m<=-2))){     //sotoni
                            c=0;
                            if(i>m){                               //p.one sotoni
                                for(int l=m ; l<=i ; l++){
                                    if(b[l][j].getIcon()==green1){
                                        c++;
                                    }
                                }
                                if(c==(i-m-1)){
                                    b[i][j].setIcon(bl);
                                }
                            }
                            else{                                 //p.two sotoni
                                for( int l=i ; l<=m ; l++){
                                    if(b[l][j].getIcon()==green1){
                                        c++;
                                }
                            }
                             if(c==(m-i-1)){
                                    b[i][j].setIcon(bl);   
                            }
                            }
                            }
                            if((i-m==j-n)&&((i-m>=2)||(i-m<=-2))){  //R.movarab
                                c=0;
                                if(i<m){                            // p.one R.movarab
                                    for(int d=1; d<=m-i-1 ; d++){
                                        if(b[i+d][j+d].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(m-i-1)){
                                        b[i][j].setIcon(bl);
                                    }
                                }
                                else{                              // p.two R.movarab
                                    c=0;
                                    for(int d= 1 ; d<=i-m-1 ; d++){
                                        if(b[m+d][n+d].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(i-m-1)){
                                        b[i][j].setIcon(bl);
                                    }
                                } 
                            }
                            if((i+j==m+n)&&((i-m<=-2)||(i-m>=2))){    // L.movarab
                                c=0;
                                if(i<m){                              // p.one L.movarab
                                    for(int g=1 ; g<=m-i-1 ; g++){
                                        if(b[i+g][j-g].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(m-i-1)){
                                        b[i][j].setIcon(bl);
                                    }
                                }
                                else{                              //p.two L.movarab
                                    for(int g=1 ; g<=i-m-1 ; g++){
                                        if(b[i-g][j+g].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(i-m-1)){
                                        b[i][j].setIcon(bl);
                                    }
                                }
                            }
                            }
                        }
                    }
                }
            }
        }
    }   
        }
// ----------------------------------------------------------------//
    public void setGreen(JButton btn,int i, int j){
        for( int m =1 ;m <=8 ; m++){
            for( int n =1 ;n<=8 ; n++){
                if((b[m][n].getIcon()==green1)){
                if((i==m)&&((j-n>=2)||(j-n<=-2))){
                    int c=0;
                    if(j>n){                       // p.one satr
                                    for(int k=n ; k<=j ; k++){
                                        if(b[i][k].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(j-n-1)){
                                        for(int k=n ; k<=j ; k++){
                                        b[i][k].setIcon(green1);
                                        }
                                    }
                                    }
                                else{                         //p.two satr
                                    for( int k=j ; k<=n ; k++){
                                        if(b[i][k].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(n-j-1)){
                                        for(int k=j ; k<=n ; k++){
                                        b[i][k].setIcon(green1);
                                        }
                                    }
                                }
                }
                  if((j==n)&&((i-m>=2)||(i-m<=-2))){ // soton
                            int c=0;
                            if(i>m){                           //p.one soton
                                for(int l=m ; l<=i ; l++){
                                    if(b[l][j].getIcon()==black1){
                                        c++;
                                    }
                                }
                                if(c==(i-m-1)){
                                    for(int l=m ; l<=i ; l++){
                                    b[l][j].setIcon(green1);
                                    }
                                }
                            }
                            else{                             //p.two soton
                                for( int l=i ; l<=m ; l++){
                                    if(b[l][j].getIcon()==black1){
                                        c++;
                                }
                            }
                             if(c==(m-i-1)){
                                 for( int l=i ; l<=m ; l++){
                                    b[l][j].setIcon(green1);   
                                 }
                            }
                            }
                  }
                   if((i-m==j-n)&&((i-m>=2)||(i-m<=-2))){   // R.movarab
                             int   c=0;
                                if(i<m){                             // p.one R.movarab
                                    for(int d=1; d<=m-i-1 ; d++){
                                        if(b[i+d][j+d].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(m-i-1)){
                                        for(int d=1; d<=m-i-1 ; d++){
                                        b[i+d][j+d].setIcon(green1);
                                        }
                                    }
                                }
                                else{                              // p.two R.movarab
                                    c=0;
                                    for(int d= 1 ; d<=i-m-1 ; d++){
                                        if(b[m+d][n+d].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(i-m-1)){
                                        for(int d= 1 ; d<=i-m-1 ; d++){
                                        b[m+d][n+d].setIcon(green1);
                                        }
                                    }
                                } 
                            }
                   if((i+j==m+n)&&((i-m<=-2)||(i-m>=2))){    // L.movarab
                              int  c=0;
                                if(i<m){                              // p.one L.movarab
                                    for(int g=1 ; g<=m-i-1 ; g++){
                                        if(b[i+g][j-g].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(m-i-1)){
                                        for(int g=1 ; g<=m-i-1 ; g++){
                                        b[i+g][j-g].setIcon(green1);
                                        }
                                    }
                                }
                                else{                              //p.two L.movarab
                                    for(int g=1 ; g<=i-m-1 ; g++){
                                        if(b[i-g][j+g].getIcon()==black1){
                                            c++;
                                        }
                                    }
                                    if(c==(i-m-1)){
                                        for(int g=1 ; g<=i-m-1 ; g++){
                                        b[i-g][j+g].setIcon(green1);
                                        }
                                    }
                                }
                            }
                }
            }
        }
    }
// ----------------------------------------------------------------//
    public void setBlack(JButton btn,int i, int j){
        for( int m =1 ;m <=8 ; m++){
            for( int n =1 ;n<=8 ; n++){
                if((b[m][n].getIcon()==black1)){
                if((i==m)&&((j-n>=2)||(j-n<=-2))){
                    int c=0;
                    if(j>n){                       // p.one satr
                                    for(int k=n ; k<=j ; k++){
                                        if(b[i][k].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(j-n-1)){
                                        for(int k=n ; k<=j ; k++){
                                        b[i][k].setIcon(black1);
                                        }
                                    }
                                    }
                                else{                         //p.two satr
                                    for( int k=j ; k<=n ; k++){
                                        if(b[i][k].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(n-j-1)){
                                        for(int k=j ; k<=n ; k++){
                                        b[i][k].setIcon(black1);
                                        }
                                    }
                                }
                }
                  if((j==n)&&((i-m>=2)||(i-m<=-2))){ // soton
                            int c=0;
                            if(i>m){                           //p.one soton
                                for(int l=m ; l<=i ; l++){
                                    if(b[l][j].getIcon()==green1){
                                        c++;
                                    }
                                }
                                if(c==(i-m-1)){
                                    for(int l=m ; l<=i ; l++){
                                    b[l][j].setIcon(black1);
                                    }
                                }
                            }
                            else{                             //p.two soton
                                for( int l=i ; l<=m ; l++){
                                    if(b[l][j].getIcon()==green1){
                                        c++;
                                }
                            }
                             if(c==(m-i-1)){
                                 for( int l=i ; l<=m ; l++){
                                    b[l][j].setIcon(black1);   
                                 }
                            }
                            }
                  }
                   if((i-m==j-n)&&((i-m>=2)||(i-m<=-2))){   // R.movarab
                             int   c=0;
                                if(i<m){                             // p.one R.movarab
                                    for(int d=1; d<=m-i-1 ; d++){
                                        if(b[i+d][j+d].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(m-i-1)){
                                        for(int d=1; d<=m-i-1 ; d++){
                                        b[i+d][j+d].setIcon(black1);
                                        }
                                    }
                                }
                                else{                              // p.two R.movarab
                                    c=0;
                                    for(int d= 1 ; d<=i-m-1 ; d++){
                                        if(b[m+d][n+d].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(i-m-1)){
                                        for(int d= 1 ; d<=i-m-1 ; d++){
                                        b[m+d][n+d].setIcon(black1);
                                        }
                                    }
                                } 
                            }
                   if((i+j==m+n)&&((i-m<=-2)||(i-m>=2))){    // L.movarab
                              int  c=0;
                                if(i<m){                              // p.one L.movarab
                                    for(int g=1 ; g<=m-i-1 ; g++){
                                        if(b[i+g][j-g].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(m-i-1)){
                                        for(int g=1 ; g<=m-i-1 ; g++){
                                        b[i+g][j-g].setIcon(black1);
                                        }
                                    }
                                }
                                else{                              //p.two L.movarab
                                    for(int g=1 ; g<=i-m-1 ; g++){
                                        if(b[i-g][j+g].getIcon()==green1){
                                            c++;
                                        }
                                    }
                                    if(c==(i-m-1)){
                                        for(int g=1 ; g<=i-m-1 ; g++){
                                        b[i-g][j+g].setIcon(black1);
                                        }
                                    }
                                }
                            }
                }
            }
        }
    }    
// ----------------------------------------------------------------//    
    public void changeTurn(){
        turn=!turn;
    }
// ----------------------------------------------------------------//    
    public void checkTurn(){
        if(turn==true){
            turnShow.setForeground(green);
            turnShow.setText("Green Turn");
        }
        else{
            turnShow.setForeground(black);
            turnShow.setText("Black Turn");
        } 
        }
// -----------------------------------------------------------------//
    public void clearHelp(){
        for(int i=1; i<=8 ; i++){
            for(int j=1 ; j<=8 ; j++){
                if((b[i][j].getIcon()==gr)||(b[i][j].getIcon()==bl)){
                    b[i][j].setIcon(null);
                }
            }
        }
    }
// -----------------------------------------------------------------//
    public void End(){
        int G = 0;
        int B = 0;
        for(int i =1 ; i<=8 ;i++){
            for(int j=1 ; j<=8 ;j++){
                if(b[i][j].getIcon()==green1){
                    G++;
                }
                if(b[i][j].getIcon()==black1){
                    B++;
                }
            }
        }
        if(G>B){
            JOptionPane.showMessageDialog(null,"The Green Wins   :) ","Congratulations!  ",JOptionPane.INFORMATION_MESSAGE);
        }
        if(B>G){
            JOptionPane.showMessageDialog(null,"The Black Wins   :) ","Congratulations!  ",JOptionPane.INFORMATION_MESSAGE);
        }
        if(B==G){
            JOptionPane.showMessageDialog(null,"No Winer     :( ","The Equal  ",JOptionPane.INFORMATION_MESSAGE);
        }
        turnShow.setText("The End");
    }
// ----------------------------------------------------------------//
    public void BuggerBlack(){
        int r =0;
        for(int i=1 ; i<=8 ; i++){
            for(int j=1 ; j<=8 ; j++){
              if(b[i][j].getIcon()==gr){
                  r++;
              }  
            }
        }
        if(r==0){
            changeTurn();
            checkTurn();
            freeButton();
        }
    }
// ----------------------------------------------------------------//
    public void BuggerGreen(){
        int r =0;
        for(int i=1 ; i<=8 ; i++){
            for(int j=1 ; j<=8 ; j++){
              if(b[i][j].getIcon()==bl){
                  r++;
              }  
            }
        }
        if(r==0){
            changeTurn();
            checkTurn();
            freeButton();
        }
    }
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
            java.util.logging.Logger.getLogger(jothello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jothello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jothello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jothello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jothello().setVisible(true);
        }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_1;
    private javax.swing.JButton b_10;
    private javax.swing.JButton b_11;
    private javax.swing.JButton b_12;
    private javax.swing.JButton b_13;
    private javax.swing.JButton b_14;
    private javax.swing.JButton b_15;
    private javax.swing.JButton b_16;
    private javax.swing.JButton b_17;
    private javax.swing.JButton b_18;
    private javax.swing.JButton b_19;
    private javax.swing.JButton b_2;
    private javax.swing.JButton b_20;
    private javax.swing.JButton b_21;
    private javax.swing.JButton b_22;
    private javax.swing.JButton b_23;
    private javax.swing.JButton b_24;
    private javax.swing.JButton b_25;
    private javax.swing.JButton b_26;
    private javax.swing.JButton b_27;
    private javax.swing.JButton b_28;
    private javax.swing.JButton b_29;
    private javax.swing.JButton b_3;
    private javax.swing.JButton b_30;
    private javax.swing.JButton b_31;
    private javax.swing.JButton b_32;
    private javax.swing.JButton b_33;
    private javax.swing.JButton b_34;
    private javax.swing.JButton b_35;
    private javax.swing.JButton b_36;
    private javax.swing.JButton b_37;
    private javax.swing.JButton b_38;
    private javax.swing.JButton b_39;
    private javax.swing.JButton b_4;
    private javax.swing.JButton b_40;
    private javax.swing.JButton b_41;
    private javax.swing.JButton b_42;
    private javax.swing.JButton b_43;
    private javax.swing.JButton b_44;
    private javax.swing.JButton b_45;
    private javax.swing.JButton b_46;
    private javax.swing.JButton b_47;
    private javax.swing.JButton b_48;
    private javax.swing.JButton b_49;
    private javax.swing.JButton b_5;
    private javax.swing.JButton b_50;
    private javax.swing.JButton b_51;
    private javax.swing.JButton b_52;
    private javax.swing.JButton b_53;
    private javax.swing.JButton b_54;
    private javax.swing.JButton b_55;
    private javax.swing.JButton b_56;
    private javax.swing.JButton b_57;
    private javax.swing.JButton b_58;
    private javax.swing.JButton b_59;
    private javax.swing.JButton b_6;
    private javax.swing.JButton b_60;
    private javax.swing.JButton b_61;
    private javax.swing.JButton b_62;
    private javax.swing.JButton b_63;
    private javax.swing.JButton b_64;
    private javax.swing.JButton b_7;
    private javax.swing.JButton b_8;
    private javax.swing.JButton b_9;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JButton start;
    private javax.swing.JLabel turnShow;
    // End of variables declaration//GEN-END:variables
}
