package com.example.myapplication

fun main() {

    var sum=0.1
    val numbers= arrayListOf<Double>(2.2 ,3.3,4.4,5.5,6.6)
    for(num in numbers){
    sum=sum+num
    }
    sum=sum-0.1
    sum=sum/5
    println(sum)

}
