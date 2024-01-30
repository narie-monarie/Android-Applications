package com.example.swapo.components.productPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.swapo.R
import com.example.swapo.data.Product

val product: List<Product> = listOf(
    Product(
        image = R.drawable.one,
        icon = Icons.Rounded.ShoppingCart,
        description = "Stupid Product",
        price = 124.57F
    ),
    Product(
        image = R.drawable.two,
        icon = Icons.Rounded.ShoppingCart,
        description = "Stupid Product 1",
        price = 24.57F
    ),

    Product(
        image = R.drawable.three,
        icon = Icons.Rounded.ShoppingCart,
        description = "Stupid Product 2",
        price = 724.57F
    ),

    Product(
        image = R.drawable.four,
        icon = Icons.Rounded.ShoppingCart,
        description = "Stupid Product 3",
        price = 245.57F
    ),

    Product(
        image = R.drawable.five,
        icon = Icons.Rounded.ShoppingCart,
        description = "Stupid Product 4",
        price = 564.47F
    ),

    Product(
        image = R.drawable.six,
        icon = Icons.Rounded.ShoppingCart,
        description = "Stupid Product 5",
        price = 29.57F
    ),

    Product(
        image = R.drawable.seven,
        icon = Icons.Rounded.ShoppingCart,
        description = "Stupid Product 6",
        price = 54.57F
    ),
)

@Composable
@Preview
fun ProductDis() {

    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 130.dp),
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        items(product.size) { index ->
            ProductDisplay(index)
        }
    }
}

@Composable
fun Search() {
    Column(
        Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "search"
                )
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Products", fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun ProductDisplay(index: Int) {
    val prod = product[index]

    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier.size(width = 150.dp, height = 200.dp)
    ) {
        Box {

            Image(
                painter = painterResource(id = prod.image),
                contentDescription = prod.description,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .offset(y = (-30).dp)
            )

            Spacer(modifier = Modifier.height(20.dp))
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    prod.description,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .offset(y = 165.dp)
                        .padding(12.dp),
                )
                Text(
                    "$${prod.price}",
                    fontSize = 12.sp,
                    modifier = Modifier
                        .offset(y = 165.dp)
                        .padding(12.dp),
                )
            }
        }
    }

}