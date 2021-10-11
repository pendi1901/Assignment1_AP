import jdk.swing.interop.SwingInterOpUtils;

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
         private final String name;
         private final long Pincode;
         private final int AllocatedId;

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
         private final String name;
         private final int age;
         private final long ID;
         private final String status;
         private final int  noofdoses;
         private final String vaccine;

         public Citizens(String _name , int _age , long _ID , int _noofdoses, String _vaccine , String _status ){
            this.name = _name;
            this.age = _age;
            this.ID = _ID;
            this.status = _status;
            this.noofdoses = _noofdoses;
            this.vaccine = _vaccine;
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
        private int slotno;

        public Slot(int _slotno ,int _HospitalId , int _Slotno , int _Dayno , int _quantity  , String _name   ){
            this.HospitalId = _HospitalId;
            this.Slotno = _Slotno;
            this.Dayno = _Dayno;
            this.quantity = _quantity;
            this.Vaccine = _name;
            this.slotno = _slotno;
            System.out.println("Slot added by Hospital " + _HospitalId + " for Day " + _Dayno );
            System.out.println("Avaiable Quantity " + _quantity + " of " + _name);
        }

    }

    public static class Status{
        private final String status;
        private final String vaccine;
        private final int Day;
        private final int noofDoses;
        private final int Duedate;
        private final long Personid;
        private final long HospitalID;

        public Status(String _Status , String  _vaccine ,int _Day , int _noofDoses , int _Due , long _Id, long _HospitalId ){
            this.status= _Status;
            this.vaccine =_vaccine;
            this.Day = _Day;
            this.noofDoses = _noofDoses;
            this.Duedate = _Due;
            this.Personid = _Id;
            this.HospitalID = _HospitalId;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Vaccine> vaccine =  new ArrayList<>();
        ArrayList<Hospital> hospital = new ArrayList<>();
        ArrayList<Citizens> citizens = new ArrayList<>();
        ArrayList<Slot> slots = new ArrayList<>();
        ArrayList<Status> stat = new ArrayList<>();
        int count1=0;
        //vaccine no of doses count
        int count2=0;
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
            String p ="";

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
                    int noofdoses = 0;
                    String _vaccine = "null";
                    Citizens c1 = new Citizens(r,z,k,noofdoses,_vaccine,s);
                    citizens.add(c1);
                    System.out.println("---------------------------------");
                }
                else if(z<18 & k>999999999){

                    String s = "N/A";
                    int noofdoses = 0;
                    String _vaccine = "null";
                    Citizens c1 = new Citizens(r,z,k,noofdoses,_vaccine,s);
                    citizens.add(c1);
                    System.out.println("Only allowed above 18");
                    System.out.println("---------------------------------");
                }
                else{
                    String s = "REGISTERED";
                    int noofdoses = 0;
                    String _vaccine = "null";
                    Citizens c1 = new Citizens(r,z,k,noofdoses,_vaccine,s);
                    citizens.add(c1);
                    System.out.println("---------------------------------");
                }
            }
            else if(q==4){
                System.out.println("Enter the hosiptal ID ");
                for(int h = 0 ; h < hospital.size() ; h++){
                    System.out.println("Hospital " + h + ":" + hospital.get(h).AllocatedId);
                }
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

                            Slot s1 = new Slot(count1 ,n, noofslots, daynumber, quantity, name);
                            slots.add(s1);
                            count1++;
                            for(int z = 0 ; z< slots.size() ; z++){
                                System.out.println(slots.get(z).slotno);
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
                        System.out.println("0. Pincode");
                        System.out.println("1.Vaccine");
                        System.out.println("2. Exit");
                        int choice = sc.nextInt();
                        if(choice == 0) {
                            System.out.println("Enter the pin number ");
                            long pin = sc.nextLong();
                            for (Hospital value : hospital) {
                                if (pin == value.Pincode) {
                                    System.out.println(value.AllocatedId + " " + value.name);
                                }
                            }
                            System.out.println("Enter the Unique Id of the hospital");
                            int id = sc.nextInt();
                            for (int l = 0; l < slots.size(); l++) {
                                if (id == slots.get(l).HospitalId) {
                                    System.out.println(l + "-> " + "Day: " + slots.get(l).Dayno + " Available + Qty:" + slots.get(l).quantity + " Vaccine " + slots.get(l).Vaccine);

                                }
                            }
                            System.out.println("enter the slot number you choose");
                            int d = sc.nextInt();

                            String s = "";
                            count2++;
                            for (int u = 0; u < slots.size(); u++) {
                                int due = 0;
                                int so = 0;
                                if (d == slots.get(u).slotno) {
                                    int x = slots.get(u).Dayno;
                                    int y = slots.get(u).HospitalId;
                                    String v = slots.get(u).Vaccine;

                                    for (int w = 0; w < vaccine.size(); w++) {
                                        if (v.equals(vaccine.get(w).name)) {
                                            so = vaccine.get(w).NoofDoses;
                                            int a = vaccine.get(w).Gap;
                                            due = x + a;

                                        }

                                    }
                                    if (count2 == so) {
                                        s = "FULLY VACCINATED";
                                    } else {
                                        s = "PARTAILLY VACCINATED";
                                    }
                                    Status s1 = new Status(s, v, x, so, due, n, y);
                                    stat.add(s1);
                                }
                            }
                            for (int we = 0; we < stat.size(); we++) {
                                if (n == stat.get(we).Personid) {
                                    System.out.println(stat.get(we).HospitalID);
                                    System.out.println(stat.get(we).status);
                                    System.out.println(stat.get(we).Day);
                                    System.out.println(stat.get(we).Duedate);
                                    System.out.println(stat.get(we).noofDoses);
                                    System.out.println(stat.get(we).vaccine);
                                }
                            }
                        }

                        else if(choice ==1){
                            System.out.println("Enter the vaccine name ");
                            String name =sc.nextLine();
                            for(int j  = 0 ; j < slots.size() ; j++){
                                if(name == slots.get(j).Vaccine) {
                                    System.out.println(slots.get(j).HospitalId + " " + hospital.get(j).name);
                                }
                            }
                            System.out.println("Enter the Unique Id of the hospital");
                            int id = sc.nextInt();
                            for (int l = 0; l < slots.size(); l++) {
                                if (id == slots.get(l).HospitalId) {
                                    System.out.println(l + "-> " + "Day: " + slots.get(l).Dayno + " Available + Qty:" + slots.get(l).quantity + " Vaccine " + slots.get(l).Vaccine);

                                }
                            }
                            System.out.println("enter the slot number you choose");
                            int d = sc.nextInt();

                            String s = "";
                            count2++;
                            for (int u = 0; u < slots.size(); u++) {
                                int due = 0;
                                int so = 0;
                                if (d == slots.get(u).slotno) {
                                    int x = slots.get(u).Dayno;
                                    int y = slots.get(u).HospitalId;
                                    String v = slots.get(u).Vaccine;

                                    for (int w = 0; w < vaccine.size(); w++) {
                                        if (v.equals(vaccine.get(w).name)) {
                                            so = vaccine.get(w).NoofDoses;
                                            int a = vaccine.get(w).Gap;
                                            due = x + a;

                                        }

                                    }
                                    if (count2 == so) {
                                        s = "FULLY VACCINATED";
                                    } else {
                                        s = "PARTAILLY VACCINATED";
                                    }
                                    Status s1 = new Status(s, v, x, so, due, n, y);
                                    stat.add(s1);
                                }
                            }
                            for (int we = 0; we < stat.size(); we++) {
                                if (n == stat.get(we).Personid) {
                                    System.out.println(stat.get(we).HospitalID);
                                    System.out.println(stat.get(we).status);
                                    System.out.println(stat.get(we).Day);
                                    System.out.println(stat.get(we).Duedate);
                                    System.out.println(stat.get(we).noofDoses);
                                    System.out.println(stat.get(we).vaccine);
                                }
                            }
                        }
                        else if(choice ==2){
                            break;
                        }

                    }
                }
                System.out.println("---------------------------------");
            }

            else if(q==6){
                System.out.println("Enter the hospital ID");
                for(int h = 0 ; h < hospital.size() ; h++){
                    System.out.println("Hospital " + h + ":" + hospital.get(h).AllocatedId);
                }
                long n = sc.nextLong();
                for(int i = 0 ; i < slots.size() ; i++){
                    if(n == slots.get(i).HospitalId){
                        System.out.println("Day: " + slots.get(i).Dayno  + "Vaccine: " + slots.get(i).Vaccine + "Available quantity: " + slots.get(i).quantity );
                    }
                }

                System.out.println("---------------------------------");
            }

            else if(q==7){
                System.out.println("Enter the your Unique ID");
                long n = sc.nextLong();
                for(int i  = 0 ; i < citizens.size() ; i++){
                    if(n == stat.get(i).Personid){
                        String s = stat.get(i).status;
                        System.out.println(stat.get(i).status);
                        System.out.println("Vaccine Administered: " + stat.get(i).vaccine);
                        if(s.equals("PARTIALLY VACCINATED")){
                            System.out.println("Number of doses");
                            System.out.println(stat.get(i).noofDoses);
                            System.out.println("Due Date");
                            System.out.println(stat.get(i).Duedate);
                        }
                    }
                }
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
