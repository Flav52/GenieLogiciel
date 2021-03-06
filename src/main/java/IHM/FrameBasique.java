/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import java.awt.Color;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Flavien
 */
public class FrameBasique extends javax.swing.JFrame {

    int mousepX, mousepY;
    protected static final Color HoverColor = new Color(200, 30, 35, 255);
    protected static final Color BarColor = new Color(0, 102, 102, 255);
    protected static final Color BackgroundColor = new Color(153, 153, 153, 255);
    protected static final Color BarBackgroundColor = new Color(220, 220, 220, 255);

    public FrameBasique() {
        initComponents();
    }

    public FrameBasique(CellStatus f) {
        initComponents();
        this.MainPanel.add(f);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomMenuBar = new javax.swing.JPanel();
        ControlButtons = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CustomMenuBar.setBackground(BarColor);
        CustomMenuBar.setMinimumSize(new java.awt.Dimension(100, 20));
        CustomMenuBar.setPreferredSize(new java.awt.Dimension(400, 35));
        CustomMenuBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CustomMenuBarMouseDragged(evt);
            }
        });
        CustomMenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CustomMenuBarMousePressed(evt);
            }
        });
        CustomMenuBar.setLayout(new java.awt.BorderLayout());

        ControlButtons.setBackground(new java.awt.Color(0, 102, 102));
        ControlButtons.setPreferredSize(new java.awt.Dimension(70, 35));
        ControlButtons.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(BarColor);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        ControlButtons.add(jPanel3);

        CloseButton.setBackground(BarColor);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseButtonMouseExited(evt);
            }
        });
        CloseButton.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(BarColor);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        CloseButton.add(jLabel1, java.awt.BorderLayout.CENTER);

        ControlButtons.add(CloseButton);

        CustomMenuBar.add(ControlButtons, java.awt.BorderLayout.EAST);

        getContentPane().add(CustomMenuBar, java.awt.BorderLayout.NORTH);

        MainPanel.setBackground(BackgroundColor);
        MainPanel.setLayout(new javax.swing.BoxLayout(MainPanel, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomMenuBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomMenuBarMouseDragged
        int nx, ny;
        nx = evt.getXOnScreen();
        ny = evt.getYOnScreen();
        this.setLocation(nx - mousepX, ny - mousepY);        this.setLocation(nx - mousepX, ny - mousepY);    }//GEN-LAST:event_CustomMenuBarMouseDragged

    private void CustomMenuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomMenuBarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();        mousepY = evt.getY();    }//GEN-LAST:event_CustomMenuBarMousePressed

    private void CloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseEntered
        CloseButton.setBackground(HoverColor);
    }//GEN-LAST:event_CloseButtonMouseEntered

    private void CloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseExited
        CloseButton.setBackground(BarColor);

    }//GEN-LAST:event_CloseButtonMouseExited

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_CloseButtonMouseClicked

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
            java.util.logging.Logger.getLogger(FrameBasique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBasique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBasique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBasique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        System.out.println(info.getName());
                        if ("Windows".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                        }
                    }
                } catch (UnsupportedLookAndFeelException e) {
                    // handle exception
                } catch (ClassNotFoundException e) {
                    // handle exception
                } catch (InstantiationException e) {
                    // handle exception
                } catch (IllegalAccessException e) {
                    // handle exception
                }
                
                
                javax.swing.JFrame j;
                j = new FrameBasique();
                j.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CloseButton;
    private javax.swing.JPanel ControlButtons;
    private javax.swing.JPanel CustomMenuBar;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
