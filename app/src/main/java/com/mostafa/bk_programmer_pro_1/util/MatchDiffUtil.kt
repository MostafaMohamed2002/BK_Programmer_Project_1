package com.mostafa.bk_programmer_pro_1.util

import androidx.recyclerview.widget.DiffUtil

class MatchDiffUtil(
    val matchOldList: List<com.mostafa.bk_programmer_pro_1.data.domain.Match>,
    val matchNewList: List<com.mostafa.bk_programmer_pro_1.data.domain.Match>
) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return matchOldList.size
    }

    override fun getNewListSize(): Int {
        return matchNewList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return (matchOldList[oldItemPosition].homeTeamName == matchNewList[newItemPosition].homeTeamName
                && matchOldList[oldItemPosition].awayTeamName == matchNewList[newItemPosition].awayTeamName)
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return true
    }
}