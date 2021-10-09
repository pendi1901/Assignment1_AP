import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    //first class
    public static class Vaccine {
        private final String name;
        private final int NoofDoses;
        private final int Gap;

        public Vaccine(String _name, int _noofDoses, int _gap) {
            this.name = _name;
            this.NoofDoses = _noofDoses;
            this.Gap = _gap;
            System.out.println("Vaccine name : " + _name);
            System.out.println("Number of Doses: " + _noofDoses);
            System.out.println("Gap Between Doses: " + _gap);
        }
    }

    //Second class
    public static class Hospital{
         final String name;
         final long Pincode;
         final int AllocatedId;

        public Hospital(String _name, long _pincode, int _allocatedId) {
            this.name = _name;
            this.Pincode = _pincode;
            this.AllocatedId = _allocatedId;
            System.out.println("Hospital Name: " + _name);
            System.out.println("Pincode: " + _pincode);
            System.out.println("Unique ID: " + _allocatedId);

        }
    }

    //Third Class
    public static class Citizens{
         final String name;
         final int age;
         final long ID;
         String status;

         public Citizens(String _name , int _age , long _ID ){
            this.name = _name;
            this.age = _age;
            this.ID = _ID;
            this.status = "REGISTERED";
            System.out.println("Citizen Name: " + _name);
            System.out.println("Age: " + _age);
            System.out.println("Unique ID: " + _ID);


        }
    }

    //4th class
    public static class Slot{
        private final int HospitalId;
        private final int Slotno;
        private int Dayno;
        private int quantity;
        private String Vaccine;

        public Slot(int _HospitalId , int _Slotno , int _Dayno , int _quantity  , String _name ){
            this.HospitalId = _HospitalId;
            this.Slotno = _Slotno;
            this.Dayno = _Dayno;
            this.quantity = _quantity;
            this.Vaccine = _name;
            System.out.println("Slot added by Hospital " + _HospitalId + " for Day " + _Dayno );
            System.out.println("Avaiable Quantity " + _quantity + " of " + _name);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Vaccine> vaccine =  new ArrayList<>();
        ArrayList<Hospital> hospital = new ArrayList<>();
        ArrayList<Citizens> citizens = new ArrayList<>();
        ArrayList<Slot> slots = new ArrayList<>();
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
                if(b==1){
                    int c=0;
                    Vaccine v1 = new Vaccine(a,b,c);
                    vaccine.add(v1);
                    for(int i = 0; i< vaccine.size() ; i++){
                        System.out.println(vaccine.get(i));
                    }
                    System.out.println("---------------------------------");

                }
                else {
                    System.out.println("Gap Between Doses: ");
                    int c = sc.nextInt();
                    if (b > 0 && c > 0) {
                        Vaccine v1 = new Vaccine(a, b, c);
                        vaccine.add(v1);
                        System.out.println("---------------------------------");
                    } else if (b <= 0) {
                        System.out.println("you cant have less than or equal to zero doses ");
                        System.out.println("enter the Number of doses again");
                        b = sc.nextInt();
                        Vaccine v1 = new Vaccine(a, b, c);
                        vaccine.add(v1);
                        System.out.println("---------------------------------");
                    } else if (c < 0) {
                        System.out.println("the gap needs to be more than or equal to 0");
                        System.out.println("enter the gap of days again");
                        c = sc.nextInt();
                        Vaccine v1 = new Vaccine(a, b, c);
                        vaccine.add(v1);
                        System.out.println("---------------------------------");
                    }
                }
            }

            else if(q==2){
                System.out.println("Hospital Name: ");
                String e = sc.next();
                System.out.println("Pincode: ");
                long d = sc.nextLong();
                System.out.println("Allocated Id: ");
                int upper= 900000;
                int f = rand.nextInt(upper);
                if(d>0) {
                    Hospital h1 = new Hospital(e, d,f);
                    hospital.add(h1);
                    System.out.println("---------------------------------");
                    for(int i = 0 ; i< hospital.size() ; i++){
                        System.out.println(hospital.get(i).name);
                        System.out.println(hospital.get(i).AllocatedId);
                        System.out.println(hospital.get(i).Pincode);
                    }
                }
                else if(d < 0 ){
                    System.out.println("you cant have a pincode less than 0 ");
                    System.out.println("enter the pincode again");
                    d = sc.nextInt();
                    Hospital h1 = new Hospital(e,d,f);
                    hospital.add(h1);
                    for(int i = 0 ; i< hospital.size() ; i++){
                        System.out.println(hospital.get(i).name);
                        System.out.println(hospital.get(i).AllocatedId);
                        System.out.println(hospital.get(i).Pincode);
                    }
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

                if(z<=0 && k<=999999999){
                    System.out.println("The age cant be negative");
                    System.out.println("enter the age again");
                    z = sc.nextInt();
                    System.out.println("the ID needs to be ten digits or more");
                    System.out.println("enter the ID again");
                    k=sc.nextLong();
                    String s = "REGISTERED";
                    Citizens c1 = new Citizens(r,z,k);
                    citizens.add(c1);
                    System.out.println("---------------------------------");
                }
                else if(z<18 & k>999999999){
                    Citizens c1 = new Citizens(r,z,k);
                    String s = "N/A";
                    citizens.add(c1);
                    System.out.println("Only allowed above 18");
                    System.out.println("---------------------------------");
                }
                else{
                    String s = "REGISTERED";
                    Citizens c1 = new Citizens(r,z,k);
                    citizens.add(c1);
                    System.out.println("---------------------------------");
                }
            }
            else if(q==4){
                System.out.println("Enter the hosiptal ID ");
                int n = sc.nextInt();
                for(int i = 0 ; i <hospital.size() ; i++){
                    if( n==hospital.get(i).AllocatedId){
                        System.out.println("Enter the number of slots ");
                        int noofslots = sc.nextInt();
                        for(int j =0 ; j<noofslots ; j++) {
                            System.out.println("enter the day number");
                            int daynumber = sc.nextInt();
                            System.out.println("enter the quantity");
                            int quantity = sc.nextInt();
                            System.out.println("Select vaccine");
                            System.out.println("According to the order choose number accordingly");
                            int count = vaccine.size();
                            for (int k = 0; k < count; k++) {
                                System.out.println(k + ". " +  vaccine.get(k).name);
                            }
                            System.out.println("enter the choice");
                            int choice = sc.nextInt();
                            String name = vaccine.get(choice).name;
                            Slot s1 = new Slot(n, noofslots, daynumber, quantity, name);
                            slots.add(s1);
                            for(int z = 0 ; z< slots.size() ; z++){
                                System.out.println(slots.get(z).HospitalId);
                                System.out.println(slots.get(z).Slotno);
                                System.out.println(slots.get(z).Dayno);
                                System.out.println(slots.get(z).quantity);
                                System.out.println(slots.get(z).Vaccine);
                            }

                        }
                    }

                }
                System.out.println("Hospital ID not found");
                System.out.println("---------------------------------");
            }
            else if(q==5){
                System.out.println("Enter the your Unique ID");
                long n = sc.nextLong();
                for(int i = 0 ; i < citizens.size() ; i++){
                    if( n == citizens.get(i).ID){
                        System.out.println("Valid Id");
                        System.out.println("Search by");
                        System.out.println("If by pincode enter 0");
                        System.out.println("else by vaccine enter 1");
                        int choice = sc.nextInt();

                    }
                }
                System.out.println("---------------------------------");
            }
            else if(q==6){
                System.out.println("Enter the hospital ID");
                long n = sc.nextLong();

                System.out.println("---------------------------------");
            }
            else if(q==7){
                System.out.println("Enter the your Unique ID");
                long n = sc.nextLong();

                System.out.println("---------------------------------");
            }
            else if(q==8){
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("{End Of Test Case}");
                System.out.println("------------------------------------------------------------------------------");
                break;
            }

        }

    }

}
