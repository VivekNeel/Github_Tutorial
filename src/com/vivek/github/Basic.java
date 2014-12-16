package com.vivek.github;

import com.vivek.github.basic.Branch;
import com.vivek.github.basic.Check;
import com.vivek.github.basic.Commit;
import com.vivek.github.basic.Git;
import com.vivek.github.basic.Install;
import com.vivek.github.basic.Move;
import com.vivek.github.basic.Remote;
import com.vivek.github.basic.Remove;
import com.vivek.github.basic.Repo;
import com.vivek.github.basic.SetUp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Basic extends ListActivity {
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ListView l = getListView();
		String[] b = {"Introduction to Github" , "How to install git", "How to set up git" , " Learn about Repository" , "Learn about commits" , "Learn About Branch" , "Learn about remotes" , " Move or rename a file" , "Remove files from the working tree and from the index" , "Learn about checkout"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , b);
	    l.setAdapter(adapter);
	    l.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				switch(position){
				
				case 0: 
					Intent b = new Intent(Basic.this , Git.class);
					startActivity(b);
					break;
				case 1:
					Intent w = new Intent(Basic.this , Install.class);
					startActivity(w);
					break;
				case 2: 
					Intent s = new Intent(Basic.this , SetUp.class);
					startActivity(s);
					break;
					
				case 3: 
					Intent r = new Intent(Basic.this , Repo.class);
					startActivity(r);
					break;
					
				case 4: 
					Intent c = new Intent(Basic.this , Commit.class);
					startActivity(c);
					break;
					
				case 5: 
					Intent br = new Intent(Basic.this , Branch.class);
					startActivity(br);
					break;
					
				case 6: 
					Intent re = new Intent(Basic.this , Remote.class);
					startActivity(re);
					break;
					
				case 7: 
					Intent mo = new Intent(Basic.this , Move.class);
					startActivity(mo);
					break;
					
				case 8: 
					Intent rem = new Intent(Basic.this , Remove.class);
					startActivity(rem);
					break;
					
				case 9: 
					Intent ch = new Intent(Basic.this , Check.class);
					startActivity(ch);
					break;
				default:
						break;
				}
				
			}
	    	
	    	
	    });
	}
	
	
	

}
