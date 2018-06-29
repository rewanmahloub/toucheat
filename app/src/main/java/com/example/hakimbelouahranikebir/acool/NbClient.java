package com.example.hakimbelouahranikebir.acool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NbClient extends AppCompatActivity {

    private ImageView un;
    private ImageView deux;
    private ImageView trois;
    private ImageView quatre;
    private ImageView Suivant;
    private ImageView unperso;
    private ImageView deuxperso;
    private ImageView troisperso;
    private ImageView quatreperso;
    public int Client=0;
    private TextView nb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nb_client);

        this.un=(ImageView) findViewById(R.id.imageView);
        this.deux=(ImageView) findViewById(R.id.imageView2);
        this.trois=(ImageView)findViewById(R.id.imageView6);
        this.quatre=(ImageView)findViewById(R.id.imageView4);
        this.Suivant=(ImageView)findViewById(R.id.Suivant);
        this.unperso=(ImageView)findViewById(R.id.imageView5);
        this.deuxperso=(ImageView)findViewById(R.id.imageView7);
        this.troisperso=(ImageView)findViewById(R.id.imageView8);
        this.quatreperso=(ImageView)findViewById(R.id.imageView9);

        this.nb=(TextView)findViewById(R.id.nb);

        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Client=1;
                nb.setText("Vous êtes "+ Client +" personne");

            }
        });
        unperso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Client=1;
                nb.setText("Vous êtes "+ Client +" personne");

            }
        });

        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Client=2;
                nb.setText("Vous êtes "+ Client +" personnes");

            }
        });

        deuxperso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Client=2;
                nb.setText("Vous êtes "+ Client +" personnes");

            }
        });

        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Client=3;
                nb.setText("Vous êtes "+ Client +" personnes");

            }
        });

        troisperso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Client=3;
                nb.setText("Vous êtes "+ Client +" personnes");

            }
        });

        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Client=4;
                nb.setText("Vous êtes "+ Client +" personnes");

            }
        });

        quatreperso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Client=4;
                nb.setText("Vous êtes "+ Client +" personnes");

            }
        });

            Suivant.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent Home = new Intent(getApplicationContext(), Menu.class);
                    startActivity(Home);
                    finish();

                }


            });


    }
}
