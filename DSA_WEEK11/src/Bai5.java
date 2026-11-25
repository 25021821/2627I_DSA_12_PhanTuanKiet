
import java.util.*;

public class Bai5 {

    public static List<Integer> missingNumbers(
            int[] arr, int[] brr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : brr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : arr) {
            map.put(x, map.get(x) - 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int x : map.keySet()) {
            if (map.get(x) > 0) {
                result.add(x);
            }
        }

        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] brr = new int[m];

        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        List<Integer> result = missingNumbers(arr, brr);

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
