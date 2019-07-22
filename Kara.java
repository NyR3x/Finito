public class Kara{
    protected void narisi_vrstico(int stevilo_presledkov, int stevilo_zvezdic,int MaxZvezdic)
    {
        for (int i = 1; i <= stevilo_presledkov; i++)
            System.out.print(" ");
        for (int i = 1; i <= stevilo_zvezdic; i++)
            System.out.print("*");

        System.out.println();
    }

    public void izrisi(int sirina,int n)
    {
        if( n == 2 ){
            if ((sirina % 2) == 0) --sirina;

            int sredina = (sirina+1)/2;
            PaperKite mojKito = new PaperKite();
            for (int i = 1; i <= sredina; i++)
                mojKito.narisi_vrstico(sredina - i, i * 2 - 1, sirina);

            for (int i = ((sirina+1)/2) - 1; i >= 1; i--)
                mojKito.narisi_vrstico(sredina - i, i * 2 - 1, sirina);
        }

        if( n == 3 ){
        if ((sirina % 2) == 0) --sirina;

        int sredina = (sirina+1)/2;

            KaraXray mojXray = new KaraXray();

        for (int i = 1; i <= sredina; i++)
            mojXray.narisi_vrstico(sredina - i, i * 2 - 1, sirina);

        for (int i = ((sirina+1)/2) - 1; i >= 1; i--)
            mojXray.narisi_vrstico(sredina - i, i * 2 - 1, sirina);

        }
        else
        if ((sirina % 2) == 0) --sirina;

        int sredina = (sirina+1)/2;

        for (int i = 1; i <= sredina; i++)
            narisi_vrstico(sredina - i, i * 2 - 1, sirina);

        for (int i = ((sirina+1)/2) - 1; i >= 1; i--)
            narisi_vrstico(sredina - i, i * 2 - 1, sirina);
    }

}

