import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(isMagic(n));
    }

     static int isMagic(int n){
        while (n>9){
            int sum=0;
            while (n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        if(n==1){
            return 1;
        }
        return 0;
    }
}
