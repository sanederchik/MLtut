package LinRegression;

import java.util.ArrayList;

public class Main {

    //init X and Y vars

    static double[][] x = {{10, 0}, {20, 0}, {30, 0}};
    static double[] y = {0, 1, 2};

    public static void main(String[] args) {

        SimpleLinRegression A = new SimpleLinRegression(x, y);
        A.make_regression();
        A.report();

    }

}
