package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
  ArrayList<khVN> listVN = new ArrayList<>();
  ArrayList<khNN> listNN = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  void nhapkhVN()
  {
	do {
	 System.out.println("nhap ma khach hang ");
	 String mkh = sc.nextLine();
	 if(mkh == null || mkh.equalsIgnoreCase(""))
	 {
		 break;
	 }
	 System.out.println("nhap dtkh ");
	 String dtkh = sc.nextLine();
	 System.out.println(" nhap ten khach hang ") ;
	 String tkh = sc.nextLine();
	 System.out.println("ngay ra hoa don");
	 String n = sc.nextLine();
	 System.out.println("nhap so luong kW ");
	 double sl = sc.nextDouble();
	 System.out.println("nhap don gia ");
	 double dg = sc.nextDouble();
	 System.out.println("nhap dinh muc ");
	 double dm = sc.nextDouble();
	 khVN kh = new khVN(mkh,dtkh,tkh,dg,sl,n,dm);
	 listVN.add(kh);
	 }
	while(true);
  }
  void nhapkhNN()
  {
	  do {
		 System.out.println("nhap ma khach hang ");
		 String mkh = sc.nextLine();
		 if(mkh == null || mkh.equalsIgnoreCase(""))
		 {
			 break;
		 }
		 System.out.println("nhap quoc tich ");
		 String qt = sc.nextLine();
		 System.out.println(" nhap ten khach hang ") ;
		 String tkh = sc.nextLine();
		 System.out.println("ngay ra hoa don");
		 String n = sc.nextLine();
		 System.out.println("nhap so luong kW ");
		 double sl = sc.nextDouble();
		 System.out.println("nhap don gia ");
		 double dg = sc.nextDouble();
		 khNN kh = new khNN(mkh,qt,tkh,dg,sl,n);
		 listNN.add(kh); 
			}
	  while(true);
  }
  void xuatVN()
  {
	 for (khVN kh : listVN )
         {
		   System.out.printf(" %s  %s  %s  %s  %f   %f   %f  %f\n",kh.mkh,kh.ht,kh.dtkh,kh.ngay,kh.sl,kh.dongia,kh.dm,kh.thanhtien());
		 }  
  }
  void xuatNN() 
  {
	  for (khNN kh : listNN )
      {
		   System.out.printf(" %s  %s  %s  %s  %f   %f   %f\n",kh.mkh,kh.ht,kh.qt,kh.ngay,kh.sl,kh.dongia,kh.thanhtien());
	  }    
  }
    void menu() 
    {
    	int n = sc.nextInt();
    	do {
    		System.out.println("chon 1 : muc kh VN");
    		System.out.println("chon 2 : muc kh nuoc ngoai ");
    		switch (n) 
    		{
    		case 1: int a =sc.nextInt();
    		System.out.println("chon 1 : nhap ");
    		System.out.println("chon 2 : xuat");
    		        switch(a) 
    		        {
    		        case 1: nhapkhVN();break;
    		        case 2:xuatVN();break;
    		        }
    		case 2: int b =sc.nextInt();
    		System.out.println("chon 1 : nhap ");
    		System.out.println("chon 2 : xuat");
    		      switch(b) 
    		      {
    		      case 1: nhapkhNN();
    		      case 2: xuatNN();
    		      
    		      }
    		}
    	}while(true);
    	
    	
    	
    }
}
