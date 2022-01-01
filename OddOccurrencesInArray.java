class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> occurringMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) {
            if(occurringMap.containsKey(A[i])) {
                int occurrence = occurringMap.get(A[i]);
                occurrence ++;
                occurringMap.put(A[i], occurrence);
            } else {
                occurringMap.put(A[i], 1);
            }
        }

        Set keySet = occurringMap.keySet();
        for(Object currentKey: keySet) {
            int value = occurringMap.get(currentKey);

            if(value % 2 != 0) return ((int)currentKey);
        }

        return 0;
    }
}
