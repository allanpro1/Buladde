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
//import static com.szhuddea.buladde.mainActivity.closeDrawer;
//import static com.szhuddea.buladde.mainActivity.closeDrawer;

public class Ebisoko extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Object SearchableActivity;


    public void ClickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);

    }

    public void ClickLogo(View view) {
        closeDrawer(drawerLayout);
    }

    public void ClickHome(View view) {
        MainActivity.redirectActivity(this, MainActivity.class);
    }

//    public void ClickEbisoko(View view) {
//        recreate();
//    }

    public void ClickDashboard(View view) {
        MainActivity.redirectActivity(this, Ekika.class);
    }

    public void ClickEmyezi(View view) {
        redirectActivity(this, Emyezi.class);
    }

    public void ClickEnnaku(View view) {
        redirectActivity(this, Ennaku.class);
    }

    public void ClickAmasaza(View view) {
        redirectActivity(this, Amasaza.class);
    }

    public void ClickAbout(View view) {
        redirectActivity(this, Engero.class);
    }

    public void ClickEkitiibwa(View view) {
        redirectActivity(this, Ekitiibwa.class);
    }

    public void ClickZ(View view) {
        redirectActivity(this, Amannya.class);
    }

    public void ClickLogout(View view) {
        logout(this);
    }


    public static void logout(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Ggalawo");

        builder.setMessage("okakasa oyagala kugalawo?");
        builder.setPositiveButton("ye", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                activity.finishActivity(); //.finishAffinity();
                System.exit(0);
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


    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity, aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandableListView;

    List<String> ParentList= new ArrayList<>();
    {
        ParentList.add("Okulya mundago");
        ParentList.add("Okuwunya ku gwa ddyo");
        ParentList.add("Okusiyagguka");
        ParentList.add("Okugenda okulunda emobogo");
        ParentList.add("Okwetyabira akalimu obuwuka");
        ParentList.add("okwekulira embazzi kukugulu");
        ParentList.add("Okwoza ku mmunye");
        ParentList.add("Okukweka enjala");
        ParentList.add("Okuliisa ebijanjalo empiso");
        ParentList.add("Okumenya mu jjenje ekkalu");
        ParentList.add("Okwesiwa amagengere");
        ParentList.add("Okugaangatanyaekiwanga mu ngalo");
        ParentList.add("Okutema ebisiki");
        ParentList.add("Okusimba kasooli");
        ParentList.add("okujja omukono mu ngabo");
        ParentList.add("Okunyenya agaliba enjole");
        ParentList.add("Okulinnya mumusaayi");
        ParentList.add("Kinywa na mpindi");
        ParentList.add("Okweyimbamu ogwa kabugu");
        ParentList.add("Enkoko okugikwata omumwa");
        ParentList.add("Okuyisa omukka mu kisero");
        ParentList.add("Okukirira e zira kumwa");
        ParentList.add("Okufuuyira endiga omulere");
        ParentList.add("Okusiika ebinyomo");
        ParentList.add("Okufuuka omusu gw'ekanyanya");
        ParentList.add("Okukaabya omuntu akayirigombe");
        ParentList.add("Okukuba obulatti");
        ParentList.add("Ekintu okuba nga n'owemindi asena");
        ParentList.add("Olubuto okuba mu mannyo");
        ParentList.add("Olubuto okuba mu mumugongo");
        ParentList.add("Okukotakoota mu ga lumonde");
        ParentList.add("Okugenda ekaganga");
        ParentList.add("Okuteeka nga aga lubigi");
        ParentList.add("Gaboggola g'ekikere kyenamugongo");
        ParentList.add("Okwewugulaza ng'Omunyoro alya engabi");
        ParentList.add("Okweyinula ng' omusimbu agenda ku lutabaalo");
        ParentList.add("OkukuumaOkukuuma ekintu nga akalira k'omwana");
        ParentList.add("Emundu emenye");
        ParentList.add("Okutema kulw'enamuganga");
        ParentList.add("Okuyita sikaala ebuddo");
        ParentList.add("Okuzannya n'owebiti");
        ParentList.add("Okukaaba aga waggoonya");
        ParentList.add("Okudda e Mbaale mu baganda banno");
        ParentList.add("Okusanga nga galinnye olunnyo");
        ParentList.add("Okukuba ey'abageye");
        ParentList.add("Balyegiira ng'ensimbi egula muwogo");
        ParentList.add(" Okwetala nga Namutale omunyageko ente");

    }
    String[]planetName = {
            "Kitegeeza kuyimba"};

    String[]monthName = {"kulya"};

    String[]P = {"Kutambula"};

    String[] x = {"Kufa"};

    String[]a={"Kweretera bizibu"};

    String[]b ={"Kweretera mitawaana"};
    String[]c = {"Kukaaba"};

    String[]d = {"Kulwana"
    };
    String[]e = {"Okukola ekintu nga ogayaala"
    };
    String[]jjenje = {"Okukola ekintu ekyangu"
    };
    String[]ssiwa = {
            "Okunywa omwenge"
    };
    String[]kwebaka = {
            "Kwebaka"
    };
    String[]siki= {
            "Kwebaka"
    };
    String[]ok = {
            "Kutambula"
    };

    String[]tip = {
            "Kufa"
    };

    String[]ko = {
            "Kuzina"
    };
    String[]lin = {
            " Kuwerekera muntu"
    };

    String[] pin = {
            "Ekintu okuba okumpi ennyo"
    };

    String[]enkoko = {
            "Kueera"
    };

    String[]sero ={
            "Okukola ekintu ekyangu"
    };
    String[]mwa = {
            "kufa"
    };
    String[]ndiga = {
            "Okukola ekintu ekitagasa"
    };

    String[] binyomo = {
            "Okukola ekintu ekitalina mugaso"
    };

    String[]kanyanya = {
            "Okubula"
    };
    String[] aka={
            "okumubonyabonya"
    };
    String[]lati= {
            "kusanyuka"
    };
    String[]mindi ={
            "ekintu okuba nga kingi nnyo"
    };
    String[]mannyo= {
            "kiteggeza kukkuta nnyo"
    };


    String[]njala= {
            "Enjala okuba nga ekuluma"
    };

    String[]lumonde={
            "Okukola ekintu nga tekigasa"
    };

    String[] iok={
            "Kufa"
    };
    String[]defaultName = {
            "wano wakyakolebwako"
    };
    String[]ob ={
            "Okwetuga"
    };
    String[]ob1 ={
            "Kwewombeeka"
    };
    String[]ob2 ={
            "Ekintu nga kinene ate nga kyakitiibwa"
    };
    String[]ob3 ={
            "ye muntu akola ekintu ng'amanyi kikyamu kyokka n’agenda mu maaso n'okukikola."
    };
    String[]ob4 ={
            "okukola ekintu naye nga okimayi kiyina okukuleetera obuzibu."
    };
    String[]ob5 ={
            "Kukuuma kintu butiribiri."
    };
    String[]ob6 ={
            "Ekintu kyewesiga ennyo."
    };
    String[]ob7 ={
            "Okukola ekintu ekizibu ennyo"
    };
    String[]ob8 ={
            "Kufuna kintu kirungi kyobadde tosuubira"
    };
    String[]ob9 ={
            "Kwanguyirwa mu kyokola"
    };
    String[]ob10 ={
            "Kukudaala"
    };
    String[]ob11 ={
            "Kuboola oba kusosola"
    };
    String[]ob12 ={
            "Kunga baakamala okulya"
    };
    String[]ob13 ={
            "Butaterera mu kifo kimu"
    };
    String[]ob14 ={
            "okukola ekintu nekikuviiramu obuzibu"
    };
    String[]ob15 ={
            "Kikozesebwa kumuntu nga tatuula mukifo kimu" +
                    ""
    };

    @Override
    protected void  onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_ebisoko);



        ParentListItems = new LinkedHashMap<>();
        for (String HoldItem : ParentList){
            if (HoldItem.equals("Okulya mundago")){
                LoadChild(planetName);
            } else if (HoldItem.equals("Okuwunya ku gwa ddyo")){
                LoadChild(monthName);
            } else if (HoldItem.equals("Okusiyagguka")){
                LoadChild(P);
            } else if (HoldItem.equals("Okugenda okulunda emobogo")){
                LoadChild(x);
            } else if (HoldItem.equals("Okwetyabira akalimu obuwuka")){
                LoadChild(a);
            } else  if (HoldItem.equals("okwekulira embazzi kukugulu")){
                LoadChild(b);
            } else if (HoldItem.equals("Okwoza ku mmunye")){
                LoadChild(c);
            } else if (HoldItem.equals("Okukweka enjala")){
                LoadChild(d);
            } else if (HoldItem.equals("Okuliisa ebijanjalo empiso")){
                LoadChild(e);
            } else  if (HoldItem.equals("Okumenya mu jjenje ekkalu")){
                LoadChild(jjenje);
            } else  if (HoldItem.equals("Okwesiwa amagengere")){
                LoadChild(ssiwa);
            } else if (HoldItem.equals("Okugaangatanyaekiwanga mu ngalo")){
                LoadChild(kwebaka);
            }  else if (HoldItem.equals("Okutema ebisiki")){
                LoadChild(siki);
            } else if (HoldItem.equals("Okusimba kasooli")){
                LoadChild(ok);
            } else  if (HoldItem.equals("okujja omukono mu ngabo")){
                LoadChild(tip);
            } else if (HoldItem.equals("Okunyenya agaliba enjole")){
                LoadChild(ko);
            } else if (HoldItem.equals("Okulinnya mumusaayi")){
                LoadChild(lin);
            } else if (HoldItem.equals("Kinywa na mpindi")){
                LoadChild(pin);
            } else if (HoldItem.equals("Okweyimbamu ogwa kabugu")){
                LoadChild(ob);
            } else if (HoldItem.equals("Enkoko okugikwata omumwa")){
                LoadChild(enkoko);
            } else if (HoldItem.equals("Okuyisa omukka mu kisero")){
                LoadChild(sero);
            } else if (HoldItem.equals("Okukirira e zira kumwa")){
                LoadChild(mwa);
            } else if (HoldItem.equals("Okufuuyira endiga omulere")){
                LoadChild(ndiga);
            } else if (HoldItem.equals("Okusiika ebinyomo")){
                LoadChild(binyomo);
            } else  if(HoldItem.equals("Okufuuka omusu gw'ekanyanya")){
                LoadChild(kanyanya);
            } else  if (HoldItem.equals("Okukaabya omuntu akayirigombe")){
                LoadChild(aka);
            } else if (HoldItem.equals("Okukuba obulatti")){
                LoadChild(lati);
            } else if (HoldItem.equals("Ekintu okuba nga n'owemindi asena")){
                LoadChild(mindi);
            } else if (HoldItem.equals("Olubuto okuba mu mannyo")){
                LoadChild(mannyo);
            } else if (HoldItem.equals("Olubuto okuba mu mumugongo")){
                LoadChild(njala);
            } else if (HoldItem.equals("Okukotakoota mu ga lumonde")){
                LoadChild(lumonde);
            } else if (HoldItem.equals("Okugenda ekaganga")){
                LoadChild(iok);
            }
            else if (HoldItem.equals("Okuteeka nga aga lubigi")){
                LoadChild(ob1);
            }
            else if (HoldItem.equals("Gaboggola g'ekikere kyenamugongo")){
                LoadChild(ob2);
            }
            else if (HoldItem.equals("Okwewugulaza ng'Omunyoro alya engabi")){
                LoadChild(ob3);
            }
            else if (HoldItem.equals("Okweyinula ng' omusimbu agenda ku lutabaalo")){
                LoadChild(ob4);
            }

            else if (HoldItem.equals("OkukuumaOkukuuma ekintu nga akalira k'omwana")){
                LoadChild(ob5);
            }
            else if (HoldItem.equals("Emundu emenye")){
                LoadChild(ob6);
            }
            else if (HoldItem.equals("Okutema kulw'enamuganga")){
                LoadChild(ob7);
            }
            else if (HoldItem.equals("Okuyita sikaala ebuddo")){
                LoadChild(ob8);
            }
            else if (HoldItem.equals("Okuzannya n'owebiti")){
                LoadChild(ob9);
            }
            else if (HoldItem.equals("Okukaaba aga waggoonya")){
                LoadChild(ob10);
            }
            else if (HoldItem.equals("Okudda e Mbaale mu baganda banno")){
                LoadChild(ob11);
            }
            else if (HoldItem.equals("Okusanga nga galinnye olunnyo")){
                LoadChild(ob12);
            }
            else if (HoldItem.equals("Okukuba ey'abageye")){
                LoadChild(ob13);
            }
            else if (HoldItem.equals("Balyegiira ng'ensimbi egula muwogo")){
                LoadChild(ob14);
            }
            else if (HoldItem.equals("  Okwetala nga Namutale omunyageko ente")){
                LoadChild(ob15);
            }




            else
                LoadChild(defaultName);
            ParentListItems.put(HoldItem, ChildList);
        }

        expandableListView = findViewById(R.id.expandListView);
        final ExpandableListAdapter expandableListAdapter = new ListAdapter(this, ParentList, ParentListItems);
        expandableListView.setAdapter(expandableListAdapter);



    }

    private void LoadChild(String[] ParentElementName) {
        ChildList = new ArrayList<>();
        Collections.addAll(ChildList, ParentElementName);

    }

}

