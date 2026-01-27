class Solution {

    public int[] distributeCandies(int candies, int people) {
        int[] arr = new int[people];
        int idx = 0;
        int c = 1;
        int give = 0;
        while (candies > 0) {
            give = Math.min(c, candies);
            idx = idx % people;
            arr[idx++]+=give;
            candies-=give;
            c++;

        }
        return arr;
    }
}