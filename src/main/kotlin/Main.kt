fun main(){
    val numberOfcups = 60
    val numberOfPlates = 50

    if (numberOfcups > numberOfPlates)
        print("too many cups")

    else
        print("not enough cups!")

    val guests = 30
    if (guests == 0){
        println("\nNo guests")
    }
    else if(guests < 20){
        println("\nsmall group of peolpe")
    }
    else{
        println("\nlarge group of people")
    }

    val currentYear = 2023
    println("enter birthyear: ")
    val birthYear = readLine()!!
    var ageYear: Int = birthYear.toInt()

    var age = (currentYear - ageYear)

    if (age < 18){
        println("\nthis is a minor $age")
    }
    else if (age > 18 || age < 40){
        println("\nthis is a youth $age")
    }
    else{
        println("\nthis guy is mature $age")
    }


}