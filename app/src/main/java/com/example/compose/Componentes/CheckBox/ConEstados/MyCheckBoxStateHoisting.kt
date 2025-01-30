package com.example.compose.Componentes.CheckBox.ConEstados

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyCheckBoxStateHoisting(checkInfo: CheckInfo) {
    Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checkInfo.checked,
            onCheckedChange = { checkInfo.onCheckedChange(!checkInfo.checked) })
        Text(text = checkInfo.title)
    }
}

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var status by rememberSaveable { mutableStateOf(false) }
        CheckInfo(
            title = it,
            checked = status,
            onCheckedChange = { myNewStatus -> status = myNewStatus })
    }
}

@Composable
fun trescheckboxIndependientes(modifier: Modifier) {
    Column(modifier) {
        var status by rememberSaveable { mutableStateOf(false) }
        var checkInfo = CheckInfo(title = "CheckBox", checked = status,
            onCheckedChange = { status = it })

        var myOptions = getOptions(listOf("Opción 1", "Opción 2", "Opción 3"))

        MyCheckBoxStateHoisting(checkInfo)
        Column(Modifier.padding(start = 20.dp)) {
            myOptions.forEach {
                MyCheckBoxStateHoisting(checkInfo = it)
            }
        }


    }
}




