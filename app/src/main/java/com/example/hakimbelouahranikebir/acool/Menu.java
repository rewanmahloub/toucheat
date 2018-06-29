package com.example.hakimbelouahranikebir.acool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    private ImageView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.menu=(ImageView) findViewById(R.id.menu);



        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Home = new Intent(getApplicationContext(), Menus.class);
                startActivity(Home);
                finish();

            }


        });
    }

}

