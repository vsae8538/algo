import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class leetcode {


    public static void main(String[] args) {    

    }

    /**
     * sum[k] = sum[1...k-1]
     * sumRange(i,j) = sum[j+1] - sum[i]
     */
    class NumArray {

        public int[] sum;
        public NumArray(int[] nums) {
            sum = new int[nums.length+1];
            for(int i = 0;i < nums.length;i++){
                sum[i+1] = sum[i] + nums[i];
            }
        }
        
        public int sumRange(int i, int j) {
            return sum[j+1] - sum[i];
        }
    }
}

