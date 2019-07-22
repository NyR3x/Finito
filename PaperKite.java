public class PaperKite extends Kara
{
        public void narisi_vrstico(int stevilo_presledkov, int stevilo_zvezdic, int maxZvezdic)
        {
        for (int i = 1; i <= stevilo_presledkov; i++)

            System.out.print(" ");
            for (int j = 1; j <= stevilo_zvezdic; j++)
            {
                if ((stevilo_zvezdic == maxZvezdic) || (j == 1 || j == stevilo_zvezdic || (j == (stevilo_zvezdic + 1) / 2))) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }


}
}