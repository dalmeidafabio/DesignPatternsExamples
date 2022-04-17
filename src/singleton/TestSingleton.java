package singleton;

public class TestSingleton {

	public static void main(String[] args) {

		PrintManager printManager01 = PrintManager.getInstance();
		PrintManager printManager02 = PrintManager.getInstance();
		PrintManager printManager03 = PrintManager.getInstance();
		PrintManager printManager04 = PrintManager.getInstance();
		PrintManager printManager05 = PrintManager.getInstance();
		
		System.out.println(printManager01);
		System.out.println(printManager02);
		System.out.println(printManager03);
		System.out.println(printManager04);
		System.out.println(printManager05);
		
	}

}
