package org.csuf.cpsc411.simplehttpclient

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SummaryEditorScreenActivity: SummaryScreenActivity() {

    //lateinit var pService : PersonService
    //lateinit var customAdapter : CustomAdapter
    //lateinit var summaryView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //
        setContentView(R.layout.summary_activity)
        //
        pService = PersonService.getInstance(this)
        customAdapter = CustomHybridAdapter(pService)
        summaryView = findViewById(R.id.summary_view)
        summaryView.adapter = customAdapter
        customAdapter.updateData()
    }
}