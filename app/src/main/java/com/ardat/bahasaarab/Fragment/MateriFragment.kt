package com.ardat.bahasaarab.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.ardat.bahasaarab.Adapter.ListDataAdapter
import com.ardat.bahasaarab.Data.DataList
import com.ardat.bahasaarab.Data.ModelData
import com.ardat.bahasaarab.R

class MateriFragment : Fragment() {
    private var fragmentView: View? = null

    private var list: ArrayList<ModelData> = arrayListOf()
    private var materi_list: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_materi, container, false)

        init()
        return fragmentView
    }

    fun init(){
        materi_list = fragmentView?.findViewById(R.id.materi_list)
        materi_list?.setHasFixedSize(true)

        list.addAll(DataList.listData)

        materi_list?.layoutManager = LinearLayoutManager(context)
        val adapter = ListDataAdapter(context!!, list)
        materi_list?.adapter = adapter
    }
}