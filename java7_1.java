package hello;

import java.util.Scanner;

public class java7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n=input.nextInt();
		int[] s = new int[101];
		System.out.print("Enter"+n+"scores :");
		for (int i=0;i<n;i++) {
			s[i]=input.nextInt();
		}
		int max=0;
		for (int i=0;i<n;i++) {
			if(s[i]>max) {
				max=s[i];
			}
		}
		for (int i=0;i<n;i++) {
			if(s[i]>=max-10) {
				System.out.println("Student "+i+" score is "+s[i]+" is A");
			}
			else if (s[i]>=max-20) {
				System.out.println("Student "+i+" score is "+s[i]+" is B");
			}
			else if (s[i]>=max-30) {
				System.out.println("Student "+i+" score is "+s[i]+" is C");
			}
			else if (s[i]>=max-40) {
				System.out.println("Student "+i+" score is "+s[i]+" is D");
			}
			else {
				System.out.println("Student "+i+" score is "+s[i]+" is F");
			}
		}
	}

}
