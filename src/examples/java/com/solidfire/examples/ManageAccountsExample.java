package com.solidfire.examples;

import com.solidfire.client.ElementFactory;
import com.solidfire.element.api.*;

public class ManageAccountsExample {
    public static void main(String[] args) {
        // Create Connection to SF Cluster
        SolidFireElement sfe = ElementFactory.create("mvip", "username", "password", "8.0");


        // create the request object but leave all properties as default
        ListAccountsRequest listAccountsRequest = ListAccountsRequest.builder().build();

        // send the request and gather the result
        ListAccountsResult listAccountsResult = sfe.listAccounts(listAccountsRequest);

        // iterate the accounts array on the result object and display each account
        for (Account account : listAccountsResult.getAccounts()) {
            System.out.println(account);
        }


        // send the request and gather the result
        GetAccountResult getAccountResult = sfe.getAccountByID(1L);

        // display the account from the result object
        System.out.println(getAccountResult.getAccount());


        // send the request and gather the result
        GetAccountResult getAccountResult1 = sfe.getAccountByName("username-of-account");

        // display the account from the result object
        System.out.println(getAccountResult1.getAccount());


        // create a request object and set the username property
        AddAccountRequest addAccountRequest = AddAccountRequest.builder()
                                                               .username("my-new-account")
                                                               .build();

        // send the request and gather the result
        AddAccountResult addAccountResult = sfe.addAccount(addAccountRequest);

        // grab the account ID from the result object
        Long newAccountId = addAccountResult.getAccountID();

        
        // create a request object and set the username property
        AddAccountRequest addAccountRequest1 = AddAccountRequest.builder()
                                                                .username("my-new-account-1")
                                                                .optionalInitiatorSecret(new CHAPSecret("a12To16charvalue"))
                                                                .build();
        
        // send the request and gather the result
        AddAccountResult addAccountResult1 = sfe.addAccount(addAccountRequest1);

        // grab the account ID from the result object
        Long newAccountId1 = addAccountResult.getAccountID();

        
        // create a request object and set the username property
        ModifyAccountRequest modifyAccountRequestt = ModifyAccountRequest.builder()
                                                                         .accountID(newAccountId1)
                                                                         .optionalTargetSecret(CHAPSecret.autoGenerate())
                                                                         .build();

        // send the request
        sfe.modifyAccount(modifyAccountRequestt);
    }
}