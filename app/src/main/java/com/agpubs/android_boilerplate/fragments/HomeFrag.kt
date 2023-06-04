package com.agpubs.android_boilerplate.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.agpubs.android_boilerplate.R

class HomeFrag: Fragment(R.layout.frag_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            findNavController().navigate(R.id.action_homeFrag_to_dest1Frag)
        }
    }
    
}