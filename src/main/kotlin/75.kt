fun sortColors(nums: IntArray): Unit {
    val n = nums.size
    var low = 0
    var mid = 0
    var high = n - 1

    while (mid <= high) {

        if (nums[mid] == 1)
            mid++
        else if (nums[mid] == 2) {
            val temp = nums[mid]
            nums[mid] = nums[high]
            nums[high] = temp
            high--
        } else if (nums[mid] == 0) {
            val temp = nums[mid]
            nums[mid] = nums[low]
            nums[low] = temp
            mid++
            low++
        }


    }


}
