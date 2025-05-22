import java.util.Scanner;

public class dowhilesifre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre;
        String dogrusifre = "Ceyda.kaba";
        ;
        do {
            System.out.println("lütfen sifreyi giriniz .");
            sifre = scan.nextLine();
            if (!sifre.equals(dogrusifre))
            System.out.println("yanlış şifre.Lütfen tekrar deneyiniz.");
        }
        while (!sifre.equals(dogrusifre)) ;
        System.out.println("Giriş yapılıyor.Şifre kabul edildi.");
        scan.close();

    }
}
