package pt.ulusofona.deisi.cm2122.g21805677.fragments

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import pt.ulusofona.deisi.cm2122.g21805677.ui.adapter.FireAdapter
import pt.ulusofona.deisi.cm2122.g21805677.NavigationManager
import pt.ulusofona.deisi.cm2122.g21805677.R
import pt.ulusofona.deisi.cm2122.g21805677.databinding.FragmentFireListBinding
import pt.ulusofona.deisi.cm2122.g21805677.ui.viewModels.FireUi

class FireListFragment : Fragment() {

    private lateinit var binding: FragmentFireListBinding
    private var adapter = FireAdapter(onClick = ::onFireClick)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.fires)
        val view = inflater.inflate(R.layout.fragment_fire_list,container, false)
        binding = FragmentFireListBinding.bind(view)

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.rvFireList?.adapter = adapter
        binding.floatingActionButton.setOnClickListener{onMapClick()}
    }

    private fun onFireClick(fire: FireUi){
        NavigationManager.goToFireDetail(parentFragmentManager,fire)
    }

    private fun onMapClick(){
        NavigationManager.goToFireMap(parentFragmentManager)
    }


}