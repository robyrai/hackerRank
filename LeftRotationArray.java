import java.util.Arrays;

public class LeftRotationArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotLeft(arr, 4)));
    }

    static int[] rotLeft(int[] a, int d) {
        int netChange = d % a.length;
        for (int i = 0; i < netChange; i++) {
            int temp = a[0];
            int curr = 1;
            while (curr < a.length) {
                a[curr - 1] = a[curr];
                curr++;
            }
            a[a.length - 1] = temp;
        }
        return a;
    }
}
