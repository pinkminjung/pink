package ex01.random;

import java.util.Random;
import java.util.Scanner;

public class Updown {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Random r = new Random();
		
		/*int cnt=0 , num = 0;
		int result = (int)(Math.random() *100) +1;
		
		System.out.println("원하는 숫자를 입력해 주세요 : ");
		num = sc.nextInt();
		
		while ( cnt<=5) {
			if ( num <0 || num > 100) {
				System.out.println("다시 입력하세요");
				num = sc.nextInt();
			} else if (num < result) {
				System.out.print(" UP : ");
				num = sc.nextInt();
				cnt++;
			} else if (num > result) {
				System.out.print( "Down : ");
				num = sc.nextInt();
				cnt++;
			} else {
				System.out.println("****************Bingo*********************");
				break;
			}
		} // i end
*/	
		
		// UPDOWN GAME
		while (true) {
			int updown = (int)(Math.random() *100) +1;
			int [] x=new int [100];
			char op = ' ';
			int cnt = 0;
			
			System.out.print( "\n" );
			
			for ( int i=0; i<x.length; i++) {
				System.out.println( "아무 숫자나 입력하세요 : ");
				x[i] = sc.nextInt();
				
				if (x[i] >0 && x[i] <=100) {
					if (updown == x[i]) {
						System.out.println( " Bingo" + updown);
						break;
					} // in if end
					
					else if ( updown > x[i]) {
						System.out.print( " Up : ");
						cnt++;
						if (cnt == 5) break;
					}
					
					else if (updown < x[i]) {
						System.out.print( " Down : ");
						cnt++;
						if (cnt ==5) break;
					}
				} // if end
				else  {
					System.out.println( " 1~100 사이의 숫자를 입력해주세요" );
				}
			} // i end
			
			System.out.println( "숫자를 맞추지 못했습니다. 숫자는 " + updown + "입니다.");
		}
	}// main end
} // class end


