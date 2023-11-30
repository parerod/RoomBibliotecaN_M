package com.example.pruebaroom.modelo.daos

import androidx.room.*
import com.example.pruebaroom.modelo.entidades.Persona

@Dao
interface InterfaceDaoPersona {

    @Insert
    fun addPersona(pe : Persona)
    @Query("SELECT * FROM persona")
    fun getPersonas():MutableList<Persona>
    @Query("SELECT * FROM persona WHERE id_persona IN (:idPersons)")
    fun getBibliotecaListaId(idPersons: MutableList<Int>):MutableList<Persona>
    @Query("SELECT * FROM biblioteca WHERE nombre LIKE :nombre")
    fun getPersonaNombre(nombre: String):Persona?
    @Update
    fun updatePersona(pe : Persona)
    @Delete
    fun deletePersona(pe : Persona)
}