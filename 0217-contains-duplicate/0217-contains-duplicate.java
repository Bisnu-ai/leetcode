import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> mp=new HashSet<>();
        for(int e:arr){
            if(mp.contains(e)){
                return true;
            }
            mp.add(e);
        }
        return false;
    }
}