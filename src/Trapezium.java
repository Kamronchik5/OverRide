public class Trapezium extends Triangle{

    @Override
    public double area(int a, int b, int c) {
        double s = (a+b)*c/2;
        return s;
    }

    @Override
    public int perimetr(int a, int b, int c) {
        return a+b+c;
    }
}
