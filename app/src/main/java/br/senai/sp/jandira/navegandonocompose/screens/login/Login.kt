package br.senai.sp.jandira.navegandonocompose.screens.login

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.navegandonocompose.screens.menu.MenuScreen

@Composable
fun LoginScreen(navController: NavController) {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color.Magenta
    ) {
        Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround) {
            Text(text = "Login", fontSize = 46.sp, color = Color.White)
            Column {
                AnimatedVisibility(
                    visible = true,
                    enter = fadeIn()
                ) {
                    Button(onClick = { navController.navigate("menu") }, shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .width(300.dp)
                            .height(48.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = "Entrar",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            color = Color.Blue)
                    }
                }

            }
        }

    }
}
