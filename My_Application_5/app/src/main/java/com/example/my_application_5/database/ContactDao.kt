package com.example.my_application_5.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ContactDao {

    @Query("SELECT * FROM ContactDbModel")
    fun getAllStnc():List<ContactDbModel>

    @Query("SELECT * FROM ContactDbModel WHERE id IN (:conIds)")
    fun getContactByIdsSync(conIds: List<Long>):List<ContactDbModel>

    @Query("SELECT * FROM ContactDbModel WHERE id LIKE :id")
    fun findByIdsSync(id: Long):ContactDbModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(contactDbModel: ContactDbModel)

    @Insert
    fun insertAll(vararg contactDbModel: ContactDbModel)

    @Query("DELETE FROM ContactDbModel WHERE id LIKE id")
    fun delete(id: Long)

    @Query("DELETE FROM ContactDbModel WHERE id IN (:conIds)")
    fun delete(conIds: List<Long>)
}