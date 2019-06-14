package br.com.robsonlima.habittrainer.db

import android.provider.BaseColumns

val DATABASE_NAME = "habitrainer.db"
val DATABASE_VERSION = 10

object HabitEntry : BaseColumns {
    val TABLE_NAME = "habit"
    val _ID_COL = "id"
    val TITLE_COL = "title"
    val DESCR_COL = "description"
    val IMAGE_COL = "image"
}