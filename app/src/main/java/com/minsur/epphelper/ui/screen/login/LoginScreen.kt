package com.minsur.epphelper.ui.screen.login


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Dock
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.minsur.epphelper.R
import com.minsur.epphelper.model.AreaItem
import com.minsur.epphelper.model.getUser
import com.minsur.epphelper.model.mainUser
import com.minsur.epphelper.ui.screen.main.MainScreen
import androidx.compose.material.Text as Text


@Composable
fun LoginScreen(onLoginSuccess: () -> Unit){
    Surface(modifier = Modifier.fillMaxSize(),color = MaterialTheme.colors.background){
        Column (modifier = Modifier.fillMaxSize(),verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            val textState: MutableState<String> = remember{mutableStateOf("")}

            WelcomeText()
            PurposeImage()
            text_field(InputType = KeyboardType.Number,"Documento de Identidad",
                IconImage = painterResource(id = R.drawable.napoleon), textState = textState)
            SignIn(textState = textState, onLoginSuccess = onLoginSuccess)
            ForgotPasswordText()
        }
    }
}
@Composable
fun WelcomeText(){
    Text(text = "Welcome To Maps",
        color = Color.White,
        fontSize = 25.sp,
        modifier = Modifier.padding(top = 40.dp)
    )
}
@Composable
fun PurposeImage(){
    Image(painter = painterResource(id = R.drawable.napoleon), contentDescription = "image",
        modifier = Modifier.size(300.dp))
}
@Composable
fun text_field(InputType : KeyboardType,placeholder : String,IconImage : Painter, textState:MutableState<String> ){


    TextField(value = textState.value,
        onValueChange = { newInput -> textState.value = newInput.filter { it.isDigit() } },
        leadingIcon = {Icon(
            imageVector = Icons.Default.Dock,
            contentDescription = null
        )},
        label = {Text(text = "Documento de identidad",color = MaterialTheme.colors.secondary)},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier
            .padding(top = 25.dp)
            .background(color = MaterialTheme.colors.secondary)
    )
//    var TextFieldPasswordState = remember{mutableStateOf("")}
//    TextField(value = TextFieldPasswordState.value,
//        onValueChange = { newInput -> TextFieldPasswordState.value = newInput },
//        leadingIcon = {Icon(
//            imageVector = Icons.Default.Password,
//            contentDescription = null
//        )},
//        label = {Text(text = "Password",color = MaterialTheme.colors.secondary)},
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
//        modifier = Modifier
//            .padding(top = 25.dp)
//            .background(color = MaterialTheme.colors.secondary)
//    )

}



@Composable
fun SignIn(textState:MutableState<String>,onLoginSuccess: () -> Unit){

    val showDialog = remember {
        mutableStateOf(false)
    }
    val showToast = remember {
        mutableStateOf(false)
    }
    var primaryMessage: String = ""
    var secondaryMessage: String = ""


    Button(onClick = {
        getUser(dni=textState.value){
            if(textState.value==""){
                primaryMessage = "DATO NO VALIDO"
                secondaryMessage = "Porfavor ingrese un documento de identidad válido."
                showDialog.value = true
            }else if(it==null){
                primaryMessage = "USUARIO NO ENCONTRADO"
                secondaryMessage = "Porfavor contacte a su superior para proceder a registrarlo."
                showDialog.value = true
            } else {
                showDialog.value = false
                showToast.value=true
                mainUser = it
            }
        }
    }
        ,modifier = Modifier
            .padding(top = 25.dp)
            .requiredWidth(277.dp)){
        Text(text = "Ingresar")
        if(showDialog.value){
            Alert(showDialog=showDialog, primaryMessage = primaryMessage, secondaryMessage = secondaryMessage)
        }
        if(showToast.value){
            Toast.makeText(
                LocalContext.current,
                "Bienvenido ${mainUser!!.names} ${mainUser!!.paternal_surname} ${mainUser!!.maternal_surname}",
                Toast.LENGTH_LONG
            ).show()
            onLoginSuccess()
            showToast.value=false
        }

    }


}

@Composable
fun Alert(showDialog: MutableState<Boolean>, primaryMessage: String, secondaryMessage:String ) {
    AlertDialog(
        title = {
            Text(text = primaryMessage)
        },
        text = {
            Text(secondaryMessage)
        },
        onDismissRequest = {

        },
        buttons = {
            Button(onClick = { showDialog.value = false }, modifier = Modifier.padding(8.dp)) {
                Text("Aceptar")
            }
        }
    )
}


@Composable
fun ForgotPasswordText(){
    Text(text = "Necesitas Ayuda?",color = MaterialTheme.colors.secondary,
        modifier = Modifier.padding(top = 70.dp))
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ProjectLoginTheme {
//        loginScreen()
//    }
//}