package listTraining;

public class Employee {
	// viet tiep...
	private String ten;
	private int tuoi;
	boolean gioiTinh;
	private String queQuan;
	private double luong;
	private String chucVu;

	public String getTen() {
		return ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public double getLuong() {
		return luong;
	}

	public String getChucvu() {
		return chucVu;
	}

	public boolean isGioiTing() {
		return gioiTinh;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh.equals("true");
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getGioiTinhString() {
		return gioiTinh ? "nam" : "nu";
	}
}
