import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charan
 */
public class Database {
    private ArrayList<Birds> hello;
    
    public Database(){
        hello = new ArrayList();
    }
    
    public void add(Birds eachBird){
        hello.add(eachBird);
    }
    
}
