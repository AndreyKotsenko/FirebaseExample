package com.akotsenko.firebaseexample.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.akotsenko.firebaseexample.R
import com.akotsenko.firebaseexample.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    private lateinit var viewModel: StartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_start, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[StartViewModel::class.java]
    }

    override fun onStart() {
        super.onStart()
        binding.btnLogOut.setOnClickListener {
            viewModel.logOut()
            findNavController().navigate(R.id.action_startFragment_to_loginFragment)
        }
    }

}