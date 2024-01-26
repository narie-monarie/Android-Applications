package com.example.composedesigns

data class NFTCollection(
    val title: String,
    val image: Int,
    var likes: Int
)

val collections = listOf<NFTCollection>(
    NFTCollection("3D Art", R.drawable.card_3d, 200),
    NFTCollection("Abstract Art", R.drawable.card_abstract, 123),
    NFTCollection("Portrait Art", R.drawable.card_portrait, 245),
    NFTCollection("Metaverse", R.drawable.card_metaverse, 170),
)