package com.mycompany.threadimplementation.newpackage;


public class Inicial extends javax.swing.JFrame {

    static int x, tres = 0;
    int r;
    String texto;

    class even extends Thread {

        @Override
        public void run() {
            int num1, cont = 0;
            num1 = Integer.parseInt(jTextField1.getText());
            while (num1 >= cont) {
                cont++;
                if (cont % 2 == 0 && cont <= num1) {
                    texto = jTextArea1.getText();
                    jTextArea1.setText(texto + "Even: " + cont + "\n");
                }
            }
        }
    }

    class odd extends Thread {

        @Override
        public void run() {
            int num1, cont = 0;
            num1 = Integer.parseInt(jTextField2.getText());
            while (num1 >= cont) {
                cont++;
                if (!(cont % 2 == 0) && cont <= num1) {
                    texto = jTextArea1.getText();
                    jTextArea1.setText(texto + "Odds: " + cont + "\n");
                }
            }

        }
    }

    class interval extends Thread {

        @Override
        public void run() {
            int num1, num2, cont = 0;
            num1 = Integer.parseInt(jTextField3.getText());
            num2 = Integer.parseInt(jTextField4.getText());

            if (num1 > num2) {
                while (num2 <= num1) {
                    num2++;
                    if (num2 < num1) {
                        texto = jTextArea1.getText();
                        jTextArea1.setText(texto + "Interval: " + num2 + "\n");
                    }
                }
            } else if (num1 < num2) {
                while (num1 <= num2) {
                    num1++;
                    if (num1 < num2) {
                        texto = jTextArea1.getText();
                        jTextArea1.setText(texto + "Interval: " + num1 + "\n");
                    }
                }
            } else if (num1 == num2) {
                System.out.println("Same numbers!!!");
            }
        }
    }

    public Inicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 120, 100, 52);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(110, 80, 130, 23);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(110, 120, 130, 23);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(110, 160, 130, 23);

        jLabel1.setText("Even:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 80, 60, 20);

        jLabel2.setText("Odds:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 60, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 10, 310, 280);

        jLabel3.setText("Interval 1:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 80, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(110, 200, 130, 23);

        jLabel4.setText("Interval 2:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 80, 20);

        setSize(new java.awt.Dimension(709, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        (new Thread(new even())).start();
        (new Thread(new odd())).start();
        (new Thread(new interval())).start();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
