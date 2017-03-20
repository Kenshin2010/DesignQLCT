package vn.manroid.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import vn.manroid.qlct.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);


    }
}
