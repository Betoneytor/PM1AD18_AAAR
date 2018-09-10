package angel.alberto.loginpasedeargumetos.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import angel.alberto.loginpasedeargumetos.R;
import angel.alberto.loginpasedeargumetos.models.Usuario;

public class MainActivity extends Activity {
    public static final int LOGIN_INTENT_CODE = 20;
    public static final int ALUMNOS_INTENT_CODE = 25;

    TextView txtNombre;
    TextView txtApellidos;
    TextView txtMatricula;
    TextView txtCarrera;
    TextView txtSemestre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre= (TextView) findViewById(R.id.txtNombre);
        txtApellidos= (TextView) findViewById(R.id.txtApellidos);
        txtMatricula= (TextView) findViewById(R.id.txtMatricula);
        txtCarrera= (TextView) findViewById(R.id.txtCarrera);
        txtSemestre= (TextView) findViewById(R.id.txtSemestre);
        Intent loginIntent = new Intent(MainActivity.this,Login.class);
        startActivityForResult(loginIntent,LOGIN_INTENT_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==LOGIN_INTENT_CODE){
            // Programar lo que hay que hacer cuando regrese el usuario y contraseña

            Usuario res =(Usuario) data.getSerializableExtra("usRes");
            if (res!=null){
                Toast.makeText(this,"Bienvenido Usuario :D" ,Toast.LENGTH_LONG).show();
            txtNombre.setText("Nombre: "+res.getNombre());
            txtApellidos.setText("Apellido: "+res.getApellido());
            txtMatricula.setText("Matricula: "+res.getMatricula());
            txtCarrera.setText("Carrera: "+res.getCarrera());
            txtSemestre.setText("Semestre: "+res.getSemestre());


            }else{
                Toast.makeText(this,"Autenticacion Fallida, Vuelva a intentarlo" ,Toast.LENGTH_LONG).show();
                Intent loginIntent = new Intent(MainActivity.this,Login.class);
                startActivityForResult(loginIntent,LOGIN_INTENT_CODE);
            }

        }
    }
}
