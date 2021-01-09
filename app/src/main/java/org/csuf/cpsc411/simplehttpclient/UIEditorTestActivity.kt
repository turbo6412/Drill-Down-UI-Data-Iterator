package org.csuf.cpsc411.simplehttpclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class UIEditorTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //
        setContentView(R.layout.test_activity)

        // Control logic
        var fnval : TextView = findViewById(R.id.firstNameVal)
        fnval.text = "James"
        var lnval : TextView = findViewById(R.id.lastNameVal)
        lnval.text = "Shen"

        var btn : Button = findViewById(R.id.addButton)
        btn.setOnClickListener {

        }
    }
}