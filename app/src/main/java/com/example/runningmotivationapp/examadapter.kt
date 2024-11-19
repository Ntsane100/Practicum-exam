package com.example.runningmotivationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


data class Activity(val Day: String, val Morning: String, val Afternoon: String, val Activitynotes: String)
class examadapter (private val Activities: List<Activity>) : RecyclerView.Adapter<examadapter.viewHolder>()
{
    class viewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        val Day : TextView = view.findViewById(R.id.txtDay)
        val Morning : TextView = view.findViewById(R.id.txtMorning)
        val Afternoon : TextView = view.findViewById(R.id.txtAfternoon)
        val Activitynotes : TextView = view.findViewById(R.id.txtActivitynotes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detailed_view, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int = Activities.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        TODO("Not yet implemented")
        val Activity = Activities[position]

        holder.Day.text= Activity.Day
        holder.Morning.text=Activity.Morning
        holder.Afternoon.text= Activity.Afternoon
        holder.Activitynotes.text= Activity.Activitynotes
    }


}