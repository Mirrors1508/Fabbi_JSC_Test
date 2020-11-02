package Bai1;

import java.util.Scanner;

public class Bai1 {
	 
	public static int NhapN() {
		Scanner inputN = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n=inputN.nextInt();
		
		/*boolean check=false;
		 while(!check)
		{
			try {
				
				check=true;
			} catch (Exception e) {
				System.out.println("Ban phai nhap vao so nguyen. Vui long nhap lai.");
				//inputN.nextLine();
				continue;
			}
			if(n<=0) {
				System.out.println("Ban phai nhap vao so nguyen duong va lon hon 1. Vui long nhap lai.");
				check=false;
			}
			else break;
		}*/
		inputN.close();
		return n;
	}
	public static int[] NhapMang(int n)
	{
		Scanner inputMang = new Scanner(System.in);
		int[] mang = new int[3*n];
		int i=0;
		//boolean check=false;
		for(i=0;i<3*n;i++)
		{
			System.out.print("Nhap vao phan tu mang thu: "+(i+1)+": ");
			mang[i]=inputMang.nextInt();
			/*check=false;
			while(!check)
			{
				try {
					mang[i]=inputMang.nextInt();
					check=true;
				} catch (Exception e) {
					System.out.println("Ban phai nhap vao so nguyen. Vui long nhap lai.");
					//inputMang.nextLine();
				}
				
			}*/
		}
		inputMang.close();
		return mang;
	}
	
	public static void main(String[] args) {
		int n=NhapN(),i=0;
		int[] mang = NhapMang(n);
		
		System.out.print("Mang da nhap: ");
		for (i=0;i<3*n;i++) System.out.print(mang[i]+", ");
		System.out.print("Mang da da sap xep: ");
		for (i=0;i<n;i++) System.out.print(mang[i]+", "+mang[i+n]+", "+mang[i+(2*n)]);
		
	}
}
