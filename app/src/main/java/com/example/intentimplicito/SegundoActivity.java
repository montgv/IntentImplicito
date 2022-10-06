package com.example.intentimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

import com.example.intentimplicito.databinding.ActivitySegundoBinding;

public class SegundoActivity extends AppCompatActivity {

    private ActivitySegundoBinding binding2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding2 = ActivitySegundoBinding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());
    }

    public void crearContacto(View view) {
        String nombre = binding2.txtNombre.getText().toString();
        String numTelefono = binding2.txtTelefono.getText().toString();
        String email = binding2.txtEmail.getText().toString();

        Intent intent = new Intent(Intent.ACTION_INSERT);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        intent.putExtra(ContactsContract.Intents.Insert.NAME, nombre);
        intent.putExtra(ContactsContract.Intents.Insert.PHONE, numTelefono);
        intent.putExtra(ContactsContract.Intents.Insert.EMAIL, email);
        startActivity(intent);
    }
}