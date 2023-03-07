import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Vui lòng nhap vao so a ");
            int a = scanner.nextInt();
            System.out.println("Vui lòng nhap vao so b ");
            int b = scanner.nextInt();
            if (a < b){
                System.out.println("So nho nhat trong 2 so là ");
                System.out.println("Min: "+a);
                
            }
            else {
                System.out.println("So nho nhat trong 2 so là ");
                System.out.println("Min: "+b);
            }
        } 
       

        }
       

    }
