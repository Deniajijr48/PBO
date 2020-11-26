package pbo_3_inherite;

public class main {

    public static void main(String[] args) {
        //Deklarasi Tim
        Tim jagoanNeon = new Tim("Jagoan Neon");
        
        //Deklarasi Member
        Member orang_1 = new Member("totok", 20);
        Member orang_2 = new Member("Ari", 23);
        Member orang_3 = new Member("ardy", 22);
        
        //Deklarasi Trainee
        Member orang_4 = new Trainee("Joko", 26, 8);
        Member orang_5 = new Trainee("paidi", 21, 10);
        Member orang_6 = new Trainee("mukidi", 30, 12);
        
        //Menambahkan data pada ArrayList
        jagoanNeon.addMember(orang_1);
        jagoanNeon.addMember(orang_2);
        jagoanNeon.addMember(orang_3);
        jagoanNeon.addMember(orang_4);
        jagoanNeon.addMember(orang_5);
        jagoanNeon.addMember(orang_6);
        
        //Output
        jagoanNeon.displayFullMember();
        jagoanNeon.displayTrainee();
    }
    
}
