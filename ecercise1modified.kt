package com.example.myapplication.com.example.myapplication

fun main(){


    var temp=35
    var count=0
    while(count<=10){
        count++

        when(temp){
            30 ->{ println("It is Hot")
                temp-=1}
            20 ->{println("It is Comfy")
                temp-=1}
            15 ->{println("IT IS COLD!!!!")}
            else ->{
                println(temp)
                temp-=1
            }


        }
    }

}