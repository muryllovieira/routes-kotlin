package br.senai.sp.jandira.navegandonocompose.screens.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()
            .padding(64.dp),
    ){
        Text(
            text = "MENU",
            color = Color.White,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = {navController.navigate("perfil")},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier
                .width(150.dp)
        ) {
            Text(
                text = "PERFIL",
                color = Color.Blue,
                fontSize = 18.sp
            )
        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = {navController.navigate("pedidos")},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier
                .width(150.dp)
        ) {
            Text(
                text = "PEDIDOS",
                color = Color.Blue,
                fontSize = 18.sp
            )
        }
        Button(
            onClick = {navController.navigate("login")},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier
                .width(150.dp)
        ) {
            Text(
                text = "SAIR",
                color = Color.Blue,
                fontSize = 18.sp
            )
        }
    }
}