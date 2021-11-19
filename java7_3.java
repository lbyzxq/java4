package hello;

import java.util.Scanner;

public class java7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] numbers = new int[101];
		int n=input.nextInt();
		while(n!=0) {
			numbers[n]=numbers[n]+1;
			n=input.nextInt();
		}
		for(int i=1;i<101;i++) {
			if(numbers[i]>0) {
				System.out.println(i + " occurs " + numbers[i] + " time");
			}
		}
	}

}
