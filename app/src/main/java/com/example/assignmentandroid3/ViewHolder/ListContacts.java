package com.example.assignmentandroid3.ViewHolder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.assignmentandroid3.Adapter.ContactAdapter;
import com.example.assignmentandroid3.Entity.Contact;
import com.example.assignmentandroid3.R;
import com.example.assignmentandroid3.Response.ContactsResponse;
import com.example.assignmentandroid3.Util.ContactUtil;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListContacts extends AppCompatActivity {

    Contact contact;
    RecyclerView recyclerView;
    ContactsView contactService;
    ContactsResponse contactsResponse;
    ContactAdapter contactAdapter;
    List<Contact> contacts = new ArrayList<>();
    ContactUtil contactUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_list_contacts);

        contactUtil = new ContactUtil();
        recyclerView = findViewById(R.id.contacts_recycler_view);

        RecyclerView.LayoutManager mLayoutManager= new LinearLayoutManager(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        contactUtil.getContacts().getContact().enqueue(new Callback<ContactsResponse>() {
            @Override
            public void onResponse(Call<ContactsResponse> call, Response<ContactsResponse> response) {
                contacts = response.body().getContacts();
                contactAdapter = new ContactAdapter(contacts, getApplicationContext());
                recyclerView.setAdapter(contactAdapter);
            }

            @Override
            public void onFailure(Call<ContactsResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }




}