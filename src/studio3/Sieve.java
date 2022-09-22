
package studio3;

import java.util.Scanner;

public class Sieve {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Pick a value of N:");
		int n = in.nextInt();
		
		boolean [] numbers = new boolean[n+1];
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			int counter = 1;
			
			if(numbers[i] == false) {
				for (int j = i*i; j<=n; j = j+i ) {
					
					numbers[j] = true;
					
				}
			}
		}
		
		for (int i = 0; i<n; i++) {
			if (numbers[i] == false) {
				System.out.println(i);
			}
		}
	}
	
}