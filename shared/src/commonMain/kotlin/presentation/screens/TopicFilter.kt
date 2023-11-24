package presentation.screens

import kotlinx.serialization.Serializable

/** Created by Shubham Singh on 13/08/23. */
@Serializable data class TopicFilter(val topic: String, val isSelected: Boolean = false)