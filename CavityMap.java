import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CavityMap {
    public static void main(String[] args) throws IOException {
        String[] grid = {"1112", "1912", "1892", "1234"};
        String[] result = cavityMap(grid);

        System.out.println(Arrays.toString(result));
    }

    static String[] cavityMap(String[] grid) {
        for (int i = 1; i < grid.length - 1; i++) {
            char[] nums = grid[i].toCharArray();
            for (int j = 1; j < nums.length - 1; j++) {
                String a = String.valueOf(grid[i - 1].charAt(j));
                if (nums[j] > grid[i - 1].charAt(j) && nums[j] > nums[j + 1] && nums[j] > grid[i + 1].charAt(j) && nums[j] > nums[j - 1]) {
                    nums[j] = 'X';
                }
            }
            grid[i] = String.valueOf(nums);
        }
        return grid;
    }
}
