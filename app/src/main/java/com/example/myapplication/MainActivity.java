package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private AlertDialog dialog;
    private AlertDialog.Builder loginAlertDialog;
    private String Username;
    private String Password;
    private EditText UsernameEdit;
    private EditText PasswordEdit;
    private View alertDialogView;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertDialogView = getLayoutInflater().inflate(R.layout.alertdialog, null, false);
        Button LoginButton = (Button) findViewById(R.id.button_login);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.app_name, Toast.LENGTH_LONG).show();
                loginAlertDialog = new AlertDialog.Builder(MainActivity.this);
                dialog = loginAlertDialog.create();
                loginAlertDialog.setView(alertDialogView);
                loginAlertDialog.setCancelable(true);


                loginAlertDialog.show();

            }

        });

    }

}
