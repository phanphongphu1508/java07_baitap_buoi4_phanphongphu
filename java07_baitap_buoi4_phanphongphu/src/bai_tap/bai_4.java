package bai_tap;
import java.util.Scanner;
public class bai_4 {
	public static void main(String[] args) {
		
		String sinhVienXaTruongNhat = "";
		String tenSV1, tenSV2, tenSV3;
		double x1, x2, x3, xDaiHoc;
		double y1,y2, y3, yDaihoc;
		double khoangCachSV1, khoangCachSV2, khoangCachSV3;
		
		// Cho phép nhập từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập vào tọa độ trường đại học
		System.out.print("Tọa độ X trường đại học: ");
		xDaiHoc = banPhim.nextDouble();
		System.out.print("Tọa độ Y trường đại học: ");
		yDaihoc = banPhim.nextDouble();
		banPhim.nextLine();
		

		// Nhập vào tọa độ sinh viên thứ nhất
		System.out.println("Sinh viên thứ nhất:");
		System.out.print("Tên: ");
		tenSV1 = banPhim.nextLine();
		System.out.print("Tọa độ X: ");
		x1 = banPhim.nextDouble();
		System.out.print("Tọa độ Y: ");
		y1 = banPhim.nextDouble();
		banPhim.nextLine();
		
		// Nhập vào tọa độ sinh viên thứ hai
		System.out.println("Sinh viên thứ hai:");
		System.out.print("Tên: ");
		tenSV2 = banPhim.nextLine();
		System.out.print("Tọa độ X: ");
		x2 = banPhim.nextDouble();
		System.out.print("Tọa độ Y: ");
		y2 = banPhim.nextDouble();
		banPhim.nextLine();
		
		// Nhập vào tọa độ sinh viên thứ ba
		System.out.println("Sinh viên thứ ba:");
		System.out.print("Tên: ");
		tenSV3 = banPhim.nextLine();
		System.out.print("Tọa độ X: ");
		x3 = banPhim.nextDouble();
		System.out.print("Tọa độ Y: ");
		y3 = banPhim.nextDouble();
		
		banPhim.close();
		
		// Tính khoảng cách sinh viên thứ nhất
		khoangCachSV1 = Math.sqrt(Math.pow((xDaiHoc - x1), 2) + Math.pow((yDaihoc - y1), 2));
		
		// Tính khoảng cách sinh viên thứ hai
		khoangCachSV2 = Math.sqrt(Math.pow((xDaiHoc - x2), 2) + Math.pow((yDaihoc - y2), 2));
		
		// Tính khoảng cách sinh viên thứ ba
		khoangCachSV3 = Math.sqrt(Math.pow((xDaiHoc - x3), 2) + Math.pow((yDaihoc - y3), 2));
		
		if (khoangCachSV1 > khoangCachSV2 && khoangCachSV1 > khoangCachSV3) {
			sinhVienXaTruongNhat = tenSV1;
		}
		else if (khoangCachSV2 > khoangCachSV1 && khoangCachSV2 > khoangCachSV3) {
			sinhVienXaTruongNhat = tenSV2;
		}
		else if (khoangCachSV3 > khoangCachSV1 && khoangCachSV3 > khoangCachSV2) {
			sinhVienXaTruongNhat = tenSV3;
		}
		else {
			System.out.print("Khoảng cách đến trường của 3 sinh viên bằng nhau");
			return;
		}
		// In ra màn hình sinh viên xa trường nhất
		System.out.print("Sinh viên xa trường nhất là " + sinhVienXaTruongNhat);
		banPhim.close();
	}
}
