package com.matheushcd.conversordemoedas.contract

import android.content.Context
import com.matheushcd.conversordemoedas.model.CurrencyResult

interface CurrencyListContract {

    interface View {
        fun showProgress()
        fun hideProgress()
        fun showMsgError(msg: String)
        fun getContext(): Context
        fun loadRecycler(list: ArrayList<CurrencyResult>)
    }

    interface Presenter {
        fun setView(view: View)
        fun getList()
        fun onDestroy()
    }

}