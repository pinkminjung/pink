package ex01.random;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		Random r = new Random(); // import java.util.Random ���Ѿ���
		int iNum = r.nextInt(); // ���� �����
		System.out.println("iNum = " + iNum);
		
		for (int i=2; i<6; i++){
			System.out.print(r.nextInt(5) +1 + "\t"); // 0~n-2, 32bit�� �ش��ϴ� ����
		}
	}
}
