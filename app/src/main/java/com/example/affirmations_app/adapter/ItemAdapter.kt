package com.example.affirmations_app.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations_app.R
import com.example.affirmations_app.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset : List<Affirmation>
        ):RecyclerView.Adapter<ItemAdapter.ItemViewHolder> (){
    //nested class which holds the view
    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView:ImageView=view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        println("create")
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        println("Bind")
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imgResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}