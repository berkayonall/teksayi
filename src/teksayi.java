import java.util.Scanner;
public class teksayi {
    public static void main(String[] args) {
        int a;
        int total = 0;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Bir sayı giriniz :");
            a = scanner.nextInt();
            if (a % 2 == 1);{
                total +=  a ;

            }
        } while (a >0);

        System.out.println("Toplam : " + total);





    }
}
