package pt.ulusofona.deisi.cm2122.g21805677.model

import java.util.*

data class Fire(
    val uuid: String = java.util.UUID.randomUUID().toString(),
    val locale: String,
    val operators: Int  ,
    val land: Int,
    val air: Int,
    val state: String,
    val observations: String,
    val startDate: Long
){
    val timestamp: Long = Date().time
}
