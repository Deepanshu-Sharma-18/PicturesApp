package models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Wallpapers(
    @SerialName("status")
    val status: String?
)