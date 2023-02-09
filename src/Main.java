import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Scanner in = new Scanner(System.in);
        Statistika statistika = new Statistika();
        statistika.palinaSpoje("busy.csv");
        statistika.vypisSpoje();
        statistika.najdiNejrychlejsiSpoj();
        Cas cas = new Cas(12,05);
        statistika.vypisSpojeOdCasu(cas);

//        String id = in.nextLine();
  //      System.out.println("vyjezd hod!");
     //   int hod = in.nextInt();
      //  System.out.println("vyjezd min!");
      //  int min = in.nextInt();
      //  Cas vy = new Cas(hod, min);
      //  System.out.println("Dojezd hod!");
      //  int hod2 = in.nextInt();
      //  System.out.println("Dojezd min!");
        //int min2 = in.nextInt();
      //  Cas pr = new Cas(hod2, min2);

       // Spoj spoj = new Spoj(id,vy, pr);
      //  statistika.pridejSpoj(spoj);
      //  statistika.vypisSpoje();
       // System.out.println(spoj.casJizdyMinuty());
    }
}