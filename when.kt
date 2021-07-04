
fun main()
{
  var n=5
 //Using when as an Expression
 var res=when(n)
{
 1->"One"
 2->"Two"
 3->"Three"
 4->"Four"
 5->"Five"
 6->"Six"
 7->"seven"

  else -> "Invalid number"
 }
 println("selected result is=$res")

 //Using when without expression
 when(n)
 {
  1-> println("One")
  2-> println("Two")
  3-> println("Three")
  4-> println("Four")
  5-> println("Five")
  6->println("Six")
  7-> println("Seven")
   else-> println("Invalid number")
 }
// Multiple Statement of when Using Braces
 when(n)
 {
  1->{
      println("Monday")
      println("First day of week")
  }
  5->{
      println("Friday")
      println("Fifth day of the week")
  }
  7-> println("last day of week")
  else-> println("Others day")
 }
 //Multiple branches of when
 when(n)
 {
  1,2,3,4,5-> println("Week days")
  6,7-> println("Weekend days")
  else-> println("Invalid days")
 }
 //Ranges in when
 when(n)
 {
  in 1..5-> println("Week days")    //check the day in range
  !in 1..5-> println("Weekend days") //check the day not in range
  else-> println("none of the above")
 }
 //You can use arbitrary expressions (not only constants) as branch conditions
 val s="1"
 when(n)
 {
    s.toInt()-> println("non arbitrary value")
     else-> println("invalid expression")
 }
 //Another option is checking that a value is or !is of a particular type. Note that, due to smart casts, you can access the methods and properties of the type without any extra checks.
// You can capture when subject in a variable using following syntax:

// fun Request.getBody() =
//  when (val response = executeRequest()) {
//   is Success -> response.body
//   is HttpError -> throw HttpException(response.status)
//  }
}