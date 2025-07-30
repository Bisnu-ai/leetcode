import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> mp=new TreeMap<>(Collections.reverseOrder());
        //collection.reverseorder is to desc order of treemap
         for(int i=0;i<heights.length;i++){
            mp.put(heights[i],names[i]);
         }
         return mp.values().toArray(new String[0]);//collection to an array
    }
}