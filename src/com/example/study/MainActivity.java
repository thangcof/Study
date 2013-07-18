package com.example.study;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button button1;
	EditText editText1;
	EditText editText2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.button1);
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void insert(View view) {
		String name  = (String) this.editText1.getText().toString();
		String id  = (String) this.editText2.getText().toString();
		Log.v("thangcof", name);
		Log.v("thangcof", id);
		
		MyDB myDB = new MyDB(this);
		myDB.createRecords(id, name);
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.itemAdd:
			return true;
		case R.id.itemRefresh:
			//do something when this button is pressed
			return true;
		case R.id.itemHelp:
			//do something when this button is pressed
			return true;
		default: 
			return true;
		}	
	}

}
