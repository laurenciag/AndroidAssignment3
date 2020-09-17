package com.example.assignmentandroid3.Service;

import com.example.assignmentandroid3.Response.ContactsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContactService {
    @GET("/contacts")
    Call<ContactsResponse> getContact();

}
