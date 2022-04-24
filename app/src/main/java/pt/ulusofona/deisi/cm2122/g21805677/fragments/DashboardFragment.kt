package pt.ulusofona.deisi.cm2122.g21805677.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import pt.ulusofona.deisi.cm2122.g21805677.R

import pt.ulusofona.deisi.cm2122.g21805677.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.dashboard)
        val view = inflater.inflate(R.layout.fragment_dashboard,container,false)

        binding = FragmentDashboardBinding.bind(view)
        // Inflate the layout for this fragment
        return binding.root
    }

}