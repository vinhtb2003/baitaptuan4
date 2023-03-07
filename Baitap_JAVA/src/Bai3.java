import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int namsinh, tuoi;
		String ten;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten :");
		ten = sc.nextLine();
		System.out.print("Nhap nam sinh :");
		namsinh = sc.nextInt();
		tuoi = 2023 - namsinh;
		if(tuoi < 16) {
			System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
		}
	    else if(tuoi >= 16 && tuoi < 18) {
			System.out.println("Ban " + ten + " o do tuoi truong thanh ");
		    }
		else {
			System.out.println("Ban " + ten  + " da gia");
		}
						
	}

}
