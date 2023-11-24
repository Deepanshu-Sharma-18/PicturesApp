package presentation.viewmodel

import models.Hit

data class PicturesData(
    val images: List<Hit?>? = emptyList(),
    val isLoading: Boolean = false
)