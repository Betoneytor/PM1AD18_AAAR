package angel.alberto.miapplicationusodebuild;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.M){

            Toast.makeText(this,"Tu version de Android es la Marsmallow",Toast.LENGTH_LONG).show();
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P){

            Toast.makeText(this,"Tu version de Android es la Menor que la Pie",Toast.LENGTH_LONG).show();
        }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.DONUT){

            Toast.makeText(this,"Tu version de Android es mayor a la Donut XD",Toast.LENGTH_LONG).show();
        }
    }
}
