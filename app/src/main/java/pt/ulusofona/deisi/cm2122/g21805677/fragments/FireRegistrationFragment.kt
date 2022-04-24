package pt.ulusofona.deisi.cm2122.g21805677.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import pt.ulusofona.deisi.cm2122.g21805677.R
import pt.ulusofona.deisi.cm2122.g21805677.databinding.FragmentFireRegistrationBinding
import java.util.*

class FireRegistrationFragment : Fragment() {

    private lateinit var binding: FragmentFireRegistrationBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.registration)
        val view = inflater.inflate(R.layout.fragment_fire_registration,container,false)
        binding = FragmentFireRegistrationBinding.bind(view)

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.buttonSubmit.setOnClickListener{onSubmitClick()}
    }

    private fun onSubmitClick(){
        val fireInfo: String
        val timeSubmission = Date().time
        fireInfo = binding.locationInput.text.toString() + "," + timeSubmission
    }
}