import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listcompress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            List<String> compressedSequence = compressSequence(arr);
            String result = String.join(",", compressedSequence);
            System.out.println(result);
        }
    }

    private static List<String> compressSequence(int[] arr) {
        List<String> compressedSequence = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                if (start == end) {
                    compressedSequence.add(Integer.toString(arr[start]));
                } else if (end == start + 1) {
                    compressedSequence.add(Integer.toString(arr[start]));
                    compressedSequence.add(Integer.toString(arr[end]));
                } else {
                    String range = arr[start] + "..." + arr[end];
                    compressedSequence.add(range);
                }
                start = i;
                end = i;
            } else {
                end = i;
            }
        }

       
        if (start == end) {
            compressedSequence.add(Integer.toString(arr[start]));
        } else if (end == start + 1) {
            compressedSequence.add(Integer.toString(arr[start]));
            compressedSequence.add(Integer.toString(arr[end]));
        } else {
            String range = arr[start] + "..." + arr[end];
            compressedSequence.add(range);
        }

        return compressedSequence;
    }
}