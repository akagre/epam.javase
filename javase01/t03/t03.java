import java.lang.Math;
import java.util.Scanner;
public class t03 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double h = in.nextDouble();
        int n = (int)((b-a)/h) + 1;
        double x[]  = new double [n];
        double y[]  = new double [n];
        for (int i=0;i<n;i++){
            x[i] = a+i*h;
            y[i] = Math.tan(2*(x[i])-3);
        }
        System.out.println("x"+"\t"+"y");
        for (int i=0;i<n;i++){
            System.out.println(x[i]+"\t"+y[i]);
        }
    }

}
