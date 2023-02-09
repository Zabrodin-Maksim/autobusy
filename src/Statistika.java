import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Statistika {
private Spoj[] spoj;
private int actualni;
private int max;

    public Statistika() {
        this.max = 50;
        this.spoj = new Spoj[max];
        this.actualni = 0;
    }

    public void pridejSpoj(Spoj spoj){
        if (actualni <= max) {
            this.spoj[actualni] = spoj;
            actualni++;
        } else {
            System.out.println("Nemate dost mista");
        }
    }

    public void vypisSpoje(){
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            if (spoj[i] != null) {
                System.out.println(spoj[i].toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
    }

    public Spoj najdiNejrychlejsiSpoj(){
        boolean flag = false;
        int a = 0;
        int temp = 0;
        for (int i = 0; i < max; i++) {
            if (spoj[i] != null ) {
                if (spoj[i].casJizdyMinuty() <= temp){
                    a = i;
                    temp = spoj[i].casJizdyMinuty();
                }
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
        System.out.println("Nejrychlejsi spoj je: " + spoj[a]);
        return null;
    }
    public void vypisSpojeOdCasu (Cas cas){

            boolean flag = false;
            for (int i = 0; i < max; i++) {
                if (spoj[i] != null && spoj[i].getCasVyjezdu().hodina >= cas.hodina && spoj[i].getCasVyjezdu().minuty >= cas.minuty) {
                    System.out.println(spoj[i].toString());
                    flag = true;
                }
            }
            if (!flag) System.out.println("Pole je prazdne!");
    }
    public void palinaSpoje(String jmenoSouboru) {
        BufferedReader reader = null;
        String line = "";

        try {
           reader = new BufferedReader(new FileReader(jmenoSouboru));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(";");
                String[] casa = row[1].split(":");
                String[] casb = row[2].split(":");
                spoj[actualni++] = new Spoj(row[0], new Cas(Integer.parseInt(casa[0]), Integer.parseInt(casa[1])), new Cas(Integer.parseInt(casb[0]), Integer.parseInt(casb[1])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
