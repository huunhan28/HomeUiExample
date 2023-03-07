package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun ExamplePreview() {
    Surface(
        modifier = Modifier
            .size(200.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray),
        color = Color.Blue,
        contentColor = Color.Black,
        tonalElevation = 16.dp
    ) {
        // Nội dung bên trong Surface
        Text(
            text = "This is an example of Surface in Compose",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "More",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ExampleSurface() {
    Surface(
        modifier = Modifier.fillMaxWidth(), // để áp dụng các hiệu ứng như kích thước, độ lệch, độ cao...
                color = Color.White, // để thiết lập màu nền cho bề mặt
                contentColor = Color.Black, // để thiết lập màu cho nội dung bên trong bề mặt
                shape = RectangleShape, // để thiết lập hình dạng cho bề mặt, có thể là hình tròn, hình chữ nhật hoặc hình tùy chỉnh
                //elevation = 4.dp, // để thiết lập độ cao cho bề mặt và tạo ra hiệu ứng bóng
                border = BorderStroke(1.dp, Color.Gray), // để thiết lập đường viền cho bề mặt

    ) {
        Text("Hello World") // nội dung của bề mặt là một chữ "Hello World"
    }
}

@Preview(showBackground = true)
@Composable
fun ExampleAnim() {
    var visible by remember { mutableStateOf(true) }

    Button(onClick = { visible = !visible }) {
        Text("Toggle")
    }

    AnimatedVisibility(visible = visible) {
        Surface(
            modifier = Modifier.size(200.dp),
            color = Color.Blue,
            contentColor = Color.White
        ) {
            Text("Hello World")
        }
    }
}

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleCardAndSurface() {
    // A Card with a text and an icon
    Column {
        Card(
            modifier = Modifier.padding(16.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Hello, world!")
                Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
            }
        }

        // A Surface with a text and a background color
        Surface(
            modifier = Modifier.padding(16.dp),
            color = Color.Blue,
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Hello, world!", color = Color.White)
                Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
            }

        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ExampleCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
//        elevation = 8.dp,
        border = BorderStroke(2.dp, Color.Gray)
    ) {
        // Nội dung bên trong Card
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Example Card in Compose",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HelloScreen() {
    // Tạo state để lưu trữ giá trị của TextField
    val name = rememberSaveable { mutableStateOf("") }

    // Truyền state vào HelloContent
    HelloContent(name = name.value, onNameChange = { name.value = it })
}

@Composable
fun HelloContent(name: String, onNameChange: (String) -> Unit) {
    // Hiển thị TextField với value và onValueChange từ state
    TextField(
        value = name,
        onValueChange = onNameChange,
        label = { Text("Nhập tên") }
    )

    // Hiển thị Text với text từ state
    Text(text = "Xin chào, $name")
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ExampleWifi(){
    Card(
        modifier = Modifier
            .width(154.dp)
            .height(200.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
//        elevation = 8.dp,
        border = BorderStroke(2.dp, Color.Gray)
    ) {
        Column {
            
        }
    }
}