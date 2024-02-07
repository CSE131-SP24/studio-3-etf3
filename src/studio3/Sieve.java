package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Number please?");
		int number = in.nextInt();

		boolean [] prime = new boolean[40];
		for (int i = 2 ; i < number; i++) {
			for (int j = 2*i; j < prime.length; j = j+i ) {
				prime [j-1] = true;

				for (int k = 0; k < prime.length; k++) {
					
					if (prime[k] == false) {
						System.out.println(j + " is not prime");
					}
					else {
						System.out.println(j + " is prime"); 
					}
				}
			}
		}




	}

}
