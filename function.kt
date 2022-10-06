package com.example.myapplication

fun main(){
    print(caiculater(2.2,2.2))

}

fun caiculater(num1: Double ,num2:Double ,op: String="+"){
    when(op){
        "+" ->return print( num1+num2)
        "-"->return print(num1-num2)
        "*"->return print(num1*num2)
        "/"->return print(num1+num2)
        else->return print("wrong type")


    }


}