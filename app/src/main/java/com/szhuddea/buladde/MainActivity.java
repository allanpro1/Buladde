package com.szhuddea.buladde;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
    }
    public  void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
           drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public void ClickHome(View view){
        recreate();
    }

    public void ClickDashboard(View view){
        MainActivity.redirectActivity(this,Ekika.class );
    }







    public  void ClickEmyezi(View view){
        redirectActivity(this,Emyezi.class);
    }
    public  void ClickEnnaku(View view){
        redirectActivity(this,Ennaku.class);
    }
    public  void ClickAbout(View view){ redirectActivity(this,Engero.class); }
    public  void ClickEbisoko(View view){
        redirectActivity(this,Ebisoko.class);
    }
    public  void ClickEkitiibwa(View view){
        redirectActivity(this,Ekitiibwa.class);
    }
    public  void ClickZ(View view){
        redirectActivity(this,Amannya.class);
    }
    public  void ClickLogout (View view){
        logout(this);
    }


    public static void logout(final Activity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Ggalawo");

        builder.setMessage("okakasa oyagala kugalawo?");
        builder.setPositiveButton("ye", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                activity.finishAffinity();
                System.exit( 0);
            }
        });
        builder.setNegativeButton("Nedda", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
            }
        });
        builder.show();

    }
    public static  void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity,aClass) ;
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }


    //
//    @Override  void onPause() {
//        super.onPause();
//        closeDrawer(drawerLayout);
//    }
}