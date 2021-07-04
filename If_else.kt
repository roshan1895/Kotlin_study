
fun main()
{
   val num1=10
 val num2=20
 //Traditional if-else
 if (num1>num2)
 {
  println("$num1 is greater than $num2")
 }
 else
 {
  println("$num1 is smaller than $num2")

 }
 //new update in if-else in kotlin

val str= if (num1>num2)
 {
  "$num1 is greater than $num2"
 }
 else
 {
  "$num1 is smaller than $num2"
 }
 println(str)
 // System.out.println(b2) // if we didn't initialize the variable before printing or using it ,there will be an error.
}