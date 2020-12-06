/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

        double[] return_array = new double[array.length];
        for (int i=0;i<array.length;i++){
            return_array[i] = array[i];
        }

        return (return_array);
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

        for (int i=0;i<x.length;i++){
            x[i]*=alpha;
            y[i]*=alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

        for (int i=0;i<x.length;i++){
            x[i]+=dx;
            y[i]+=dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

        theta = Math.toRadians(theta);

        for (int i=0;i<x.length;i++){
            double temp = x[i];
            x[i] = (x[i]*Math.cos(theta)) - (y[i]*Math.sin(theta));
            y[i] = (y[i]*Math.cos(theta)) + (temp*Math.sin(theta));
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

        /*Scales polygon by the factor 2.
        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double alpha = 2.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        scale(x, y, alpha); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        */

        /*Translates polygon by (2, 1).
        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double dx = 2.0, dy = 1.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        translate(x, y, dx, dy); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        */

         //Rotates polygon 45 degrees. 
        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double theta = 30.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        rotate(x, y, theta); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        

        /*Returns copy of array
        double[] g = copy(x);
        for (int i=0;i<g.length;i++){
            System.out.println(g[i]);
        }
        */

    }
}
