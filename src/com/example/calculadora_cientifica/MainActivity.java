package com.example.calculadora_cientifica;

import android.support.v7.app.ActionBarActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
		
			public void onIngresar(View v) {
			Intent inte=new Intent();
			inte.setClass(this, CalculadoraCientifica.class);
			inte.setClass(this, CalculadoraBasica.class);
			
			startActivity(inte);
		
				// TODO Auto-generated method stub
				
			}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// traer los stickers 
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			
			Intent inte=new Intent();
			inte.putExtra("txtusuarioX","Dato1");
			inte.putExtra("txtClaveX","Dato2");
			inte.setClass(this,MainActivity.class);
			startActivity(inte);
			
			return true;
		}
		
		if (id == R.id.action_opt1) {
			System.exit(0);
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
