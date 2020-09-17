package com.example.assignmentandroid3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.assignmentandroid3.Response.ContactsResponse;
import com.example.assignmentandroid3.ViewHolder.ListContacts;

import java.util.List;

public class MainActivity extends AppCompatActivity {
//    RecyclerView recyclerView;
//    List<Contact>
    ListContacts listContacts;
    ContactsResponse contactsResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        listContacts = new ListContacts();
    }
}