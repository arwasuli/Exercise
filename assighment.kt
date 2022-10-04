package com.example.myapplication

fun main(){

    //////exercise1

    for(num in 1..100){
       if(num<71) println(num)
       else if(num==71) {
           println("its over 70!!!")
           println(num)
       }
        else println(num)

    }

    //////exercise2

    var temp=35
    var count=0
    while(count<=10){
        count++

        when(temp){
             30 ->{ println("It is Hot")
             temp+=1}
             20 ->{println("It is Comfy")
             temp+=1}
             15 ->{println("IT IS COLD!!!!")}
             else ->{
                 println(temp)
                 temp+=1
             }


        }
    }


}