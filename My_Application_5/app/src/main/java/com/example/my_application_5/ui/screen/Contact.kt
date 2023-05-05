package com.example.my_application_5.ui.screen

import android.app.LauncherActivity.ListItem
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.my_application_5.database.ContactDbModel


@ExperimentalMaterial3Api
@Composable
fun Contact(
    modifier: Modifier= Modifier,
    contact: ContactDbModel
) {
    Card(
        shape = RoundedCornerShape(4.dp),
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {

        androidx.compose.material3.ListItem(
            headlineText = { Text(text = contact.title, maxLines = 1) },
            overlineText = { Text(text = contact.content, maxLines = 1)},
//            icon = {
//                ContactColor(
//                    color = Color.LightGray,
//                    size = 40.dp,
//                    border = 1.dp
//                )
//            }
        )
    }
}