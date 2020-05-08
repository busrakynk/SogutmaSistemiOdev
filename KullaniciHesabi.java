import java.sql.*;

public class KullaniciHesabi {
    private int seriNo;
    private int sifre;

    public KullaniciHesabi(int seriNo,int sifre)
    {
    this.seriNo=seriNo;
    this.sifre=sifre;
    }

    public boolean kullaniciDogrula() throws SQLException {
    boolean control = false;
    Connection conn = null;

    try {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SogutmaSistemi", "postgres", "admin");

    } catch (Exception e) {
        System.out.println("Baglantı başarısız");
    }
    String query = "select * from \"public\".\"KullaniciHesabi\"";
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(query);
    while (rs.next()) {
        if (seriNo==rs.getInt("seriNo") && sifre==rs.getInt("sifre")) {
            control = true;
        }
    }
    if (control) {
        System.out.println("----kullanici Dogrulandi ----");
        return true;
    }
    else {
        System.out.println("----kullanici Dogrulanamadi ----");
        return false;
    }

}

}
