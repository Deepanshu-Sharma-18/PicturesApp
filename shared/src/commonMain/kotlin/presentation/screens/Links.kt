package presentation.screens

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Links(
    @SerialName("download") val download: String = "",
    @SerialName("download_location") val downloadLocation: String = "",
    @SerialName("html") val html: String = "",
    @SerialName("self") val self: String = ""
) {
    override fun toString(): String {
        return Json.encodeToString(this)
    }
}