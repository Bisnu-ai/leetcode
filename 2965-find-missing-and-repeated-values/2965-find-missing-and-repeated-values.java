class Solution {
    public static int dup(int[][] arr) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (s.contains(arr[i][j])) {
                    return arr[i][j];
                }
                s.add(arr[i][j]);

            }

        }
        return -1;
    }

    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int n = 0;

        for (int j = 0; j < arr.length; j++) {
            n+=arr[j].length;
        }
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        int duplicate = dup(arr);
        int res = total - (sum-duplicate);
        return new int[] { duplicate, res };

    }
}