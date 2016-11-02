package com.wbh.day36_designlayout02;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wbh.day36_designlayout02.adapter.MyDataAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {


    private View view;
    private RecyclerView recyclerView;
    private List<String> list = new ArrayList<>();
    private MyDataAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_my, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerVIew);
        initData();
        return view;
    }

    private void initData() {
        for (int i = 0; i < 100; i++) {
            list.add("******" + i + "******");
        }
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        adapter = new MyDataAdapter(list, getActivity());
        recyclerView.setAdapter(adapter);
    }

}
