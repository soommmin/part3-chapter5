package android.part3_chapter5.list.viewholder

import android.part3_chapter5.databinding.ItemImageBinding
import android.part3_chapter5.list.ItemHandler
import android.part3_chapter5.model.ImageItem
import android.part3_chapter5.model.ListItem
import androidx.recyclerview.widget.RecyclerView


class ImageItemViewHolder(
    private val binding: ItemImageBinding,
    private val itemHandler: ItemHandler? = null
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as ImageItem
        binding.item = item
        binding.handler = itemHandler
    }
}