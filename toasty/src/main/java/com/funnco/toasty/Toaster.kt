package com.funnco.toasty

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object{
        fun show(text: String, context: Context){
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        }
    }
}