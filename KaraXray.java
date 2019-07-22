import java.util.Scanner;
public class KaraXray extends Kara
   {
    public void narisi_vrstico(int stevilo_presledkov, int stevilo_zvezdic, int maxZvezdic) {
        for (int i = 1; i <= stevilo_presledkov; i++)
            System.out.print(" ");
        for (int i = 1; i <= stevilo_zvezdic; i++) {
            if ( (i == 1 || i == stevilo_zvezdic)) {
                System.out.print("*");
            } else
                System.out.print(" ");
        }

        System.out.println();
    }

}

