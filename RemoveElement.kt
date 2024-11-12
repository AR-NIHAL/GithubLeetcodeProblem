fun removeElement(nums: IntArray, `val`: Int): Pair<IntArray, Int>{
    var k=0
    for (i in 0 until nums.size){
        if (nums[i] != `val`){
            k++
        }
        if(nums[i] == `val`){
            nums[i]=0

        }

    }
    return Pair<IntArray, Int>(
        nums,
        k
    )
}
fun main() {

    val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val `val` = 2

    val arr = removeElement(nums, `val`)
    println("${arr.second}")


    for (i in arr.first) {
        print("$i")
    }
}
