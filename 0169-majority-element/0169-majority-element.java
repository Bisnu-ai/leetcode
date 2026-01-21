class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(h.get(arr[i])>n/2){
                ans=arr[i];
            }
        }
        return ans;
    }
}