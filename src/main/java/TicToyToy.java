
import javax.swing.JOptionPane;


public class TicToyToy extends javax.swing.JFrame {

    int turn=2;
    int p1s=0;
    int p2s=0;
    int b1flag=0;
    int b2flag=0;
    int b3flag=0;
    int b4flag=0;
    int b5flag=0;
    int b6flag=0;
    int b7flag=0;
    int b8flag=0;
    int b9flag=0;
    String player1,player2;
    public TicToyToy() {
       initComponents(); 
      }
    
     public TicToyToy(String player1,String player2) {
       initComponents(); 
       this.player1=player1;
        this.player2=player2;
        p1Name.setText(player1);
        p2Name.setText(player2);
    
       
    }
      void setAllBtnEnable(){
      b1flag=0;
      b2flag=0;
      b3flag=0;
      b4flag=0;
      b5flag=0;
      b6flag=0;
      b7flag=0;
      b8flag=0;
      b9flag=0;
    }
    void setAllBtnDisable(){
        b1flag=1;
        b2flag=1;
        b3flag=1;
        b4flag=1;
        b5flag=1;
        b6flag=1;
        b7flag=1;
        b8flag=1;
        b9flag=1;
    }
  
       
    public void checkWin(){
        if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"){
            w.setText(player2+ "Bhosri Wale Noobra");
        }
        else{
            if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"){
              w.setText(player1+ "Bhosri Wale Noobra");
        }
        
        if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"){
            w.setText(player2+ "Bhosri Wale Noobra");
        }else{
            if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O")
              w.setText(player1+ "Bhosri Wale Noobra");
        }
        
        if(b7.getText()=="X"&&b5.getText()=="X"&&b3.getText()=="X"){
            w.setText(player2+ "Bhosri Wale Noobra");
        }
        else
            if(b7.getText()=="O"&&b5.getText()=="O"&&b3.getText()=="O")
                 w.setText(player1+ "Bhosri Wale Noobra");
        
        if((b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"))
            w.setText(player2+ "Bhosri Wale Noobra");
        else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O")
              w.setText(player1+ "Bhosri Wale Noobra");
        if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X")
            w.setText(player2+ "Bhosri Wale Noobra");
        else
            if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O")
                w.setText(player1+ "Bhosri Wale Noobra");
        
        if((b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"))
           w.setText(player2+ "Bhosri Wale Noobra");
        else
            if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O")
               w.setText(player1+ "Bhosri Wale Noobra"); 
        
        if((b6.getText()=="X"&&b9.getText()=="X"&&b3.getText()=="X"))
            w.setText(player2+ "Bhosri Wale Noobra"); 
        else
            if(b6.getText()=="O"&&b9.getText()=="O"&&b3.getText()=="O")
                 w.setText(player1+ "Bhosri Wale Noobra"); 
         if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X")
           w.setText(player2+ "Bhosri Wale Noobra"); 
         else
             if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O")
                  w.setText(player1+ "Bhosri Wale Noobra"); 
   
        if((w.getText()==player1+ "Bhosri Wale Noobra")){
           p1s++;
           //set score lbl here
           String str1=String.valueOf(p1s);
           p1Score.setText(str1);
            setAllBtnDisable();
        }
        else if(w.getText()==player1+ "Bhosri Wale Noobra"){
         p2s++;
         String str2=String.valueOf(p2s);
          p2Score.setText(str2);
            setAllBtnDisable();
        }
        
            
    }
    
   
   

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        p1Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        p1Score = new javax.swing.JLabel();
        p2Name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p2Score = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnrstScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TOC TOY BY DPK");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        w.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        w.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 44, 564, 36));

        btnreset.setText("RESET GAME");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 35));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b2.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 51, 51));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel2.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 72, 67));

        b3.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 51, 51));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel2.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 72, 67));

        b9.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 51, 51));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel2.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 72, 67));

        b6.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 51, 51));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel2.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 72, 67));

        b5.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 51, 51));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel2.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 72, 67));

        b8.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 51, 51));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel2.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 72, 67));

        b7.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 51, 51));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel2.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 72, 67));

        b4.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 51, 51));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel2.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 72, 67));

        b1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 51, 51));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 72, 67));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 320, 280));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1Name.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        p1Name.setForeground(new java.awt.Color(102, 102, 255));
        p1Name.setText("NAME");
        jPanel1.add(p1Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 198, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setText("SCORE:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        p1Score.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        p1Score.setText("0");
        jPanel1.add(p1Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 31, 20));

        p2Name.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        p2Name.setForeground(new java.awt.Color(102, 102, 255));
        p2Name.setText("NAME");
        jPanel1.add(p2Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 198, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("SCORE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        p2Score.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        p2Score.setText("0");
        jPanel1.add(p2Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 240, 280));

        jButton1.setText("QUIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        jLabel3.setText("backLabel");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 540));

        btnrstScore.setText("RESET SCORE");
        btnrstScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrstScoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnrstScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(b1flag==0){
        if(turn%2==0){
            b1.setText("X");
                
        }else{
            b1.setText("O");
        }
        turn++;
        b1flag=1;
        }
      
        checkWin();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(b2flag==0){
        if(turn%2==0){
            b2.setText("X");
                
        }else{
            b2.setText("O");
        }
        turn++;
        b2flag=1;
        }
        //b2.setEnabled(false);
         checkWin();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(b3flag==0){
        if(turn%2==0){
            b3.setText("X");
                
        }else{
            b3.setText("O");
        }
        turn++;
        b3flag=1;
        }
        //b3.setEnabled(false);
         checkWin();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(b4flag==0){
        if(turn%2==0){
            b4.setText("X");
                
        }else{
            b4.setText("O");
        }
        turn++;
        b4flag=1;
        }
        //b4.setEnabled(false);
         checkWin();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       if(b5flag==0){
        if(turn%2==0){
            b5.setText("X");
                
        }else{
            b5.setText("O");
        }
        turn++;
        b5flag=1;
       }
        //b5.setEnabled(false);
         checkWin();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       if(b6flag==0){
        if(turn%2==0){
            b6.setText("X");
                
        }else{
            b6.setText("O");
        }
        turn++;
        b6flag=1;
       }
        //b6.setEnabled(false);
         checkWin();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
     if(b7flag==0){
        if(turn%2==0){
            b7.setText("X");
                
        }else{
            b7.setText("O");
        }
        turn++;
        b7flag=1;
     }
      //  b7.setEnabled(false);
         checkWin();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(b8flag==0){
        if(turn%2==0){
            b8.setText("X");
                
        }else{
            b8.setText("O");
        }
        turn++;
        b8flag=1;}
        
        //b8.setEnabled(false);
         checkWin();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
      if(b9flag==0){
        if(turn%2==0){
            b9.setText("X");
                
        }else{
            b9.setText("O");
        }
        turn++;
      b9flag=1;
      }
        
        
         checkWin();
    }//GEN-LAST:event_b9ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
      b1.setText("");
      b2.setText("");
      b3.setText("");
      b4.setText("");
      b5.setText("");
      b6.setText("");
      b7.setText("");
      b8.setText("");
      b9.setText("");
      turn=2;
     setAllBtnEnable();
      w.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnrstScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrstScoreActionPerformed
       p1Score.setText("0");
       p2Score.setText("0");
    }//GEN-LAST:event_btnrstScoreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(this,"Iski Maa Ka..Khelna Hi Nhi Tha To Aaye Kyu..Jaa Corner Se Quit Kr!! Lodu");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             TicToyToy ff=   new TicToyToy("1","1");
             ff.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnrstScore;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel p1Name;
    private javax.swing.JLabel p1Score;
    private javax.swing.JLabel p2Name;
    private javax.swing.JLabel p2Score;
    private javax.swing.JLabel w;
    // End of variables declaration//GEN-END:variables

   // private void initComponents() {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}
