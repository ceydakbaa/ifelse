import java.util.Scanner;

public class ifelseodev {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
           System.out.println("sayı gir:");
              int number = scan.nextInt();
         if(number %2==0) {
             System.out.println("o bir çift sayıdır.");
         }
           else {
             System.out.println("o bir tek sayıdır.");
           }
           scan.close();
         }
    }