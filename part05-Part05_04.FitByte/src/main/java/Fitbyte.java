/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Fitbyte {
    private int  ag;
    private int res;
    
    
    public Fitbyte(int age, int restingHeartRate){
        this.ag = age;
        this.res = restingHeartRate;
        
    }
    public double targetHeartRate(double percentageOfMaximum){
        double max = 206.3 - (0.711 * this.ag);
        return (max - this.res) * (percentageOfMaximum) + this.res;
    }
}
