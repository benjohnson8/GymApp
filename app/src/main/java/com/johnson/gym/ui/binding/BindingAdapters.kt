package com.johnson.gym.ui.binding

import android.R
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.databinding.BindingAdapter

@BindingAdapter("entries")
fun Spinner.setEntries(entries: List<String>) {
    adapter = ArrayAdapter(this.context, R.layout.simple_spinner_item, entries)
}
