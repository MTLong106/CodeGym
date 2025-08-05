import java.util.Scanner; // Import lớp Scanner để đọc dữ liệu từ bàn phím

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner

        System.out.println("Enter your name: ");  // In ra dòng hướng dẫn
        String name = scanner.nextLine();         // Đọc toàn bộ dòng nhập vào (bao gồm cả dấu cách)

        System.out.println("Hello: " + name);     // Hiển thị lời chào kèm tên

        scanner.close(); // Đóng đối tượng scanner để giải phóng tài nguyên
    }
}