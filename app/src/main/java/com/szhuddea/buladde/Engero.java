package com.szhuddea.buladde;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.szhuddea.buladde.MainActivity.closeDrawer;
//
//import static com.szhuddea.buladde.MainActivity.closeDrawer;
//import static com.szhuddea.buladde.MainActivity.closeDrawer;

public class Engero extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engero);
        drawerLayout = findViewById(R.id.drawer_layout);

        ParentListItems = new LinkedHashMap<>();
        for (String HoldItem : ParentList) {
            if (HoldItem.equals("Atanayita yita")) {
                LoadChild(planetName);
            } else if (HoldItem.equals("kange")) {
                LoadChild(monthName);
            } else if (HoldItem.equals("Nyini mufu")) {
                LoadChild(P);
            } else if (HoldItem.equals("Gwosussa emwanyi")) {
                LoadChild(x);
            } else if (HoldItem.equals("Bakuyita embuga")) {
                LoadChild(y);
            } else if (HoldItem.equals("Baleke bagggwe akanyomagano")) {
                LoadChild(AK);
            } else if (HoldItem.equals("Balikomya eyo ne bazza")) {
                LoadChild(MU);
            } else if (HoldItem.equals("Balimutta jjo")) {
                LoadChild(VU);
            } else if (HoldItem.equals("Balo embogu yamutta")) {
                LoadChild(XU);
            } else if (HoldItem.equals("Bannange bangi")) {
                LoadChild(ZU);
            } else if (HoldItem.equals("Bandaba")) {
                LoadChild(TU);
            } else if (HoldItem.equals("Byampuna")) {
                LoadChild(OU);
            } else if (HoldItem.equals("Ebukojja Banjagala")) {
                LoadChild(PU);
            } else if (HoldItem.equals("Ebyokulya tebyandeetaa")) {
                LoadChild(LU);
            } else if (HoldItem.equals("Embaga enyuma kiro")) {
                LoadChild(AU);
            } else if (HoldItem.equals("Linda kiggweeyo")) {
                LoadChild(BU);
            } else if (HoldItem.equals("kuno kwe kwaffe")) {
                LoadChild(JU);
            } else if (HoldItem.equals("Kaliba kasajja")) {
                LoadChild(NU);
            } else if (HoldItem.equals("Ensimbi zabula")) {
                LoadChild(KU);
            } else if (HoldItem.equals("Bukya mbirya")) {
                LoadChild(DU);
            } else if (HoldItem.equals("Sebuwoomi bwa nswa")) {
                LoadChild(U1);
            } else if (HoldItem.equals("Byakuno")) {
                LoadChild(FU);
            } else if (HoldItem.equals("Agamyuka omutezi")) {
                LoadChild(U2);
            } else if (HoldItem.equals("Omukisa nkukunyi")) {
                LoadChild(U4);
            } else if (HoldItem.equals("Buyisi bwoomu")) {
                LoadChild(U3);
            } else if (HoldItem.equals("Atya omusana")) {
                LoadChild(U5);
            } else
                LoadChild(defaultName);
            ParentListItems.put(HoldItem, ChildListp);
        }

        expandableListView = findViewById(R.id.expandListVie);
        final ExpandableListAdapter expandableListAdapter = new ListAdapter(this, ParentList, ParentListItems);
        expandableListView.setAdapter(expandableListAdapter);





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
    public  void ClickAbout(View view){
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
    List<String> ChildListp;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandableListView;



    List<String> ParentList= new ArrayList<>();
    private Object Menu;

    {
        ParentList.add("Atanayita yita");
        ParentList.add("kange");
        ParentList.add("Nyini mufu");
        ParentList.add("Gwosussa emwanyi");
        ParentList.add("Bakuyita embuga");
        ParentList.add("Baleke bagggwe akanyomagano");
        ParentList.add("Balikomya eyo ne bazza");
        ParentList.add("Balimutta jjo");
        ParentList.add("Balo embogo yamutta");
        ParentList.add("Bannange bangi");
        ParentList.add("Bandaba");
        ParentList.add("Byampuna");
        ParentList.add("Ebukojja banjagala");
        ParentList.add("Ebyokulya tebyandeeta");
        ParentList.add("Egindi wala ");
        ParentList.add("Embaga enyuma kiro ");
        ParentList.add("Linda kiggweeyo");
        ParentList.add("Kuno kwe kwaffe");
        ParentList.add("Kaliba kasajja");
        ParentList.add("Ensimbi zabula");
        ParentList.add("Bukya mbirya");
        ParentList.add("Byakuno");
        ParentList.add("Sebuwoomi bwa nswa");
        ParentList.add("Agamyuka omutezi");
        ParentList.add("Buyisi bwoomu");
        ParentList.add("Omukisa nkukunyi");
        ParentList.add("Atya omusana");

    }

    String[]planetName = {
            "y'atenda nnyina okufumba. Lutuyigiriza obuteyibalanga."

    };

    String[]monthName = {
            "kakira kaffe. olugero luno lutuyigiriza okwekolerera"
    };

    String[]P = {
            "Y'akwata ewawunya. lutuyigiriza okwekwatirangamu mumirimu"
    };

    String[] x = {
            "Omusanga mitala nga awungula.  Lutuyigiriza obutanyooma oba okusosola abantu"
    };

    String[]y ={
            "Sibuganzi. Buli gwe bayita embuga tebamuyita kumuwa birungi. Oluusi baba bamuyita kumukuba oba kumusiba. Abamu kyebava batya okuyitibwa embuga. "
    };
    String[]AK ={
            "Naga gwoyagala y'ali kungulu. Mukwano gw’omuntu bw’aba ng’alwana n’omuntu gw’asinza amaanyi, munne taba na kweralikirira, kyava tayagala na kubataasa mangu"

    };
    String[]MU ={
            "Yemunyoro agenda.  Olugero lutuyigiriza butatya kwanganga bizibu"

    };
    String[]VU ={
            "Tekikulobera kumusenga. Omuntu gwe basalidde ogw’okufa ne bamulaga n’olunaku olw’okuttibwa ayinza okusonyiyibwa n’atattibwa. N’olwekyo abaagala okubeera naye tebasaana kumuddukako"

    };

    String[]XU ={
            "Nti bwatyo bwazifumita.   Bulijjo tusaana okuwulirizanga obulungi ebitugambibwa"

    };
    String[]ZU ={
            "Nga tonagwa wabi.   Omuntu bw’agwa mu kabi nga banne bamwabulira"

    };
    String[]TU ={
            "Afunda Kumunaabo. Omuntu yenna Tasaanye kusirika nga waliwo embeera etamusanyusa"

    };
    String[]OU ={
            "Nga akubbye wa munju. Omuntu ow’omu nju bw’akubba n’omumanya ebigambo bikulema okwogera amangu. "
    };

    String[]PU ={
            "Nga add ku nyoko waali .Mu mpisa z’abaganda, ebukojja teba wammwe era baganda ba nnyoko bwe batabaayo, tobaayo na ssimba. "
    };
    String[]LU ={
            "Omugenyi akiina nnyinimu .Omugenyi bw’atalya bugenyi gy’akyadde n’asiibuza nnyinimu ebigambo ebyo, aba ayoggedde kaati nti anyiize olw’obutamuwa bugenyi. "
    };
    String[]GU ={
            "Nga tekuli Mumanyi .Gw’oyagala ennyo ne bw’abeera ewala era owaliriza n’otuukayo omulabeko. "
    };
    String[]AU ={
            "Bwatagenda kubba agenda kulwana .Abakozi b'ebikolobera bagala nnyo ebinyumu eby'ekiro. "
    };
    String[]BU ={
            "Afumita Mukira .Tusaana okukola buli kimu mu kaseera kayo akatuufu. "
    };
    String[]JU ={
            "Takulaga gyasula. "
    };
    String[]NU ={
            "Akuliisa engo. Okuwana ennyo omuntu kiyinza okumuletera okukola ensobi "
    };
    String[]KU ={
            "Asiiba waka. Obugayavu sibulungi "
    };
    String[]DU ={
            "Omunya gujiira ku nju "
    };
    String[]FU ={
            "Tasenguka agoba bajja. Omuntu agugamba nti awantu wabi nga ate ye tavaawoa aba takwagaliza kubeerako "
    };
    String[]U1 ={
            "Natalya mutima aguliira omwo. Ekintu bwekiba ekirungi, oli tafaayo kukiri munda "
    };
    String[]U2 ={
            "N'akasolo "
    };
    String[]U3 ={
            "Nsega y'ebika. bwobeera wekka oyinza ofuna obuzibu abantu nebatamanya "
    };
    String[]U4 ={
            "tegutuulirwa. ekintu kyonna nga  kaykolebwa kubeera kikyo era luliba olwo nokifuna "
    };
    String[]U5 ={
            "Talya bwami. Omuntu atya okuyita mubugubi aba tagenda kufuna ekyo kyayagala "
    };

    String[]defaultName = {
            "wano wakyakolebwako"
    };


    private void LoadChild(String[] ParentElementName) {
        ChildListp = new ArrayList<>();
        Collections.addAll(ChildListp, ParentElementName);


    }

}
