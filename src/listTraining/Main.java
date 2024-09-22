package listTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Employee hito1 = new Employee();
		hito1.setTen("Hung");
		hito1.setTuoi(35);
		hito1.setGioiTinh("true");
		hito1.setQueQuan("Ha Noi");
		hito1.setLuong(30.0);
		hito1.setChucVu("truong Phong IT");

		Employee hito2 = new Employee();
		hito2.setTen("Huong");
		hito2.setTuoi(32);
		hito2.setGioiTinh("false");
		hito2.setQueQuan("Nghe An");
		hito2.setLuong(20.0);
		hito2.setChucVu("Ke Toan");

		Employee hito3 = new Employee();
		hito3.setTen("Lan");
		hito3.setTuoi(28);
		hito3.setGioiTinh("false");
		hito3.setQueQuan("Hai Phong");
		hito3.setLuong(19);
		hito3.setChucVu("maketing");

		Employee hito4 = new Employee();
		hito4.setTen("Duong");
		hito4.setTuoi(31);
		hito4.setGioiTinh("true");
		hito4.setQueQuan("Phu Tho");
		hito4.setLuong(25);
		hito4.setChucVu("ki Su IT");

		Employee hito5 = new Employee();
		hito5.setTen("Nam");
		hito5.setTuoi(29);
		hito5.setGioiTinh("true");
		hito5.setQueQuan("Ha Noi");
		hito5.setLuong(21);
		hito5.setChucVu("ki Su IT");

		Employee hito6 = new Employee();
		hito6.setTen("Vy");
		hito6.setTuoi(21);
		hito6.setGioiTinh("false");
		hito6.setQueQuan("Ha Noi");
		hito6.setLuong(5);
		hito6.setChucVu("intern");

		String ten = hito1.getTen();
		int tuoi = hito1.getTuoi();
		String gioitinh = hito1.getGioiTinhString();
		String queQuan = hito1.getQueQuan();
		double luong = hito1.getLuong();
		String chucVu = hito1.getChucvu();

		String ten1 = hito2.getTen();
		int tuoi1 = hito2.getTuoi();
		String gioitinh1 = hito2.getGioiTinhString();
		String queQuan1 = hito2.getQueQuan();
		double luong1 = hito2.getLuong();
		String chucVu1 = hito2.getChucvu();

		String ten2 = hito3.getTen();
		int tuoi2 = hito3.getTuoi();
		String gioitinh2 = hito3.getGioiTinhString();
		String queQuan2 = hito3.getQueQuan();
		double luong2 = hito3.getLuong();
		String chucVu2 = hito3.getChucvu();

		String ten3 = hito4.getTen();
		int tuoi3 = hito4.getTuoi();
		String gioitinh3 = hito4.getGioiTinhString();
		String queQuan3 = hito4.getQueQuan();
		double luong3 = hito4.getLuong();
		String chucVu3 = hito4.getChucvu();

		String ten4 = hito5.getTen();
		int tuoi4 = hito5.getTuoi();
		String gioitinh4 = hito4.getGioiTinhString();
		String queQuan4 = hito5.getQueQuan();
		double luong4 = hito5.getLuong();
		String chucVu4 = hito5.getChucvu();

		String ten5 = hito6.getTen();
		int tuoi5 = hito6.getTuoi();
		String gioitinh5 = hito6.getGioiTinhString();
		String queQuan5 = hito6.getQueQuan();
		double luong5 = hito6.getLuong();
		String chucVu5 = hito6.getChucvu();

		System.out.println(ten + " " + tuoi + " tuoi " + gioitinh + " " + queQuan + " " + luong + " trieu " + chucVu);
		System.out.println(
				ten1 + " " + tuoi1 + " tuoi " + gioitinh1 + " " + queQuan1 + " " + luong1 + " trieu " + chucVu1);
		System.out.println(
				ten2 + " " + tuoi2 + " tuoi " + gioitinh2 + " " + queQuan2 + " " + luong2 + " trieu " + chucVu2);
		System.out.println(
				ten3 + " " + tuoi3 + " tuoi " + gioitinh3 + " " + queQuan3 + " " + luong3 + " trieu " + chucVu3);
		System.out.println(
				ten4 + " " + tuoi4 + " tuoi " + gioitinh4 + " " + queQuan4 + " " + luong4 + " trieu " + chucVu4);
		System.out.println(
				ten5 + " " + tuoi5 + " tuoi " + gioitinh5 + " " + queQuan5 + " " + luong5 + " trieu " + chucVu5);

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(hito1);
		employeeList.add(hito4);
		employeeList.add(hito5);
		employeeList.add(hito2);
		employeeList.add(hito3);
		employeeList.add(hito6);
		System.out.println(" ");
//		in lương trên 20tr
		System.out.println("danh sach nhan vien luong tren 20tr:");
		for (Employee employee : employeeList) {

			if (employee.getLuong() > 20.0) {
				System.out.println(employee.getTen() + ": " + "Luong " + employee.getLuong() + "Trieu");
			}

		}
		System.out.println(" ");
//		In ra tổng số nhân viên nam cùng với tên những nhân viên nam:
		for (Employee employee : employeeList) {
			if (employee.getGioiTinh()) {
				System.out.println("Nam: " + employee.getTen() + " ");
				System.out.println(" ");
			} else {
				System.out.println("Nu:" + employee.getTen() + " ");
				System.out.println(" ");
			}
		}
		System.out.println("tong so nhan vien Nam trong cong ty la : " + employeeList.size());

	}

}