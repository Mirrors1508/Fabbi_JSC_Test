package Bai3;

import java.util.Scanner;

public class Bai3 {
	public static int NhapN() {
		Scanner inputN = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n=inputN.nextInt();
		boolean check=false;
		
		 while(!check)
		{
			 if (n>=2) break;
			 System.out.print("Vui long nhap lai n (n>=2): ");
			 	n=inputN.nextInt();
		}
		inputN.close();
		return n;
	}
	public static int[] NhapMang(int n)
	{
		Scanner inputMang = new Scanner(System.in);
		int[] mang = new int[n];
		int i=0;
		//boolean check=false;
		for(i=0;i<n;i++)
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
		int n=NhapN(),i=0,j=0,num1,num2,range;
		int[] mang = NhapMang(n);
		range=0;
		num1=mang[0];
		num2=mang[1];
		
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(Math.abs(mang[i]-mang[j])>0)
					return;
				
			}
		}
		System.out.println("Tong 2 so lon nhat trong mang: "+(num1+num2));
		
		
	}
}
