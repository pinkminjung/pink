package ex01.random;

//*
import java.util.Random;

public class LottoRandom {
	public static void main(String[] args) {
		int num = 45;
		Random r = new Random();
		int lotto[] = new int[6];

		for (int i = 0; i < lotto.length; i++)
			lotto[i] = r.nextInt(num);   

		again :  for (int i = 0; i < lotto.length; i++)
			for (int j = 0; j < lotto.length; j++) {
				if (i == j)
					continue again;
				while (lotto[i] == lotto[j])
					lotto[i] = r.nextInt(num);
		}

		for (int i = 0; i < lotto.length - 1; i++)
			for (int j = i + 1; j < lotto.length; j++)
				if (lotto[i] > lotto[j]) {
					int temp;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}

		System.out.print("금주의 당첨 번호는 : " + "\t");

		for (int i = 0; i < lotto.length; i++)
			System.out.print(lotto[i] + 1 + "\t");
	} // main end
}
//*/

/*
import java.util.Random;

public class LottoRandom {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1; // 1 ~ 45

			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (i == 0)
					break;
				if (arr[i] == arr[j])
					i--;

			} // for j end
		} // for i end

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		} // for end

	} // main end
} // class end

//*/
