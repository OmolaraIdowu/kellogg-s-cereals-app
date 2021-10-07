package com.swancodes.kelloggscereals

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.swancodes.kelloggscereals.adapter.ItemAdapter
import com.swancodes.kelloggscereals.data.DataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataSet = DataSource().showList()
        val recyclerView = findViewById<RecyclerView>(R.id.kg_recycler_view)
        recyclerView.adapter = ItemAdapter( this, myDataSet)
        recyclerView.setHasFixedSize(true)

    }
}
