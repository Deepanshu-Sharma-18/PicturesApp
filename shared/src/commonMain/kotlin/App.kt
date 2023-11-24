import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import org.jetbrains.compose.resources.ExperimentalResourceApi
import presentation.MainScreen
import presentation.viewmodel.PictureViewModel

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        val pictureViewModel = getViewModel(Unit , viewModelFactory {
            PictureViewModel()
        })

        pictureViewModel.updateState()

        MainScreen(pictureViewModel)
    }
}

expect fun getPlatformName(): String