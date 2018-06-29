package com.example.hakimbelouahranikebir.acool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Menus extends AppCompatActivity {

    private ImageView Menus;
    private Button Cheese;
    private Button Double;
    private Button Le180;
    private Button Supreme;
    private Button Chevre;
    private Button Accueil;
    private Button Country;
    public double Prix;
    private TextView facture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        this.Cheese= (Button) findViewById(R.id.Cheese);
        this.Double=(Button) findViewById(R.id.Double);
        this.Le180=(Button) findViewById(R.id.Le180);
        this.Supreme=(Button) findViewById(R.id.Supreme);
        this.Chevre=(Button) findViewById(R.id.Chevre);
        this.Accueil=(Button) findViewById(R.id.Accueil);
        this.Country=(Button) findViewById(R.id.Country);

        Prix=0;

        Cheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Prix=Prix+4.5;
                facture.setText("Vous devez payez "+ Prix +" personne");

            }
        });

        Double.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Prix=Prix+5.5;
                facture.setText("Vous devez payez "+ Prix +" personne");

            }
        });

        Le180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Prix=Prix+6.5;
                facture.setText("Vous devez payez "+ Prix +" personne");

            }
        });

        Supreme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Prix=Prix+6.5;
                facture.setText("Vous devez payez "+ Prix +" personne");

            }
        });

        Country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Prix=Prix+6;
                facture.setText("Vous devez payez "+ Prix +" personne");

            }
        });


        Chevre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Prix=Prix+6.5;
                facture.setText("Vous devez payez "+ Prix +" personne");

            }
        });





    }
}
