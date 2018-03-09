import numpy as np

class LinRegression(object):

    def __init__(self, x, y):

        self.x = np.array(x)
        self.y = np.array(y)

        assert (len(x) == len(y)) #n_rows is equal

#simple linear regression
class SimpleLinearRegression(LinRegression):

    def make_regression(self):

        print("Starting program...")

        mean_x = 0
        mean_y = 0
        mean_xy = 0
        mean_x_sq = 0
        len_x = len(self.x)

        for i in np.arange(0, len_x, 1):

            mean_x += self.x[i]
            mean_y += self.y[i]
            mean_xy += self.x[i] * self.y[i]
            mean_x_sq += self.x[i]**2

        mean_x = mean_x / len_x
        mean_y = mean_y / len_x
        mean_xy = mean_xy / len_x
        mean_x_sq = mean_x_sq  / len_x
        
        self.b1 = (mean_xy - mean_x * mean_y) / (mean_x_sq - mean_x**2)
        self.a = mean_y - self.b1 * mean_x

        print("Equation calculation complete!")

    def report(self):

        print("Equation is %.4f + %.4f * x" % (self.a, self.b1))

A = SimpleLinearRegression(x = np.array([[10], [20], [30]]), y = np.arange(3))
A.make_regression()
A.report()
