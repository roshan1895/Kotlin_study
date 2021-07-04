
fun main()
{
//for loop
 val marks = arrayOf(80,85,60,90,70)
 for(item in marks){
  println(item)
 }
 //If you want to iterate through an array or a list with an index, you can do it this way:
 // first way
 for (item in marks.indices)
 {
  println("values${marks[item]}")
 }
 //second way
 for ((index,value)in marks.withIndex())
 {
  println("the element at $index is $value")

 }
//iterate through the range
 print("for (i in 1..10) print(i) = ")
 for (i in 1..10) print(i)
 println()
 print("for (i in 5..1) print(i) = ")
 for (i in 10..1) print(i)             // prints nothing
 println()
 print("for (i in 10 downTo 1) print(i) = ")
 for (i in 10 downTo 1) print(i)
 println()
 print("for (i in 10 downTo 2) print(i) = ")
 for (i in 10 downTo 2) print(i)
 println()
 print("for (i in 1..10 step 2) print(i) = ")
 for (i in 1..10 step 2) print(i)
 println()
 print("for (i in 10 downTo 1 step 2) print(i) = ")
 for (i in 10 downTo 1 step 2) print(i)
}