package com.example.aula01;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityDois extends Activity {
	
	private String nome; 
	private String curso;
	private String idade;
	private String numero;
	
	Button salvar;
	Button editar;
	Button ligar;
	Button camera;
	
	TextView nomeView;
	TextView cursoView;
	TextView idadeView;
	TextView numeroView;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitydois);
		
		Bundle b = getIntent().getExtras();
		this.nome = b.getString("nome");
		this.curso = b.getString("curso");
		this.idade = b.getString("idade");
		this.numero = b.getString("numero");
		Log.i("nome: ", nome);
		
		ligar = (Button) findViewById(R.id.ligar);
		
		salvar = (Button) findViewById(R.id.salvar);
		editar = (Button) findViewById(R.id.editar);
		camera = (Button) findViewById(R.id.camera);
		
		nomeView = (TextView) findViewById(R.id.textNome);
		cursoView = (TextView) findViewById(R.id.textCurso);
		idadeView = (TextView) findViewById(R.id.textIdade);
		numeroView = (TextView) findViewById(R.id.textNumero);
		
		nomeView.setText(nome);
		cursoView.setText(curso);
		idadeView.setText(idade);
		numeroView.setText(numero);
		
		camera.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
				startActivity(i);	
			}
		});
		
		ligar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ numero));
				startActivity(i);
				
			}
		});
		
		
		editar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActivityDois.this, MainActivity.class);
				startActivity(intent);
				
			}
		});
			
		
	}
}
