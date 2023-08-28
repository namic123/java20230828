import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

class Solution {
    public String solution(String my_string, int m, int c) {
        Hashtable<Integer, String> hsTable= new Hashtable<Integer, String>();
        int n = 0;
        for (int i=0; i<m; i++){
            hsTable.put(i+1,my_string.substring(n, my_string.length()/m+n));
            n+=m;
            System.out.println(my_string.length()/m);
        }
        System.out.println(hsTable.get(c));
        return hsTable.get(c);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ihrhbakrfpndopljhygc",4,2));
    }
}