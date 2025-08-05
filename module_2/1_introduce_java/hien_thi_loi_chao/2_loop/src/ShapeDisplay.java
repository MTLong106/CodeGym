import java.util.Scanner;

public class ShapeDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (4 types)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printRectangle(4, 6);
                    break;
                case 2:
                    printSquareTriangles();
                    break;
                case 3:
                    printIsoscelesTriangle(5);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

    // Hình chữ nhật
    static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // Tam giác vuông
    static void printSquareTriangles() {
        System.out.println("Bottom-left:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("Top-left:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("Top-right:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        System.out.println("Bottom-right:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // Tam giác cân
    static void printIsoscelesTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
