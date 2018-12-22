object Demo {

  case class Student(var rollno : Int=1, var name:String="Navin", var marks: Int=90)
  {
  	def show() = println("hi")
  	
  	def >(s2 : Student): Boolean = marks > s2.marks
  	
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(227); 

	var s1 = Student(4,"Rahul");System.out.println("""s1  : Demo.Student = """ + $show(s1 ));$skip(34); ;
	var s2 = Student(2,"Primoz",90);System.out.println("""s2  : Demo.Student = """ + $show(s2 ));$skip(25); ;
	
	var result = s1.>(s2);System.out.println("""result  : Boolean = """ + $show(result ));$skip(13); 
	
	s1.show();$skip(19); 

	println(result);}
}
