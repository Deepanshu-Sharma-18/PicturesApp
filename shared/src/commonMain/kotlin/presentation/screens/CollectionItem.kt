package presentation.screens

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@kotlinx.serialization.Serializable
data class CollectionItem(
    @SerialName("cover_photo") val coverPhoto: CoverPhoto? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("last_collected_at") val lastCollectedAt: String? = null,
    @SerialName("links") val links: Links? = null,
    @SerialName("private") val isPrivate: Boolean? = null,
    @SerialName("preview_photos") val previewPhotos: ArrayList<PreviewPhotos>? = null,
    @SerialName("published_at") val publishedAt: String? = null,
    @SerialName("share_key") val shareKey: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("total_photos") val totalPhotos: Int? = null,
    @SerialName("updated_at") val updatedAt: String? = null,
    @SerialName("user") val user: User? = null
) {
    @kotlinx.serialization.Serializable
    data class CoverPhoto(
        @SerialName("blur_hash") val blurHash: String? = null,
        @SerialName("color") val color: String? = null,
        @SerialName("description") val description: String? = null,
        @SerialName("height") val height: Int? = null,
        @SerialName("id") val id: String? = null,
        @SerialName("liked_by_user") val likedByUser: Boolean? = null,
        @SerialName("likes") val likes: Int? = null,
        @SerialName("links") val links: Links? = null,
        @SerialName("urls") val urls: Urls? = null,
        @SerialName("user") val user: User? = null,
        @SerialName("width") val width: Int? = null
    ) {
        @kotlinx.serialization.Serializable
        data class Links(
            @SerialName("download") val download: String? = null,
            @SerialName("html") val html: String? = null,
            @SerialName("self") val self: String? = null
        )

        @kotlinx.serialization.Serializable
        data class Urls(
            @SerialName("full") val full: String? = null,
            @SerialName("raw") val raw: String? = null,
            @SerialName("regular") val regular: String? = null,
            @SerialName("small") val small: String? = null,
            @SerialName("thumb") val thumb: String? = null
        )

        @kotlinx.serialization.Serializable
        data class User(
            @SerialName("bio") val bio: String? = null,
            @SerialName("id") val id: String? = null,
            @SerialName("links") val links: Links? = null,
            @SerialName("location") val location: String? = null,
            @SerialName("name") val name: String? = null,
            @SerialName("portfolio_url") val portfolioUrl: String? = null,
            @SerialName("profile_image") val profileImage: ProfileImage? = null,
            @SerialName("total_collections") val totalCollections: Int? = null,
            @SerialName("total_likes") val totalLikes: Int? = null,
            @SerialName("total_photos") val totalPhotos: Int? = null,
            @SerialName("username") val username: String? = null
        ) {
            @kotlinx.serialization.Serializable
            data class Links(
                @SerialName("html") val html: String? = null,
                @SerialName("likes") val likes: String? = null,
                @SerialName("photos") val photos: String? = null,
                @SerialName("portfolio") val portfolio: String? = null,
                @SerialName("self") val self: String? = null
            )

            @kotlinx.serialization.Serializable
            data class ProfileImage(
                @SerialName("large") val large: String? = null,
                @SerialName("medium") val medium: String? = null,
                @SerialName("small") val small: String? = null
            )
        }
    }

    @kotlinx.serialization.Serializable
    data class Links(
        @SerialName("html") val html: String? = null,
        @SerialName("photos") val photos: String? = null,
        @SerialName("related") val related: String? = null,
        @SerialName("self") val self: String? = null
    )

    @kotlinx.serialization.Serializable
    data class User(
        @SerialName("bio") val bio: String? = null,
        @SerialName("id") val id: String? = null,
        @SerialName("links") val links: Links? = null,
        @SerialName("location") val location: String? = null,
        @SerialName("name") val name: String? = null,
        @SerialName("portfolio_url") val portfolioUrl: String? = null,
        @SerialName("profile_image") val profileImage: ProfileImage? = null,
        @SerialName("total_collections") val totalCollections: Int? = null,
        @SerialName("total_likes") val totalLikes: Int? = null,
        @SerialName("total_photos") val totalPhotos: Int? = null,
        @SerialName("updated_at") val updatedAt: String? = null,
        @SerialName("username") val username: String? = null
    ) {
        @kotlinx.serialization.Serializable
        data class Links(
            @SerialName("html") val html: String? = null,
            @SerialName("likes") val likes: String? = null,
            @SerialName("photos") val photos: String? = null,
            @SerialName("portfolio") val portfolio: String? = null,
            @SerialName("self") val self: String? = null
        )

        @kotlinx.serialization.Serializable
        data class ProfileImage(
            @SerialName("large") val large: String? = null,
            @SerialName("medium") val medium: String? = null,
            @SerialName("small") val small: String? = null
        )
    }

    @kotlinx.serialization.Serializable
    data class PreviewPhotos(
        @SerialName("blur_hash") val blurHash: String? = null,
        @SerialName("created_at") val createdAt: String? = null,
        @SerialName("id") val id: String? = null,
        @SerialName("slug") val slug: String? = null,
        @SerialName("updated_at") val updatedAt: String? = null,
        @SerialName("urls") val urls: Urls? = null
    ) {
        @Serializable
        data class Urls(
            @SerialName("full") val full: String? = null,
            @SerialName("raw") val raw: String? = null,
            @SerialName("regular") val regular: String? = null,
            @SerialName("small") val small: String? = null,
            @SerialName("small_s3") val smallS3: String? = null,
            @SerialName("thumb") val thumb: String? = null
        )
    }
}