package com.example.gmail_clone;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ContactModel> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#d93025")));
        bar.setDisplayShowHomeEnabled(true);
        bar.setIcon(R.drawable.ic_narbar);
        bar.setDisplayUseLogoEnabled(true);
        bar.setTitle("  Inbox");
        contacts=new ArrayList<>();
        contacts.add(new ContactModel(0,"Edurila.com","Fỉrst 10 spots","contact1"));
        contacts.add(new ContactModel(1,"Edurila.com","Fỉrst 10 spots","contact1"));
        contacts.add(new ContactModel(2,"Edurila.com","Fỉrst 10 spots","contact1"));
        contacts.add(new ContactModel(3,"Edurila.com","Fỉrst 10 spots","contact1"));
    }
}
