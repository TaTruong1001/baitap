package baitap_1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoVaTen;
	private LocalDate ngaySinh;
	private String ngheNghiep;

	public Nguoi() {
		super();
	}

	public Nguoi(String hoVaTen, LocalDate ngaySinh, String ngheNghiep) {
		super();
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.ngheNghiep = ngheNghiep;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate localDate) {
		this.ngaySinh = localDate;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

}
