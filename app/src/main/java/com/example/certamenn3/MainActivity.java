package com.example.certamenn3;

import static com.example.certamenn3.R.layout.activity_producto_registrado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
//A tener en cuenta:
// 1) Para pasar de un Activity a otro usar metodo: Intent "variable" = new Intent(parametros)
// 2) Para cargar un Spinner crear array de datos: String [] "variable" = {aqui ingresas los datos}
// 3) Luego deben crear un ArrayAdapter<String> adaptador = new ArrayAdapter<>(parametros)
// 4) Finalmente deben asignar el adaptador a su Spinner
// 5) Recuerden tambien que para pasar los datos de un activity a otro se utiliza el metodo Put.Extra()


public class MainActivity extends AppCompatActivity {

    EditText Codigo, Nproducto, Pproducto;
    Button Buscar, Registrar;
    String [] adaptador = {"Seleccione:", "Rack Monitores", "Rack Hardware", "Rack Perifericos", "Rack Gabinetes", "Rack Accesorios"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Codigo = findViewById(R.id.txtCodigoProducto);
        Nproducto = findViewById(R.id.txtNombreProducto);
        Pproducto = findViewById(R.id.txtPrecioProducto);
        Buscar = findViewById(R.id.btnBuscar);
        Registrar = findViewById(R.id.btnRegistrar);
        String PRODMOUSELOGI;

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
        //Actualizacion de codigo

    }
    public void Registrar (View view) {
        String Codigo = Pproducto.getText().toString();
        Codigo = "PRODMOUSELOGI";


        if (Codigo == "PRODMOUSELOGI") {

            return;
        }
    }
    public void Cambio(View view){
        Intent Registrar = new Intent(this, com.example.certamenn3.Producto_Registrado.class);
        startActivity(registrar);

    }
}