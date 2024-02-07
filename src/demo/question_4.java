package demo;

import java.util.Random;
import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=false;
		int guess, loop=1 ;
		Scanner entrance=new Scanner(System.in);
		Random r=new Random();
		int randomNumber=r.nextInt(10-1)+1;
		while(result==false) {
			System.out.println("1-10 arasında sayı tahmin ediniz..");
		    guess=entrance.nextInt();
		    if(randomNumber==guess) {
		    	System.out.printf("\n %d. tahmininiz doğru = %d",loop,randomNumber);
		    	result=true;		      
		    }else {
		    	System.out.println("yanlış tahmin ettiniz tekrar deneyiniz..");
		    	loop++;
		    }
		}
		
	}

}
