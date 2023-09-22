package pkg;

import java.util.Scanner;

public class Main {

	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		answer[0] = 1; 
		answer[1] = 1;
		
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
