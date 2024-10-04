package pomPakage;

import java.util.Random;

public class RandomNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int no = r.nextInt(1000);
		System.out.println(no);
	}

}
