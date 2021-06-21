package subtask3

import jdk.nashorn.internal.ir.Block
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        blockA.apply {
            return when(blockB){
                Int::class -> filterIsInstance<Int>().sum()
                String::class -> filterIsInstance<String>().joinToString("")
                else ->
                    filterIsInstance<LocalDate>().maxBy {
                        it.toEpochDay()
                    }?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))?: "Date is null"
            }
        }
    }
}

