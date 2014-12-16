package com.vivek.github;

import com.vivek.github.Intermediate.BranchMore;
import com.vivek.github.Intermediate.Commiting;
import com.vivek.github.Intermediate.Conflicts;
import com.vivek.github.Intermediate.Diff;
import com.vivek.github.Intermediate.Fetch;
import com.vivek.github.Intermediate.Forking;
import com.vivek.github.Intermediate.Log;
import com.vivek.github.Intermediate.Merging;
import com.vivek.github.Intermediate.Tag;
import com.vivek.github.Intermediate.Undo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.appcompat.R.color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class intermediate extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		String[] item = {"Forking/cloning a repo" , "About git status/diff/add commands","More about branch", "Commiting/pushing " ,"Undoing changes and commits", "Learn about git log/show/describe" , "Learn about merging", 
				         "Learn about conflicts" , "Learn about tags" , "Learn about git fetch/pull/push" };
		ListView lv = getListView();
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , item);
		lv.setAdapter(adapter);
	
		
			
		lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				switch(position){
				case 0: 
					Intent n = new Intent(intermediate.this , Forking.class);
					startActivity(n);
					break;
					
				case 1:
					Intent g = new Intent(intermediate.this , Diff.class);
					startActivity(g);
					break;
					
				case 2:
					Intent b = new Intent(intermediate.this , BranchMore.class);
					startActivity(b);
					break;
					
				case 3:
					Intent cop = new Intent(intermediate.this , Commiting.class);
					startActivity(cop);
					break;
					
				case 4:
					Intent un = new Intent(intermediate.this , Undo.class);
					startActivity(un);
					break;
					
				case 5:
					Intent lo = new Intent(intermediate.this , Log.class);
					startActivity(lo);
					break;
					
				case 6:
					Intent me = new Intent(intermediate.this , Merging.class);
					startActivity(me);
					break;
					
				case 7:
					Intent con = new Intent(intermediate.this , Conflicts.class);
					startActivity(con);
					break;
					
				case 8:
					Intent t = new Intent(intermediate.this , Tag.class);
					startActivity(t);
					break;
					
				case 9:
					Intent fe = new Intent(intermediate.this , Fetch.class);
					startActivity(fe);
					break;
					default:
						break;
				
				
				
				}
				
			}
			
			
			
		});
	}


	

}
