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
public class Lot {

    public String type;
    public double poids, volume, temp, humi;

    public Lot(String type, double poids, double volume, double temp, double humi) {
        this.type = type;
        this.poids = poids;
        this.volume = volume;
        this.temp = temp;
        this.humi = humi;
    }

    public Lot() {
        this.type = "N/A";
        this.poids = -1;
        this.volume = 400;
        this.temp = -275;
        this.humi = -1;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Lot:\t" + type + "\n";
        res += "Poids:\t" + poids + "\n";
        res += "Volume:\t" + volume + "\n";
        res += "Humidité:\t" + humi + "\n";
        return res;
    }
}
