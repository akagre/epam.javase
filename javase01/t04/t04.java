import java.util.Scanner;
public class t04 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of numbers");
        int n = in.nextInt();
        if (n%2!=0){
            System.out.println("Only even amount of numbers supports");
            System.out.println("Enter amount of numbers");
            n = in.nextInt();
        }
        double a[] = new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter " + (i+1) +" number");
            a[i] = in.nextDouble();
        }
        double max = a[0]+a[n-1]; 
        for(int i=1;i<n/2-1;i++){
            if (a[i]+a[n-i]>max){
                max = a[i]+a[n-i];
            }
        }
        System.out.println(max);
    }
}
