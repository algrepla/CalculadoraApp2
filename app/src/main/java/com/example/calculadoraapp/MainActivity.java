package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    int numero1 = 0;
    int numero2 = 0;
    String operacion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);

    }
    public void EscribirCero(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("0");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "0");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("0");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "0");
            }
        }

    }
    public void EscribirUno(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("1");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "1");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("1");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "1");
            }
        }
    }
    public void EscribirDos(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("2");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "2");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("2");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "2");
            }
        }
    }
    public void EscribirTres(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("3");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "3");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("3");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "3");
            }
        }
    }
    public void EscribirCuatro(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("4");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "4");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("4");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "4");
            }
        }
    }
    public void EscribirCinco(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("5");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "5");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("5");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "5");
            }
        }
    }
    public void EscribirSeis(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("6");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "6");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("6");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "6");
            }
        }
    }
    public void EscribirSiete(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("7");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "7");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("7");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "7");
            }
        }
        if(numero1 == 0){
            tvResultado.setText("7");
        }
        else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }
    public void EscribirOcho(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("8");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "8");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("8");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "8");
            }
        }
    }
    public void EscribirNueve(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());

        if(operacion.equals("")){
            if(numero1 == 0){
                tvResultado.setText("9");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "9");
            }
        }else{
            if(numero2 == 0){
                tvResultado.setText("9");
            }
            else{
                tvResultado.setText(tvResultado.getText() + "9");
            }
        }
    }
    public void LimpiarResultado(View View){
        tvResultado.setText("0");
        numero1 = 0;
        numero2 = 0;
        operacion ="";
    }
    public void OperacionDividir(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        operacion ="/";
        tvResultado.setText("0");
        
    }
    public void OperacionRestar(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        operacion = "-";
        tvResultado.setText("0");
    }
    public void MostrarResultado(View view){
        numero1 = Integer.parseInt(tvResultado.getText().toString());
        numero2 = Integer.parseInt(tvResultado.getText().toString());
        if(operacion.equals("/")){

                int result = numero1 / numero2;
                tvResultado.setText (result+"");

        } else if (operacion.equals("-")) {
            int result = numero1 - numero2;
            tvResultado.setText(result+"");

        }
    }
}