import java.lang.Math;

public class t02 {
    public static final double EPS = 1e-6;

    public static void main(String[] args) {   
        int n = 1;
        while (1/Math.pow((n+1),2)>EPS){
            n++;
        }
        System.out.println(n);
    }

}
