import java.util.*;
public class twosum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int l=0;
        int r=n-1;
        while(l<r){
            int s=nums[l]+nums[r];
            if(s==target){
                System.out.println((l)+" "+(r));
                return;
            }else if(s<target){
                l++;
            }else{
                r--;
            }
        }
        System.out.println("-1 -1");
    }
}