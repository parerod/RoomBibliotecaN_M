package com.example.pruebaroom.modelo.daos

import androidx.room.*
import com.example.pruebaroom.modelo.entidades.Persona
import com.example.roombibliotecan_m.modelo.entidades.Prestamo

@Dao
interface InterfaceDaoPrestamo {

    @Insert
    fun addPrestamo(pre : Prestamo)
    @Query("SELECT * FROM persona")
    fun getPrestamos():MutableList<Prestamo>
    @Query("SELECT * FROM biblioteca WHERE nombre LIKE :nombre")
    fun getPrestamoNombre(nombre: String):Persona?
    @Update
    fun updatePrestamo(pre : Prestamo)
    @Delete
    fun deletePrestamo(pre : Prestamo)
}