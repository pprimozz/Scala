object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 

	var nums = List(3,4,5,6,6,9,8,4);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(34); ;
	
	
	for (n <- nums)
		println(n);$skip(34); 
    var reverseNums= nums.reverse;System.out.println("""reverseNums  : List[Int] = """ + $show(reverseNums ));$skip(69); val res$0 = 
          
          nums.drop(2).take(3);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(50); 		//remove first 2 elements
          
    nums.foreach{i:Int => println(i)}}
	

}
