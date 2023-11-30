package com.example.pruebaroom.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="persona")
data class Persona (
    @ColumnInfo(name = "nombre")
    var nombre:String,
    @ColumnInfo(name = "apellidos")
    var apellidos:String){
    @PrimaryKey(autoGenerate=true)
    @ColumnInfo(name = "id_persona")
    var id_persona:Int=0



}