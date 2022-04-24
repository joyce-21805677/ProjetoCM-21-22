package pt.ulusofona.deisi.cm2122.g21805677.fragments

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pt.ulusofona.deisi.cm2122.g21805677.R
import pt.ulusofona.deisi.cm2122.g21805677.databinding.FragmentDangerZoneBinding

private const val TAG = "STATUS CHECK"

class DangerZoneFragment : Fragment() {

    private lateinit var binding: FragmentDangerZoneBinding
    private val handler = Handler()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_danger_zone, container, false)
        binding = FragmentDangerZoneBinding.bind(view)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.textRiskReduced.text = getString(R.string.fire_level1)
        Log.i(TAG,"Estou no onStart")

        startHandler()

    }

    override fun onDestroy() {
        super.onDestroy()
        stopHandler()
    }

    private val task = Runnable {

        if (binding.textRiskReduced.text == getString(R.string.fire_level1)) {

            binding.textRiskReduced.text = ""
            binding.textRiskModerate.text = getString(R.string.fire_level2)


        } else if (binding.textRiskModerate.text == getString(R.string.fire_level2)) {

            binding.textRiskModerate.text = ""
            binding.textRiskelevated.text = getString(R.string.fire_level3)


        } else if (binding.textRiskelevated.text == getString(R.string.fire_level3)) {

            binding.textRiskelevated.text = ""
            binding.textRiskVeryElevated.text = getString(R.string.fire_level4)


        } else if (binding.textRiskVeryElevated.text == getString(R.string.fire_level4)) {

            binding.textRiskVeryElevated.text = ""
            binding.textRiskMax.text = getString(R.string.fire_level5)


        } else if (binding.textRiskMax.text == getString(R.string.fire_level5)) {

            binding.textRiskMax.text = ""
            binding.textRiskReduced.text = getString(R.string.fire_level1)

        }
    }

    private fun startHandler() {
        handler.postDelayed(task, 20000)
    }

    private fun stopHandler() {
        handler.removeCallbacks(task)
    }
}