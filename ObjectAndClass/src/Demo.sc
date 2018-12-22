object Demo {

  case class Student(var rollno : Int=1, var name:String="Navin", var marks: Int=90)
  {
  	def show() = println("hi")
  	
  	def >(s2 : Student): Boolean = marks > s2.marks
  	
  }

	var s1 = Student(4,"Rahul");              //> s1  : Demo.Student = Student(4,Rahul,90)
	var s2 = Student(2,"Primoz",90);          //> s2  : Demo.Student = Student(2,Primoz,90)
	
	var result = s1.>(s2)                     //> result  : Boolean = false
	
	s1.show()                                 //> hi

	println(result);                          //> false
}