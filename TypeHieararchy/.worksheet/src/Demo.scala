object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 

	var nums = List(4,5,true,"Navin");System.out.println("""nums  : List[Any] = """ + $show(nums ));$skip(22); val res$0 = 
	
	nums drop 2 take 2;System.out.println("""res0: List[Any] = """ + $show(res$0))}
	
	
}
