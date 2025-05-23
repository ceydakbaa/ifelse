import java.util.Scanner;

public class nothesaplama {
    public static void main(String[] args){
        int vize , quiz, arasınav, qquiz, ffinal ;
        double ortalama;
         Scanner scan = new Scanner(System.in);

        System.out.println("vize notunu giriniz:");
          vize = scan.nextInt();
        System.out.println("quiz notunu giriniz:");
          quiz = scan.nextInt();
        System.out.println("arasınav notunu giriniz:");
           arasınav = scan.nextInt();
        System.out.println("qquiz notunu giriniz:");
           qquiz = scan.nextInt();
        System.out.println("ffinal notunu giriniz:");
           ffinal = scan.nextInt();

           ortalama = (vize * 0.2) + (quiz * 0.1) + (arasınav * 0.2) + (qquiz * 0.1) + (ffinal * 0.4);
           System.out.println("Not ortalamanız:"+ ortalama);
           String sonuc = (ortalama >=60) ? "Geçtiniz" : "Kaldınız" ;
           System.out.println(sonuc);

    }
}
