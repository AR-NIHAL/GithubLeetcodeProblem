fun main(){
    println( longestCommonPrefix(arrayOf("dog","racecar","car")))


}
fun longestCommonPrefix(strs: Array<String>): String {
    if(strs.size ==0 ) return ""
    var min = Integer.MAX_VALUE
    for(string in strs) {
        min = Math.min(min, string.length)
    }
    for (i in 0 until min){
        val char = strs[0][i]
        for(string in strs){
            if(string[i] !== char){
                return string.substring(0,i)
            }
        }
    }
    return strs[0].substring(0,min)
}
