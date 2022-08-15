import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Immutable {

    public static int topla(int a) {
        if (a>=0)//koşulumuzu belirttik.
        {
            return (a + topla(a - 1));//geriye döndürme işlemimizi yaptık
        }
        else {

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Klavyeden sayı giriniz");

        int x = scanner.nextInt();//klavyeden sayı istedik.
        int sonuc = topla(x);

        System.out.println("Girilen sayıdan 1'e kadar olan sayılar toplamı = "+sonuc);



        System.out.println("Sayı giriniz");
        int n = scanner.nextInt();

        System.out.println("Girilen sayının fibonaccisi = " + fibonacci(n));

    }



    public static int fibonacci(int n) {
        if ((n == 0) || (n == 1))//koşulumuzu belirttik
            return n;
        else//yinelemeli olarak yazılır.
            return fibonacci(n - 1) + fibonacci(n - 2);
    }




}





