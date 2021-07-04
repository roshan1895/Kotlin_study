
fun main()
{
/* As we are aware of jump statements return,break,contnue .
In kotlin  we can use these jump statements as same as java.But ,kotlin added something new in these.
So,let'see how to use it*/

 //kotlin labeled-break
 //Labeled is the form of identifier followed by the @ sign, for example abc@, test@. To make an expression as label, we just put a label in front of expression.
 abc@for(i in 1..5)
 {
  for (j in 1..5)
  {
   println("i = $i and j = $j")
   if(i==2)
    break@abc
  }
 }
//by using same syntax we can use kotlin labeled return and continue statement.
}