package LinRegression;
import java.text.DecimalFormat;

public class SimpleLinRegression extends LinearRegression {

    private double mean_x, mean_x_sq, mean_y, mean_xy;
    private double a, b1;
    private int i, j;

    SimpleLinRegression(double [][] x, double y[]){

        super(x, y);

    }

    public void make_regression(){

        System.out.println("Starting program...");

        for(i = 0; i < len_x; i++){

            mean_x += x[i][0];
            mean_y += y[i];
            mean_xy += x[i][0] * y[i];
            mean_x_sq += Math.pow(x[i][0], 2);

        }

        mean_x = mean_x / len_x;
        mean_y = mean_y / len_x;
        mean_xy = mean_xy / len_x;
        mean_x_sq = mean_x_sq  / len_x;

        b1 = (mean_xy - mean_x * mean_y) / (mean_x_sq - Math.pow(mean_x, 2));
        a = mean_y - b1 * mean_x;

        System.out.println("Equation calculation complete!");
        System.out.println(a + ", " + b1);

    }

    public void report(){

        DecimalFormat df = new DecimalFormat("###.####");
        System.out.println("Equation is " + df.format(a) + " + " +
                df.format(b1) + "x");

    }

}
