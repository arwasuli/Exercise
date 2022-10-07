package com.example.myapplication

fun main(){
    val todo=Todo()
    val task1=Task(1,"arwa","Study web",false)
    val task2=Task(2,"arwa","study secuirty",false)
    todo.addTask(task1)
    todo.addTask(task2)

    todo.removeTask(task1)
    todo.allTask()
    todo.specificTask(2)
    todo.changeTask(task2)


}


//////////////////////////////////////////////////////////////////////////////

data class Task(val id:Int, val name:String,val note :String,var isCompleted:Boolean)

//////////////////////////////////////////////////////////////////////////////
class Todo(){

    val tasks= arrayListOf<Task>()

    ///////////////////////////

    fun allTask(){
        println("All Task:")
        for(N in tasks) {
            println("Task: ${N.note}")
        }
    }

    //////////////////////////

    fun specificTask(Id:Int){
        for(I in tasks){
            if(I.id==Id) println("Task Details: id(${I.id}), name(${I.name}), note(${I.note}), complete(${I.isCompleted})")

        }
    }

    /////////////////////////

    fun addTask(task:Task){

        tasks.add(task)
        println("Add task: ${task.note} ")
    }

    /////////////////////////

    fun removeTask(task:Task){
         for(i in tasks){
             if(i.id==task.id){
                 tasks.remove(task)
                 println("Remove task: ${i.note}")
             }
         }
    }

    ////////////////////////

    fun changeTask(task:Task){
        for(i in tasks){
            if(i.id==task.id){
                i.isCompleted= !i.isCompleted
                println("Task: ${i.note} Complete: ${i.isCompleted}")
            }

        }

    }
    ////////////////////////







    }
