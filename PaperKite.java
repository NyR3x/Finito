
    public class PaperKite extends AbstKaraClass {

        void narisi_vrstico(int stevilo_presledkov, int stevilo_zvezdic, int maxZvezdic)
        {
            for (int i = 1; i <= stevilo_presledkov; i++)
                System.out.print(" ");

            for (int i = 1; i <= stevilo_zvezdic; i++)
            {
                if ((stevilo_zvezdic == maxZvezdic) ||
                        (i == 1 || i == stevilo_zvezdic || (i == (stevilo_zvezdic+1)/2)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

