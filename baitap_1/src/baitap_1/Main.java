package baitap_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		KhuPho hoDan = new KhuPho();
		Nguoi nguoi = new Nguoi();

		Scanner sc = new Scanner(System.in);
		nhapThongTin(hoDan);
		hienThiThongTin(hoDan);
		mungTho(hoDan);

	}

	public static void nhapThongTin(KhuPho hoDan) {
		Scanner sc = new Scanner(System.in);
		char c;
		while (true) {
			System.out.println("So thanh vien trong Ho: ");
			hoDan.setSoThanhVienTrongHo(sc.nextInt());
			System.out.println("So nha: ");
			hoDan.setSoNha(sc.nextInt());

			ArrayList<Nguoi> nguois = new ArrayList<Nguoi>(hoDan.getSoThanhVienTrongHo());
			for (int i = 0; i < hoDan.getSoThanhVienTrongHo(); i++) {
				Nguoi nguoi = new Nguoi();
				System.out.println("Ho va ten: ");
				nguoi.setHoVaTen(sc.next());
				System.out.println("Ngay Sinh: ");
				String ngaySinh = sc.next();
				nguoi.setNgaySinh(LocalDate.parse(ngaySinh));
				System.out.println("Nghe nghiep: ");
				nguoi.setNgheNghiep(sc.next());
				nguois.add(nguoi);
			}
			hoDan.setNguois(nguois);
			System.out.println("Ban co muon nhap them:(Y/N) ");
			c = sc.next().charAt(0);
			if (c == 'n' || c == 'N')
				break;
		}

		ArrayList<KhuPho> arrKhuPhos = new ArrayList<KhuPho>();
		for (int i = 0; i < arrKhuPhos.size(); i++) {
			arrKhuPhos.add(hoDan);
			System.out.println("Ban co muon nhap them:(Y/N) ");
			c = sc.next().charAt(0);
			if (c == 'n' || c == 'N')
				break;
		}
	}

	public static void hienThiThongTin(KhuPho hoDan) {
		ArrayList<KhuPho> arrKhuPhos = new ArrayList<KhuPho>();

			System.out.println("So thanh vien: " + hoDan.getSoThanhVienTrongHo());
			System.out.println("So nha: " + hoDan.getSoNha());
			System.out.println("Cac thanh vien trong gia dinh: ");
			for (int j = 0; j < hoDan.getSoThanhVienTrongHo(); j++) {
				System.out.println("Ho va ten: " + hoDan.getNguois().get(j).getHoVaTen());
				System.out.println("Ngay sinh: " + hoDan.getNguois().get(j).getNgaySinh());
				System.out.println("Nghe nghie: " +hoDan.getNguois().get(j).getNgheNghiep());
			}
		}

	public static void mungTho(KhuPho hoDan) {
		ArrayList<KhuPho> arrKhuPhos = new ArrayList<KhuPho>();
		LocalDate localDate = LocalDate.now();
		int year = 2022;
			for (int i = 0; i < arrKhuPhos.size(); i++) {
				for (int j = 0; j < hoDan.getSoThanhVienTrongHo(); j++){
				if(localDate.getYear() - hoDan.getNguois().get(i).getNgaySinh().getYear() > 80);
					System.out.println("Ho co nguoi thuong tho: " +arrKhuPhos.get(i).hienThiThongTin());
					}
				}
}
}