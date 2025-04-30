package Graph;
import java.util.Scanner;
import java.util.*;
public class Parcel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr); // Sort the array
        
        List<Integer> p = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            p.add(x);
            while (i < n && x == arr[i]) {
                i++;
            }
            i--; // to compensate the extra i++ in while
        }
        
        int i = 0, j = 0;
        int ans = 0, cnt = 0;
        
        while (j < p.size()) {
            while (j < p.size() && p.get(j) - p.get(i) < n) {
                j++;
            }
            cnt = j - i;
            ans = Math.max(ans, cnt);
            while (i < p.size() && j < p.size() && p.get(j) - p.get(i) >= n) {
                i++;
            }
        }
        
        System.out.println(ans);
    }
}

    