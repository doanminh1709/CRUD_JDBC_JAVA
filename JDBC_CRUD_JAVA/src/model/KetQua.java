package model;

public class KetQua {
	private SinhVien sinhVien;
	private MonHoc monHoc;
	private float diemThi; //has-A
	
	public SinhVien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
	public MonHoc getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}
	public float getDiemThi() {
		return diemThi;
	}
	public void setDiemThi(float diemThi) {
		this.diemThi = diemThi;
	}

}
