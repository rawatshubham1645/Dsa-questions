package Masai.Impress_the_Girls;

public class Main {
	public static void main(String[] args) {
        int N = 7;
        int k = 2;
        int[] arr = new int[]{2, 4, 8, 1, 2, 1, 8};
        impress(N, k, arr);
    }

    public static void impress(int n, int k, int[] arr) {
        int max = 0;

        int sum;
        for(sum = 0; sum < k; ++sum) {
            max += arr[sum];
        }

        sum = max;

        for(int i = k; i < n; ++i) {
            sum += arr[i] - arr[i - k];
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }
}
