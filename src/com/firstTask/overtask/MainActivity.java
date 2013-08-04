package com.firstTask.overtask;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView textView;
	private RelativeLayout relativeLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView) findViewById(R.id.text_view);
		textView.setTextSize(40);
		
		relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void changeColor(View view) {
		Random rand = new Random();
		int red = (int) rand.nextInt() * 255;
		int green = (int) rand.nextInt() * 255;
		int blue = (int) rand.nextInt() * 255;
		
		relativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
	}

}
