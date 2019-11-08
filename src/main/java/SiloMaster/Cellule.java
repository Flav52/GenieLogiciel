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
public class Cellule {

    private Lot lot;
    public Ventilation vent;

    private double volume;
    public int volumeMax, id;
    public final int hauteur = 21;

    public Cellule(Lot lot, int id) {
        this.setLot(lot);
        this.vent = new Ventilation();
        this.volumeMax = (int) (960 * Math.random()) + 410;
        this.id = id;
    }

    public Cellule(int id) {
        this.lot = new Lot();
        setLot(this.lot);
        this.vent = new Ventilation();
        this.volumeMax = (int) (960 * Math.random()) + 410;
        this.id = id;
    }

    public Lot getLot() {
        return lot;
    }

    public double getVolume() {
        return volume;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
        this.volume = lot.volume;
    }

}
