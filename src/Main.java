import java.util.Scanner;

public class Main {

    static int pow(int a, int b) {

        // Üs 0 ise sonuç 1'dir
        if (b == 0)
            return 1;

        // Recursive çağrı
        return a * pow(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Tabanı Giriniz: ");
        int a = sc.nextInt();

        System.out.print("Lütfen Üssü Giriniz: ");
        int b = sc.nextInt();

        int result = pow(a, b);
        System.out.println(a + "^" + b + " = " + result);
    }
}
