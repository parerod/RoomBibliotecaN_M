package com.example.pruebaroom.modelo.daos

import androidx.room.*
import com.example.pruebaroom.modelo.entidades.Libro


@Dao
interface InterfaceDaoLibro {

    @Insert
    fun addLibro(li: Libro)
    @Query("SELECT * FROM libro")
    fun getLibros():MutableList<Libro>
    @Update
    fun updateLibro(li : Libro)
    @Delete
    fun deleteLibro(li : Libro)

}