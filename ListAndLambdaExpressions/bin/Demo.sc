object Demo {

	var nums = List(3,4,5,6,6,9,8,4);         //> nums  : List[Int] = List(3, 4, 5, 6, 6, 9, 8, 4)
	
	
	for (n <- nums)
		println(n)                        //> 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 6
                                                  //| 9
                                                  //| 8
                                                  //| 4
    var reverseNums= nums.reverse                 //> reverseNums  : List[Int] = List(4, 8, 9, 6, 6, 5, 4, 3)
          
          nums.drop(2).take(3)		//remove first 2 elements
                                                  //> res0: List[Int] = List(5, 6, 6)
          
    nums.foreach{i:Int => println(i)}             //> 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 6
                                                  //| 9
                                                  //| 8
                                                  //| 4
	

}