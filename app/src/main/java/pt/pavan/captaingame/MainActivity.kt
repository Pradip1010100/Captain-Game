package pt.pavan.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pt.pavan.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CaptainGame()
                }
            }
        }
    }
    @Composable
    fun CaptainGame(){
        val treasuresFound = remember { mutableStateOf(0) }
        //val treasureFound by remember{mutableStateOf(0)}  //** access the value directly like treasureFound unlike treasureFound.value
        val direction = remember{mutableStateOf("North")}
        val hpLeft = remember{mutableStateOf(100)}
        val stormOrTreasure = remember{mutableStateOf("")}

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Tresures Found : ${treasuresFound.value}")
            Text(text = "Current Direction : ${direction.value}")
            Text(text = "?? : ${stormOrTreasure.value}")
            Text(text = " HP : ${hpLeft.value}")
            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    if(hpLeft.value < 100){
                        hpLeft.value += 1;
                    }
                    stormOrTreasure.value = "Found a Treasure"
                }
                else{
                    hpLeft.value -= 5;
                    stormOrTreasure.value = "Storm Ahead!"
                    if(hpLeft.value <= 0){
                        treasuresFound.value = 0
                        direction.value = "North"
                        hpLeft.value = 100
                        stormOrTreasure.value = "Game Over"
                    }

                }
            }) {
                Text("Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    if(hpLeft.value < 100){
                        hpLeft.value += 1
                    }
                    stormOrTreasure.value = "Found a Treasure"
                }
                else{
                    hpLeft.value -= 5;
                    stormOrTreasure.value = "Storm Ahead!"
                    if(hpLeft.value <= 0){
                        treasuresFound.value = 0
                        direction.value = "North"
                        hpLeft.value = 100
                        stormOrTreasure.value = "Game Over"
                    }
                }
            }) {
                Text("Sail West")
            }
            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    if(hpLeft.value < 100){
                        hpLeft.value += 1
                    }
                    stormOrTreasure.value = "Found a Treasure"
                }else{
                    hpLeft.value -= 5
                    stormOrTreasure.value = "Storm Ahead!"
                    if(hpLeft.value <= 0){
                        treasuresFound.value = 0
                        direction.value = "North"
                        hpLeft.value = 100
                        stormOrTreasure.value = "Game Over"
                    }
                }
            }) {
                Text("Sail North")
            }
            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    if(hpLeft.value < 100){
                        hpLeft.value += 1
                    }
                    stormOrTreasure.value = "Found a Treasure"
                }else{
                    hpLeft.value -= 5
                    stormOrTreasure.value = "Storm Ahead!"
                    if(hpLeft.value <= 0){
                        treasuresFound.value = 0
                        direction.value = "North"
                        hpLeft.value = 100
                        stormOrTreasure.value = "Game Over"
                    }
                }
            }) {
                Text("Sail South")
            }

        }
    }
}
