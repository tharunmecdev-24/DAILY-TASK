import java.util.*;
public class rem0veduplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==0){
            System.out.println(0);
            return;
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        int newarr=i+1;
        for(int k=0;k<newarr;k++){
            System.out.println(arr[k]);
        }
    }
}