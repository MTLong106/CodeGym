import java.util.Scanner;

public class PrimeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int numbers = scanner.nextInt();

        int count = 0;
        int n = 2;
        while (count < numbers) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }

        scanner.close();
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}