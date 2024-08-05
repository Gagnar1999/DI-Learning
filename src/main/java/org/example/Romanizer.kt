package org.example

class Romanizer {
    val number = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val symbols = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

    init {
        number.reverse()
        symbols.reverse()
    }

    fun convertInRoman(inputNumber: Int) : String {
        var outPutString = ""
        var tempNumber = inputNumber
        while (tempNumber > 0){
            var i = 0
            while (i < number.size){
                if(tempNumber < number[i]){
                    break
                }
                i++
            }
            println("Value of I---> $i")
            if(i == 0){
                i = 1
            }
            tempNumber -= number[i-1]

            println(tempNumber)

            outPutString += symbols[i-1]

            println(outPutString)
        }
        return outPutString;
    }
}