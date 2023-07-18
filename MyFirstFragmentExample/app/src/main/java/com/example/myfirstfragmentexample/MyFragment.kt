package com.example.myfirstfragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import java.util.zip.Inflater

class MyFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         // return super.onCreateView(inflater, container, savedInstanceState)
        val view:View = inflater.inflate(R.layout.fragment, container, false)
        return view
    }
}