package diddy.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import diddy.example.happybirthday.ui.theme.HappyBirthdayTheme
import diddy.example.happybirthday.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center // Centers the content
                    ) {
                        // Background Image
                        Image(
                            painter = painterResource(id = R.drawable.hbd), // Replace with your image resource
                            contentDescription = "Background Image",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop // Scale the image to fill the entire background
                        )
                        // Greeting content with a card frame
                        Greeting(name = "Frezy")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Card for the frame
    Card(
        shape = RoundedCornerShape(8.dp), // Rounded corners
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp), // Shadow
        modifier = modifier.padding(16.dp)
    ) {
        // Text inside the card
        Text(
            text = "Happy Birthday $name!",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp) // Padding inside the card
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyBirthdayTheme {
        Greeting("Frezy")
    }
}
