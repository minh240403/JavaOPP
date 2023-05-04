import java.util.Scanner;

public class Nhanvien {
    public String hoten;
    public String tuoi;
    public float hesoluong;
    public float Namsinh;
    public final float luongcoban = 1490000;
    public float luong;
    public void nhapthongtinnhanvien(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap vao ten nhan vien");
            hoten = sc.nextLine();
            System.out.println("Nhap vao tuoi nhan vien");
            tuoi = sc.nextLine();
            System.out.println("Nhap vao he so luong");
            hesoluong = sc.nextFloat();
            System.out.println("Nhap vao nam sinh");
            hesoluong = sc.nextInt();
        }
    }
    public Float tinhluong(){
        return (luongcoban*hesoluong);
    }
    public void inthongtinnhanvien(){
System.out.printf("ten nv la %s, tuoi %d, he so luong:%f,luong hien tai = %f ",hoten,tuoi,hesoluong,luongcoban*hesoluong);
    }
    

}
