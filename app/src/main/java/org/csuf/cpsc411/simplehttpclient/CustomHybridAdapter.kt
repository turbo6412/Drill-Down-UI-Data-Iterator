package org.csuf.cpsc411.simplehttpclient

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CustomHybridAdapter(pService : PersonService): CustomAdapter(pService) {
    //
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        lateinit var view: View
        val inflater = LayoutInflater.from(parent?.context)
        view = inflater.inflate(R.layout.summary_row, parent, false)
        //
        val pObj = pService.personList[position]
        val label = "${pObj.firstName} ${pObj.lastName}"
        val lblView : TextView = view.findViewById(R.id.lblTxtId)
        lblView.text = label

        return view
    }
}