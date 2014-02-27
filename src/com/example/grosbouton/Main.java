package com.example.grosbouton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class Main extends Activity implements OnTouchListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//recuperer le bouton de R
		Button b = (Button) findViewById(R.id.bouton);
		//bind le bouton a un OnTouchListener
		b.setOnTouchListener(this);
		
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		
		/*A chaque fois que l'evement OnTouchListener est appele
		il nous donne la vue qui a ete appelee. Cela peut etre
		n'importe quel vue associee a OnTouchListener*/
		
		//recuperer notre bouton pour gerer les evements
		Button b = (Button) v;
		
		//get button width
		int w = b.getWidth();
		//get button height
		int h = b.getHeight();
		
		//get coordinates
		float x = event.getX();
		float y = event.getY();
		
		b.setTextSize(Math.abs(x - w/2) + Math.abs(y - h/2));
		
		return true;
	}

}
