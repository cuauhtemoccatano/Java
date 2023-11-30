/*given 3 sets of coordinates that form a triangle, calculate the area of the triangle. The area of the triangle i (base * height) / 2 square units. if a line has a slope o dy/dx, its perpendicular has a slope of -dx/dy.
Example:
x= [0,4,7]
y= [0,8,6]
the input numbers are provided by the user with inputstreamreader
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the x coordinates of the triangle");
        String x = reader.readLine();
        String[] xArr = x.split(",");
        System.out.println("Enter the y coordinates of the triangle");
        String y = reader.readLine();
        String[] yArr = y.split(",");
        int[] xInt = new int[xArr.length];
        int[] yInt = new int[yArr.length];
        for (int i = 0; i < xArr.length; i++) {
            xInt[i] = Integer.parseInt(xArr[i]);
        }
        for (int i = 0; i < yArr.length; i++) {
            yInt[i] = Integer.parseInt(yArr[i]);
        }
        System.out.println("The area of the triangle is: " + area(xInt, yInt));
    }

    public static double area(int[] x, int[] y){
        double area = 0;
        int[] xArr = x;
        int[] yArr = y;
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        int base = xArr[2] - xArr[0];
        int height = yArr[2] - yArr[0];
        area = (base * height) / 2;
        return area;
    }
}