import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

class Solution{


    /**
     * 分治遞規
     * 
     */
    public int longestSubstring(String s, int k) {
        if(s.length() < k) return 0;
        HashMap<Character,Integer> map = new HashMap();
        for(int i = 0;i < s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        int res = 0;
        for(char c : map.keySet()){
            if(map.get(c) < k){
                for(String t : s.split(c + "")){
                    res = Math.max(res, longestSubstring(t, k));
                }
                return res;
            }
        }

        return s.length();
    }

}
