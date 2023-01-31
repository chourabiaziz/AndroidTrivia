package com.iset.androidtrivia

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.iset.androidtrivia.databinding.FragmentTitleBinding
import java.util.zip.Inflater

class TitleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding =DataBindingUtil.inflate<FragmentTitleBinding>(inflater , R.layout.fragment_title,container ,false)
      binding.playButton.setOnClickListener { view:View ->
          view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
      }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu)
        Inflater.inflate(R.menu.menu, menu)
    }




}