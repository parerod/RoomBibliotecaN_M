package com.example.roombibliotecan_m.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import com.example.pruebaroom.modelo.entidades.Libro
import com.example.pruebaroom.modelo.entidades.Persona

@Entity(tableName="prestamo",
    primaryKeys = ["idPersonaPr", "idLibroPr"],
    foreignKeys = [
        ForeignKey(
            entity = Prestamo::class,
            parentColumns = ["id_persona"],
            childColumns = ["idPersonaPr"]
        ),
        ForeignKey(
            entity = Persona::class,
            parentColumns = ["id_libro"],
            childColumns = ["idLibroPr"]
        )
    ])
data class Prestamo(
    @ColumnInfo(name = "idPersonaPr")
    var idPersonaPr:Int,
    @ColumnInfo(name = "idLibroPr")
    var idLibroPr:Int
) {
}