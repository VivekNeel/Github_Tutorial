package com.vivek.github.Quiz;
import com.vivek.github.R;

import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
public class Quiz extends Activity {
	List<Question> quesList;
	int score=0;
	int control_v=0;
	Question current;
	TextView tex;
	RadioButton a, b, c;
	Button Next_Q;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.quiz);
		DatabaseHelper db=new DatabaseHelper(this);
		quesList=db.getAllQuestions();
		current=quesList.get(control_v);
		tex=(TextView)findViewById(R.id.textView1);
		a=(RadioButton)findViewById(R.id.radio0);
		b=(RadioButton)findViewById(R.id.radio1);
		c=(RadioButton)findViewById(R.id.radio2);
		Next_Q=(Button)findViewById(R.id.button1);
		setQuestionView();
		Next_Q.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);
				RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());
				Log.d("yourans", current.getANSWER()+" "+answer.getText());
				if(current.getANSWER().equals(answer.getText()))
				{
					score++;
					Log.d("score", "Your score"+score);
				}
				if(control_v<30){					
					current=quesList.get(control_v);
					setQuestionView();
				}else{
					Intent intent = new Intent(Quiz.this, Result.class);
					Bundle b = new Bundle();
					b.putInt("score", score); 
					intent.putExtras(b); 
					startActivity(intent);
					finish();
				}
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.quiz, menu);
		return true;
	}
	private void setQuestionView()
	{
		tex.setText(current.getQUESTION());
		a.setText(current.getOPTION_A());
		b.setText(current.getOPTION_B());
		c.setText(current.getOPTION_C());
		control_v++;
	}
}
