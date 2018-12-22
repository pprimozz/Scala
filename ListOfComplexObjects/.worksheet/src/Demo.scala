object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 
 	var nums = List(4,5,true,"Navin");System.out.println("""nums  : List[Any] = """ + $show(nums ));$skip(24); val res$0 = 
 	
 	nums drop 2 take 3
 	
 	
 	case class Stud(rollno : Int, name : String, marks : Int);System.out.println("""res0: List[Any] = """ + $show(res$0));$skip(149); 
 	
 	val students = List(Stud(1,"Navin",40),Stud(2,"Poja",80),Stud(3,"Nadeen",60));System.out.println("""students  : List[Demo.Stud] = """ + $show(students ));$skip(53); 
 	val first = students.head;System.out.println("""first  : Demo.Stud = """ + $show(first ));$skip(64);    // head- first element
 	
 	val rest = students.tail;System.out.println("""rest  : List[Demo.Stud] = """ + $show(rest ));$skip(36);   // tail - all remaining elements
 	
 	val rest2 = students.tail.head;System.out.println("""rest2  : Demo.Stud = """ + $show(rest2 ));$skip(53); 
 	
 	val toppers = students.filter(s => s.marks>=60);System.out.println("""toppers  : List[Demo.Stud] = """ + $show(toppers ))}
}
