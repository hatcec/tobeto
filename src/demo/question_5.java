package demo;

import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner entrance = new Scanner(System.in);
	        int total = 0;
	        
	        System.out.print("Bir sayi giriniz: ");
	        int number = entrance.nextInt();
	        
	        for(int i = 1; i < number; i++)
	        {
	            if(number % i == 0) {
	                total += i;
	            }
	        }
	        if(number == total) {
	            System.out.printf("\n %d Mükemmel bir sayidir",number);
	        }
	        else {
	            System.out.printf("\n %d Mükemmel bir sayi değildir.", number);
	        }
	}

}
