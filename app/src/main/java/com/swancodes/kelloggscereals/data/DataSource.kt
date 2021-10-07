package com.swancodes.kelloggscereals.data

import com.swancodes.kelloggscereals.R
import com.swancodes.kelloggscereals.model.Cereals

class DataSource {
    fun showList(): List<Cereals> {
        return listOf<Cereals>(
            Cereals(R.string.corn_flakes,R.string.corn_flakes1, R.drawable.corn_flakes),
            Cereals(R.string.choco_malt, R.string.choco_malt1, R.drawable.choco_malt1),
            Cereals(R.string.crunchy_nut, R.string.crunchy_nut1, R.drawable.crunchy_nut1),
            Cereals(R.string.froot_loops,R.string.froot_loops1, R.drawable.froot_loops),
            Cereals(R.string.honey_loops,R.string.honey_loops1, R.drawable.honey_loops),
            Cereals(R.string.oats,R.string.oats1, R.drawable.oats),
            Cereals(R.string.rice_krispies,R.string.rice_krispies1, R.drawable.rice_krispies)
        )
    }
}