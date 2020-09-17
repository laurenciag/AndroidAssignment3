package com.example.assignmentandroid3.Adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.assignmentandroid3.Entity.Contact;
import com.example.assignmentandroid3.R;

public class DetailContact extends AppCompatActivity {

    TextView id, name, email, address, gender, mobile, home, office;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_contact);

        id = findViewById(R.id.getId);
        name = findViewById(R.id.getName);
        email = findViewById(R.id.getEmail);
        address = findViewById(R.id.getAddress);
        gender = findViewById(R.id.getGender);
        mobile = findViewById(R.id.getMobile);
        home = findViewById(R.id.getHome);
        office = findViewById(R.id.getOffice);

        Contact contacts =(Contact) getIntent().getSerializableExtra("contactDetail");

        id.setText(contacts.getId());
        name.setText(contacts.getName());
        email.setText(contacts.getEmail());
        address.setText(contacts.getAddress());
        gender.setText(contacts.getGender());
        mobile.setText(contacts.getPhone().getMobile());
    }
}