import java.util.Random;

public class SicaklikAlgilayici {

    private static int sicaklik;

    public static void SicaklikOlc()
    {

        Random derece = new Random();
        sicaklik = derece.nextInt(40);
        System.out.println("Sicaklik Degeri:"+sicaklik);
        System.out.println("Sicaklik ölçülmüştür...");

    }

}
