import java.util.Scanner;

public class VirDelovanja
{
    public static void main(String[] args) {
        Scanner Drink = new Scanner(System.in);
        int j=1;
        while(j == 1)
        {
        Scanner zanka = new Scanner(System.in);
        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi stevilo likov,ki jih zelite izrisati");
        int n = zanka.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Izrisi (K)aro, (X)ray Karo ali (Z)maja:");
            String tipLika = vnos.next();

            if (tipLika.equalsIgnoreCase("z") || tipLika.equalsIgnoreCase("k") ||
                    tipLika.equalsIgnoreCase("x")) {
                System.out.println("Vnesi sirino lika:");
                int sirina = vnos.nextInt();

                if (tipLika.equalsIgnoreCase("x")) {
                    KaraXray mojaXKara = new KaraXray();
                    mojaXKara.izrisi(sirina);
                } else if (tipLika.equalsIgnoreCase("Z")) {
                    PaperKite mojZmaj = new PaperKite();
                    mojZmaj.izrisi(sirina);
                } else {
                    Kara mojKara = new Kara();
                    mojKara.izrisi(sirina);
                }
            } else
                System.out.println("Funkcionalna nepismenost lahko postane ovira!");
        }
            System.out.println("Za izhod iz programa vpisite 0");
             j = Drink.nextInt();
    }

        System.out.println("KONEC PROGRAMA");
        System.out.println("KONEC JE NEHAJ VNASAT");
        System.out.println("HALLO");
        System.out.println("HALLO");
        System.out.println("PA IDI SPAT GLEJ KAK SI");
 }

}

