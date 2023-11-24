package presentation.viewmodel

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import models.PictureModel

class PictureViewModel : ViewModel() {

    private val _data = MutableStateFlow<PicturesData>(PicturesData())
    val data = _data.asStateFlow()


    private val httpClient = HttpClient {
        install(ContentNegotiation){
           json(
               Json {
                   isLenient = false
               }
           )
        }
    }

     private val accessKey = "40875822-8bd6955b499c81ed291037833"

    fun updateState(){
        viewModelScope.launch {
            _data.update {
                it.copy(isLoading = true)
            }
            val callData = getImagesFromApi()
            _data.update {
                it.copy(images = callData.hits , isLoading = false)
            }
        }
    }

    private suspend fun getImagesFromApi() : PictureModel{
        return httpClient.get("https://pixabay.com/api/?key=$accessKey") {

        }.body<PictureModel>()
    }



}