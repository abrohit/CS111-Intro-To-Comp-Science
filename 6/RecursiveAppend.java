/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

        if (n >= 0) {
            return(original + appendNTimes(original, n - 1));
        }
        return "";
    }

    public static void main (String[] args) {

        System.out.print(appendNTimes("cat",10));

	// WRITE TEST CASES HERE to test your method
    }
}
