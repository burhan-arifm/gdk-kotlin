package burhanarifm.footballclubs.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import burhanarifm.footballclubs.R
import burhanarifm.footballclubs.ankos.MainUI
import burhanarifm.footballclubs.utils.adapters.RecyclerViewAdapter
import burhanarifm.footballclubs.utils.domains.Club
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    //  Variable Declarations
    private var clubs: MutableList<Club> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initData()

        val adapter = RecyclerViewAdapter(this, clubs) {
            startActivity<DetailsActivity>("club_name" to it.name, "club_image" to it.image, "club_desc" to it.desc)
        }

        MainUI(adapter).setContentView(this)
    }

    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val desc = resources.getStringArray(R.array.club_desc)
        clubs.clear()
        for (i in name.indices) {
            clubs.add(
                Club(
                    name[i],
                    image.getResourceId(i, 0),
                    desc[i]
                )
            )
        }

        //Recycle the typed array
        image.recycle()
    }
}
