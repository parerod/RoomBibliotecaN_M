package com.example.pruebaroom.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.PrimaryKey

@Entity(tableName="libro")
data class Libro (
    @ColumnInfo(name = "nombre")
    var nombre:String,
    @ColumnInfo(name = "autor")
    var autor:String,
    @ColumnInfo(name = "paginas")
    var paginas:Int
    ) {
        @PrimaryKey(autoGenerate=true)
        @ColumnInfo(name = "id_libro")
        var libroId:Int=0
}

