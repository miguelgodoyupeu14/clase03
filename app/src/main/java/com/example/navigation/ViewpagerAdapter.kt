package com.example.navigation
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.FragmentActivity

class AgendaPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val fragments = listOf(
        PendientesFragment(),
        EnProgresoFragment(),
        CompletadasFragment()
    )

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}