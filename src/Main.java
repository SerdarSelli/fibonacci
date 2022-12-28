import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı fibonaci istersin?");
        n= scan.nextInt();
        int a=0,b=1,sum=0;
        System.out.print(0+" "+1+" ");
        for (int i =2;i<n;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }

    }
}