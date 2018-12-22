object Demo {
 	var nums = List(4,5,true,"Navin")         //> nums  : List[Any] = List(4, 5, true, Navin)
 	
 	nums drop 2 take 3                        //> res0: List[Any] = List(true, Navin)
 	
 	
 	case class Stud(rollno : Int, name : String, marks : Int)
 	
 	val students = List(Stud(1,"Navin",40),Stud(2,"Poja",80),Stud(3,"Nadeen",60))
                                                  //> students  : List[Demo.Stud] = List(Stud(1,Navin,40), Stud(2,Poja,80), Stud(3
                                                  //| ,Nadeen,60))
 	val first = students.head   // head- first element
                                                  //> first  : Demo.Stud = Stud(1,Navin,40)
 	
 	val rest = students.tail  // tail - all remaining elements
                                                  //> rest  : List[Demo.Stud] = List(Stud(2,Poja,80), Stud(3,Nadeen,60))
 	
 	val rest2 = students.tail.head            //> rest2  : Demo.Stud = Stud(2,Poja,80)
 	
 	val toppers = students.filter(s => s.marks>=60)
                                                  //> toppers  : List[Demo.Stud] = List(Stud(2,Poja,80), Stud(3,Nadeen,60))
}