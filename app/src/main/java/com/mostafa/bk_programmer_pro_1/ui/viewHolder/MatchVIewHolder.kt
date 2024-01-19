package com.mostafa.bk_programmer_pro_1.ui.viewHolder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mostafa.bk_programmer_pro_1.R

class MatchVIewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
    val yearTextView = viewItem.findViewById<TextView>(R.id.yearTextViewR)
    val homeTeamNameTextView = viewItem.findViewById<TextView>(R.id.homeTeamNameTextViewR)
    val homeTeamGoalsTextView = viewItem.findViewById<TextView>(R.id.homeTeamGoalsTextViewR)
    val awayTeamGoalsTextView = viewItem.findViewById<TextView>(R.id.awayTeamGoalsTextViewR)
    val awayTeamNameTextView = viewItem.findViewById<TextView>(R.id.awayTeamNameTextViewR)
}