/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SiloMaster;

import java.util.ArrayList;

/**
 *
 * @author Flavien
 */
public class Silo {

    private ArrayList<Cellule> cellules;

    public ArrayList<Cellule> getCellules() {
        return cellules;
    }
    public AC ac;
    public int volume;

    public Silo() {
        cellules = new ArrayList<Cellule>();
        for (int i = 0; i < 10; i++) {
            cellules.add(new Cellule(cellules.size() + 1));
        }
        this.volume = 0;
        for (Cellule c : cellules) {
            this.volume += c.volumeMax;
        }
        this.ac = new AC();
    }
}
