public class Rectangle extends Triangle{

    @Override
    public double area(int a, int b, int c) {
        return a*b;
    }

    @Override
    public int perimetr(int a, int b, int c) {
        return (a+b)*2;
    }
}
