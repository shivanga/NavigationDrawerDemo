package com.shivang.recyclerviewdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag1 extends Fragment {

    TextView textViewfr1;
    View view;
    public frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view=inflater.inflate(R.layout.fragment_frag1,container,false);
        textViewfr1=(TextView)view.findViewById(R.id.textView);

        String data=getArguments().getString("name");
        textViewfr1.setText(data);


       return view;
    }

}
