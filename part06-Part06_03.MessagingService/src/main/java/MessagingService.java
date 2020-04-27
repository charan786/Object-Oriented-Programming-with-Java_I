
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
public class MessagingService {
    private ArrayList<Message> cool;    
    
    public MessagingService(){
        this.cool = new ArrayList<>();
    }
    public void add(Message message){
        String content = message.getContent();
        if(content.length() <= 280){
            this.cool.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        return this.cool;
    }
    

}        
