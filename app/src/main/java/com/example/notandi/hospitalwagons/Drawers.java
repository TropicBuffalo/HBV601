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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer1_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer2_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer3_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer4_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer5_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer6_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer7_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer8_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer_Commit_List_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer_med_Fragment;
import com.example.notandi.hospitalwagons.Fragment_Drawers.drawer_top_Fragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Drawers extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        public static boolean isSealBroken;
        public static int DrawerChosen;
        public Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(savedInstanceState);
        setContentView(R.layout.activity_drawers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
       // drawer_Commit_List_Fragment b = new drawer_Commit_List_Fragment();
        //b.creatingList();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.screen_area, new drawer_top_Fragment());
        ListProcessing.initList(); // Start the list as if it was in its optimal state
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
         fragment = null;
        ItemAdapter.isitpopulated=false;
        int id = item.getItemId();
        //Find ID for buttons in Drawers Navigation bar and connect it to the correct fragment
        if (id == R.id.nav_drawer_top) {
            fragment = new drawer_top_Fragment();
            DrawerChosen = 0;
        } else if (id == R.id.nav_drawer_med) {
            if (isSealBroken == false) {
                isSealBroken_Message();
                if(isSealBroken == true){
                    fragment = new drawer_med_Fragment();
                    DrawerChosen=1;
                }
            }
            if (isSealBroken == true) {
                    fragment = new drawer_med_Fragment();
                    DrawerChosen=1;
            }
        }
        else if(id == R.id.nav_drawer1) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                         if(isSealBroken==true){
                             fragment = new drawer1_Fragment();
                             DrawerChosen=2;
                         }
                    }else {
                        fragment = new drawer1_Fragment();
                        DrawerChosen=2;
                    }
        }
        else if(id == R.id.nav_drawer2) {
                    if(isSealBroken==false){
                        isSealBroken_Message();

                        if(isSealBroken==true){
                            fragment = new drawer2_Fragment();
                            DrawerChosen=3;
                        }
                    }else {
                        fragment = new drawer2_Fragment();
                        DrawerChosen=3;
                    }
        }
        else if(id == R.id.nav_drawer3) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true){
                            fragment = new drawer3_Fragment();
                            DrawerChosen=4;
                        }
                    }else {
                        fragment = new drawer3_Fragment();
                        DrawerChosen=4;
                    }
        }
        else if(id == R.id.nav_drawer4) {
                    if(isSealBroken==false){
                        isSealBroken_Message();

                        if(isSealBroken==true){
                            fragment = new drawer4_Fragment();
                            DrawerChosen=5;
                        }
                    }else{
                        fragment = new drawer4_Fragment();
                        DrawerChosen=5;
                    }
        }
        else if(id == R.id.nav_drawer5) {
                    if(isSealBroken==false){
                        isSealBroken_Message();

                        if(isSealBroken==true){
                            fragment = new drawer5_Fragment();
                            DrawerChosen=6;
                        }
                    }else{
                        fragment = new drawer5_Fragment();
                        DrawerChosen=6;
                    }
        }
        else if(id == R.id.nav_drawer6) {
                    if(isSealBroken==false){
                        isSealBroken_Message();

                        if(isSealBroken==true){
                            fragment = new drawer6_Fragment();
                            DrawerChosen=7;
                        }
                    }else{
                        fragment = new drawer6_Fragment();
                        DrawerChosen=7;
                    }
        }
        else if(id == R.id.nav_drawer7) {
                    if(isSealBroken==false){
                        isSealBroken_Message();

                        if(isSealBroken==true){
                            fragment = new drawer7_Fragment();
                            DrawerChosen=8;
                        }
                    }else {
                        fragment = new drawer7_Fragment();
                        DrawerChosen=8;
                    }
        }
        else if(id == R.id.nav_drawer8) {
                    if(isSealBroken==false){
                        isSealBroken_Message();
                        if(isSealBroken==true){
                            fragment = new drawer8_Fragment();
                            DrawerChosen=9;
                        }
                    }else {
                        fragment = new drawer8_Fragment();
                        DrawerChosen=9;
                    }
        }
        else if (id == R.id.drawer_continue) {
            //final Intent intent = new Intent(this, WagonSummary.class);
            fragment = new drawer_Commit_List_Fragment();
            DrawerChosen=10;
            ListProcessing LP = new ListProcessing();
            LP.commitList();
            }
        else if (id ==R.id.commit_list){
            new AlertDialog.Builder(this)
                    .setTitle("Er búið er að vinna með vagninn?")
                    .setNegativeButton("Nei",null)
                    .setPositiveButton("já",new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finishUsingWagon();
                        }
                    }).create().show();

            Intent ReturnToIntro = new Intent(this, WelcomeScreen.class);
            startActivity(ReturnToIntro);
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
                        ListProcessing d = new ListProcessing();
                        d.sealBroken();
                    }
    }).create().show();
    }

    private EditText editText2;
    private EditText editText3;
    private String test;
    private String user;
    private String missing;
    String currentDate = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.getDefault()).format(new Date());
    public void finishUsingWagon(){

        //transfer the still missing items to the database;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference(currentDate);
        missing = editText3.getText().toString();
        user = editText2.getText().toString();
        DatabaseReference myRef2 = ref.child("Missing");
        myRef2.setValue(missing);
        DatabaseReference myRef = ref.child("User");
        myRef.setValue(user);

        //transfer user back to main menu
        Intent ReturnToIntro;
        ReturnToIntro = new Intent(this, WelcomeScreen.class);
        startActivity(ReturnToIntro);
    }


}
