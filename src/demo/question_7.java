package demo;

import java.util.Scanner;

public class question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrance=new Scanner(System.in);
		System.out.println("Öğrenci sayısını giriniz=");
	    int squantity=entrance.nextInt();
	    int s1,s2,s3;
	    String name, surname;
	    double avg;
	    for(int i=0;i<squantity;i++) {
	    	System.out.printf("\nÖğrenci adını giriniz=");
	    	name=entrance.next();
	    	System.out.printf("\nÖğrenci soyadını giriniz=");
	    	surname=entrance.next();
	    	System.out.printf("\nÖğrenci 1.sınav notunu giriniz=");
	    	s1=entrance.nextInt();
	    	System.out.printf("\nÖğrenci 2.sınav notunu giriniz=");
	    	s2=entrance.nextInt();
	    	System.out.printf("\nÖğrenci 3.sınav notunu giriniz=");
	        s3=entrance.nextInt();
	    	System.out.printf("öğrencinin not ortalaması= %f",((s1+s2+s3)/3.0));
	    }
	}

}
