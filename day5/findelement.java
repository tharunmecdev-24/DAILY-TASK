import java.util.*;
public class findelement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int l=0;
        int r=n-1;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                res=mid;
                break;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println(res);
    }
}