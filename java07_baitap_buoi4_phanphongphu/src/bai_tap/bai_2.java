package bai_tap;
import java.util.Scanner;
public class bai_2 {
	public static void main(String[] args) {
		
		// Cho phép nhập từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập số nguyên thứ nhất
		System.out.print("Nhập số nguyên thứ nhất: ");
		int soNguyen1 = banPhim.nextInt();
		
		// Nhập số nguyên thứ nhất
		System.out.print("Nhập số nguyên thứ hai: ");
		int soNguyen2 = banPhim.nextInt();
				
		// Nhập số nguyên thứ nhất
		System.out.print("Nhập số nguyên thứ ba: ");
		int soNguyen3 = banPhim.nextInt();
		
		banPhim.close();
		
		// Tạo biến tích lũy
		int soChan = 0;
		int soLe = 0;
		
		// Kiểm tra số nguyên thứ nhất để xác định số chẵn hay số lẻ
		if (soNguyen1 % 2 == 0) {
			soChan += 1;
		} 
		else {
			soLe += 1;
		}
		// Kiểm tra số nguyên thứ hai để xác định số chẵn hay số lẻ
		if (soNguyen2 % 2 == 0) {
			soChan += 1;
		} 
		else {
			soLe += 1;
		}
		// Kiểm tra số nguyên thứ ba để xác định số chẵn hay số lẻ
		if (soNguyen3 % 2 == 0) { 
			soChan += 1;
		}
		else {
			soLe += 1;
		}
		
		System.out.printf("Có %d số chẵn và %d số lẻ",soChan, soLe );
	}
}
