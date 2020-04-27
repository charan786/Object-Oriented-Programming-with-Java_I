
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        
        HealthStation childrensHospital = new HealthStation();

        
        Person Sam = new Person("Samantha", 28, 159, 65);
        System.out.println(Sam.getName() + " weight: " + childrensHospital.weigh(Sam) + " kilos");
        childrensHospital.feed(Sam);
        childrensHospital.feed(Sam);
        System.out.println(Sam.getName() + " weight: " + childrensHospital.weigh(Sam) + " kilos");
        System.out.println("weighings performed: " + childrensHospital.weighings());
        
        childrensHospital.weigh(Sam);
        childrensHospital.weigh(Sam);
        childrensHospital.weigh(Sam);
        System.out.println("weighings performed: " + childrensHospital.weighings());







    }
}
