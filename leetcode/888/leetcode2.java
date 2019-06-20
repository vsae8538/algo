import java.util.HashSet;
import java.util.stream.IntStream;

class leetcode {
    public static void main(String[] args) {

    }    
    //Calculate dif = (sum(A) - sum(B)) / 2
    //We want find a pair (a, b) with a = b + dif
    public int[] fairCandySwap(int[] A, int[] B) {
        int dif = (IntStream.of(A).sum() - IntStream.of(B).sum()) / 2;
        HashSet<Integer> S = new HashSet<>();
        for (int a : A) S.add(a);
        for (int b : B) if (S.contains(b + dif)) return new int[] {b + dif, b};
        return new int[0];
    }
}
