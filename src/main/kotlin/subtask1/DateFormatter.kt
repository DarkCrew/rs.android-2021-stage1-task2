package subtask1

import java.lang.IllegalArgumentException
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val data = GregorianCalendar(year.toInt(), month.toInt() - 1, day.toInt())
        val dateformate: DateFormat = SimpleDateFormat("dd MMMM, EEEE", Locale("ru"))
        data.isLenient = false

        return try {
            dateformate.format(data.time)
        } catch (e: IllegalArgumentException) {
            "Такого дня не существует"
        }
    }
}
