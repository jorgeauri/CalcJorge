package com.ads.calcjorge;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//variaveis
    Button btnZero, btnUm, btnDois, btnTres, btnQuatro, btnCinco, btnSeis, btnSete, btnOito,
            btnNove, btnPonto, btnIgual, btnAdicao, btnSubtracao, btnMulti, btnDiv, btnLimpar;
    EditText etProceso, etconcatenar;
    double numero1, numero2, resultado;
    String operador;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//associa as variaveis aos botoes vindo do layout
    btnZero = (Button)findViewById(R.id.numero_zero);
    btnUm = (Button)findViewById(R.id.numero_um);
    btnDois = (Button)findViewById(R.id.numero_dois);
    btnTres = (Button)findViewById(R.id.numero_tres);
    btnQuatro = (Button)findViewById(R.id.numero_quatro);
    btnCinco = (Button)findViewById(R.id.numero_cinco);
    btnSeis = (Button)findViewById(R.id.numero_seis);
    btnSete = (Button)findViewById(R.id.numero_sete);
    btnOito = (Button)findViewById(R.id.numero_oito);
    btnNove = (Button)findViewById(R.id.numero_nove);
    btnPonto = (Button)findViewById(R.id.ponto);
    btnIgual = (Button)findViewById(R.id.igual);
    btnAdicao = (Button)findViewById(R.id.adicao);
    btnSubtracao = (Button)findViewById(R.id.subtracao);
    btnMulti = (Button)findViewById(R.id.multiplicacao);
    btnDiv = (Button)findViewById(R.id.divisao);
    btnLimpar = (Button)findViewById(R.id.limpar);
    etProceso =(EditText)findViewById(R.id.etProceso);
//vincula os botes ao evento onClick
    btnZero.setOnClickListener(new View.OnClickListener(){
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v){
            etconcatenar =(EditText)findViewById(R.id.etProceso);
            etProceso.setText(etconcatenar.getText().toString() + "0");
        }
    });
    btnUm.setOnClickListener(new View.OnClickListener(){
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v){
            etconcatenar =(EditText)findViewById(R.id.etProceso);
            etProceso.setText(etconcatenar.getText().toString() + "1");
        }
    });
        btnDois.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        btnQuatro.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        btnSete.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });
        btnOito.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        });
        btnNove.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        });
        btnPonto.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                etconcatenar =(EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + ".");
            }
        });
//        vincula o botao de igual ao evento onClick e efetua a operação desejada
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero2 = Double.parseDouble(etconcatenar.getText().toString());
                if(operador.equals("+")){
                    etProceso.setText("");
                    resultado = numero1 + numero2;
                }
                if(operador.equals("-")){
                    etProceso.setText("");
                    resultado = numero1 - numero2;
                }
                if(operador.equals("*")){
                    etProceso.setText("");
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")){
                    etProceso.setText("");
                    if(numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        etProceso.setText("Infinito");
                    }
                }
                etProceso.setText(String.valueOf(resultado));
            }
        });
        btnAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });


    }
}