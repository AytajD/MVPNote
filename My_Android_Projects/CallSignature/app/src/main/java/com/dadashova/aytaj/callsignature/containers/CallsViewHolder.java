package com.dadashova.aytaj.callsignature.Containers;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dadashova.aytaj.callsignature.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);

    }

    @BindView(R.id.image_profile)
    ImageView mProfileImage;
    @BindView(R.id.text_phone_number)
    TextView mName;
    @BindView(R.id.text_date)
    TextView mDate;
    @BindView(R.id.image_call_type)
    ImageView mCallType;
    @BindView(R.id.text_signature)
    TextView mSignature;
}
