public class Triangle {

    public double area(int a , int b , int c){
        int p = (a+b+c)/2;
        double s  = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(s);
    }

    public int perimetr(int a , int b , int c){
        return a+b+c;
    }
}
