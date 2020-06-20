public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(arr));
    }

    static int jumpingOnClouds(int[] c) {
        int hops = 0;
        for(int currIndex = 0; currIndex < c.length - 1; currIndex++) {
            if(currIndex + 2 < c.length && c[currIndex + 2] != 1) {
                currIndex += 1;
            }
            hops++;
        }
        return hops;
    }
}
