package com.example.my_application_5.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.my_application_5.database.ContactDbModel.Companion

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactScreen() {
    val contacts = Companion.DEFAULT_CONTACT

    Scaffold(
        topBar = {},
        floatingActionButton = {},
        floatingActionButtonPosition = FabPosition.End
    ) {
        LazyColumn {
            items(4) {contactindex ->
                val contact = contacts[contactindex]
                Contact(contact = contact)
            }
        }
    }
}