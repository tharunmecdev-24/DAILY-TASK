import java.util.Scanner;

public class numpalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int reverse=0;
        while(n>0){
            int last=n%10;
            reverse=(reverse*10)+last;
            n=n/10;
        }
        if(original==reverse && original>=0){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
