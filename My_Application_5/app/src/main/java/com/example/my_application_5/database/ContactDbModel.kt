package com.example.my_application_5.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id:Long = 0,
    @ColumnInfo(name = "title") val title :String,
    @ColumnInfo(name = "content") val content :String,
    @ColumnInfo(name = "in_trash") val isInTrash :Boolean,
) {
    companion object {
        val DEFAULT_CONTACT = listOf(
            ContactDbModel(1,"Somchai","022222222", false),
            ContactDbModel(1,"Somsak","022223333", false),
            ContactDbModel(1,"Somying","022224444", false),
            ContactDbModel(1,"Somrak","022225555", false),
        )
    }
}
