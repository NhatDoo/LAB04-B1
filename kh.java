package bai2;

public abstract class kh {
String mkh;
String ht;
String ngay;
double sl;
double dongia;
public String getMkh() {
	return mkh;
}
public void setMkh(String mkh) {
	this.mkh = mkh;
}
public String getHt() {
	return ht;
}
public void setHt(String ht) {
	this.ht = ht;
}
public String getNgay() {
	return ngay;
}
public void setNgay(String ngay) {
	this.ngay = ngay;
}

public kh(String mkh, String ht, String ngay, double sl, double dongia) {
	super();
	this.mkh = mkh;
	this.ht = ht;
	this.ngay = ngay;
	this.sl = sl;
	this.dongia = dongia;
}
abstract double thanhtien();
}
