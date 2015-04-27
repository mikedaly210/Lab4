object Lab1 {
    def main(args: Array[String]) {
        stringofReps("hello", 5)
        printRectangle(5, 5, '&', 'x')
        
    }
    
    def printReps(s: String, n: Int) {
        println(s*n)
    }
    
    def stringofReps(s: String, n: Int): String = {
        val x = (s*n)
        x
    }
    def Factorial(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n * Factorial(n - 1)
        //31 was the largest number for which I received a positive result with normal Int
        //Stopped returning values after 9000 with BigInt 
    }
    def printRectangle(columns: Int, rows: Int, inChar: Char, edgeChar: Char) {           
        val ic = inChar.toString() 
        val ec = edgeChar.toString()
        val c = columns
        val r = rows
        val rec = ((ec*(c+2)) +: Range(0,r).map( _ => ec+ic*c+ec) :+ (ec*(c+2)) ).mkString("\n")
        println(rec)
        
    }
     
}
