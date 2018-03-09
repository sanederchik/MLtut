package LinRegression;


public class LinearRegression {

    //init X and Y vars

    public static double[][] x;
    public static double[] y;
    public int len_x;

    LinearRegression(double [][] x, double y[]){

        this.x = x;
        this.y = y;
        this.len_x = x.length;

        assert len_x == y.length;

        }

    }
