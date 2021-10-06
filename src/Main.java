import java.util.Scanner;

public class Main {

    public static class Vaccine {
        private final String name;
        private final int NoofDoses;
        private final int Gap;


        public Vaccine(String _name, int noofDoses, int gap) {
            this.name = _name;
            this.NoofDoses = noofDoses;
            this.Gap = gap;
            System.out.println("Vaccine name : " + _name);
            System.out.println("Number of Doses: " + noofDoses);
            System.out.println("Gap Between Doses: " + gap);
        }


    }
    public static class Hospital{
        private final String name;
        private final int Pincode;
        private final int AllocatedId;

        public Hospital(String _name, int _pincode, int _allocatedId){
            this.name = _name;
            this.Pincode = _pincode;
            this.AllocatedId = _allocatedId;
            System.out.println("Hospital Name: " + _name );
            System.out.println("Pincode: " + _pincode);
            System.out.println("Unique ID: " + _allocatedId);
        }
    }

    public static class Citizens{
        private final String name;
        private final int age;
        private final long ID;
        private String status;

        public Citizens(String _name , int _age , long _ID ){
            this.name = _name;
            this.age = _age;
            this.ID = _ID;
            System.out.println("Citizen Name: " + _name);
            System.out.println("Age: " + _age);
            System.out.println("Unique ID: " + _ID);
            status = "REGISTERED";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CoWin Portal initialized....");
        System.out.println("---------------------------------");

        while (true) {

            System.out.println("1. Add Vaccine");
            System.out.println("2. Register Hospital");
            System.out.println("3. Register Citizen");
            System.out.println("4. Add Slot for Vaccination");
            System.out.println("5. Book Slot for Vaccination");
            System.out.println("6. List all slots for a hospital");
            System.out.println("7. Check Vaccination Status");
            System.out.println("8. Exit");
            System.out.println("---------------------------------");
            System.out.println("Enter the Query");
            int q = sc.nextInt();

            if (q == 1) {
                System.out.println("Vaccine name: ");
                String a = sc.next();
                System.out.println("Number of Doses: ");
                int b = sc.nextInt();
                System.out.println("Gap Between Doses: ");
                int c = sc.nextInt();
                if(b>0 && c>0) {
                    Vaccine v1 = new Vaccine(a, b, c);
                    System.out.println("---------------------------------");
                }
                else if(b <= 0 ){
                    System.out.println("you cant have less than or equal to zero doses ");
                    System.out.println("enter the Number of doses again");
                    b = sc.nextInt();
                    Vaccine v1 = new Vaccine(a, b, c);
                    System.out.println("---------------------------------");
                }
                else{
                    System.out.println("the gap needs to be more than or equal to 1");
                    System.out.println("enter the gap of days again");
                    c =sc.nextInt();
                    Vaccine v1= new Vaccine(a,b,c);
                    System.out.println("---------------------------------");
                }

            }

            else if(q==2){
                System.out.println("Hospital Name: ");
                String e = sc.next();
                System.out.println("Pincode: ");
                int d = sc.nextInt();
                System.out.println("Allocated Id: ");
                int f =sc.nextInt();
                if(d>0 && f>0) {
                    Hospital h1 = new Hospital(e,d,f);
                    System.out.println("---------------------------------");
                }
                else if(d <= 0 ){
                    System.out.println("you cant have a pincode less than 0 ");
                    System.out.println("enter the pincode again");
                    d = sc.nextInt();
                    Hospital h1 = new Hospital(e,d,f);
                    System.out.println("---------------------------------");
                }
                else{
                    System.out.println("the ID needs to be more than or equal to 0");
                    System.out.println("enter the ID again");
                    f =sc.nextInt();
                    Hospital h1 = new Hospital(e,d,f);
                    System.out.println("---------------------------------");
                }
            }
            else if(q==3){
                System.out.println("Enter the Citizen's name");
                String r = sc.next();
                System.out.println("Enter the Age");
                int z = sc.nextInt();
                System.out.println("Enter the ID");
                long k = sc.nextLong();
                if(z>18 && k>0) {
                    Citizens c1 =new Citizens(r,z,k);
                    System.out.println("---------------------------------");
                }
                if(z >= 0 && z<18 ){

                    Citizens c1 = new Citizens(r,z,k);
                    System.out.println("Only allowed above 18");
                    System.out.println("---------------------------------");
                }
                else if(k<=999999999){
                    System.out.println("the ID needs to be ten digits or more");
                    System.out.println("enter the ID again");
                    k =sc.nextInt();
                    Citizens c1 = new Citizens(r,z,k);
                    System.out.println("---------------------------------");
                }
                else{
                    System.out.println("The age cant be negative");
                    System.out.println("enter the age again");
                    z = sc.nextInt();
                    Citizens c1 = new Citizens(r,z,k);
                    System.out.println("---------------------------------");

                }

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
