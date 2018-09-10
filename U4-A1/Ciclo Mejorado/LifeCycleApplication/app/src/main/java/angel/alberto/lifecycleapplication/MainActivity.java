package angel.alberto.lifecycleapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView txtState;
    Button btnIrSec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtState= (TextView) findViewById(R.id.txtState);
        btnIrSec=(Button)findViewById(R.id.btnIrSec);
        btnIrSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondaryScreen.class));
            }
        });
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show();
        txtState.setMovementMethod(new ScrollingMovementMethod());
        Log.d("Main_STATE", "OnCreate");
        txtState.setText(txtState.getText()+"\n OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();
        Log.d("Main_STATE", "OnStart");
        txtState.setText(txtState.getText()+"\n OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();
        Log.d("Main_STATE", "OnResume");
        txtState.setText(txtState.getText()+"\n OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show();
        Log.d("Main_STATE", "OnPause");
        txtState.setText(txtState.getText()+"\n OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"OnStop",Toast.LENGTH_SHORT).show();
        Log.d("Main_STATE", "OnStop");
        txtState.setText(txtState.getText()+"\n OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"OnRestart",Toast.LENGTH_SHORT).show();
        Log.d("Main_STATE", "OnRestart");
        txtState.setText(txtState.getText()+"\n OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show();
        Log.d("Main_STATE", "OnDestroy");
        txtState.setText(txtState.getText()+"\n OnDestroy");
    }
}
