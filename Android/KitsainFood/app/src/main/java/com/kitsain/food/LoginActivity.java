package com.kitsain.food;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.login_activity);

      //on click login button
      findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            //TODO check username and password not empty and to login process

            //this only demo code.
            finish();
         }
      });
   }


}
