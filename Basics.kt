/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */
    const val sample1: Byte = 0x3A
    const val sample2: Byte = 58
    const val integral: Char = '\u222B'

fun main(args: Array<String>) {
    val heartRate: Int = 85
    val deposits: Double = 135002796.00
    val acceleration: Float = 9.800f
    val mass: Float = 14.6f
    val distance: Double = 129.763001
    val lost: Boolean = true
    val expensive: Boolean = true
    val choice: Int = 2
    val greeting: String = "Hello"
    val name: String = "Karen"
    if(sample1.compareTo(sample2) == 0)
    	println("The samples are equal")
    else
    	println("The samples are not equal.")
                
    if(heartRate >= 40 && heartRate<= 80)
    	println("Heart rate is normal")
    else
    	println("Heart Rate is not normal")
                
    if(deposits >= 100000000.0)
        println("You are exceedingly wealthy.")
    else
        println("Sorry you are so poor")
	
    val force: Float = mass*acceleration
    println("force = " + force)           
    
	println("" + distance + " is the distance")
    if(lost && expensive)
    	println("I am really sorry! I will get the manager.")
    else if(lost && !expensive)
    	println("Here is coupon for 10% of")
    
    when(choice){
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> println("you made an unknown choice")
    }
    
    println("" + integral + " is an integral.")
    
    for(i in 5..10)
    println("i="+i)
    var age: Int = 0
    while(age < 6)
    {
        println("age = " + age)
        age++
    }
    
}