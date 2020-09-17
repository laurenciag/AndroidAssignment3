package com.example.assignmentandroid3.Util;

import com.example.assignmentandroid3.Service.ClientService;
import com.example.assignmentandroid3.Service.ContactService;

public class ContactUtil {
    public ContactUtil() {
    }

    public ContactService getContacts(){
        return ClientService.getClient().create(ContactService.class);
    }
}
