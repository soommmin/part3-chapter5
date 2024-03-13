package android.part3_chapter5.list

import android.part3_chapter5.model.ListItem


interface ItemHandler {
    fun onClickFavorite(item : ListItem)
}