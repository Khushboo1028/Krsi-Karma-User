package com.krsikarma.app.Activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.krsikarma.app.R;

public class PrivacyPolicy extends AppCompatActivity {

    public static final String TAG = "PrivacyPolicy";
    String textHeading;

    WebView webView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        init();

        if(textHeading.equals(getString(R.string.privacy_policy))){
            url = "https://sites.google.com/view/krsi-karma-privacy-policy/home";
        }else{

            //TODO: Change to terms of use url
            url = "https://sites.google.com/view/krsi-karma-privacy-policy/home";
        }

        webView.loadUrl(url);
    }

    private void init(){
        textHeading = getIntent().getStringExtra("textHeading");
        webView = (WebView) findViewById(R.id.webView);
    }


}