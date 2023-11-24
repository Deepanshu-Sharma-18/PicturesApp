package presentation.screens

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Photo(
    @SerialName("alt_description") val altDescription: String? = "",
    @SerialName("color") val color: String = "",
    @SerialName("created_at") val createdAt: String? = "",
    @SerialName("description") val description: String? = "",
    @SerialName("height") val height: Int = 0,
    @SerialName("id") val id: String = "",
    @SerialName("likes") val likes: Int = 0,
    @SerialName("links") val links: Links? = Links(),
    @SerialName("promoted_at") val promotedAt: String? = "",
//    @SerialName("topic_submissions") val topicSubmissions: TopicSubmissions? = TopicSubmissions(),
    @SerialName("updated_at") val updatedAt: String? = "",
    @SerialName("urls") val urls: Urls? = Urls(),
    @SerialName("user") val user: User? = User(),
    @SerialName("width") val width: Int = 0
)