fun strStr(haystack: String, needle: String): Int{
    var len = needle.length
    var diff = haystack.length -len
    if (haystack == needle) return 0
    for (i in 0 .. diff) {
        if (haystack.substring(i, i+len) == needle){
            return i
        }
    }
    return -1


}
fun main(){
    val haysstack ="sadbutsad"
    val needle ="sad"
    val result =strStr(haysstack,needle)
    println("${result}")


}
