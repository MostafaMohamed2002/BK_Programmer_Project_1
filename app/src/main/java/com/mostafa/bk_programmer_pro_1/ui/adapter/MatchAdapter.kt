package com.mostafa.bk_programmer_pro_1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mostafa.bk_programmer_pro_1.R
import com.mostafa.bk_programmer_pro_1.data.DataManager
import com.mostafa.bk_programmer_pro_1.data.domain.Match
import com.mostafa.bk_programmer_pro_1.ui.MainActivity
import com.mostafa.bk_programmer_pro_1.ui.viewHolder.MatchVIewHolder
import com.mostafa.bk_programmer_pro_1.util.MatchDiffUtil

class MatchAdapter(private var list: List<Match>) : RecyclerView.Adapter<MatchVIewHolder>() {
    val mainActivity = MainActivity()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchVIewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_view_item, parent, false)

        return MatchVIewHolder(view)
    }

    override fun getItemCount(): Int {
        return DataManager.getMatchesCount
    }

    fun setNewData(list: List<Match>) {
        val difftUtil = DiffUtil.calculateDiff(MatchDiffUtil(this.list, list))
        this.list = list
        difftUtil.dispatchUpdatesTo(this)
    }

    override fun onBindViewHolder(holder: MatchVIewHolder, position: Int) {
        val currentMatch = list[position]
        holder._binding.apply {
            yearTextViewR.text = currentMatch.year.toString()
            homeTeamNameTextViewR.text = currentMatch.homeTeamName.toString()
            homeTeamGoalsTextViewR.text = currentMatch.homeTeamGoals.toString()
            awayTeamNameTextViewR.text = currentMatch.awayTeamName.toString()
            awayTeamGoalsTextViewR.text = currentMatch.awayTeamGoals.toString()
            imageButton.setOnClickListener {
                imageButtonClick?.invoke(currentMatch)
            }

        }
    }

    var imageButtonClick: ((Match) -> Unit)? = null
}