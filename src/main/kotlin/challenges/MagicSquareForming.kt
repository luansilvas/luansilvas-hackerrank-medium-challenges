package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/magic-square-forming/problem">Forming a Magic Square</a>
 */
fun formingMagicSquare(s: Array<Array<Int>>): Int {
    // Write your code here

    var keepGoing = arrayOf(
        s.map { it.sum() }
    ).toSet()

    println("keep going summings")

    keepGoing.map { println(">>>>>>> $it") }


    for ((indexA, array) in s.withIndex()) {
        println("array n $indexA and must keep going is $keepGoing")

        array.map { println(">>> $it") }
    }




    return 1
}
