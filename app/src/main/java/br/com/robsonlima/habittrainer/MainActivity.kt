package br.com.robsonlima.habittrainer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_cards.setHasFixedSize(true)

        rv_cards.layoutManager = LinearLayoutManager(this)
        rv_cards.adapter = HabitsAdapter(getSampleHabits())
    }
}
