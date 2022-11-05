// Find the sum of all elements in a sequence, ending with 0.
// The number 0 itself is not included in the sequence and serves as a sign
// that the sequence ended. Although, if you add 0, nothing bad will happen.

// Input:
// 3
// 6
// 8
// 0

// Output:
// 17

fun main() { // Create main function.
    var sum = 0 // Create variable for finding the result.
    do {
        val n = readln().toInt() // We need to get a number from user.
        sum += n // We sum up all the numbers that are not equal to zero.
    } while (n != 0) // We sum the numbers until the user enters 0 from the keyboard.
    println(sum) // We display the summation result on the screen.
}