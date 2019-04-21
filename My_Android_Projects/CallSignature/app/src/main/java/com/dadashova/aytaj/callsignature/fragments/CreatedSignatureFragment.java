package com.dadashova.aytaj.callsignature.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dadashova.aytaj.callsignature.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreatedSignatureFragment extends Fragment {


    public CreatedSignatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_created_signature, container, false);
    }

}
