package com.example.my_application_5.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

const val New_Contact_ID = -1L

data class ContactDbModel(
    val id:Long = New_Contact_ID,
    val title :String = "",
    val content :String = "",
    val isCheckOff :Boolean? = null,
)