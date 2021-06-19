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



public class Engero<preparing> extends AppCompatActivity {


    private DrawerLayout drawerLayout;
    private Object SearchableActivity;


//    private DrawerLayout drawerLayout;

    public void ClickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);

    }

    public void ClickLogo(View view) {
        closeDrawer(drawerLayout);
    }

    public void ClickHome(View view) {
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickAbout(View view) {
        recreate();
    }

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

    public void ClickEbisoko(View view) {
        redirectActivity(this, Ebisoko.class);
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
                activity.finishAffinity();
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

    List<String> ParentList = new ArrayList<>();

    {
        ParentList.add("Sebuwoomi bwanswa");
        ParentList.add("Agamyukaomutezi");
        ParentList.add("Ezivaamu omukulu");
        ParentList.add("Sekikubo kitutte ente");
        ParentList.add("Waruggyo");
        ParentList.add("Lunayabira Emmanga");
        ParentList.add("Abalamu magoma.");
        ParentList.add("Obuyisi bwoomu.");
        ParentList.add("Sebugenyi bwa nsanafu");
        ParentList.add("Ogubula eyeguya");
        ParentList.add("Enkumbi okubula.");
        ParentList.add("Omukwano masavu");
        ParentList.add("Ettooke");
        ParentList.add("Gunsinze");
        ParentList.add("Okulya ennyingi.");
        ParentList.add("Ekikuwa obulema");
        ParentList.add("Omukisa nkukuny");
        ParentList.add("Ebigambo byakuno bingi.");
        ParentList.add("Kifundikwa kirinsabira");
        ParentList.add("Ennyonyi eteyise");
        ParentList.add("Nditwaala kinene");
        ParentList.add("Ekiri ewala");
        ParentList.add("Engabo enzira");
        ParentList.add("Awafiira omuzira");
        ParentList.add("Atya omusana");
        ParentList.add("Alina nyina omuto");
        ParentList.add("Siwemuke");
        ParentList.add("Oluyitayita");
        ParentList.add("Ayinayina omulogo");
        ParentList.add("Ani alimumpeera");
        ParentList.add("Analemwa ebbuzi okutuga");
        ParentList.add("Sematiko agajilwa omuwuulu");
        ParentList.add("Gwoliyunjila");
        ParentList.add("Akukuba omuggo omunene");
        ParentList.add("Banange bangi");
        ParentList.add("Nviiri mbi");
        ParentList.add("Sebuguzi bwa nnume");
        ParentList.add("Awagwa ekku");
        ParentList.add("Sebayita mbwa");
        ParentList.add("Abalirila ezigula e nkumb");
        ParentList.add(" Tunalyaamu eyidde");
        ParentList.add("Ebbikilizi");
        ParentList.add("Atali nanyini mbool");
        ParentList.add("Sebagobaganya musibe");
        ParentList.add("Guweddeko entotto");
        ParentList.add("Sentamu nkadde");
        ParentList.add("Selulume lubi");
        ParentList.add("Kiyita waggulu");

        ParentList.add("Oli wamugoonya");
        ParentList.add("Enkeletanyi");
        ParentList.add("Awayira omufu");
        ParentList.add("Akutwaala entwe");
        ParentList.add("Sebakisa bulwadde");
        ParentList.add("Ensawo yamugandawo");
        ParentList.add("Sebagobaganya musibe");
        ParentList.add("Guweddeko entotto");
        ParentList.add("Sentamu nkadde");
        ParentList.add("Selulume lubi");
        ParentList.add("Kiyita waggulu");


    }

    String[] planetName = {
            "natalya mutima agulira omwo"};

    String[] monthName = {"N'akasolo"};

    String[] P = {"zangaala"};

    String[] x = {"Kyekitwala n'omulaalo"};

    String[] a = {"Akalanga bya banne"};

    String[] b = {"Nga yesinga oluganda"};
    String[] c = {"Gavigira aliwo"};

    String[] d = {"Nsega y'ebika"
    };
    String[] e = {"Gwezizinda teyebaka"
    };
    String[] jjenje = {"Tegukula"
    };
    String[] ssiwa = {
            "Ew'omunafu mpoza"
    };
    String[] kwebaka = {
            "Ogalya Gakyayokya"
    };
    String[] siki = {
            "oliwanirira likyaali kumugogo"
    };
    String[] ok = {
            "Aliwa bitono"
    };

    String[] tip = {
            "Sikuggwa maddu"
    };

    String[] ko = {
            "Kyekikuwa n'amagezi"
    };
    String[] lin = {
            " Tegutuulirwa"
    };

    String[] pin = {
            "Nga nanyinimu y'asuza ababbi"
    };

    String[] enkoko = {
            "Ekolera makaayi"
    };

    String[] sero = {
            "Afa tatuuse buko"
    };
    String[] mwa = {
            "Mpenduzo yekiggyayo"
    };
    String[] ndiga = {
            "Ojilabira kubiwundu"
    };

    String[] binyomo = {
            "Tewaba Nsitaano"
    };

    String[] kanyanya = {
            "Talya bwami"
    };
    String[] aka = {
            "Tabulwa kitaawe"
    };
    String[] lati = {
            "yaafa n'omwami"
    };
    String[] mindi = {
            "Lukira oluliira ku nkoligo"
    };
    String[] mannyo = {
            "Y'amwokesa amaddu"
    };


    String[] njala = {
            "Awa wa kibuga"
    };

    String[] lumonde = {
            "Nti lintunulidde"
    };

    String[] iok = {
            "Mufumbo yagagaba ."
    };
    String[] defaultName = {
            "wano wakyakolebwako"
    };
    String[] ob = {
            "talya bwami"
    };
    String[] ob1 = {
            "Yakuyita nakyambe"
    };
    String[] ob2 = {
            "Akutenda nakaaba mbi"
    };
    String[] ob3 = {
            "nga tonagwa mu kibi "
    };
    String[] ob4 = {
            "Kikira ekiwalata."
    };
    String[] ob5 = {
            "tebubulako nteera"
    };
    String[] ob6 = {
            "tewabula bulondelerwa."
    };
    String[] ob7 = {
            "ng'omuggo gumuli mu ngalo"
    };
    String[] ob8 = {
            "Tawa munne ssooli ddene "
    };
    String[] ob9 = {
            "nga elumye mukazi "
    };
    String[] ob10 = {
            "si kigwo"
    };
    String[] ob11 = {
            "asima ayikuula"
    };
    String[] ob12 = {
            "naye entuuyo asala "
    };
    String[] ob13 = {
            "enyonyi zuguyita ttale"
    };
    String[] ob14 = {
            "tojazika munno"
    };
    String[] t15 = {
            "luwasa mulugo lwalwooba lwonoona mu lugo lwalwo"};

    String[] t16 = {
            "Otega wansi"};
    String[] t17 = {
            "bwotta enkoko ofumba kasooli"};
    String[] t18 = {
            ".bwogitega amenvu elya bibombo "};

    String[] t19 = {
            "yeteesa"};
    String[] t20 = {
            "Taba wa wala"};
    String[] t21 = {
            "enkooko zimwatula "};
    String[] t22 = {
            "Tekuterekera "};

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_engero);


        ParentListItems = new LinkedHashMap<>();
        for (String HoldItem : ParentList) {
            if (HoldItem.equals("Sebuwoomi bwanswa")) {
                LoadChild(planetName);
            } else if (HoldItem.equals("Agamyuka omutez")) {
                LoadChild(monthName);
            } else if (HoldItem.equals("Ezivaamu omukulu")) {
                LoadChild(P);
            } else if (HoldItem.equals("Sekikubo kitutte ente")) {
                LoadChild(x);
            } else if (HoldItem.equals("Waruggyo")) {
                LoadChild(a);
            } else if (HoldItem.equals("Lunayabira Emmanga")) {
                LoadChild(b);
            } else if (HoldItem.equals("Abalamu magoma.")) {
                LoadChild(c);
            } else if (HoldItem.equals("Obuyisi bwoomu.")) {
                LoadChild(d);
            } else if (HoldItem.equals("Sebugenyi bwa nsanafu")) {
                LoadChild(e);
            } else if (HoldItem.equals("Ogubula eyeguya")) {
                LoadChild(jjenje);
            } else if (HoldItem.equals("Enkumbi okubula.")) {
                LoadChild(ssiwa);
            } else if (HoldItem.equals("Omukwano masavu")) {
                LoadChild(kwebaka);
            } else if (HoldItem.equals("Ettooke")) {
                LoadChild(siki);
            } else if (HoldItem.equals("Gunsinze")) {
                LoadChild(ok);
            } else if (HoldItem.equals("Okulya ennyingi.")) {
                LoadChild(tip);
            } else if (HoldItem.equals("Ekikuwa obulema")) {
                LoadChild(ko);
            } else if (HoldItem.equals("Omukisa nkukuny")) {
                LoadChild(lin);
            } else if (HoldItem.equals("Ebigambo byakuno bingi.")) {
                LoadChild(pin);
            } else if (HoldItem.equals("Kifundikwa kirinsabira")) {
                LoadChild(ob);
            } else if (HoldItem.equals("Ennyonyi eteyise")) {
                LoadChild(enkoko);
            } else if (HoldItem.equals("Nditwaala kinene")) {
                LoadChild(sero);
            } else if (HoldItem.equals("Ekiri ewala")) {
                LoadChild(mwa);
            } else if (HoldItem.equals("Engabo enzira")) {
                LoadChild(ndiga);
            } else if (HoldItem.equals("Awafiira omuzira")) {
                LoadChild(binyomo);
            } else if (HoldItem.equals("Atya omusana")) {
                LoadChild(kanyanya);
            } else if (HoldItem.equals("Alina nyina omuto")) {
                LoadChild(aka);
            } else if (HoldItem.equals("Siwemuke")) {
                LoadChild(lati);
            } else if (HoldItem.equals("Oluyitayita")) {
                LoadChild(mindi);
            } else if (HoldItem.equals("Ayinayina omulogo")) {
                LoadChild(mannyo);
            } else if (HoldItem.equals("Ani alimumpeera")) {
                LoadChild(njala);
            } else if (HoldItem.equals("Analemwa ebbuzi okutuga")) {
                LoadChild(lumonde);
            } else if (HoldItem.equals("Sematiko agajilwa omuwuulu")) {
                LoadChild(iok);
            } else if (HoldItem.equals("Gwoliyunjila")) {
                LoadChild(ob1);
            } else if (HoldItem.equals("Akukuba omuggo omunene")) {
                LoadChild(ob2);
            } else if (HoldItem.equals("Banange bangi")) {
                LoadChild(ob3);
            } else if (HoldItem.equals("Nviiri mbi")) {
                LoadChild(ob4);
            } else if (HoldItem.equals("Sebuguzi bwa nnume")) {
                LoadChild(ob5);
            } else if (HoldItem.equals("Awagwa ekku")) {
                LoadChild(ob6);
            } else if (HoldItem.equals("Sebayita mbwa")) {
                LoadChild(ob7);
            } else if (HoldItem.equals("Abalirila ezigula e nkumb")) {
                LoadChild(ob8);
            } else if (HoldItem.equals(" Tunalyaamu eyidde")) {
                LoadChild(ob9);
            } else if (HoldItem.equals("Ebbikilizi")) {
                LoadChild(ob10);
            } else if (HoldItem.equals("Atali nanyini mbool")) {
                LoadChild(ob11);
            } else if (HoldItem.equals("Sebagobaganya musibe")) {
                LoadChild(ob12);
            } else if (HoldItem.equals("Guweddeko entotto")) {
                LoadChild(ob13);
            } else if (HoldItem.equals("Sentamu nkadde")) {
                LoadChild(ob14);
            } else if (HoldItem.equals("Selulume lubi")) {
                LoadChild(t15);
            } else if (HoldItem.equals("Kiyita waggulu")) {
                LoadChild(t16);

            } else if (HoldItem.equals("Oli wamugoonya")) {
                LoadChild(t17);
            } else if (HoldItem.equals("Enkeletanyi")) {
                LoadChild(t18);
            } else if (HoldItem.equals("Awayira omufu")) {
                LoadChild(t19);
            } else if (HoldItem.equals("Akutwaala entwe")) {
                LoadChild(t20);
            } else if (HoldItem.equals("Sebakisa bulwadde")) {
                LoadChild(t21);
            } else if (HoldItem.equals("Ensawo yamugandawo")) {
                LoadChild(t22);

            } else
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
