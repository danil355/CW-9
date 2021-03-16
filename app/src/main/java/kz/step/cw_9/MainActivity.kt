package kz.step.cw_9

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private val LAYOUT_ONE = 0
    private val LAYOUT_TWO = 1
    var recyclerView: RecyclerView? = null
    val adapter = CustomRecyclerAdapter(getCatList())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = CustomRecyclerAdapter(fillList())

    }

    private fun getCatList(): List<String> {
        return this.resources.getStringArray(R.array.student_names).toList()
    }
    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("\$i element") }
        return data
    }


}