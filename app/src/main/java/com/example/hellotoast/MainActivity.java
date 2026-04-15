package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int count = 0; // Variable pour stocker la valeur actuelle du compteur
    private TextView textCount;  // Référence vers le TextView qui affiche le compteur à l'écran

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Lie ce fichier Java au layout XML (activity_main.xml)

        // Récupération des composants du XML grâce à leurs identifiants
        textCount = findViewById(R.id.txt_count);
        Button buttonToast = findViewById(R.id.btn_message);
        Button buttonCount = findViewById(R.id.btn_incrementer);

        buttonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
        });  // Lorsque l'utilisateur clique sur le bouton Afficher un message
        // → affiche un message temporaire "Hello Toast!" à l'écran

        buttonCount.setOnClickListener(v -> {
            count++;
            textCount.setText(String.valueOf(count)); // convertit l'int en String et l'affiche
        });  // Lorsque l'utilisateur clique sur le bouton Incrémenter le compteur
        // → incrémente le compteur de 1 et met à jour l'affichage
    }
}