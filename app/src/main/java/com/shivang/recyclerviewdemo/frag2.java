package com.shivang.recyclerviewdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag2 extends Fragment {

    TextView textViewfr1;

    public frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag2,container,false);
        textViewfr1=(TextView)view.findViewById(R.id.textView);

        String data=getArguments().getString("name");
        textViewfr1.setText(data);
        return view;
    }

}
