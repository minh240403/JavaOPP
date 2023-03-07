
public class Slide50 {
    public static void main(String[] args) {
        System.out.println("Cac so chia het cho 5 tu 0 den 200 la: ");

        for (int i = 0; i <= 200; i++) {
            // nếu i không chia hết cho 5 thì quay lại vòng lặp for
            if (i % 5 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
