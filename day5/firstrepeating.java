package day5;
import java.util.*;
public class firstrepeating{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        int result=-1;
        for(int num:arr){
            if(set.contains(num)){
                result=num;
                break;
            }
            set.add(num);
        }
        System.out.println(result);
    }
}