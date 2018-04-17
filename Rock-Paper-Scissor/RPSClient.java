// /*
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor.
//  */
// import java.rmi.Naming;
// import java.util.*;
// /**
//  *
//  * @author vatsalsmacbook
//  */
// public class RPSClient {
//     public static void main(String[] args) {
//         try{
//             RPSIntf rps=(RPSIntf)Naming.lookup("rmi://localhost//RPSGame");
//             Scanner sc=new Scanner(System.in);
//             int id=0;
//             // sc.nextLine();
//             char ch='a';
//             char play = 't';
//             while(true){
//                 while(true){
//                     ch=sc.nextLine().charAt(0);
//                     if(ch=='r'||ch=='p'||ch=='s') break;
//                 }
//                 id=rps.register(ch);
//                 while(!rps.handPlayed());
//                 System.out.println(rps.getResult(id));
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
    
// }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.rmi.Naming;
import java.util.*;
class RPSClient extends javax.swing.JFrame {
    RPSIntf rps;
//    Scanner sc=new Scanner(System.in);
    int id=0;
    /**
     * Creates new form RPSClient
     */
    public RPSClient() {
        initComponents();
        try{
            rps=(RPSIntf)Naming.lookup("rmi://localhost//RPSGame");
        } catch (Exception ex){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Rock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Paper");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Scissor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Waiting For Input");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(81, 81, 81)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//      PAPER
        try{
            id=rps.register('p');
            while(!rps.handPlayed());
    //        System.out.println(rps.getResult(id));
            jLabel1.setText(rps.getResult(id));
        } catch(Exception ex){}
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//     `ROCK
        try{
            id=rps.register('r');
            while(!rps.handPlayed());
    //        System.out.println(rps.getResult(id));
            jLabel1.setText(rps.getResult(id));
        } catch(Exception ex){}

    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 //     `SCISSOR
        try{
            id=rps.register('s');
            while(!rps.handPlayed());
    //        System.out.println(rps.getResult(id));
            jLabel1.setText(rps.getResult(id));
        } catch(Exception ex){}
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
            java.util.logging.Logger.getLogger(RPSClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPSClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPSClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPSClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPSClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
