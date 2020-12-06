/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        int steps = Integer.parseInt(args[0]);

        int[] position = new int[2];
        int[] change_in_position = new int[2];

        System.out.println("("+position[0]+","+ position[1]+")");

        for (int count=0;count<steps;count++){
            
            double probability = Math.random();

            if(probability < 0.25){ //North
                change_in_position[0] = 0;
                change_in_position[1] = 1;
            }
            else if(probability >= 0.25 && probability < 0.50){ //West
                change_in_position[0] = -1;
                change_in_position[1] = 0;
            }
            else if(probability >= 0.50 && probability < 0.75){ //South
                change_in_position[0] = 0;
                change_in_position[1] = -1;
            }
            else{ //East
                change_in_position[0] = 1;
                change_in_position[1] = 0;
            }

            position[0]+=change_in_position[0];
            position[1]+=change_in_position[1];

            System.out.println("("+position[0]+","+ position[1]+")");

        }

        double distance= Math.pow(position[0],2)+ Math.pow(position[1],2);

        System.out.println("Squared distance = "+distance);

    }
}