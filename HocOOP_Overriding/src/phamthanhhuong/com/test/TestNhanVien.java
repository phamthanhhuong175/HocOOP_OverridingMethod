package phamthanhhuong.com.test;

import phamthanhhuong.com.model.NhanVienChinhThuc;
import phamthanhhuong.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo=new NhanVienChinhThuc();
		teo.tinhLuong(25);
		NhanVienThoiVu ty=new NhanVienThoiVu();
		ty.tinhLuong(10);
	}

}
