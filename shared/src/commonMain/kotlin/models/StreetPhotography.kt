package models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StreetPhotography(
    @SerialName("status")
    val status: String?
)