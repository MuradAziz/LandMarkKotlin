package az.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import az.myapplication.databinding.RowBinding

class LandmarkAdapter(val arrayList: ArrayList<LandMark>):RecyclerView.Adapter<LandmarkAdapter.LandMarkHolder>() {
    class LandMarkHolder(val binding: RowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        val binding = RowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandMarkHolder(binding)
    }
    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        holder.binding.rectext.text=arrayList.get(position).name

        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context, Details::class.java)
            chosenLandmark=arrayList.get(position)

            //intent.putExtra("landmark", arrayList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
       return  arrayList.size
    }
}

