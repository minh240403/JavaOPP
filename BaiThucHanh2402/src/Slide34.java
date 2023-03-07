import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args){
        //cach tinh delta?
        //neu a==0 nghiem la x = -c/b
        //neu a!=0, tinh Delta = b^2 -4ac
        //neu Delta < 0, vo nghiem
        //delta=0, thi x=-b/2a
        //delta>0, thi x1= (-b -Canbac2(Delta))/2a; x2=(-b + Canbac2(delta))/2a;
        System.out.println("Vui long nhap gia tri a b c");
        try (Scanner scan = new Scanner(System.in)) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            if (a==0) {
                System.out.println("Phuong trinh co nghiem la:"+(-c/b));
            } 
            else {
                double delta = b*b - 4*a*c;
                if (delta<0){
                    System.out.println("Phuong trinh vo nghiem");
                }
                else if (delta==0){
                    double x = -b/2*a;
                    System.out.println("Phuong trinh co nghiem kep:"+x);
                }
                else  {
                    double x1 = (-b - Math.sqrt(delta))/2*a;
                    double x2 = (-b + Math.sqrt(delta))/2*a;
                    System.out.println("Phuong trinh co 2 nghiem la");
                    System.out.println("x1"+x1);
                    System.out.println("x2"+x2);

                }
            }
        }
        }

    }
    

