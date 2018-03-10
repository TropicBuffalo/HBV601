package com.example.notandi.hospitalwagons;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer1_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer2_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer3_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer4_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer5_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer6_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer7_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer8_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer_med_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer_top_Fragment;

public class Drawers extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static boolean isSealBroken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_drawers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.screen_area, new drawer_top_Fragment());
        ft.commit();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawers, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment = null;

        int id = item.getItemId();
        //Finna ID fyrir takkana í Drawers Navigation bar og tengja það við rétt fragment
        if (id == R.id.nav_drawer_top) {
            fragment = new drawer_top_Fragment();
        }
        else if(id == R.id.nav_drawer_med) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                    }else{
                        fragment = new drawer_med_Fragment();
                    }
        }
        else if(id == R.id.nav_drawer1) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                         if(isSealBroken==true)fragment = new drawer1_Fragment();
                    }else {
                        fragment = new drawer1_Fragment();
                    }
        }
        else if(id == R.id.nav_drawer2) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true)fragment = new drawer2_Fragment();
                    }else {
                        fragment = new drawer2_Fragment();
                    }
        }
        else if(id == R.id.nav_drawer3) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true)fragment = new drawer2_Fragment();
                    }else {
                        fragment = new drawer3_Fragment();
                    }
        }
        else if(id == R.id.nav_drawer4) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true)fragment = new drawer4_Fragment();
                    }else {
                        fragment = new drawer4_Fragment();
                    }
        }
        else if(id == R.id.nav_drawer5) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true)fragment = new drawer5_Fragment();
                    }else {
                        fragment = new drawer5_Fragment();
                    }
        }
        else if(id == R.id.nav_drawer6) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true)fragment = new drawer6_Fragment();
                    }else {
                        fragment = new drawer6_Fragment();
                    }
        }
        else if(id == R.id.nav_drawer7) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true)fragment = new drawer7_Fragment();
                    }else {
                        fragment = new drawer7_Fragment();
                    }
        }
        else if(id == R.id.nav_drawer8) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true)fragment = new drawer8_Fragment();
                    }else {
                        fragment = new drawer8_Fragment();
                    }
        }

        else if (id == R.id.drawer_continue) {
            final Intent intent = new Intent(this, WagonSummary.class);
            new AlertDialog.Builder(this)
                    .setTitle("Er Skráningu hluta á vagni lokið?")
                    .setNegativeButton("Nei",null)
                    .setPositiveButton("já",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            FinishComputeList(); // calls upon class to compute value from list
                            startActivity(intent);
                        }
                    }).create().show();

        } else if (id == R.id.drawer_comment) {
            Intent intent = new Intent(this, CommentSummary.class);
            startActivity(intent);
        }

        if(fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.screen_area, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void isSealBroken_Message()
    {
        new AlertDialog.Builder(this)
                .setTitle("Er innsigli rofið?")
                .setNegativeButton("Nei",null)
                .setPositiveButton("já",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        isSealBroken=true;
                    }
    }).create().show();
    }
    private void FinishComputeList(){
        // starts the process of working through the list
    }
}
