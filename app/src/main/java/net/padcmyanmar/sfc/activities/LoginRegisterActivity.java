package net.padcmyanmar.sfc.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import net.padcmyanmar.sfc.R;

import butterknife.ButterKnife;

/**
 * Created by yekokohtet on 11/26/17.
 */

public class LoginRegisterActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        ButterKnife.bind(this, this);
    }
}
