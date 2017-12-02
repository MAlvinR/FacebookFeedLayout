package id.malvinr.facebookfeedlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_feed.*
import org.jetbrains.anko.startActivity

class FeedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        commentContainer.setOnClickListener { v->
            startActivity<CommentActivity>()
        }
    }
}