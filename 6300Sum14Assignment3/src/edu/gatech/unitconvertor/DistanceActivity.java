package edu.gatech.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class DistanceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_distance);
	}
	
	public void handleClick(View view){
		Boolean checked = ((RadioButton) view).isChecked();
		EditText myEditText = (EditText) findViewById(R.id.editText1);
		
		//try catch block to account for case where user presses button without entering a number or enters a non-number
		try{
		Double unit = Double.parseDouble(myEditText.getText().toString());

		switch(view.getId())
		{
		case R.id.radio0:
			if(checked)
			{
				myEditText.setText(kmToMiles(unit));  
				break;
			}
		
		case R.id.radio1:
			if(checked){
				
			myEditText.setText(milesToKM(unit));
			break;
		}
		}
		}
		catch(Exception e){
			return;
		}
		
	}
	
	protected String milesToKM(double miles){
		double km = miles*1.609;
		return String.valueOf(km);
	}
	
	protected String kmToMiles(double km){
		double miles = km/1.609;
		return String.valueOf(miles);
	}
}
