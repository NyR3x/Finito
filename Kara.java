
    public  class Kara extends AbstKaraClass
    {
        void narisi_vrstico(int stevilo_presledkov, int stevilo_zvezdic, int maxZvezdic)
        {
            for (int i = 1; i <= stevilo_presledkov; i++)
                System.out.print(" ");

            for (int i = 1; i <= stevilo_zvezdic; i++)
                System.out.print("*");

            System.out.println();
        }
    }

