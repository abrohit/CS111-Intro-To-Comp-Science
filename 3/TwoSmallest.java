/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {

       double smallest_number = Double.MAX_VALUE;
       double sec_smallest_number = Double.MAX_VALUE;

       for(int count=0; count<args.length; count++){
           double temp = Double.parseDouble(args[count]);
           if (temp<=smallest_number){
               sec_smallest_number = smallest_number;
               smallest_number = temp;
           }
           else if (temp < sec_smallest_number && temp != smallest_number){
               sec_smallest_number = temp;
           }
       }

       System.out.println(smallest_number);
       System.out.println(sec_smallest_number);

    }

}
