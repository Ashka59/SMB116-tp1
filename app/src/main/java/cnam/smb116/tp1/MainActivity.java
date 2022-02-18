package cnam.smb116.tp1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.io.CharArrayWriter;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText = findViewById(R.id.editTextId);
        this.editText.append("onCreate\n");
    }
    public void onClickStart(View v){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("onClickStart");
        alertDialog.setMessage("Démarrage d'une nouvelle activité, même code");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent = new Intent(MainActivity.this,MainActivity.class);  // création d'une autre activité avec le même code
                        startActivity(intent);
                    }
                });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Annuler",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    public void onClickFinish(View v){
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.editText.append("onStart\n");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        this.editText.append("onRestart\n");
    }
    @Override
    protected void onResume() {
        super.onResume();
        this.editText.append("onResume\n");
    }
    @Override
    protected void onPause() {
        super.onPause();
        this.editText.append("onPause\n");
    }
    @Override
    protected void onStop() {
        super.onStop();
        this.editText.append("onStop\n");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.editText.append("onDestroy\n");
    }
}