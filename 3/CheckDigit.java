/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        int length_of_code = (args[0]).length();
        long code = Long.parseLong(args[0]);
        int sum_of_even_digit = 0;
        int sum_of_odd_digit = 0;

        for (int count=0; count<13; count++){
                
            long digit = code % 10;
            code = code/10;
                
            if (count % 2 == 0){
                sum_of_even_digit += digit;
            }

            if (count % 2 != 0){
                sum_of_odd_digit += digit;
            }

        }

        int task_one = sum_of_even_digit % 10;

        int task_two = sum_of_odd_digit % 10;
        int task_three = (task_two*3) % 10;

        int task_four = (task_one + task_three) % 10;

        System.out.println(task_four);

    }
}