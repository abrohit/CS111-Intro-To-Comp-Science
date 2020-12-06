/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int number_of_reviewers = Integer.parseInt(args[0]);
		int number_of_movies = Integer.parseInt(args[1]);

		int[][] ratings = new int[number_of_reviewers][number_of_movies];

		int row = 0;

		for (int count=2; count<args.length; count+=number_of_movies){
			for(int count_two=0; count_two<number_of_movies; count_two++){
				ratings[row][count_two]=Integer.parseInt(args[count+count_two]);
			}
			row+=1;
		}

		int[] total_ratings = new int[number_of_movies];

		for (int i=0; i<ratings[0].length; i++){
			for (int j=0; j<ratings.length; j++){
				total_ratings[i] += ratings[j][i];
			}
		}

		int max=0;
		int small=0;

		for (int count=0; count<number_of_movies; count++) {
			if (total_ratings[count]>max){
				max = total_ratings[count];
				small = count;
			}
		}

		System.out.println(small);
		
	}
}
