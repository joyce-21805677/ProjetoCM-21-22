package pt.ulusofona.deisi.cm2122.g21805677.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import pt.ulusofona.deisi.cm2122.g21805677.R
import pt.ulusofona.deisi.cm2122.g21805677.databinding.FragmentFireDetailBinding
import pt.ulusofona.deisi.cm2122.g21805677.ui.viewModels.FireUi

private const val ARG_OPERATION = "ARG_OPERATION"

class FireDetailFragment : Fragment() {

    private var fire: FireUi? = null
    private lateinit var binding: FragmentFireDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { fire = it.getParcelable(ARG_OPERATION) }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.fires)
        val view = inflater.inflate(R.layout.fragment_fire_detail,container,false)
        binding = FragmentFireDetailBinding.bind(view)

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        fire?.let {
            binding.textLocale.text = it.locale
            binding.textState.text = it.state
            binding.textObs.text = it.observations
            binding.textStartDate.text = it.startDate.toString()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(fire: FireUi) =
            FireDetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_OPERATION, fire)
                }
            }
    }

}