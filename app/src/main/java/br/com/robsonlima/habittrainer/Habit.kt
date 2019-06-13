package br.com.robsonlima.habittrainer

data class Habit(val title: String, val description: String, val image: Int)

fun getSampleHabits(): List<Habit> {
    return listOf(
        Habit(
            title = "Go for a Walk",
            description = "A nice walk in the sun",
            image = R.drawable.glass
        ),

        Habit(
            title = "Drink Water",
            description = "A refreshing glass of water",
            image = R.drawable.glass
        )
    )
}