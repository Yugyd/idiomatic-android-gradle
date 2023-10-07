package com.yugyd.idiomatic.android.gradle.ui.sample24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.yugyd.idiomatic.android.gradle.data.sample24.Sample24Repository
import com.yugyd.idiomatic.android.gradle.data.sample24.Sample24RepositoryImpl
import com.yugyd.idiomatic.android.gradle.databinding.FragmentSample24Binding
import com.yugyd.idiomatic.android.gradle.domain.sample24.Sample24UseCase
import kotlinx.coroutines.launch

class Sample24Fragment : Fragment() {

    private var _binding: FragmentSample24Binding? = null

    private val binding get() = _binding!!

    private val viewModelFactory = object : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val repository: Sample24Repository = Sample24RepositoryImpl()
            val useCase = Sample24UseCase(repository)
            return Sample24ViewModel(useCase) as T
        }
    }
    private val viewModel: Sample24ViewModel by viewModels { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSample24Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textTitle
        val button: Button = binding.buttonAction

        button.setOnClickListener {
            Toast.makeText(requireContext(), "Click!", Toast.LENGTH_SHORT).show()
        }

        lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.CREATED) {
                viewModel.state.collect {
                    textView.text = it.title
                    button.text = it.title
                }
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}