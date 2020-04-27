/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Timer {
    private ClockHand sec;
    private ClockHand hundred;
    
    public Timer(){
        this.sec = new ClockHand(60);
        this.hundred = new ClockHand(100);
    }

    public void advance(){
        this.hundred.advance();
        
        if(this.hundred.value()==0){
            this.sec.advance();
        }
    }
    public String toString(){
        return sec+":"+hundred;
    }
    
    
}