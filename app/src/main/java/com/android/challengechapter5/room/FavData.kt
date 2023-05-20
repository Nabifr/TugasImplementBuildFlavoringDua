package com.android.challengechapter5.room

import androidx.room.ColumnInfo
import java.io.Serializable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FavData(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "title")
    var title : String,
    @ColumnInfo(name = "release")
    var releasedate: String,
    @ColumnInfo(name = "posterpath")
    var posterPath : String
) : Serializable
