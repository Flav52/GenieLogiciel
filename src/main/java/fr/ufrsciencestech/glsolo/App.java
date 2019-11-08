package fr.ufrsciencestech.glsolo;

import IHM.*;
import SiloMaster.*;
import java.awt.Color;
import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                //System.out.println(info.getName());
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }

       // JFrame frame = new JFrame();
       // frame.setLayout(new java.awt.GridLayout(1, 1));

        Silo s = new Silo();
        StatusSilo SS=new StatusSilo(s);
        SS.setVisible(true);

        // CellStatus cell = new CellStatus(c);
        //frame.add(cell);
        // ACStatus a = new ACStatus(new AC());
        //  frame.add(a);
        //frame.setSize(500, 500);
       // frame.setBackground(Color.BLACK);
        //frame.setVisible(true);

    }
}
