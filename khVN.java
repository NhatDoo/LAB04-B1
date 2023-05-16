package bai2;

public class khVN extends kh
{
String dtkh;
double dm;

	public khVN(String mkh, String ht, String ngay,double sl,double dongia,String dtkh,double dm) {
		super(mkh, ht, ngay,sl,dongia);
		dtkh =this.dtkh;
		dm =this.dm;
	}
 @Override 
 double thanhtien() 
 {
	 if(sl<=dm) 
	 {
		 return sl*dongia;
	 }
	 else 
	 {
	  return sl*dongia*dm+(sl-dm)*dongia*2.5;
     }
 
 }
 
}
