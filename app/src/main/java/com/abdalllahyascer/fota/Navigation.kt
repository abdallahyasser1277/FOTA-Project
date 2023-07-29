package com.abdalllahyascer.fota

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abdalllahyascer.fota.about.AboutScreen
import com.abdalllahyascer.fota.contact.ContactScreen
import com.abdalllahyascer.fota.help.HelpScreen
import com.abdalllahyascer.fota.login.LoginScreen
import com.abdalllahyascer.fota.setting.SettingScreen

@Composable
fun Navigation(navController : NavHostController){
    
    NavHost(navController = navController, startDestination = "home"){

        composable(route="home"){
            HomeScreen()
        }
        composable(route="about"){
            AboutScreen()
        }
        composable(route="contacts"){
            ContactScreen()
        }
        composable(route="help"){
            HelpScreen()
        }
        composable(route="login"){
            LoginScreen()
        }
        composable(route="settings"){
            SettingScreen()
        }


    }
}