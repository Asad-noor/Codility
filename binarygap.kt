fun solution(N: Int): Int {
    val bi = Integer.toBinaryString(N)
    //println(bi)
    var count = 0
    var result = 0
    if(!bi.contains("0") || bi.length <= 2)
        return 0

    var shouldCount = false
    for (i in 0 until bi.length - 1) {
        if(shouldCount && bi[i] == '0' && bi[i + 1] == '1') {
            count ++
            if(result < count) {
                result = count
            }
            count = 0
            shouldCount = false
        } else if(shouldCount && bi[i] == '0') {
            count ++
        }

        if(!shouldCount && bi[i] == '1' && bi[i + 1] == '0'){
            shouldCount = true
        }
    }
    return result
}
