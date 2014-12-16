package com.vivek.github.Quiz;
import com.vivek.github.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.RatingBar;
import android.widget.TextView;
public class Result extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		TextView t=(TextView)findViewById(R.id.textResult);
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		//displaying score :D , Good luck!
		switch (score)
		{
		case 1: t.setText("Total score : 1/30");
		break;
		case 2: t.setText("Total score : 2/30");
		break;
		case 3:t.setText("Total score : 3/30");
		break;
		case 4:t.setText("Total score : 4/30");
		break;
		case 5:t.setText("Total score : 5/30");
		break;
		case 6: t.setText("Total score : 6/30");
		break;
		case 7: t.setText("Total score : 7/30");
		break;
		case 8:t.setText("Total score : 8/30");
		break;
		case 9:t.setText("Total score : 9/30");
		break;
		case 10:t.setText("Total score : 10/30");
		break;
		
		case 11: t.setText("Total score : 11/30");
		break;
		case 12: t.setText("Total score : 12/30");
		break;
		case 13:t.setText("Total score : 13/30");
		break;
		case 14:t.setText("Total score : 14/30");
		break;
		case 15:t.setText("Total score : 15/30");
		break;
		case 16: t.setText("Total score : 16/30");
		break;
		case 17: t.setText("Total score : 17/30");
		break;
		case 18:t.setText("Total score : 18/30");
		break;
		case 19:t.setText("Total score : 19/30");
		break;
		case 20:t.setText("Total score : 20/30");
		break;
		
		case 21: t.setText("Total score : 21/30");
		break;
		case 22: t.setText("Total score : 22/30");
		break;
		case 23:t.setText("Total score : 23/30");
		break;
		case 24:t.setText("Total score : 24/30");
		break;
		case 25:t.setText("Total score : 25/30");
		break;
		case 26: t.setText("Total score : 26/30");
		break;
		case 27: t.setText("Total score : 27/30");
		break;
		case 28:t.setText("Total score : 28/30");
		break;
		case 29:t.setText("Total score : 29/30");
		break;
		case 30:t.setText("Total score : 30/30");
		break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}
}
