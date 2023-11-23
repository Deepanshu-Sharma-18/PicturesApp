package models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Travel(
    @SerialName("status")
    val status: String?
)