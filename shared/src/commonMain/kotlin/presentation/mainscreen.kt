package presentation

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import models.Hit
import presentation.viewmodel.PictureViewModel

@Composable
fun MainScreen(pictureViewModel: PictureViewModel) {

    val pictures by pictureViewModel.data.collectAsState()
    val scrollState = rememberScrollState()
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        if (pictures.isLoading) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.size(25.dp)
                )
            }
        } else {

            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.fillMaxSize().padding(horizontal = 10.dp)
                    .verticalScroll(scrollState)
            ) {
                Spacer(modifier = Modifier.height(50.dp).fillMaxWidth())
                Text(
                    "Pixabay", style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 45.sp,

                        ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)
                )
                Spacer(modifier = Modifier.height(20.dp).fillMaxWidth())

                for (images in pictures.images!!) {
                    PictureFrame(images!!)
                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )
                }

            }
        }

    }
}

@Composable
fun PictureFrame(image: Hit) {
    KamelImage(
        resource = asyncPainterResource(image.largeImageURL.toString()),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
            .clip(shape = RoundedCornerShape(corner = CornerSize(10.dp)))
    )
}
