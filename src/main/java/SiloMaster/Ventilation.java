/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SiloMaster;

/**
 *
 * @author Flavien
 */
public class Ventilation {

    private int puissance;

    public int getPuissance() {
        return puissance;
    }

    public Ventilation() {
        this.puissance = (int) (Math.random() * 3);
    }

    public Ventilation(int puissance) {
        this.puissance = puissance;
    }

    public void setPuissance(int p) {
        this.puissance = (p <= 100 && p >= 0) ? p : 0;
    }
}
