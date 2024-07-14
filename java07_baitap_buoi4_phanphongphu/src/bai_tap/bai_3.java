package bai_tap;
import java.util.Scanner;

public class bai_3 {

	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		
		String ten1, ten2, ten3;
		String gioiTinh1, gioiTinh2, gioiTinh3;
		int namSinh1, namSinh2, namSinh3;
		int namSinhKetQua;
		String tenKetQua;
		String gioiTinhKetQua;
		
		// Nhập thông tin cán bộ 1
		System.out.println("Nhập thông tin cán bộ thứ nhất");
		System.out.print("Tên: ");
		ten1 = banPhim.nextLine();
		System.out.print("Giới tính: ");
		gioiTinh1 = banPhim.nextLine();
		System.out.print("Năm sinh: ");
		namSinh1 = banPhim.nextInt();
		banPhim.nextLine();
		
		// Nhập thông tin cán bộ 2
		System.out.println("nhập thông tin cán bộ thứ hai");
		System.out.print("Tên: ");
		ten2 = banPhim.nextLine();
		System.out.print("Giới tính: ");
		gioiTinh2 = banPhim.nextLine();
		System.out.print("Năm sinh: ");
		namSinh2 = banPhim.nextInt();
		banPhim.nextLine();
		
		// Nhập thông tin cán bộ 3
		System.out.println("Nhập thông tin cán bộ thứ ba");
		System.out.print("Tên: ");
		ten3 = banPhim.nextLine();
		System.out.print("Giới tính: ");
		gioiTinh3 = banPhim.nextLine();
		System.out.print("Năm sinh: ");
		namSinh3 = banPhim.nextInt();
		banPhim.nextLine();
		
		banPhim.close();
		
		tenKetQua = ten1;
		gioiTinhKetQua = gioiTinh1;
		namSinhKetQua = namSinh1;
			
		if(gioiTinh2.equals("nam")) {
			if(!gioiTinhKetQua.equals("nam")) {
				tenKetQua = ten2;
				gioiTinhKetQua = gioiTinh2;
				namSinhKetQua = namSinh2;
			} else if (namSinh2 > namSinh1) {
				tenKetQua = ten2;
				gioiTinhKetQua = gioiTinh2;
				namSinhKetQua = namSinh2;
			}
		}
		if(gioiTinh3.equals("nam")) {
			if(!gioiTinhKetQua.equals("nam")) {
				tenKetQua = ten3;
				gioiTinhKetQua = gioiTinh3;
				namSinhKetQua = namSinh2;
			} else if (namSinh3 > namSinhKetQua) {
				tenKetQua = ten3;
				gioiTinhKetQua = gioiTinh3;
				namSinhKetQua = namSinh3;
			}
		}
		if(gioiTinhKetQua.equals("nam")) {
			System.out.println("Cán bộ trẻ nhất là:");
			System.out.println("Tên: " + tenKetQua + " - " + "Năm sinh: " + namSinhKetQua);
		} else {
			System.out.print("Không tìm thấy cán bộ nam trẻ nhất");
		}
		
	
	}
}
