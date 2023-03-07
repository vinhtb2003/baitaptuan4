import java.util.Scanner;

public class Bai1 {
 public static void main(String[] args) {
	 int a,b;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Nhap vao a =");
     a = sc.nextInt();
	 System.out.print("Nhap vao b =");
	 b = sc.nextInt();
   int tong = a + b;
   System.out.println(a + "+" + b + "=" + tong);
   int hieu = a - b;
   System.out.println(a + "-" + b + "=" + hieu);
   int tich = a * b;
   System.out.println(a + "*" + b + "=" + tich);
   float thuong = (float) a / b;
   System.out.println(a + "/" + b + "=" + thuong);
   int phandu = a % b;
   System.out.println(a + "%" + b + "=" + phandu);
   
   System.out.println("a < b ? " + (a < b));
   System.out.println("a > b ? " + (a > b));
   System.out.println("a != b ? " + (a != b));
   System.out.println("a == b ? " + (a == b));
   System.out.println("a >= b ? " + (a >= b));
   System.out.println("a <= b ? " + (a <= b));
  } 
 
}
