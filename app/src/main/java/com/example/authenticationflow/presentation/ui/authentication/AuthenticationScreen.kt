package com.example.authenticationflow.presentation.ui.authentication

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AuthenticationScreen(modifier: Modifier = Modifier,navController: NavController) {
    LoginApplication()
    //LoginFragment(modifier,navController)
}
@Composable
fun LoginApplication(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login_page", builder = {
        composable("login_page", content = { LoginFragment(navController = navController) })
        composable("register_page", content = { SignupFragment(navController = navController) })
        composable("reset_page", content = { RestPasswordFragment(navController = navController) })
    })
}