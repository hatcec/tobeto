package demo;

public class question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do while koşul sağlanmasa dahi bir kez do kısmında programı çalıştırır.
		//while koşul sağlanmadığında programı çalıştırmaz.
		int i=0;
		do {
			System.out.println(i++);
		}while(i<5);
		
		
		System.out.println("---------------");
		
		while(i<5) {
			System.out.println(i++);
		}
	}

}
