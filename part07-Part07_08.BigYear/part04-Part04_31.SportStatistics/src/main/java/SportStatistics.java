
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> teamname = new ArrayList<>();
        
        System.out.println("File:");
        String filename = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        
        try(Scanner reader = new Scanner(Paths.get(filename))){
            
            while(reader.hasNextLine()){
                String eachLine = reader.nextLine();
               
                String[]pieces = eachLine.split(",");
                teamname.add(pieces[0]);
                teamname.add(pieces[1]);
                teamname.add(pieces[2]);
                teamname.add(pieces[3]);
                
            }
        }catch(Exception e){
            System.out.println("This file "+filename+" can't be read.");
            System. exit(0);
        }
        
        int i =0;
        int game =0;
        int win =0;
        int lose =0;
        while(i<teamname.size()){
            String check = teamname.get(i);
            String fuck = teamname.get(i+1);
            int j =Integer.valueOf(teamname.get(i+2));
            int k =Integer.valueOf(teamname.get(i+3));
            if(check.equals(team)){
                game=game+1;
                if(j>k){
                    win=win+1;
                }else{
                    lose=lose+1;
                }
                
            }else if(fuck.equals(team)){
                game = game+1;
                if(k>j){
                    win=win+1;
                }else{
                    lose=lose+1;
                }
            }
            i=i+4;
            
        }
        System.out.println("Games: "+game);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+lose);

    }

}
