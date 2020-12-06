/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		boolean check = false;

		for(int count=0; count<args.length; count++){
			for(int count_two=count+1; count_two<args.length; count_two++){

				int value1 = Integer.parseInt(args[count]);
				int value2 = Integer.parseInt(args[count_two]);

				if (value1==value2){
					check = true;
					break;
				}
			}
		}

		System.out.println(check);
		
	}
}
