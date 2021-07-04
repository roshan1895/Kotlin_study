
fun main()
{

println("result"+double(20))
println(run())
println(run(3))
println(run(10,'a'))
 println(    run(latter='a')) // named argument

}
// Functions in Kotlin are declared using the fun keyword:
//Function parameters are defined using Pascal notation - name: type. Parameters are separated using commas. Each parameter must be explicitly typed:
//If a function does not returns any value than its return type is Unit. It is optional to specify the return type of function definition which does not returns any value.

fun double(x: Int): Int {
 return 2 * x
}
//If a function is called without passing any argument than default argument are used as parameter of function definition. And when a function is called using argument, than the passing argument is used as parameter in function definition.
fun run(num:Int= 5, latter: Char ='x')     // Default arguments
{
 print("parameter in function definition $num and $latter")
}