package com.example.assignmentandroid3.Response;

import com.example.assignmentandroid3.Entity.Contact;

import java.util.List;

public class ContactsResponse {
    private List<Contact> contacts;

    public ContactsResponse() {
    }

    public ContactsResponse(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
