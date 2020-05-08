import java.sql.SQLException;

public class SogutmaSistemi
{


    private static IEkran ekran;
    private static ITusTakimi tusTakimi;

    private static final int SISTEM_ACILDI = 1;
    private static final int SICAKLIK_GORUNTULE = 2;
    private static final int SOGUTUCUYU_AC = 3;
    private static final int SOGUTUCUYU_KAPAT = 4;
    private static final int CIKIS = 5;


    public SogutmaSistemi()
    {
        ekran=new Ekran();
        tusTakimi=new TusTakimi();


    }

    public static void basla() throws SQLException {

            ekran.mesajGoruntule("Lütfen seri no giriniz...");
            int seriNo=tusTakimi.veriAl();
            ekran.mesajGoruntule("sifrenizi giriniz");
            int sifre = tusTakimi.veriAl();

            KullaniciHesabi kullaniciHesabi=new KullaniciHesabi(seriNo,sifre);
            boolean kontrol =kullaniciHesabi.kullaniciDogrula();
           System.out.println(kontrol);


    }

    public static void islemSecimi(){
        int secim;
        do{
            secim=anaMenuyuGoster();
            switch (secim) {
                case SISTEM_ACILDI:
                    break;

                case SICAKLIK_GORUNTULE:
                     SicaklikAlgilayici.SicaklikOlc() ;

                    break;
                case SOGUTUCUYU_AC:
                    Eyleyici.SogutucuAc();
                    break;

                case SOGUTUCUYU_KAPAT:
                    Eyleyici.SogutucuKapat();
                    break;

                case CIKIS:
                    ekran.mesajGoruntule("Çıkılıyor");
                    break;
                default:
                    ekran.mesajGoruntule("sicaklik 20 üzerindeyse sogutucuyu aciniz");
            }

        }while(secim!=5);
    }

    public static int anaMenuyuGoster()
    {    ekran.mesajGoruntule("\n");
        ekran.mesajGoruntule("-------------Ana Menu-----------------");
        ekran.mesajGoruntule("--Hangi işlemi istediğinizi seçiniz--");
        ekran.mesajGoruntule("1-Sistem başlatılyor");
        ekran.mesajGoruntule("2-Sicaklik Goruntule");
        ekran.mesajGoruntule("3-Sogutucuyu Ac");
        ekran.mesajGoruntule("4-Sogutucuyu Kapat");
        ekran.mesajGoruntule("5-Cikis");
        ekran.mesajGoruntule("Seciminiz:");



        return tusTakimi.veriAl();
    }

}
























