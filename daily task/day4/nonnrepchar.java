
import java.util.*;

public class nonnrepchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char result = '$';
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                result = s.charAt(i);
                break;
            }
        }

        System.out.println(result);
    }
}
