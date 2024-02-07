package demo;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrance=new Scanner(System.in);
		int order_id=0;		
		
		while(order_id !=-1) {
			System.out.println("sipariş numarasını giriniz. çıkış için -1");
			order_id=entrance.nextInt();
		switch(order_id) {
		case 1:
			System.out.printf("%d numaralı sipariş" , order_id);
			break;
		case 2:
			System.out.printf("%d numaralı sipariş" , order_id);
			break;
		case 3:
			System.out.printf("%d numaralı sipariş" , order_id);
			break;
		case 4:
			System.out.printf("%d numaralı sipariş" , order_id);
			break;
		case 5:
			System.out.printf("%d numaralı sipariş" , order_id);
			break;
		case 6:
			System.out.printf("%d numaralı sipariş" , order_id);
			break;
			default: 
				System.out.printf("Çıkış yapıldı");
				break;
		}
	}
	}

}
