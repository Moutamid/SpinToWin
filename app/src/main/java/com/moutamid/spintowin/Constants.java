package com.moutamid.spintowin;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Constants {

    public static final String IS_TERMS_ACCEPTED = "IS_TERMS_ACCEPTED";

    public static FirebaseAuth auth() {
        return FirebaseAuth.getInstance();
    }

    public static DatabaseReference databaseReference() {
        DatabaseReference db = FirebaseDatabase.getInstance().getReference().child("SpinToWin");
        db.keepSynced(true);
        return db;
    }
}
