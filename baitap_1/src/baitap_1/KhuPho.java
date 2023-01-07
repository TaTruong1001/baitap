package baitap_1;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
	private int soThanhVienTrongHo;
	private int soNha;
	private ArrayList<Nguoi> nguois;

	public int getSoThanhVienTrongHo() {
		return soThanhVienTrongHo;
	}

	public void setSoThanhVienTrongHo(int soThanhVienTrongHo) {
		this.soThanhVienTrongHo = soThanhVienTrongHo;
	}

	public int getSoNha() {
		return soNha;
	}

	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}

	public ArrayList<Nguoi> getNguois() {
		return nguois;
	}

	public void setNguois(ArrayList<Nguoi> nguois) {
		this.nguois = nguois;
	}

	public String hienThiThongTin() {
		ArrayList<KhuPho> arrKhuPhos = new ArrayList<KhuPho>();
		KhuPho hoDan = new KhuPho();

		System.out.println("So thanh vien: " + hoDan.getSoThanhVienTrongHo());
		System.out.println("So nha: " + hoDan.getSoNha());
		System.out.println("Cac thanh vien trong gia dinh: ");
		for (int j = 0; j < hoDan.getSoThanhVienTrongHo(); j++) {
			System.out.println("Ho va ten: " + hoDan.getNguois().get(j).getHoVaTen());
			System.out.println("Ngay sinh: " + hoDan.getNguois().get(j).getNgaySinh());
			System.out.println("Nghe nghie: " +hoDan.getNguois().get(j).getNgheNghiep());
		}
		return null;
	}

}
