package codesquad;

import java.util.Scanner;


public class step1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word;
		String w_arr[];
		int num;
		char LR;
		boolean flag = true;
		int len;
		String result[];
		
		while(flag==true) {
			word=scanner.next();
			num=scanner.nextInt();
			LR=scanner.next().charAt(0);	
			w_arr=new String[word.length()];
			result=new String[word.length()];
			len=w_arr.length;
			
			for(int i=0;i<len; i++) {
				w_arr[i]=Character.toString(word.charAt(i));
			}
		}

	}
}