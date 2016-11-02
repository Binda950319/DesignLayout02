package com.wbh.day36_designlayout02.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wbh.day36_designlayout02.R;

import java.util.List;

/**
 * Created by Administrator on 2016/10/16.
 */
public class MyDataAdapter extends RecyclerView.Adapter<MyDataAdapter.MyViewHolder> {
    private List<String> list;
    private Context context;

    public MyDataAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = new TextView(context);
        textView.setTextSize(20);
        textView.setId(R.id.text_tv);
        return new MyViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text_tv);
        }
    }
}
