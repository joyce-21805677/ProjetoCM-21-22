package pt.ulusofona.deisi.cm2122.g21805677.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import pt.ulusofona.deisi.cm2122.g21805677.NavigationManager
import pt.ulusofona.deisi.cm2122.g21805677.R
import pt.ulusofona.deisi.cm2122.g21805677.databinding.FragmentFireListBinding
import pt.ulusofona.deisi.cm2122.g21805677.databinding.FragmentFireMapBinding


class FireMapFragment : Fragment() {

    private lateinit var binding: FragmentFireMapBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.fires_map)
        val view = inflater.inflate(R.layout.fragment_fire_map,container, false)
        binding = FragmentFireMapBinding.bind(view)

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.buttonBackToList.setOnClickListener{onBackToListClick()}
    }

    private fun onBackToListClick() {
        NavigationManager.goToFireListFragment(parentFragmentManager)
    }
}