package com.solinftec.navigationcomponentapp.extensions

import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.solinftec.navigationcomponentapp.R

private val navOption = NavOptions.Builder()
    .setEnterAnim(R.anim.slide_in_right)
    .setExitAnim(R.anim.slide_out_left)
    .setPopEnterAnim(R.anim.slide_in_left)
    .setPopExitAnim(R.anim.slide_out_right)
    .build()

//criando uma extensão da classe no kotlin
fun NavController.navigateWithAnimations(destinationId: Int) {
    this.navigate(destinationId, null, navOption)
}