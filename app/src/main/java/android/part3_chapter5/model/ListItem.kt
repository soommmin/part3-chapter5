package android.part3_chapter5.model

import java.util.*

interface ListItem {
    val thumbnailUrl: String
    val dateTime: Date
    var isFavorite : Boolean
}