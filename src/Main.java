import java.util.Scanner;

public class Main {

    public static class Vaccine {
        private final String name;
        private final int NoofDoses;
        private final int Gap;


        public Vaccine(String _name, int noofDoses, int gap) {
            name = _name;
            NoofDoses = noofDoses;
            Gap = gap;
            System.out.println("Vaccine name : " + _name);
            System.out.println("Number of Doses: " + noofDoses);
            System.out.println("Gap Between Doses: " + gap);
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CoWin Portal initialized....");
        System.out.println("---------------------------------");
        System.out.println("1. Add Vaccine");
        System.out.println("2. Register Hospital");
        System.out.println("3. Register Citizen");
        System.out.println("4. Add Slot for Vaccination");
        System.out.println("5. Book Slot for Vaccination");
        System.out.println("6. List all slots for a hospital");
        System.out.println("7. Check Vaccination Status");
        System.out.println("8. Exit");
        System.out.println("---------------------------------");

        while (true) {
            int q = sc.nextInt();
            if (q == 1) {
                String a = sc.next();
                int b = sc.nextInt();
                int c = sc.nextInt();
                Vaccine v1 = new Vaccine(a, b, c);
                System.out.println("---------------------------------");


            }
            else if(q==2){
                System.out.println("---------------------------------");
            }
            else if(q==3){
                System.out.println("---------------------------------");
            }
            else if(q==4){
                System.out.println("---------------------------------");
            }
            else if(q==5){
                System.out.println("---------------------------------");
            }
            else if(q==6){
                System.out.println("---------------------------------");
            }
            else if(q==7){
                System.out.println("---------------------------------");
            }
            else if(q==8){
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("{End Of Test Case}");
                break;
            }

        }
    }

}
