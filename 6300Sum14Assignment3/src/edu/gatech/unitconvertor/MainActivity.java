package edu.gatech.unitconvertor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void handleDistanceClick(View vew){
		Intent intent = new Intent(this,DistanceActivity.class);
		startActivity(intent);
	}
	
	public void handleWeightClick(View vew){
		Intent intent = new Intent(this,WeightActivity.class);
		startActivity(intent);
	}
	
	public void handleTemperatureClick(View vew){
		Intent intent = new Intent(this,TemperatureActivity.class);
		startActivity(intent);
	}
	
}

