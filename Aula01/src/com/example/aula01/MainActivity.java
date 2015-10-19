package com.example.aula01;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button salvar;
	Button next;
	EditText editNome;
	EditText editCurso;
	EditText editIdade;
	EditText editNumero;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		salvar = (Button) findViewById(R.id.salvar);
		next = (Button) findViewById(R.id.next);
		editNome = (EditText) findViewById(R.id.editNome);	
		editCurso = (EditText) findViewById(R.id.editCurso);
		editIdade = (EditText) findViewById(R.id.editIdade);
		editNumero = (EditText) findViewById(R.id.editNumero);
		
		
		
		salvar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Nome: "+ editNome.getText() +"." + "\n" + "Curso: " +editCurso.getText()+"."+"\n" , Toast.LENGTH_LONG).show();
					
			}
		});
		
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				
				String nome = editNome.getText().toString();
				String curso = editCurso.getText().toString();
				String idade = editIdade.getText().toString();
				String numero = editNumero.getText().toString();
				
				intent.setClass(MainActivity.this, ActivityDois.class);
				intent.putExtra("nome", nome);
				intent.putExtra("curso", curso);
				intent.putExtra("idade", idade);
				intent.putExtra("numero", numero);
				
				
				startActivity(intent);

			}
		});
	}	
	
	

}
