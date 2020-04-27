/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Cube {
    private int l;
    private int v;
    
    public Cube(int edgeLength){
        this.l = edgeLength;
        this.v =this.l*this.l*this.l;
    }
    public int volume(){
        return this.v;
    }
    public String toString(){
        return "The length of the edge is "+this.l+" and the volume "+this.v;
    }
}
