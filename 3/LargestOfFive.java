/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int number_one = Integer.parseInt(args[0]);
        int number_two = Integer.parseInt(args[1]);
        int number_three = Integer.parseInt(args[2]);
        int number_four = Integer.parseInt(args[3]);
        int number_five = Integer.parseInt(args[4]);

        if (number_one>=number_two && number_one>=number_three && number_one>=number_four && number_one>=number_five) {
            System.out.println(number_one);
        }       
        else{
            if (number_two>=number_one && number_two>=number_three && number_two>=number_four && number_two>=number_five){
                System.out.println(number_two);
            }
            else{
                if (number_three>=number_one && number_three>=number_two && number_three>=number_four && number_three>=number_five){
                    System.out.println(number_three);
                }
                else{
                    if (number_four>=number_one && number_four>=number_two && number_four>=number_three && number_four>=number_five){
                        System.out.println(number_four);
                    }
                    else{
                        if (number_five>=number_one && number_five>=number_two && number_five>=number_three && number_five>=number_four){
                            System.out.println(number_five);
                        }
                    }
                }
            }
          }
    }
}