package com.spacECE.spaceceedu.Authentication;

import android.util.Log;

public class Account {
    static private String account_id=null;
    static private String username=null;
    static private String contact_number=null;
    static private String profile_pic=null;
    static private boolean CONSULTANT;
    static private String U_ID;

    public Account(String account_id, String username, String contact_number, boolean CONSULTANT, String profile_pic, String U_ID) {
        this.account_id = account_id;
        this.username = username;
        this.contact_number = contact_number;
        this.CONSULTANT = CONSULTANT;
        this.profile_pic= profile_pic;
        this.U_ID=U_ID;
        Log.i("ACCOUNT:", " GENERATED :- "+account_id+" / "+username+" / "+contact_number);
    }

    public Account(String account_id, String username, String contact_number) {
        this.account_id = account_id;
        this.username = username;
        this.contact_number = contact_number;
        this.CONSULTANT = false;
        Log.i("ACCOUNT:", " GENERATED :- "+account_id+" / "+username+" / "+contact_number);
    }

    public String getuId() {
        return U_ID;
    }

    public String getAccount_id() {
        return account_id;
    }

    public String getUsername() {
        return username;
    }

    public String getContact_number() {
        return contact_number;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public boolean isCONSULTANT() {
        return CONSULTANT;
    }
}

