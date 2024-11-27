package com.lab3.ui.screens.placeDetails
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lab3.data.ItemsData
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
/**
 * PlaceDetailsScreen - the second screen in app with the details of selected item
 * - [id]: Int - the id parameter to find and show corresponding item on screen
 */
@Composable
fun PlaceDetailsScreen(
    id: Int,
) {
    // State with the item
    val itemState = remember {
        mutableStateOf(
            // Finding the item by id in shared data source ItemsData.itemsList
            ItemsData.itemsList.first { it.id == id }
        )
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = itemState.value.imageRes),
                contentDescription = "Image of ${itemState.value.title}",
                modifier = Modifier.fillMaxWidth()
            )
//            Text(text = "Id: ${itemState.value.id}", modifier = Modifier.fillMaxWidth())
            Text(text = itemState.value.title, modifier = Modifier.fillMaxWidth(), style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold))
            Text(
                text = itemState.value.description, modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlaceDetailsScreenPreview() {
    PlaceDetailsScreen(
        id = 3
    )
}