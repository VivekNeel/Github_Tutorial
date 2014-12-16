package com.vivek.github;

import com.vivek.github.advance.Author;
import com.vivek.github.advance.Cherrypick;
import com.vivek.github.advance.Github;
import com.vivek.github.advance.MergeConflicts;
import com.vivek.github.advance.Rebase;
import com.vivek.github.advance.Sensitive;
import com.vivek.github.advance.Spitting;
import com.vivek.github.advance.Subtree;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Advance extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		String[] ad = {"Learn about cherrypicking commits from gerrit" , "Learn about cherrypicking commits from github ", "Changing author's info" , "Removing sensitive data" , "Learn about git rebase", "Resolve merge conflicts after a rebase"
				       ,"Spitting a subfolder out into a new repo" , "About git subtree merges"};
	    ArrayAdapter<String> adap = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , ad);
	    ListView le = getListView();
	    le.setAdapter(adap);
	    le.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				switch(position){
				case 0 :
					Intent c = new Intent(Advance.this , Cherrypick.class);
					startActivity(c);
					break;
					
				case 1 :
					Intent g = new Intent(Advance.this , Github.class);
					startActivity(g);
					break;
					
				case 2 :
					Intent au = new Intent(Advance.this , Author.class);
					startActivity(au);
					break;
					
				case 3 :
					Intent se = new Intent(Advance.this , Sensitive.class);
					startActivity(se);
					break;
					
				case 4 :
					Intent ba = new Intent(Advance.this , Rebase.class);
					startActivity(ba);
					break;
					
				case 5 :
					Intent me = new Intent(Advance.this , MergeConflicts.class);
					startActivity(me);
					break;
					
				case 6 :
					Intent sp = new Intent(Advance.this , Spitting.class);
					startActivity(sp);
					break;
					
				case 7 :
					Intent suu = new Intent(Advance.this , Subtree.class);
					startActivity(suu);
					break;
					default:
						break;
				
				
				
				
				
				}
				
			}
	    	
	    	
	    	
	    });
	
	
	}
	
	

}
