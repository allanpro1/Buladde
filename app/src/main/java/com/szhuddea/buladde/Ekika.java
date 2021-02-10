package com.szhuddea.buladde;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.szhuddea.buladde.Adapter.kika_adapter;
import com.szhuddea.buladde.models.kikaModel;

import java.util.ArrayList;
import java.util.List;

import static com.szhuddea.buladde.MainActivity.closeDrawer;
//
//import static com.szhuddea.buladde.MainActivity.closeDrawer;
//import static com.szhuddea.buladde.MainActivity.closeDrawer;

public class Ekika extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.kika_new);
        drawerLayout = findViewById(R.id.drawer_layout);


        // Lookup the recyclerview in activity layout
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        // Initialize contacts
        List<kikaModel> kikaModelList = createKikaModels();

        // Create adapter passing in the sample user data
        kika_adapter adapter = new kika_adapter( Ekika.this,kikaModelList);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
        // That's all!


    }

    private List<kikaModel> createKikaModels() {

        List<kikaModel> list = new ArrayList<>();
        list.add(new kikaModel("Abalangira", "?", "Ssaabataka", "Kaliiti, Busiro", R.drawable.engoma));
        list.add(new kikaModel("Butiiko", "Namulondo", "Ggunju", "Bukalango, Busiro", R.drawable.obutiko));
        list.add(new kikaModel("Fumbe", "Kikere", "Walusimbi", "Bukka, Busiro", R.drawable.ffumbe));
        list.add(new kikaModel("kasimba", "Ngo", "Kabazzi", "KKayango, Mawokota", R.drawable.kasimba));
        list.add(new kikaModel("kayozi", "Nsombabyuma", "Kafumu", "Kayango, Mawokota", R.drawable.kayozi));
        list.add(new kikaModel("kibe", "Kassukussuku", "Muyige", "Buluutwe, Kyaggwe", R.drawable.kibe));
        list.add(new kikaModel("kinyomo", "Mutima", "Nakigoye", "Kyasa, Buddu", R.drawable.kinyomo));
        list.add(new kikaModel("kkobe", "Kaama", "Namwana", "Buwama, Mawokota", R.drawable.kkobe));
        list.add(new kikaModel("Lugave", "Maleere", "Ndugwa", "Katende, Mawokota", R.drawable.lugave));
        list.add(new kikaModel("Mbogo", "Ndeerwe", "Kayiira Gajuule", "Mugulu, Ssingo", R.drawable.mbogo));
        list.add(new kikaModel("mbwa", "Kyuma kya Mbwa", "Mutasingwa", "Kiggwa, Busujju,", R.drawable.mbwa));
        list.add(new kikaModel("mmamba", "Muguya", "Ggabunga", "Ssagala,  Busiro", R.drawable.mmamba));
        list.add(new kikaModel("mpeewo", "Kayozi", "Kiggye", "Kkungu, Kyaddondo", R.drawable.mpeewo));
        list.add(new kikaModel("mpindi", "Kiyindiru", "Mazige", "Muyenje, Busiro", R.drawable.mpindi));
        list.add(new kikaModel("Musu", "Kayozi", "Muyingo", "Ssana, Mawokota", R.drawable.musu));
        list.add(new kikaModel("Mutima", "Nawuggwe", "Kakeeto", " Bbaale, Buddu", R.drawable.mutima));
        list.add(new kikaModel("nakinsige", "kkunguvvu", "Kyeyune", "Mirembe, Kyaggwe", R.drawable.nakinsige));
        list.add(new kikaModel("mpologoma", "Ngo", "Namuguzi", "Kasaga, Bulemeezi", R.drawable.mpologoma));
        list.add(new kikaModel("ndiga", "Mpologoma", "Lwomwa", "Mbaale, Mawokota", R.drawable.ndiga));
        list.add(new kikaModel("ngabi", "Jjerengesa", "Nsamba Lukonge", "Buwanda, Mawokota", R.drawable.ngabi));
        list.add(new kikaModel("ngeye", "unguvu", "Kasujja", "Busujja, Busiro", R.drawable.ngeye));
        list.add(new kikaModel("ngaali", "Kasanke akeeru", "Mawesano", "Buzooba, Buddu", R.drawable.ngaali));
        list.add(new kikaModel("ngo", "Kasimba", "Mutesasira", "Bukesa, Butambal", R.drawable.ngo));
        list.add(new kikaModel("ngonge", "Kaneene", "Kisolo", "Lweza, Busujjju", R.drawable.ngonge));
        list.add(new kikaModel("njaza", "Ngujulu", "Kitanda", "Kirungu, Kyaggwe ", R.drawable.njaza));
        list.add(new kikaModel("Njobe", "Bugaala", "Kiyise", "Mpumudde, Ssingo ", R.drawable.bg));
        list.add(new kikaModel("njovu", "Nvubu", "Mukalo", "Kambugu, Busiro", R.drawable.njovu));
        list.add(new kikaModel("nkejje", "Nkejje, kiyemba ", "Kikwata", "amukuma, Kyaggwe", R.drawable.nkejje));
        list.add(new kikaModel("nkerebwe", "Kikirikisi", "Kidimbo", "Budimbo, Ssingo", R.drawable.nkerebwe));
        list.add(new kikaModel("Nkima", "?", "Mugema", "Mayobe, Bugerere", R.drawable.nkima));
        list.add(new kikaModel("namunggona", "Kkunguvvu", "Kajjabuwongwa", "Kyabuwangwa, Gomba", R.drawable.namunggona));
        list.add(new kikaModel("nnyange", "Mutima", "Kakoto-Mbaziira", "uBlimu, Kyaggwe", R.drawable.nnyange));
        list.add(new kikaModel("Nsenene", "Nabangogoma", "Kajjabuwongwa", "Kisozi, Gomba", R.drawable.nsenene));
        list.add(new kikaModel("nsuma", "Kasulubbana", "Kibondwe", "Bukibondwe, Buvum", R.drawable.nsuma));
        list.add(new kikaModel("nswaswa", "Goonya", "Mayengo", "Bugabo, Buvuma", R.drawable.nswaswa));
        list.add(new kikaModel("ntalaganya", "Maleere", "Bbambaga", "Bbambaga, Bulemeezi", R.drawable.ntalaganya));
        list.add(new kikaModel("nte", "Ngaali", "Katongole", "Mulema, Buddu", R.drawable.nte));
        list.add(new kikaModel("nvubu", "Njovu", "Kayita", "Mbazzi, Kyaggwe", R.drawable.nvubu));
        list.add(new kikaModel("nvuma", "Kativuma", "Kyaddondo", "Kawempe, Kyaddondo", R.drawable.nvuma));
        list.add(new kikaModel("mbuzi", "?", "Kisunsu", "Muwunume", R.drawable.mbuzi));
//        list.add(new kikaModel("mbuzi", "?", "Kisunsu", "Muwunume", R.drawable.mbuzi));
        list.add(new kikaModel("nkula", "Byenda", "Mawengi", "Bbira, Busiro", R.drawable.nkula));
        list.add(new kikaModel("Butiiko", "?", "Ssaabataka", "Kaliiti, Busiro", R.drawable.nkebuka));

        return list;
    }

    public void ClickMenu(View view){
        MainActivity.openDrawer(drawerLayout);

    }
    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }
    public void ClickHome(View view){
        MainActivity.redirectActivity(this,MainActivity.class);
    }
    public  void ClickDashboard(View view){
        recreate();
    }

    public void ClickAbout(View view){
        MainActivity.redirectActivity(this,Engero.class );
    }

    public  void ClickEmyezi(View view){
        redirectActivity(this,Emyezi.class);
    }
    public  void ClickEnnaku(View view){
        redirectActivity(this,Ennaku.class);
    }
    public  void ClickAmasaza(View view){ redirectActivity(this,Amasaza.class); }
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

    private void logout() {
    }


    public static void redirectActivity(Activity activity ,Class aClass) {
        Intent intent = new Intent(activity,aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @Override
    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
}