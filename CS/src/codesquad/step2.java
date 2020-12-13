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
    		String[] array = new String[list.size()];
    		int size = 0;
    		for(String item : list) {
    		    array[size++] = item;
    		}
    		
            for(int i=0; i<array.length;i++) {
            	if(array[i].equals("U")) {
                    U(cube);
              
            	}
            	else if(array[i].equals("U'")) {
            		notU(cube);
                
            	}
            	else if(array[i].equals("R")) {
            		R(cube);
            
            	}
            	else if(array[i].equals("R'")) {
            		notR(cube);
         
            	}
            	else if(array[i].equals("L")) {
            		L(cube);

            	}
            	else if(array[i].equals("L'")) {
            		notL(cube);
                    break;
            	}
            	else if(array[i].equals("B")) {
            		B(cube);

            	}
            	else if(array[i].equals("B'")) {
            		notB(cube);
            	}
            	else if(array[i].equals("Q")) {
            		Q(cube);
                    break;
            	}
            	else {
            		 System.out.println("잘못 된 입력입니다.\n");
            		 continue;
            	}
            	showcube();
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
