package day2;
import java.util.*;
public class secondlar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int fi = arr[0];
        int sec = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > fi) {
                sec = fi;
                fi = arr[i];
            } else if (arr[i] > sec && arr[i] != fi) {
                sec = arr[i];
            }
        }

        System.out.println(sec);
    }
}

