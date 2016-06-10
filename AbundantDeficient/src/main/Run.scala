package main

object Run {
  def main(Args:Array[String]) = {
    Console.println("Find Abundant and Deficient Numbers")
    val numbers=(1 to 100).toArray
    for(number <- numbers) {
      val a=find_divisors(number).reduce({(total,n) => total+n})
      println(number+" "+ (if(a>number*2) "abundant by "+ (a-number*2) else if(a<number*2) "deficient" else "~~neither~~ deficient"))
    }
    
  }
  
  def find_divisors(number:Integer): Array[Int] = {
    
    val list=for( i <- 1 to number
        if number%i==0) yield i
    list.toArray
    
  }
}