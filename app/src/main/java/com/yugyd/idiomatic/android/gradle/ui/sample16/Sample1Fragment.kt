package com.yugyd.idiomatic.android.gradle.ui.sample16

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
import com.yugyd.idiomatic.android.gradle.data.sample16.Sample16Repository
import com.yugyd.idiomatic.android.gradle.data.sample16.Sample16RepositoryImpl
import com.yugyd.idiomatic.android.gradle.databinding.FragmentSample16Binding
import com.yugyd.idiomatic.android.gradle.domain.sample16.Sample16UseCase
import kotlinx.coroutines.launch

class Sample16Fragment : Fragment() {

    private var _binding: FragmentSample16Binding? = null

    private val binding get() = _binding!!

    private val viewModelFactory = object : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val repository: Sample16Repository = Sample16RepositoryImpl()
            val useCase = Sample16UseCase(repository)
            return Sample16ViewModel(useCase) as T
        }
    }
    private val viewModel: Sample16ViewModel by viewModels { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSample16Binding.inflate(inflater, container, false)
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