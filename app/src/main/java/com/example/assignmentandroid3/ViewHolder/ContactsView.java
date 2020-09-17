package com.example.assignmentandroid3.ViewHolder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignmentandroid3.R;

public class ContactsView extends RecyclerView.ViewHolder {
    public TextView id, name, email, address, gender, phone, mobile, home, office;
    public RelativeLayout relativeLayout;

    public ContactsView (View v){
        super(v);
        name = v.findViewById(R.id.name);
        email = v.findViewById(R.id.email);
        mobile = v.findViewById(R.id.mobile);
//        address = v.findViewById(R.id.address);
//        gender = v.findViewById(R.id.gender);

    }
}
