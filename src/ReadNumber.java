import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số (0 - 999): ");
        int number = sc.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
            return;
        }

        String result = "";

        // 🔥 hàng trăm
        if (number >= 100) {
            int hundreds = number / 100;

            switch (hundreds) {
                case 1: result += "one hundred"; break;
                case 2: result += "two hundred"; break;
                case 3: result += "three hundred"; break;
                case 4: result += "four hundred"; break;
                case 5: result += "five hundred"; break;
                case 6: result += "six hundred"; break;
                case 7: result += "seven hundred"; break;
                case 8: result += "eight hundred"; break;
                case 9: result += "nine hundred"; break;
            }

            number = number % 100;

            if (number > 0) {
                result += " and ";
            }
        }

        // 🔥 từ 10 → 19
        if (number >= 10 && number < 20) {

            switch (number) {
                case 10: result += "ten"; break;
                case 11: result += "eleven"; break;
                case 12: result += "twelve"; break;
                case 13: result += "thirteen"; break;
                case 14: result += "fourteen"; break;
                case 15: result += "fifteen"; break;
                case 16: result += "sixteen"; break;
                case 17: result += "seventeen"; break;
                case 18: result += "eighteen"; break;
                case 19: result += "nineteen"; break;
            }

        }

        // 🔥 từ 20 → 99
        else {

            int tens = number / 10;
            int ones = number % 10;

            // hàng chục
            switch (tens) {
                case 2: result += "twenty "; break;
                case 3: result += "thirty "; break;
                case 4: result += "forty "; break;
                case 5: result += "fifty "; break;
                case 6: result += "sixty "; break;
                case 7: result += "seventy "; break;
                case 8: result += "eighty "; break;
                case 9: result += "ninety "; break;
            }

            // hàng đơn vị
            switch (ones) {
                case 1: result += "one"; break;
                case 2: result += "two"; break;
                case 3: result += "three"; break;
                case 4: result += "four"; break;
                case 5: result += "five"; break;
                case 6: result += "six"; break;
                case 7: result += "seven"; break;
                case 8: result += "eight"; break;
                case 9: result += "nine"; break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}