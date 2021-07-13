package com.vaca.recyclerviewfoot


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Fuck (var context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    private val TYPE_ITEM = 0 //正常的Item

    private val TYPE_FOOT = 1 //尾部刷新


    private val mDatas= arrayListOf<String>()

init {
    mDatas.add("fuck")
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_ITEM) {
            return ItemHolder(mInflater.inflate(R.layout.item_home_member, parent, false));
        } else {
            return FootHolder(mInflater.inflate(R.layout.fw, parent, false));
        }
    }


    internal class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val tv_item: TextView
//
//        init {
//            tv_item = itemView.findViewById(R.id.tv_item)
//        }
    }

    internal class FootHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val tv_foot: TextView
//        private val iv_foot: ImageView
//
//        init {
//            tv_foot = itemView.findViewById(R.id.tv_foot)
//            iv_foot = itemView.findViewById(R.id.iv_foot)
//        }
    }

    override fun getItemCount(): Int {
        return mDatas!!.size+1
    }


    override fun getItemViewType(position: Int): Int {
        if (position == itemCount - 1) {
            return TYPE_FOOT;
        }
        return TYPE_ITEM;
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }
}