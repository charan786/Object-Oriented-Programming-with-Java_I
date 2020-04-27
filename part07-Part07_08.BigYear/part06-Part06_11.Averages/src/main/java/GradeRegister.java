
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> trades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.trades = new ArrayList<>();;
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.trades.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    public double averageOfGrades(){
        if(grades.isEmpty()){
            return -1;
        }
        double avg =0;
        double size = this.grades.size();
        double sum =0;
        for(int i=0;i<this.grades.size();i++){
            sum += grades.get(i);
        }
        avg = sum/size;
        return avg;
    }
    
    public double averageOfPoints(){
        if(grades.isEmpty()){
            return -1;
        }
        double avg =0;
        double size = this.trades.size();
        double sum =0;
        for(int i=0;i<this.trades.size();i++){
            sum += trades.get(i);
        }
        avg = sum/size;
        return avg;
    }
}
