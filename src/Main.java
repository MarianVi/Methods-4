import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO


        int numar = scanner.nextInt();
        listaNumerePalindrom(numar);
    }

    public static boolean estePalindrom(int numar) {
        int numarPrincipal = numar;
        int invers = 0;

        while (numar != 0) {
            int cifra = numar % 10;
            invers = invers * 10 + cifra;
            numar /= 10;
        }
        return numarPrincipal == invers;
    }

    public static void listaNumerePalindrom (int num) {
        for (int i = 0; i <= num; i++) {
            if (estePalindrom(i)) {
                System.out.print(i + " ");
            }
        }
    }
}