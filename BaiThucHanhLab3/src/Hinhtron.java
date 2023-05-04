import java.util.Scanner;


public class Hinhtron {
    
    public float bankinh;
    public float chuvi;
    public float dientich;
    public final float Pi = 3.14f;

public void Nhapbankinh(){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Nhap vao ban kinh");
        bankinh = sc.nextFloat();
    }
    }

public void Tinhchuvi(){
    chuvi = 2*Pi*bankinh;
    
}
public void Tinhdientich(){
    dientich = Pi*bankinh*bankinh;}

public void Inthongtin(){
    System.out.printf("r = %f,chuvi = %f, dientich = %f",bankinh,chuvi,dientich); 

}
}





        
    
