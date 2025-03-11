fun binarySubArray(array: IntArray, k: Int): Int {
//1,0,1,0,1
    var count = 0
    var sum = 0
    var l = 0
    var r = 0
    if (k < 0) return 0

    while (r < array.size) {
        sum += array[r]
        while (sum > k) {
            sum -= array[l]
            l++
        }
        count += (r - l + 1)
        r++
    }

    return count

}

fun countSubarrays(nums: IntArray, goal: Int): Int {
    if (goal < 0) return 0
    var sum = 0
    var left = 0
    var count = 0

    for (right in nums.indices) {
        sum += nums[right]

        while (sum > goal) {
            sum -= nums[left]
            left++
        }

        count += right - left + 1
    }

    return count
}