import java.util.Scanner;

public class switchmodul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı girin.");
        int number = scan.nextInt();
        switch (number) {
            case 3:
                System.out.println("sayı 3'e eşittir.");
                break;
            case 5:
                System.out.println("sayı 5'e eşittir.");
                break;
            case 7:
                System.out.println("sayı 7'ye  eşittir.");
                break;
            default:
                System.out.println("bu sayıyı kullanamıyoruz.");
        }
    }
}