import  java.util.Scanner;


public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cân nặng (kg): ");
        double weight = input.nextDouble();

        System.out.print("Nhập chiều cao (m): ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

        // phân loại
        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Bình thường");
        } else if (bmi < 30) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }

        input.close();
    }

}
