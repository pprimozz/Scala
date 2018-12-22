object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(68); 
  
  val num1 : Int = 8;System.out.println("""num1  : Int = """ + $show(num1 ));$skip(22); ;         //val = final (can't change value)
  var num2 : Int = 7;System.out.println("""num2  : Int = """ + $show(num2 ));$skip(48); ;
  
  var result = num1.+(num2);System.out.println("""result  : Int = """ + $show(result ));$skip(28); ;			//+ je metoda
  
   
  println(num1+num2)}
  
  
}
