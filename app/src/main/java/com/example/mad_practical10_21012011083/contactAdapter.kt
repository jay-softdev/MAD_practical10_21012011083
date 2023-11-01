package com.example.mad_practical10_21012011083

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class contactAdapter( context: Context, val array:ArrayList<contect>):ArrayAdapter<contect>(context,0,array){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listviewlayout,parent,false)
        view.findViewById<TextView>(R.id.textView2).text = array.get(position).name
        view.findViewById<TextView>(R.id.textView3).text = array.get(position).address
        view.findViewById<TextView>(R.id.textView4).text = array.get(position).emailid

        return view
    }
}