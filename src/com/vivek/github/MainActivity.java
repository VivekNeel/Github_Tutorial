package com.vivek.github;

import com.vivek.github.Quiz.Quiz;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private NavigationDrawerFragment mNavigationDrawerFragment;

    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Setting up the drawer :P
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                Intent b = new Intent(MainActivity.this , Basic.class);
                startActivity(b);
                
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                Intent i = new Intent(MainActivity.this , intermediate.class);
                startActivity(i);
                
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                Intent a = new Intent(MainActivity.this , Advance.class);
                startActivity(a);
                
                break;
                
            case 4:
                mTitle = getString(R.string.title_section4);
                Intent t = new Intent(MainActivity.this , Quiz.class);
                startActivity(t);
                
               break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
             getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
          int id = item.getItemId();
        if (id == R.id.rate) {
        	Intent p =  new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://play.google.com/store/apps/details?id=com.vivek.github"));
            startActivity(p);
           
        }
        else if (id == R.id.about){
        	
        	
        	Intent a = new Intent (MainActivity.this , About_me.class);
        	startActivity(a);
        }
         else if (id == R.id.con){
        	 Intent c = new Intent(android.content.Intent.ACTION_SEND);
        	 c.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{getResources().getString(R.string.email)});
        	 c.putExtra(android.content.Intent.EXTRA_SUBJECT, 
        			 new String[] {getResources().getString(R.string.subject)});
        	 c.putExtra(android.content.Intent.EXTRA_TEXT, 
        			 getResources().getString(R.string.subject));
        	 c.setType("plan/text");
        	 startActivity(Intent.createChooser(c, "Contact developer"));
        	
        	
        }
         else if (id == R.id.share){
        	 
        	 Intent s = new Intent(Intent.ACTION_SEND);
        	 s.putExtra(android.content.Intent.EXTRA_TEXT, getResources().getString(R.string.share));
        	 s.setType("text/plain");
        	 startActivity(Intent.createChooser(s, "Share via"));
        	 
        	 }
         else if (id == R.id.more){
        	 
        	 Intent m = new Intent(Intent.ACTION_VIEW)
        	 .setData(Uri.parse("https://play.google.com/store/apps/developer?id=Neel+World&hl=en"));
        	 startActivity(m);
         }
       
          else if (id == R.id.ex){
        	
        	
        	finish();
        }
       
        
        return super.onOptionsItemSelected(item);
    }

     public static class PlaceholderFragment extends Fragment {
          private static final String ARG_SECTION_NUMBER = "section_number";

          public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
