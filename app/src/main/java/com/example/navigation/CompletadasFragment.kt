package com.example.navigation
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CompletadasFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val textView = TextView(requireContext())
        textView.text = "Fragmento 3: Completadas"
        textView.textSize = 20f
        textView.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        return textView
    }
}
