package models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PictureModelItem(
    @SerialName("alt_description")
    val altDescription: String?,
    @SerialName("blur_hash")
    val blurHash: String?,
    @SerialName("breadcrumbs")
    val breadcrumbs: List<String>?,
    @SerialName("color")
    val color: String?,
    @SerialName("created_at")
    val createdAt: String?,
    @SerialName("current_user_collections")
    val currentUserCollections: List<User?>?,
    @SerialName("description")
    val description: String?,
    @SerialName("height")
    val height: Int?,
    @SerialName("id")
    val id: String?,
    @SerialName("liked_by_user")
    val likedByUser: Boolean?,
    @SerialName("likes")
    val likes: Int?,
    @SerialName("links")
    val links: Links?,
    @SerialName("promoted_at")
    val promotedAt: String?,
    @SerialName("slug")
    val slug: String?,
    @SerialName("sponsorship")
    val sponsorship: Sponsorship?,
    @SerialName("topic_submissions")
    val topicSubmissions: TopicSubmissions?,
    @SerialName("updated_at")
    val updatedAt: String?,
    @SerialName("urls")
    val urls: Urls?,
    @SerialName("user")
    val user: User?,
    @SerialName("width")
    val width: Int?
)