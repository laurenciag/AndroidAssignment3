package com.example.assignmentandroid3.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignmentandroid3.Entity.Contact;
import com.example.assignmentandroid3.R;
import com.example.assignmentandroid3.ViewHolder.ContactsView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactsView> {

    private List<Contact> contacts;
    private Context ctx;

    public ContactAdapter(List<Contact> contacts, Context ctx) {
        this.contacts = contacts;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ContactsView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_detail_contact,parent,false);
        return new ContactsView(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsView holder, final int position) {
        final TextView name = holder.name;
        TextView email = holder.email;
        TextView mobile = holder.mobile;

        name.setText(contacts.get(position).getName());
        email.setText(contacts.get(position).getEmail());
        mobile.setText(contacts.get(position).getPhone().getMobile());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent detailUser = new Intent(ctx, DetailContact.class);
//                detailUser.putExtra("userDetail",contacts.get(position));
//                ctx.startActivity(detailUser);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
