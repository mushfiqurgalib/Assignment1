/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BoosterMode extends PrintMode{
    
    private double intensityThreshold;

    public double getIntensityThreshold() {
        return intensityThreshold;
    }

    public void setIntensityThreshold(double intensityThreshold) {
        this.intensityThreshold = intensityThreshold;
    }
    

    
    public void boost() {
        System.out.println("boosted succesfully");
    }
    /*
     * moved this method from PrintMode.java Class as it is not needed in any other child of PrintMode other than
     * BoostMode. So It would have violated the Interface Segregation Principle.
      */
}
