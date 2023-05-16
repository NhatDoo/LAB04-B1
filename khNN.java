package bai2;

public class khNN extends kh
{
	String qt;
public khNN(String mkh, String ht, String ngay, double sl, double dongia,String qt) {
		super(mkh, ht, ngay, sl, dongia);
		qt = this.qt;
	}
@Override 
double thanhtien() 
{
	return sl*dongia;
}

}
