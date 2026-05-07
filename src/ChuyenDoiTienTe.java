import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // tỷ giá USD -> VND
        double rate = 25000;

        // nhập USD
        System.out.print("Nhập số tiền USD: ");
        double usd = sc.nextDouble();

        // chuyển đổi
        double vnd = usd * rate;

        // hiển thị kết quả
        System.out.println("Số tiền VND: " + vnd);

        sc.close();
    }
}