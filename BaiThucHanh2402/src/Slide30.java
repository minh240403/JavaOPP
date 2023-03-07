import java.util.Scanner;

public class Slide30 {
    //tinh tong cac so nguyen nhap tu ban phim
    //input:1 2 3 4 5
    //output:1+2+3+4+5=15
    public static void main(String[] args) {
        System.out.println("Nhap so nguyen can tinh tong: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int tong = 0;
            while (a!=0){
                tong+= a%10;
                a/=10; // chinh la a = a/10

            }
            System.out.println("tong cac chu so la:" +tong);
        }

    }
}