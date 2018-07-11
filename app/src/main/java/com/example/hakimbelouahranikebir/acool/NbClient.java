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
    private ImageView accueil;
    private int Client=0;
    private TextView nb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nbclient);

        this.un=(ImageView) findViewById(R.id.unepers);
        this.deux=(ImageView) findViewById(R.id.deuxpers);
        this.trois=(ImageView)findViewById(R.id.troispers);
        this.quatre=(ImageView)findViewById(R.id.quatrepers);
        this.Suivant=(ImageView)findViewById(R.id.suivant);
        this.accueil=(ImageView)findViewById(R.id.accueil);

        this.nb=(TextView)findViewById(R.id.nb);

        un.setOnClickListener(new View.OnClickListener() {
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



        trois.setOnClickListener(new View.OnClickListener() {
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


            Suivant.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent Home = new Intent(getApplicationContext(), Menu.class);
                    startActivity(Home);
                    finish();

                }


            });

        accueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent Home = new Intent(getApplicationContext(), MainActivity.class);
                getIntent().putExtra("NbClient",Client);
                startActivity(Home);
                finish();

            }


        });


    }
}
