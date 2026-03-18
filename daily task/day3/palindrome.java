import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l=0;
        int r=s1.length()-1;
        boolean isPalindrome=true;
        while(l<r){
            if (s1.charAt(l)!=s1.charAt(r)) {
                isPalindrome=false;
                break;
            }
            l++;
            r--;
        }
        if(isPalindrome){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
