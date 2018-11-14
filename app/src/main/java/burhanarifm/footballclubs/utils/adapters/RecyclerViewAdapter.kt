package burhanarifm.footballclubs.utils.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import burhanarifm.footballclubs.ankos.ClubUI
import burhanarifm.footballclubs.utils.domains.Club
import burhanarifm.footballclubs.utils.holders.ClubHolder
import org.jetbrains.anko.AnkoContext

class RecyclerViewAdapter(private val context: Context, private val clubs: List<Club>, private val listener: (Club) -> Unit)
    : RecyclerView.Adapter<ClubHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ClubHolder {
        return ClubHolder(ClubUI().createView(AnkoContext.create(parent.context)))
    }

    override fun onBindViewHolder(holder: ClubHolder, position: Int) {
        holder.bind(clubs[position], listener)
    }

    override fun getItemCount(): Int = clubs.size
}