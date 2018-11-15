package burhanarifm.footballclubs.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import burhanarifm.footballclubs.ankos.DetailsUI
import org.jetbrains.anko.setContentView

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailsUI(intent).setContentView(this)
    }
}