package com.mostafa.bk_programmer_pro_1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mostafa.bk_programmer_pro_1.R
import com.mostafa.bk_programmer_pro_1.data.DataManager
import com.mostafa.bk_programmer_pro_1.data.domain.Match
import com.mostafa.bk_programmer_pro_1.ui.viewHolder.MatchVIewHolder

class MatchAdapter(val list: List<Match>) : RecyclerView.Adapter<MatchVIewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchVIewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_view_item, parent, false)

        return MatchVIewHolder(view)
    }

    override fun getItemCount(): Int {
        return DataManager.getMatchesCount
    }

    override fun onBindViewHolder(holder: MatchVIewHolder, position: Int) {
        val currentMatch = list.get(position)
        holder.apply {
            yearTextView.text = currentMatch.year.toString()
            homeTeamNameTextView.text = currentMatch.homeTeamName.toString()
            homeTeamGoalsTextView.text = currentMatch.homeTeamGoals.toString()
            awayTeamNameTextView.text = currentMatch.awayTeamName.toString()
            awayTeamGoalsTextView.text = currentMatch.awayTeamGoals.toString()

        }

    }

}