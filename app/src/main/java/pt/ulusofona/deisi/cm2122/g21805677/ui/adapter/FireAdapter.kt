package pt.ulusofona.deisi.cm2122.g21805677.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pt.ulusofona.deisi.cm2122.g21805677.ui.viewModels.FireUi
import pt.ulusofona.deisi.cm2122.g21805677.databinding.ItemFireBinding

class FireAdapter(private var items: List<FireUi> = listOf(),
                  private val onClick: (FireUi)-> Unit ) : RecyclerView.Adapter<FireAdapter.FireViewHolder>() {

    class FireViewHolder(val binding: ItemFireBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FireViewHolder {
        return FireViewHolder(ItemFireBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        )
    }

    override fun onBindViewHolder(holder: FireViewHolder, position: Int) {
        holder.binding.textLocale.text = items[position].locale
        holder.binding.textState.text = items[position].state
        holder.binding.textStartDate?.text = items[position].startDate.toString()
    }

    override fun getItemCount() = items.size

    fun updateItems(items: List<FireUi>) {
        this.items = items
        notifyDataSetChanged()
    }

}