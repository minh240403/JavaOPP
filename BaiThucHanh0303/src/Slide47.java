import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) throws Exception {

        float sum = 0, number;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Vui Long Nhap Cac So:");
                number = scanner.nextFloat();
                sum += number;

                // Neu tong > 100 thi dung va in ra man hinh
                if (sum > 100)
                    break;
            } while (number > 0);
        }

        System.out.println("Tong = " + sum);

    }
}
