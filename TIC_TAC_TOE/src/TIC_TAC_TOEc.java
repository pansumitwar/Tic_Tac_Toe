
import static java.awt.Color.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sumitbhaiji
 */
public class TIC_TAC_TOEc extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOEc
     */
    
    private String turn = "O";
    private String btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private int xcount=0;
    private int ycount=0;
    private int totalCount=0;
    public TIC_TAC_TOEc() {
        initComponents();
    }
    
    private void choosePlayer()
    {
        if(turn.equalsIgnoreCase("X"))
            turn="O";
        else
            turn="X";
    }
    
    private void setScore(){
        xscore.setText(String.valueOf(xcount));
        yscore.setText(String.valueOf(ycount));
    }
    
    private void reset()
    {
        totalCount=0;
        
        txtbtn1.setText("");
        txtbtn2.setText("");
        txtbtn3.setText("");
        txtbtn4.setText("");
        txtbtn5.setText("");
        txtbtn6.setText("");
        txtbtn7.setText("");
        txtbtn8.setText("");
        txtbtn9.setText("");
        
        txtbtn1.setBackground(white);
        txtbtn2.setBackground(white);
        txtbtn3.setBackground(white);
        txtbtn4.setBackground(white);
        txtbtn5.setBackground(white);
        txtbtn6.setBackground(white);
        txtbtn7.setBackground(white);
        txtbtn8.setBackground(white);
        txtbtn9.setBackground(white);
        
        btn1 = "";
        btn2 = "";
        btn3 = "";
        btn4 = "";
        btn5 = "";
        btn6 = "";
        btn7 = "";
        btn8 = "";
        btn9 = "";
    }
    private void winingGame(){
        if(totalCount==9)
        {
            txtbtn1.setBackground(pink);
            txtbtn2.setBackground(pink);
            txtbtn3.setBackground(pink);
            txtbtn4.setBackground(pink);
            txtbtn5.setBackground(pink);
            txtbtn6.setBackground(pink);
            txtbtn7.setBackground(pink);
            txtbtn8.setBackground(pink);
            txtbtn9.setBackground(pink);
            JOptionPane.showMessageDialog(this, "Match Draw","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
            return;
        }
        btn1 = txtbtn1.getText();
        btn2 = txtbtn2.getText();
        btn3 = txtbtn3.getText();
        btn4 = txtbtn4.getText();
        btn5 = txtbtn5.getText();
        btn6 = txtbtn6.getText();
        btn7 = txtbtn7.getText();
        btn8 = txtbtn8.getText();
        btn9 = txtbtn9.getText();
        
        if(btn1!="" && btn1.equals(btn2) && btn1.equals(btn3)){
            if(btn1=="X")
                xcount++;
            else
                ycount++;
            txtbtn1.setBackground(orange);
            txtbtn2.setBackground(orange);
            txtbtn3.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player "+btn1+" Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            
            setScore();
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
        else if(btn4!="" && btn4.equals(btn5) && btn4.equals(btn6)){
            if(btn4=="X")
                xcount++;
            else
                ycount++;
            txtbtn4.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn6.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player "+btn4+" Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
        else if(btn7!="" && btn7.equals(btn8) && btn7.equals(btn9)){
            if(btn7=="X")
                xcount++;
            else
                ycount++;
            txtbtn7.setBackground(orange);
            txtbtn8.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player "+btn7+" Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
        if(btn1!="" && btn1.equals(btn4) && btn1.equals(btn7)){
            if(btn1=="X")
                xcount++;
            else
                ycount++;
            txtbtn1.setBackground(orange);
            txtbtn4.setBackground(orange);
            txtbtn7.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player "+btn1+" Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
        else if(btn2!="" && btn2.equals(btn5) && btn2.equals(btn8)){
            if(btn2=="X")
                xcount++;
            else
                ycount++;
            txtbtn2.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn8.setBackground(orange);
            setScore();
            JOptionPane.showMessageDialog(this, "Player "+btn2+" Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
        else if(btn3!="" && btn3.equals(btn6) && btn3.equals(btn9)){
            if(btn3=="X")
                xcount++;
            else
                ycount++;
            txtbtn3.setBackground(orange);
            txtbtn6.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player "+btn3+" Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
        else if(btn1!="" && btn1.equals(btn5) && btn1.equals(btn9)){
            if(btn1=="X")
                xcount++;
            else
                ycount++;
            txtbtn1.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn9.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player "+btn1+" Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
        else if(btn3!="" && btn3.equals(btn5) && btn3.equals(btn7)){
            if(btn3=="X")
                xcount++;
            else
                ycount++;
            txtbtn3.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn7.setBackground(orange);
            JOptionPane.showMessageDialog(this, "Player "+btn3+" Won","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(Level.SEVERE, null, ex);
            }
            reset();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        yscore = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtbtn2.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn5.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(153, 255, 51));
        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 0, 0));
        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PLAYER X    :");

        xscore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xscore.setForeground(new java.awt.Color(0, 153, 0));
        xscore.setText("0");

        yscore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yscore.setForeground(new java.awt.Color(0, 153, 0));
        yscore.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PLAYER O    :");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCORECARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yscore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xscore))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xscore, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yscore, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(exitbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addComponent(resetbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        if(txtbtn2.getText()!="")
            return;
        txtbtn2.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn2.setForeground(red);
        }
        else
        {
            txtbtn2.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
        
//        txtbtn2.setEnabled(false);
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        JFrame frame = new JFrame("EXIT");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","TIC_TAC_TOE",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
            System.exit(0);
        
    }//GEN-LAST:event_exitbtnActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        if(txtbtn1.getText()!="")
            return;
        txtbtn1.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn1.setForeground(red);
        }
        else
        {
            txtbtn1.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
//        txtbtn1.setEnabled(false);
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        if(txtbtn3.getText()!="")
            return;
        txtbtn3.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn3.setForeground(red);
        }
        else
        {
            txtbtn3.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
//        txtbtn3.setEnabled(false);
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        if(txtbtn4.getText()!="")
            return;
        txtbtn4.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn4.setForeground(red);
        }
        else
        {
            txtbtn4.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
//        txtbtn4.setEnabled(false);
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        if(txtbtn5.getText()!="")
            return;
        txtbtn5.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn5.setForeground(red);
        }
        else
        {
            txtbtn5.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
//        txtbtn5.setEnabled(false);
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        if(txtbtn6.getText()!="")
            return;
        txtbtn6.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn6.setForeground(red);
        }
        else
        {
            txtbtn6.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
//        txtbtn6.setEnabled(false);
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        if(txtbtn7.getText()!="")
            return;
        txtbtn7.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn7.setForeground(red);
        }
        else
        {
            txtbtn7.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
//        txtbtn7.setEnabled(false);
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        if(txtbtn8.getText()!="")
            return;
        txtbtn8.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn8.setForeground(red);
        }
        else
        {
            txtbtn8.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
//        txtbtn8.setEnabled(false);
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        if(txtbtn9.getText()!="")
            return;
        txtbtn9.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn9.setForeground(red);
        }
        else
        {
            txtbtn9.setForeground(magenta);
        }
        totalCount++;
        winingGame();
        
        choosePlayer();
//        txtbtn9.setEnabled(false);
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        reset();
    }//GEN-LAST:event_resetbtnActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOEc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JLabel xscore;
    private javax.swing.JLabel yscore;
    // End of variables declaration//GEN-END:variables
}
