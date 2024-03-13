package android.part3_chapter5

import android.os.Bundle
import android.os.Handler
import android.part3_chapter5.databinding.FragmentSearchResultBinding
import android.part3_chapter5.list.ListAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class SearchFragment : Fragment() {


    private var binding: FragmentSearchResultBinding? = null

    private val adapter by lazy { ListAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentSearchResultBinding.inflate(inflater, container, false).apply {
            binding = this


        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            recyclerView.adapter = adapter
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun searchKeyword(text: String) {

    }


}