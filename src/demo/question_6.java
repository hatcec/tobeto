package demo;

public class question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="hatice ateş";
		String text2="furkan";
		System.out.printf("\n %s cümlesinin uzunluğu =%d",text, text.length());
		System.out.printf("\n %s cümlesinin büyük harf yazılışı: %s",text,text.toUpperCase());
		System.out.printf("\n %s cümlesinin küçük harf yazılışı:%s",text,text.toLowerCase());
		System.out.printf("\n ateş'in index numarası =%d",text.indexOf("ateş"));
		System.out.printf("\n %s",text.concat(text2));
		
	}

}
