package pt.ulusofona.deisi.cm2122.g21805677.ui.viewModels

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FireUi(
    val uuid: String, val locale: String, val operators: Int  ,val land: Int, val air: Int,val state: String, val observations: String, val startDate: Long
): Parcelable
