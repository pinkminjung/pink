package ex01.random;

public class MathRandom { // java.lang.Math.random();

	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		System.out.println(Math.random()); // 0.0~1.0 ������ �������� � �� ��µ�
		System.out.println((int)(Math.random() * 5)); //0~n-1, 0~4 ���̰� ��µ�
		System.out.println( "===========================");
		
		for (int i=1; i<5; i++) {
			num[i] = (int)(Math.random() *5) +1 ; // 0�� �ȳ����� �Ϸ���
			System.out.print(num[i] + "\t");
		}
	} // main end

}
