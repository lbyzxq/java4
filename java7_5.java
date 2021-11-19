package hello;

import java.util.Scanner;

public class java7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int[] number=new int[11];
		int sum=0;
		for(int i = 1;i<=10;i++) {
			int n=input.nextInt();
			number[n]=number[n]+1;
			if(number[n]==1) {
				sum=sum+1;
				System.out.print(n+" ");
				
			}
		}
		System.out.print("\n"+sum);
	}

}
