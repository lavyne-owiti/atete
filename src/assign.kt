fun main(){
var x=many(2,3,4,)
    println(x)
    var p=mul(2,4,5,)
    println(p)
    currentYearBirth(2022,1995,32)


}
fun many(num1:Int,num2:Int,num3:Int):Int {
    var sum = num1 + num2 + num3
    return sum
}
    fun mul(num1:Int,num2:Int,num3:Int):Int{
    var multiply =num1*num2*num3
    return multiply
}
fun currentYearBirth(x:Int,x2:Int,fact:Int){
    var sub=x-x2
    var say="I am"+" "+fact+" "+"years old"
    println(sub)
    println(say)
}