package quiz2;

import java.util.Scanner;

public class Tuition {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.println("Enter your tuition increasing rate:");
			double rate = input.nextDouble();
			
			System.out.println("Enter your first year tuition:");
			double tuition = input.nextDouble();

			input.close();
			
			double sum = 0.0;
			
			int i = 1;
			while (i<=4) {
			
				sum+=tuition;
				
				tuition+=(tuition*rate);
				
				i++;
			}
				System.out.printf("The tuition for the four years is:$%.2f\n",sum);

				
			}	  
		}	
