package com.andromeda.hackme;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.andromeda.hackme.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Boolean admin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(v -> {
            AlertDialog.Builder ab= new AlertDialog.Builder(MainActivity.this);
            String content = "Admin değilsin! Şifreyi göremezsin.";
            if (isAdmin()){
                content = "Hoşgeldin Admin, Şifre 123456 kimseye söyleme!";
            }
            ab.setMessage(content);
            ab.setPositiveButton("Kapat",null);
            ab.setTitle("Durum");
            ab.create().show();
        });
    }

    Boolean isAdmin(){
        return admin;
    }

}