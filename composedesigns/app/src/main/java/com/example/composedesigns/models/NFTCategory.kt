package com.example.composedesigns

import java.util.UUID

data class NFTCategory(
    val title: String,
    val image: Int,
    val id: UUID = UUID.randomUUID()
)

val categories: List<NFTCategory> = listOf(
    NFTCategory("Music", R.drawable.card_music),
    NFTCategory("Art", R.drawable.card_art),
    NFTCategory("Virtual Worlds", R.drawable.card_vw),
)