import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        int rate = 23000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input USD: ");
        int usd = scanner.nextInt();

        int vnd = usd * rate;
        System.out.println("Output VND: " + vnd);

        scanner.close();
    }
}
