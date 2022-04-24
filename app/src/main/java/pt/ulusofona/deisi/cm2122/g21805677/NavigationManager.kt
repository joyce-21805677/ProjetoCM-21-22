package pt.ulusofona.deisi.cm2122.g21805677

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import pt.ulusofona.deisi.cm2122.g21805677.fragments.*
import pt.ulusofona.deisi.cm2122.g21805677.ui.viewModels.FireUi

object NavigationManager {

    private fun placeFragment(fm: FragmentManager, fragment: Fragment) {
        val transition = fm.beginTransaction()
        transition.add(R.id.frameDangerZone,DangerZoneFragment())
        transition.replace(R.id.frame, fragment)
        transition.addToBackStack(null)
        transition.commit()
    }

    fun placeFragmentDangerZone(fm: FragmentManager) {
        val transition = fm.beginTransaction()
        transition.add(R.id.frameDangerZone,DangerZoneFragment())

        transition.commit()
    }

    fun goToDashBoardFragment(fm: FragmentManager) {
        placeFragment(fm, DashboardFragment())

    }

    fun goToFireListFragment(fm: FragmentManager) {
        placeFragment(fm, FireListFragment())

    }

    fun goToFireRegistrationFragment(fm: FragmentManager) {
        placeFragment(fm, FireRegistrationFragment())

    }

    fun goToFireDetail(fm: FragmentManager, fire: FireUi){
        placeFragment(fm, FireDetailFragment.newInstance(fire))
        placeFragment(fm, FireMapFragment())
    }

    fun goToFireMap(fm: FragmentManager) {
        placeFragment(fm, FireMapFragment())
    }

    fun goToFireDetailFragment(fm: FragmentManager) {
        placeFragment(fm, FireDetailFragment())

    }

}