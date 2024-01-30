package com.example.composedesigns

import java.util.UUID

data class NFT(
    val title: String,
    val subtitle: String,
    val image: Int,
    var likes: Int,
    val eth: Double,
    val id: UUID = UUID.randomUUID()
)

val nfts = listOf<NFT>(
    NFT("Wave", "wav2 #5672", R.drawable.card_wave2, 5160, 0.018),
    NFT("Abstract Pink", "abstract #2538", R.drawable.card_pink, 1800, 0.906),
    NFT("Wave", "wavepi #5267", R.drawable.card_ring, 2030, 0.26),
    NFT("Abstract23", "abstract #2038", R.drawable.card_wave, 2060, 0.246),
    NFT("Music", "mali #7890", R.drawable.card_wave2, 1690, 0.46),
    NFT("Ball", "baalli #4890", R.drawable.card_wave2, 690, 0.03),
    NFT("Ring", "Ring #7288", R.drawable.card_wave2, 400, 0.106),
    NFT("Beer", "Beer #1238", R.drawable.card_wave2, 200, 0.26)
)