package az.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import az.myapplication.databinding.ActivityDetailsBinding
import az.myapplication.databinding.ActivityMainBinding

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        val intent= intent
        //val selectLandmark=intent.getSerializableExtra("landmark") as LandMark
        val selectLandmark= chosenLandmark
        binding.textView.text=selectLandmark!!.name
        binding.textView2.text=selectLandmark!!.country
        binding.imageView.setImageResource(selectLandmark.image)
    }
}