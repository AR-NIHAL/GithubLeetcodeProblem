fun main(){
    Romantointeger()

}
fun Romantointeger(){
    val romanmap = mapOf('I' to 1,'V' to 5,'X' to 10, 'L' to 50,'C' to 100,'D' to 500,'M' to 1000)
    val sum = 0
    for (i in str.indices){
        val currentValue=romanmap.getvalue(str[i])
        if(i+1 !=str.length){
            val rightvalue=romanmap.getvalue(str[i+1])
            if(currentValue<rightvalue){
                result-=currentValue
            }else{
                result+=currentValue
            }
        }else{
            result+=currentValue
        }
    }return result
}

