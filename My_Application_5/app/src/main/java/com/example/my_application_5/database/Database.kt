package com.example.my_application_5.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ContactDbModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contactDao() : ContactDao

    companion object {
        private const val Database_NAME = "contact-maker-database"
        private var INSTANT: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            var instant = INSTANT
            if (instant == null) {
                instant = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    Database_NAME
                ).build()

                INSTANT = instant
            }

            return instant
        }
    }
}