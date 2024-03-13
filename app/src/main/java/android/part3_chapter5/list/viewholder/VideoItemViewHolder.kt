package android.part3_chapter5.list.viewholder

import android.part3_chapter5.databinding.ItemVideoBinding
import android.part3_chapter5.list.ItemHandler
import android.part3_chapter5.model.ListItem
import android.part3_chapter5.model.VideoItem
import androidx.recyclerview.widget.RecyclerView


class VideoItemViewHolder(private val binding: ItemVideoBinding,
                          private val itemHandler: ItemHandler? = null) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as VideoItem
        binding.item = item
        binding.handler = itemHandler
    }
}