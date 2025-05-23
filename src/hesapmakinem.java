  import java.util.Scanner;
  public class hesapmakinem {
      private static double Her;

      public static double topla(double a ,double b ){
          return a+b ;
      }
      public static double cikarma(double a , double b){
          return a-b ;
      }
      public static double bolme(double a, double b) {
          if (b != 0) {
              return a / b;
          } else {
              System.out.println("sıfıra bölünemez.");
              return Double.NaN;
          }
      }

      public static double carpma(double a, double b) {
          return a * b;
      }

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Hangi işlemi yapmak istersiniz? (topla, cikarma, carpma, bolme): ");
          String islem = scanner.nextLine().toLowerCase();

          System.out.print("Birinci sayıyı girin: ");
          double sayi1 = scanner.nextDouble();

          System.out.print("İkinci sayıyı girin: ");
          double sayi2 = scanner.nextDouble();

          double sonuc;

          switch (islem) {
              case "topla":
                  sonuc = topla(sayi1, sayi2);
                  break;
              case "cikarma":
                  sonuc = cikarma(sayi1, sayi2);
                  break;
              case "carpma":
                  sonuc = carpma(sayi1, sayi2);
                  break;
              case "bolme":
                  sonuc = bolme(sayi1, sayi2);
                  break;
              default:
                  System.out.println("Geçersiz işlem türü!");
                  scanner.close();
                  return;
          }

          System.out.println("Sonuç: " + sonuc);
          scanner.close();
      }
  }
