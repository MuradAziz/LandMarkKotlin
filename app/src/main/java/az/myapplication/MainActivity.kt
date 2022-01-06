package az.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import az.myapplication.databinding.ActivityMainBinding

var chosenLandmark: LandMark ?= null
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var arraylist: ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        arraylist = ArrayList()

        val pisa = LandMark("Pisa", "Italy", R.drawable.pisa)
        val eiffel = LandMark("Eiffel", "France", R.drawable.eiffel)
        val london = LandMark("London", "England", R.drawable.london)
        val collosium = LandMark("Collosium", "Italy", R.drawable.download)

        arraylist.add(pisa)
        arraylist.add(london)
        arraylist.add(eiffel)
        arraylist.add(collosium)

        binding.RecyclerView.layoutManager=LinearLayoutManager(this)
        val adapter=LandmarkAdapter(arraylist)
        binding.RecyclerView.adapter=adapter

    }
}
/*
       val adapter=ArrayAdapter(this, android.R.layout.simple_list_item_1, arraylist.map { arraylist->arraylist.name })
        binding.listView.adapter=adapter
        binding.listView.onItemClickListener=AdapterView.OnItemClickListener { adapterView, view, i, l ->
           val  intent= Intent(MainActivity@this, Details::class.java)
            intent.putExtra("landmark", arraylist.get(i))
            startActivity(intent)
        }
        }
}*/