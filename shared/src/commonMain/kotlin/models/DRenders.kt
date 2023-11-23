package models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DRenders(
    @SerialName("status")
    val status: String?
)