import java.util.*;

public class Bai4 {

    public static int pairs(int k, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        int count = 0;
        for (int x : arr) {
            if (set.contains(x - k)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pairs(k, arr));
        sc.close();
    }
}
