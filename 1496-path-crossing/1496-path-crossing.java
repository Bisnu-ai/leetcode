
import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visit=new HashSet<>();
        int x=0,y=0;
        int n=path.length();
        visit.add(x+","+y);
        for(char ele:path.toCharArray()){
            if(ele=='N'){
                y++;
            }
            else if(ele=='S'){
                y--;
            }
            if(ele=='E'){
                x++;
            }
            if(ele=='W'){
                x--;
            }
        String p=x+","+y;
        if(visit.contains(p)){
            return true;
        }
        visit.add(p);
        }
       return false;
    }
}