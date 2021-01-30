package ru.netology.lesson6
/**
 * Description Домашнее задание к занятию «2.3. ООП: Композиция, наследование и интерфейсы»
 */

//import kotlinx.serialization.Mapper
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

val format = Json {
    encodeDefaults = true
    prettyPrint = true
}

fun main()
{
    val post = Post( text = "пост № 1", createdBy = 1 )
    println(format.encodeToString(post))

    //println(post.toString())
    
}