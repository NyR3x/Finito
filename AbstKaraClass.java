public abstract class AbstKaraClass {

    abstract void narisi_vrstico(int stevilo_presledkov, int stevilo_zvezdic, int maxZvezdic);

    public void izrisi(int sirina)
    {
        if ((sirina % 2) == 0) --sirina;

        int sredina = (sirina+1)/2;

        for (int i = 1; i <= sredina; i++)
            narisi_vrstico(sredina - i, i * 2 - 1, sirina);

        for (int i = ((sirina+1)/2) - 1; i >= 1; i--)
            narisi_vrstico(sredina - i, i * 2 - 1, sirina);
    }

}
