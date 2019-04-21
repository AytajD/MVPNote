package com.dadashova.aytaj.callsignature.Containers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.Fragments.CreatedSignatureFragment;
import com.dadashova.aytaj.callsignature.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ClickedSignatureBottomSheet extends BottomSheetDialogFragment {

    public static final String SELECKTED_SIGNATURE_KEY = "signature";

    @BindView(R.id.text_clicked_signature)
    TextView mSignature;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.signature_click_bottom_sheet, container, false);
        ButterKnife.bind(this, view);

        if (getArguments()!=null){

            String str = getArguments().getString(SELECKTED_SIGNATURE_KEY);
            mSignature.setText(str);

        }


        return view;
    }

    @OnClick(R.id.text_activate)
    public void onActivateClicked(TextView mActivate) {

        Bundle bundle = new Bundle();
        bundle.putString("activate", mSignature.toString());
// set Fragmentclass Arguments
        CreatedSignatureFragment fragobj = new CreatedSignatureFragment();
        fragobj.setArguments(bundle);

        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragobj).commit();


    }
}
