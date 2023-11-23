package models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopicSubmissions(
    @SerialName("3d-renders")
    val dRenders: DRenders?,
    @SerialName("street-photography")
    val streetPhotography: StreetPhotography?,
    @SerialName("travel")
    val travel: Travel?,
    @SerialName("wallpapers")
    val wallpapers: Wallpapers?
)