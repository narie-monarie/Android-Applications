package com.example.composedesigns

data class Rankings(
    val title: String,
    val image: Int,
    val eth: Double = 0.0,
    val percentChange: Double = 0.0
)

var rankings: List<Rankings> = listOf(
    Ranking("Azumi", R.drawable.ranking01, 3.99, 200055.02),
    Ranking("Hape prime", R.drawable.ranking02, 33.79, 180055.45),
    Ranking("Cryoto", R.drawable.ranking03, -6.56, 90055.62),
    Ranking("Ape Club", R.drawable.ranking04, 3.99, 88055.12),
    Ranking("Bat", R.drawable.ranking05, 3.99, 10055.06),
    Ranking("Mutant", R.drawable.ranking06, 3.99, 9095.27),
    Ranking("Metaverse", R.drawable.ranking07, 3.99, 10055.02),
    Ranking("Mountain", R.drawable.ranking08, 3.99, 8055.73),
    Ranking("Mutant Ape", R.drawable.ranking05, 3.99, 5055.73),
    Ranking("The Mountain", R.drawable.ranking10, -1.99, 1055.02)
)
