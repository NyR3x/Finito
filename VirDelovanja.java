import java.awt.print.Paper;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class VirDelovanja {
    public static void main(String[] args) {
        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi stevilo\n"  +
                           "1. izris kare\n" +
                           "2. izris zamaja\n" +
                           "3. izris Xraj kare");
              int n = vnos.nextInt();
        if (n==1 || n==2  || n==3)
        {
            System.out.println("Vnesi sirino lika:");
            int sirina = vnos.nextInt();
            if(n==1)
            {
                Kara mojaKara = new Kara();
                mojaKara.izrisi(sirina,n);
            }
            if(n==2)
            {
                PaperKite mojKite = new PaperKite();
                mojKite.izrisi(sirina,n);
            }
            if(n==3)
            {
                KaraXray mojXrey = new KaraXray();
                mojXrey.izrisi(sirina,n);
            }
        }
        else
            System.out.println("Funkcionalna nepismenost lahko postane ovira!");
    }



    }

