fun removeDuplicates(nums: IntArray): Int {
        val distinctnums = nums.distinct()
        distinctnums.forEachIndexed() { index, value ->
            nums[index] = value
        }
       return distinctnums.size

    }

    fun main(){
        val nums= intArrayOf(1,1,2)
        val newsize = removeDuplicates(nums)
        for(i in 0 until newsize){
            print("${nums[i]}")
        }
        
    }
