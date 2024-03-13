package android.part3_chapter5

import android.os.Bundle
import android.part3_chapter5.databinding.FragmentFavoriteBinding
import android.part3_chapter5.list.ListAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment

class FavoritesFragment : Fragment() {

    private var binding: FragmentFavoriteBinding? = null

    private val adapter = ListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentFavoriteBinding.inflate(inflater, container, false).apply {
            binding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            recyclerView.adapter = adapter
        }
    }
    override fun onResume() {
        super.onResume()
        binding?.apply {
            if (Common.favoritesList.isEmpty()) {
                emptyTextView.isVisible = true
                recyclerView.isVisible = false
            } else {
                emptyTextView.isVisible = false
                recyclerView.isVisible = true
            }
        }
        adapter.submitList(Common.favoritesList.sortedBy { it.dateTime })
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}