import java.time.OffsetTime

fun main(){
odd()
    println(names(arrayOf("monocotyledonae","Zuenah","Eric","table")))
    robots(3)
    robots(12)
    robots(30)




    multiply()
}
fun odd() {
    for(z in 1..100) {
        if (z % 2 !==0)
        println(z)
    }
}
fun names(txt:Array<String>):Int{
    var same=0
    txt.forEach {r->
        if (r.length>5){
            same++

        }
    }
    return same
}
fun robots(age:Int){
    if (age<=6){
        println("Glass of milk")
    }
    else if(age>6 && age<15){
        println("Fanta Orange")
    }
    else{
        println("Cocacola")
    }
}
fun multiply() {
    for (s in 1..100) {
        if (s % 3 == 0) {
            println("Fizz")
        } else if (s % 5 == 0) {
            println("Buzz")
        }
        if(s%3==0 && s%5==0){
            println("FizzBuzz")

        }
    }
}
