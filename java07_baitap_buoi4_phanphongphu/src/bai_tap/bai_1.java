package bai_tap;
import java.util.Scanner;
public class bai_1 {
	public static void main(String[] args) {
		
		// Khai báo biến tên và năm sinh của sinh Viên
		String tenSV1, tenSV2, tenSV3;
		int namSinhSV1, namSinhSV2, namSinhSV3;
		
		// Cho phép nhập từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập tên và năm sinh của sinh viên 1
		System.out.println("Sinh viên thứ nhất");
		System.out.print("Tên: ");
		tenSV1 = banPhim.nextLine();
		System.out.print("Năm sinh: ");
		namSinhSV1 = banPhim.nextInt();
		banPhim.nextLine();
		
		// Nhập tên và năm sinh của sinh viên 2
		System.out.println("Sinh viên thứ hai");
		System.out.print("Tên: ");
		tenSV2 = banPhim.nextLine();
		System.out.print("Năm sinh: ");
		namSinhSV2 = banPhim.nextInt();
		banPhim.nextLine();
		
		// Nhập tên và năm sinh của sinh viên 3
		System.out.println("Sinh viên thứ ba");
		System.out.print("Tên: ");
		tenSV3 = banPhim.nextLine();
		System.out.print("Năm sinh: ");
		namSinhSV3 = banPhim.nextInt();
		
		banPhim.close();	
		
		
		System.out.println("Sinh viên nhỏ tuổi nhất là");
		
		// Đặt điều kiện để kiểm tra tìm sinh viên nhỏ nhất
		// SV1 > SV2 & SV1 > SV3 -> SV1 nhỏ nhất
		if(namSinhSV1 > namSinhSV2 && namSinhSV1 > namSinhSV3) {
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV1, namSinhSV1);
		}
		// SV2 > SV1 & SV2 > SV3 -> SV2 nhỏ nhất
		else if(namSinhSV2 > namSinhSV1 && namSinhSV2 > namSinhSV3) {
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV2, namSinhSV2);
		}
		// SV3 > SV1 & SV3 > SV2 -> SV3 nhỏ nhất
		else if(namSinhSV3 > namSinhSV1 && namSinhSV3 > namSinhSV2) {
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV3, namSinhSV3);
		}
		// SV1 = SV2 & SV1 < SV3 -> SV3 nhỏ nhất
		else if(namSinhSV1 == namSinhSV2 && namSinhSV1 < namSinhSV3) {
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV3, namSinhSV3);
		}
		// SV1 = SV3 & SV1 < SV2 -> SV2 nhỏ nhất
		else if(namSinhSV1 == namSinhSV3 && namSinhSV1 < namSinhSV2) {
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV2, namSinhSV2);
		}
		// SV2 = SV3 & SV2 < SV1 -> SV1 nhỏ nhất
		else if(namSinhSV2 == namSinhSV3 && namSinhSV2 < namSinhSV1) {
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV1, namSinhSV1);
		}
		// SV1 = SV2 & SV1 > SV3 -> SV1, SV2 nhỏ nhất
		else if(namSinhSV1 == namSinhSV2 && namSinhSV1 > namSinhSV3) {
			System.out.printf("Tên: %s - Năm Sinh: %d.\n",tenSV1, namSinhSV1);
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV2, namSinhSV2);
		}
		// SV1 = SV3 & SV1 > SV2 -> SV1, SV3 nhỏ nhất
		else if(namSinhSV1 == namSinhSV3 && namSinhSV1 > namSinhSV2) {
			System.out.printf("Tên: %s - Năm Sinh: %d.\n",tenSV1, namSinhSV1);
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV3, namSinhSV3);
		}
		// SV2 = SV3 & SV2 > SV1 -> SV2, SV3 nhỏ nhất
		else if(namSinhSV2 == namSinhSV3 && namSinhSV2 > namSinhSV1) {
			System.out.printf("Tên: %s - Năm Sinh: %d.\n",tenSV2, namSinhSV2);
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV3, namSinhSV3);
		}
		// SV1 = SV2 = SV3 -> SV1, SV2, SV3
		else {
			System.out.printf("Tên: %s - Năm Sinh: %d.\n",tenSV1, namSinhSV1);
			System.out.printf("Tên: %s - Năm Sinh: %d.\n",tenSV2, namSinhSV2);
			System.out.printf("Tên: %s - Năm Sinh: %d",tenSV3, namSinhSV3);
		}
	}
}
