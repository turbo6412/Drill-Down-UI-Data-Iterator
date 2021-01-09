package org.csuf.cpsc411.simplehttpclient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HybridUIActivity : AppCompatActivity() {

    lateinit var root : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //
        root = LinearLayout(this)
        val rParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        root.orientation = LinearLayout.VERTICAL
        root.layoutParams = rParams

        // LayoutInfalter class
        val inflater = LayoutInflater.from(this)
        val view = inflater.inflate(R.layout.first_name_row, root, false)
        root.addView(view)
        setContentView(root)
    }
}