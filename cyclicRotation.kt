fun solution(A: IntArray, K: Int): IntArray {
    if (A.isEmpty() || K == A.size || K == 0) {
        return A
    }
    val result = IntArray(A.size)
    var newK = K
    if (K > A.size) {
        if (K % A.size == 0) {
            return A
        }
        newK = K % A.size
    }

    var indexRes = A.size - newK
    A.forEachIndexed { index, _ ->
        if (indexRes == A.size) {
            indexRes = 0
        }
        result[index] = A[indexRes]
        indexRes ++
    }
    return result
}
