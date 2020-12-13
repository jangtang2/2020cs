package codesquad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class step2 { 
    static Scanner scanner = new Scanner(System.in);
    static char[][] cube = new char[3][3];

    public static void main(String[] args) {
    	List<String> list = new ArrayList<String>();
		cube[0] = new char[]{'R', 'R', 'W'};
        cube[1] = new char[]{'G', 'C', 'W'};
        cube[2] = new char[]{'G', 'B', 'B'};
        
        showcube();
        
        while(true) {
    		list=getinput();
    	}
        
    }
    
    private static void showcube() {    
    	for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cube[i][j] + " ");
            }
            System.out.println();
        }
	}
    
    private static List<String> getinput() {
		System.out.print("CUBE > ");
        String input = scanner.nextLine();
        
        String[] inst_arr = input.split("");
        ArrayList<String> inputList = new ArrayList<>(); 
        for (int i = 0; i < inst_arr.length; i++) {
            String details = inst_arr[i];
            if (details.equals("'")) {
                inst_arr[i - 1] = inst_arr[i - 1] + "'"; 
            }
        }
        for (int i = 0; i < inst_arr.length; i++) {
            String details = inst_arr[i];
            if (!details.equals("'")) { 
                inputList.add(details);
            }
        }
        return inputList;
		
	}
 
} 
