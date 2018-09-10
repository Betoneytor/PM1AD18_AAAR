package angel.alberto.lifecycleapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondaryScreen extends Activity {
    TextView txtState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary_screen);
        txtState= (TextView) findViewById(R.id.txtStateV2);
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show();
        txtState.setMovementMethod(new ScrollingMovementMethod());
        Log.d("Secondary_STATE", "OnCreate");
        txtState.setText(txtState.getText()+"\n OnCreate");
    }
    public void clickBotonPrincipal(View view){
        startActivity(new Intent(SecondaryScreen.this,MainActivity.class));

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();
        Log.d("Secondary_STATE", "OnStart");
        txtState.setText(txtState.getText()+"\n OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();
        Log.d("Secondary_STATE", "OnResume");
        txtState.setText(txtState.getText()+"\n OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show();
        Log.d("Secondary_STATE", "OnPause");
        txtState.setText(txtState.getText()+"\n OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"OnStop",Toast.LENGTH_SHORT).show();
        Log.d("Secondary_STATE", "OnStop");
        txtState.setText(txtState.getText()+"\n OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"OnRestart",Toast.LENGTH_SHORT).show();
        Log.d("Secondary_STATE", "OnRestart");
        txtState.setText(txtState.getText()+"\n OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show();
        Log.d("Secondary_STATE", "OnDestroy");
        txtState.setText(txtState.getText()+"\n OnDestroy");
    }
}
