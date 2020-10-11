package com.example.ass8mysql

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emp_item_laout.view.*


class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val tvName = view.tv_name
    val tvGender = view.tv_gender
    val tvEmail = view.tv_email
    val  tvSalary = view.tv_salary
}