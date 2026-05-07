import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {

        // tạo Scanner để nhập dữ liệu
        Scanner sc = new Scanner(System.in);

        // yêu cầu nhập tên
        System.out.print("Enter your name: ");

        // đọc chuỗi nhập từ bàn phím
        String name = sc.nextLine();

        // hiển thị lời chào
        System.out.println("Hello: " + name);

        // đóng Scanner
        sc.close();
    }
}