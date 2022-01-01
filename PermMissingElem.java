class Solution {
    public int solution(int[] A) {
        int len = A.length;
        if(len == 0) return 1;
        
        Arrays.sort(A);
        if(A[0] != 1) return 1;
        for(int i = 0; i < len - 1; i++) {
            if(A[i] - A[i+1] == 1 || A[i] - A[i+1] == -1) {
                continue;
            } else {
                return A[i] + 1;
            }
        }
        if(A[len - 1] == len) return len + 1;
        return len;
    }
}
