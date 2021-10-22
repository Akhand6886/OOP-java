package Lab3.java;
import java.util.Scanner;

public class Exp3_Prog2 {

	public static void main(String[] args) {

				java.util.Scanner in = new java.util.Scanner(System.in);
				int[] array = new int[3];
				int sum=0;
				System.out.println("Enter the 20 numbers");
				for(int i=0;i<array.length;i++){
						array[i]=in.nextInt();
						sum = sum + array[i]*array[i];
				}
				System.out.println("The sum is:"+ sum);
				}
	}
