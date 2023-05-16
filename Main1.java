package bai1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] arg) 
    {
    	List l = new List();
        int n ;
        Scanner sc = new Scanner(System.in);
        do {
        	
        	System.out.println(" chon 1 : nhap thong tin dat ");
        	System.out.println(" chon 2 : xuat thong tin dat ");
        	
        	
        n =sc.nextInt();
        switch (n)
        {
        case 1: l.nhapdl();break;
        case 2: l.xuat();break;
        
        }
        }
        while(true);
    	
    }
}
