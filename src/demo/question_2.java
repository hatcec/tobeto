package demo;

import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrance=new Scanner(System.in);
		System.out.println("kaç ürün almak istersiniz?");
		int quantity=entrance.nextInt();
		double price=0;
		double total=0;
		for(int i=0;i<quantity;i++) {
			System.out.printf("%d . ürünün fiyatı= ",i+1);
			 price=entrance.nextDouble();
			 total+=price;
		}
		System.out.printf("\n %d ürünün toplam fiyatı= %f " , quantity, total);

	}

}
