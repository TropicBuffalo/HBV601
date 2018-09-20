package com.example.notandi.hospitalwagons;

import android.app.Activity;


import java.util.ArrayList;

import java.util.List;

/**
 * Created by Olaf on 04/07/2018.
 */

//https://www.isostech.com/blogs/software-development/android-retain-fragment-input/
//https://www.isostech.com/blogs/software-development/android-retain-fragment-input/


public class  ListProcessing extends Activity
{


    public int numberOfItems = 2; // need to be worked on
    private int numberOfWagons = 1;
    private  int numberOfDrawers = 9;
    private  int numberOfDetales = 5;
    public static String[][][][] wagon = new String[1][10][29][6];
    public static String[][][][] CompareWagon = new String[1][10][29][6];
    public static String[][] finalWagon;
    public List<List<List<Object>>> Cartlist = new ArrayList<List<List<Object>>>();


    // if seal is broken and the rest of the list is considered "used" and needs counting
    void sealBroken(){

        for(int i=0;i<26;i++){wagon[0][1][i][5]="false";}
        for(int i=0;i<29;i++){wagon[0][2][i][5]="false";}
        for(int i=0;i<8;i++){wagon[0][3][i][5]="false";}
        for(int i=0;i<18;i++){wagon[0][4][i][5]="false";}
        for(int i=0;i<7;i++){wagon[0][5][i][5]="false";}
        for(int i=0;i<4;i++){wagon[0][6][i][5]="false";}
        for(int i=0;i<4;i++){wagon[0][7][i][5]="false";}
        for(int i=0;i<5;i++){wagon[0][8][i][5]="false";}
        for(int i=0;i<27;i++){wagon[0][9][i][5]="false";}

    }
    public static void ChangeData(int drawer,int position,String userinput){
        ListProcessing.wagon[0][drawer][position][3] = userinput;
        System.out.println("ListProcessing.wagon[0]["+drawer+"]["+position+"][3]: " + ListProcessing.wagon[0][drawer][position][3] + "+++++++++++++++++++++++++++++++");
    }

    public void commitList() {

        finalWagon = new String[153][6];

        int FWLC=0; //Finalwagonlist counter
        String[] DrawerList ={"OFANÁ VAGNI","LYFJASKÚFFA",
                "SKÚFFA NR 1","SKÚFFA NR 2","SKÚFFA NR 3","SKÚFFA NR 4",
                "SKÚFFA NR 5","SKÚFFA NR 6","SKÚFFA NR 7","BRÁÐABÚNAÐUR FYRIR BÖRN"};

        for(int i=0;i<=9;i++)
        {
            finalWagon[FWLC][0]=DrawerList[i];
            FWLC++;
            for(int j=0;j<29;j++)
            {
                //if(wagon[0][i][j][0].isEmpty()){break;}
                if((wagon[0][i][j][5] == "false")||(wagon[0][i][j][3] != CompareWagon[0][i][j][3]))
                {
                    finalWagon[FWLC][0]=wagon[0][i][j][0];
                    finalWagon[FWLC][1]=wagon[0][i][j][1];
                    finalWagon[FWLC][2]=wagon[0][i][j][2];
                        if(wagon[0][i][j][3]==null){finalWagon[FWLC][3]="0";}
                        else{finalWagon[FWLC][3]= Integer.toString(Integer.parseInt(CompareWagon[0][i][j][3]) - Integer.parseInt(wagon[0][i][j][3])) ;}
                    finalWagon[FWLC][4]=wagon[0][i][j][4];
                    finalWagon[FWLC][5]="false";
                    FWLC++;
                }
            }
        }
    }

   public static void initList()
    {

//1 -Ofan á og utan á vagni:

        wagon[0][0][0][0] = "Hjartastuðtæki";
        wagon[0][0][1][0] = "External pacemaker kapall og tilheyrandi padsar";
        wagon[0][0][2][0] = "Elektróður";
        wagon[0][0][3][0] = "Gelpúðar/Defib. padsar";
        wagon[0][0][4][0] = "Gult nálabox";
        wagon[0][0][5][0] = "AMBU-belgur og maski";
        wagon[0][0][6][0] = "Súrefnisslanga (græn)";
        wagon[0][0][7][0] = "Súrefniskútur";
        wagon[0][0][8][0] = "Sog og safnflaska";
        wagon[0][0][9][0] = "Kassi með grænni súrefnisslöngu";
        wagon[0][0][10][0] = "Eftirlitsblöð fyrir bráðavagn";
        wagon[0][0][11][0] = "Skráningarblöð fyrir endurlífgun";
        wagon[0][0][12][0] = "Ferlar í sérhæfðri endurlífgun fullorðinna";
        wagon[0][0][13][0] = "Lyftulykill";
        wagon[0][0][14][0] = "Súefnismettunarmælir";
        wagon[0][0][15][0] = "Hlustunarpípa";

//---------------------------------------------------------------------------------
//2- Lyfjaskúffa

// "medicine_drawer_items"

        wagon[0][1][0][0] ="Inj. Adrenalin 1mg/ml";
        wagon[0][1][1][0] ="Inj. Adrenalin 0,1 mg /ml";
        wagon[0][1][2][0] ="Inj. Atropin 0,5mg/ml";
        wagon[0][1][3][0] ="Inj. Calcium Gluconate 10%";
        wagon[0][1][4][0] ="Inj. Cordarone 50mg/ml";
        wagon[0][1][5][0] ="Inj. Dormicum 1mg/ml";
        wagon[0][1][6][0] ="Inj. Dópamin 400mg/40/mg/ml";
        wagon[0][1][7][0] ="Inj. Furix 10mg/ml";
        wagon[0][1][8][0] ="Inj Flumazenil 0,1mg/ml";
        wagon[0][1][9][0] ="Inj Fenylefrin 0,1mg/ml";
        wagon[0][1][10][0] ="Inf. Glúkósa 500mg/ml (50%)";
        wagon[0][1][11][0] ="Inf. Magnesium 246mg/ml(1mmol/ml)";
        wagon[0][1][12][0] ="Inj. Naloxon.HCl. 0,4 mg/ml";
        wagon[0][1][13][0] ="Inf. Natríumhydrogenkarbonate 42mg/ml";
        wagon[0][1][14][0] ="Inj. Natríumklóríð 0,9%";
        wagon[0][1][15][0] ="Inf. Natríumklórið 0,9%"	;
        wagon[0][1][16][0] ="Inj. Propolipid 10mg/ml";
        wagon[0][1][17][0] ="Inj. Seloken  1mg/ml";
        wagon[0][1][18][0] ="Inj. Solu-Cortef 50mg/ml  + leysir";
        wagon[0][1][19][0] ="Inj. Stesolid Novum/Stesolid 5mg/ml	Diazepam";
        wagon[0][1][20][0] ="Inj. Tavegyl  1mg/ml";
        wagon[0][1][21][0] ="Inj. Xylocard 20mg/m";
        wagon[0][1][22][0] ="Mini spike";
        wagon[0][1][23][0] ="Inj Esmeron 10mg/ml";
        wagon[0][1][24][0] ="Inj Fentanyl 0,05mg/ml";
        wagon[0][1][25][0] ="Inj. Celocurin 50mg/ml";


//  "medicine_drawer_info"
        wagon[0][1][0][1] ="Adrenalin";
        wagon[0][1][1][1] ="Adrenalin";
        wagon[0][1][2][1] ="Atropin";
        wagon[0][1][3][1] ="Calsium gluconat";
        wagon[0][1][4][1] ="AmiodaronHCl";
        wagon[0][1][5][1] ="MidazolamHCl";
        wagon[0][1][6][1] ="Dópamín";
        wagon[0][1][7][1] ="Furosemid";
        wagon[0][1][8][1] ="Flumazenil";
        wagon[0][1][9][1] ="Fenylefrin";
        wagon[0][1][10][1] ="Glukosa";
        wagon[0][1][11][1] ="Magnesiumsulfat";
        wagon[0][1][12][1] ="NaloxonHCl";
        wagon[0][1][13][1] ="Natríumhydrogenkarbonate";
        wagon[0][1][14][1] ="Natriumklorið";
        wagon[0][1][15][1] ="Natríumklorið";
        wagon[0][1][16][1] ="Propofol";
        wagon[0][1][17][1] ="Metoprolol";
        wagon[0][1][18][1] ="Hydrocortison";
        wagon[0][1][19][1] ="Diazepam";
        wagon[0][1][20][1] ="Clemastin";
        wagon[0][1][21][1] ="Lidocain";
        wagon[0][1][22][1] ="Mini spike";
        wagon[0][1][23][1] ="Rocuronium";
        wagon[0][1][24][1] ="Fentanyl";
        wagon[0][1][25][1] ="Suxameton";

//"medicine_drawer_dose"
        wagon[0][1][0][2] ="1ml";
        wagon[0][1][1][2] ="10";
        wagon[0][1][2][2] ="1ml";
        wagon[0][1][3][2] ="10ml";
        wagon[0][1][4][2] ="3ml";
        wagon[0][1][5][2] ="5ml";
        wagon[0][1][6][2] ="10ml";
        wagon[0][1][7][2] ="4ml";
        wagon[0][1][8][2] ="5 ml";
        wagon[0][1][9][2] ="5ml";
        wagon[0][1][10][2] ="50ml";
        wagon[0][1][11][2] ="10ml";
        wagon[0][1][12][2] ="1ml";
        wagon[0][1][13][2] ="250ml";
        wagon[0][1][14][2] ="50ml";
        wagon[0][1][15][2] ="250ml";
        wagon[0][1][16][2] ="20ml";
        wagon[0][1][17][2] ="5ml";
        wagon[0][1][18][2] ="2ml";
        wagon[0][1][19][2] ="2ml";
        wagon[0][1][20][2] ="2ml";
        wagon[0][1][21][2] ="5ml";
        wagon[0][1][22][2] ="stk";
        wagon[0][1][23][2] ="5ml";
        wagon[0][1][24][2] ="2ml";
        wagon[0][1][25][2] ="2ml";

//"medicine_drawer_quantity"
        wagon[0][1][0][3] ="8";
        wagon[0][1][1][3] ="1";
        wagon[0][1][2][3] ="8";
        wagon[0][1][3][3] ="2";
        wagon[0][1][4][3] ="6";
        wagon[0][1][5][3] ="3";
        wagon[0][1][6][3] ="1";
        wagon[0][1][7][3] ="4";
        wagon[0][1][8][3] ="1";
        wagon[0][1][9][3] ="1";
        wagon[0][1][10][3] ="1";
        wagon[0][1][11][3] ="2";
        wagon[0][1][12][3] ="2";
        wagon[0][1][13][3] ="1";
        wagon[0][1][14][3] ="1";
        wagon[0][1][15][3] ="1";
        wagon[0][1][16][3] ="2";
        wagon[0][1][17][3] ="6";
        wagon[0][1][18][3] ="2";
        wagon[0][1][19][3] ="2";
        wagon[0][1][20][3] ="2";
        wagon[0][1][21][3] ="3";
        wagon[0][1][22][3] ="2";
        wagon[0][1][23][3] ="2";
        wagon[0][1][24][3] ="5";
        wagon[0][1][25][3] ="2";

//"medicine_drawer_type"
        wagon[0][1][0][4] ="amp";
        wagon[0][1][1][4] ="amp";
        wagon[0][1][2][4] ="amp";
        wagon[0][1][3][4] ="amp";
        wagon[0][1][4][4] ="amp";
        wagon[0][1][5][4] ="amp";
        wagon[0][1][6][4] ="amp";
        wagon[0][1][7][4] ="amp";
        wagon[0][1][8][4] ="amp";
        wagon[0][1][9][4] ="amp";
        wagon[0][1][10][4] ="hgl";
        wagon[0][1][11][4] ="hgl";
        wagon[0][1][12][4] ="amp";
        wagon[0][1][13][4] ="hgl";
        wagon[0][1][14][4] ="hgl";
        wagon[0][1][15][4] ="stk";
        wagon[0][1][16][4] ="hgl";
        wagon[0][1][17][4] ="amp";
        wagon[0][1][18][4] ="hgl";
        wagon[0][1][19][4] ="amp";
        wagon[0][1][20][4] ="amp";
        wagon[0][1][21][4] ="amp";
        wagon[0][1][22][4] ="stk";
        wagon[0][1][23][4] ="amp";
        wagon[0][1][24][4] ="amp";
        wagon[0][1][25][4] ="amp";

//--------------------------------------------------------------------------------------------------------
//3 -Skúffa 1
        wagon[0][2][0][0] ="1 ml sprautur";
        wagon[0][2][1][0] ="2 ml sprautur";
        wagon[0][2][2][0] ="5 ml sprautur";
        wagon[0][2][3][0] ="10 ml sprautur";
        wagon[0][2][4][0] ="20 ml sprautur";
        wagon[0][2][5][0] ="60 ml sprautur";
        wagon[0][2][6][0] ="Venflonálar, hvítar";
        wagon[0][2][7][0] ="Venflonálar, grænar";
        wagon[0][2][8][0] ="Venflonálar, bleikar";
        wagon[0][2][9][0] ="Venflonálar, bleikar";
        wagon[0][2][10][0] ="Neoflonnálar, barna";
        wagon[0][2][11][0] ="Arteriunálar";
        wagon[0][2][12][0] ="Beinmergsbor (er á E6 og 14EG)";
        wagon[0][2][13][0] =" Beinmergsnálar (15mm, 25mm, 45mm) (Er á E6 og 14EG)";
        wagon[0][2][14][0] =" Uppdrögunarnálar";
        wagon[0][2][15][0] ="Tappar í venflo: hvítir, gulir, rauðir";
        wagon[0][2][16][0] ="3 way";
        wagon[0][2][17][0] ="3 way með 10 cm framlengingu";
        wagon[0][2][18][0] ="Stasi";
        wagon[0][2][19][0] =" Bómullarhnoðrar";
        wagon[0][2][20][0] ="Sprittpúðar";
        wagon[0][2][21][0] ="Plástur";
        wagon[0][2][22][0] ="Curapor";
        wagon[0][2][23][0] ="OpSite/Hydrofilm";
        wagon[0][2][24][0] ="Einnota rakvélar";
        wagon[0][2][25][0] ="Sekalon T 170 (CVK leggur, grár)";
        wagon[0][2][26][0] ="Sekalon T 120 (CVK leggur, grænn";
        wagon[0][2][27][0] ="Astrup sprautur";
        wagon[0][2][28][0] ="Skæri";

        //"drawer_one_quantity"
        wagon[0][2][0][3] ="5";
        wagon[0][2][1][3] ="10";
        wagon[0][2][2][3] ="10";
        wagon[0][2][3][3] ="5";
        wagon[0][2][4][3] ="2";
        wagon[0][2][5][3] ="1";
        wagon[0][2][6][3] ="2";
        wagon[0][2][7][3] ="4";
        wagon[0][2][8][3] ="4";
        wagon[0][2][9][3] ="4";
        wagon[0][2][10][3] ="3";
        wagon[0][2][11][3] ="2";
        wagon[0][2][12][3] ="1";
        wagon[0][2][13][3] ="1";
        wagon[0][2][14][3] ="10";
        wagon[0][2][15][3] ="0";
        wagon[0][2][16][3] ="2";
        wagon[0][2][17][3] ="2";
        wagon[0][2][18][3] ="1";
        wagon[0][2][19][3] ="1";
        wagon[0][2][20][3] ="1";
        wagon[0][2][21][3] ="1";
        wagon[0][2][22][3] ="4";
        wagon[0][2][23][3] ="3";
        wagon[0][2][24][3] ="2";
        wagon[0][2][25][3] ="3";
        wagon[0][2][26][3] ="3";
        wagon[0][2][27][3] ="3";
        wagon[0][2][28][3] ="1";

        //  "drawer_one_type"
        wagon[0][2][0][4] ="stk.";
        wagon[0][2][1][4] ="stk.";
        wagon[0][2][2][4] ="stk.";
        wagon[0][2][3][4] ="stk.";
        wagon[0][2][4][4] ="stk.";
        wagon[0][2][5][4] ="stk.";
        wagon[0][2][6][4] ="stk.";
        wagon[0][2][7][4] ="stk.";
        wagon[0][2][8][4] ="stk.";
        wagon[0][2][9][4] ="stk.";
        wagon[0][2][10][4] ="stk.";
        wagon[0][2][11][4] ="stk.";
        wagon[0][2][12][4] ="stk.";
        wagon[0][2][13][4] ="stk.";
        wagon[0][2][14][4] ="stk.";
        wagon[0][2][15][4] ="  ";
        wagon[0][2][16][4] ="stk.";
        wagon[0][2][17][4] ="stk.";
        wagon[0][2][18][4] ="stk.";
        wagon[0][2][19][4] ="  ";
        wagon[0][2][20][4] ="  ";
        wagon[0][2][21][4] ="  ";
        wagon[0][2][22][4] ="stk.";
        wagon[0][2][23][4] ="stk.";
        wagon[0][2][24][4] ="stk.";
        wagon[0][2][25][4] ="stk.";
        wagon[0][2][26][4] ="stk.";
        wagon[0][2][27][4] ="stk.";
        wagon[0][2][28][4] ="stk.";


//--------------------------------------------------------------------------------
//4- Skúffa 2:

// Drawer 4 name="drawer_two"Skúffa 2
        wagon[0][3][0][0] ="Hanskar ósterilir";
        wagon[0][3][1][0] ="Hanskar sterilir";
        wagon[0][3][2][0] ="Sogleggir, grænir";
        wagon[0][3][3][0] ="Sogleggir, hvítir";
        wagon[0][3][4][0] ="Millistykki fyrir sogleggi";
        wagon[0][3][5][0] ="Súrefnisgleraugu";
        wagon[0][3][6][0] ="Súrefnisleggur með svamp";
        wagon[0][3][7][0] ="Súrefnismaskar (NRB)";

//"drawer_two_quantity"
        wagon[0][3][0][3] ="1";
        wagon[0][3][1][3] ="1";
        wagon[0][3][2][3] ="4";
        wagon[0][3][3][3] ="2";
        wagon[0][3][4][3] ="1";
        wagon[0][3][5][3] ="1";
        wagon[0][3][6][3] ="1";
        wagon[0][3][7][3] ="1";

//"drawer_two_type"
        wagon[0][3][0][4] ="kassi";
        wagon[0][3][1][4] ="Nr. 6.5, 7.5, 8";
        wagon[0][3][2][4] ="stk.";
        wagon[0][3][3][4] ="stk.";
        wagon[0][3][4][4] ="stk.";
        wagon[0][3][5][4] ="stk.";
        wagon[0][3][6][4] ="stk.";
        wagon[0][3][7][4] ="stk.";


//----------------------------------------------------------------------------------------
//5- Skúffa 3:

//  name="drawer_three"Skúffa 3

        wagon[0][4][0][0] ="Laryngoscope";
        wagon[0][4][1][0] ="Blöð á laryngoscope nr. 2, 3, 4";
        wagon[0][4][2][0] ="Rafhlöður í laryngoscope";
        wagon[0][4][3][0] ="Kokrennur nr. 1, 2, 3 (70, 80, 90, 100 mm)";
        wagon[0][4][4][0] ="Maskar nr. 3, 4 og 5";
        wagon[0][4][5][0] ="Barkatúbur nr. 6,5";
        wagon[0][4][6][0] ="Barkatúbur nr. 7";
        wagon[0][4][7][0] ="Barkatúbur nr. 7,5";
        wagon[0][4][8][0] ="Barkatúbur nr. 8";
        wagon[0][4][9][0] ="Leiðari fyrir barkatúbur";
        wagon[0][4][10][0] ="Igel túbur";
        wagon[0][4][11][0] ="Minitrack kit (Porex cricothyriodotmy Kit)";
        wagon[0][4][12][0] ="Æðatöng";
        wagon[0][4][13][0] ="Magilstöng";
        wagon[0][4][14][0] ="Xylocain gel (lidocain)";
        wagon[0][4][15][0] ="10 ml sprauta";
        wagon[0][4][16][0] ="Brúnn plástur";
        wagon[0][4][17][0] ="Capnographsnúra og millistykki";

        // "drawer_three_quantity"
        wagon[0][4][0][3] ="2";
        wagon[0][4][1][3] ="1";
        wagon[0][4][2][3] ="2";
        wagon[0][4][3][3] ="1";
        wagon[0][4][4][3] ="1";
        wagon[0][4][5][3] ="2";
        wagon[0][4][6][3] ="1";
        wagon[0][4][7][3] ="1";
        wagon[0][4][8][3] ="1";
        wagon[0][4][9][3] ="1";
        wagon[0][4][10][3] ="3";
        wagon[0][4][11][3] ="1";
        wagon[0][4][12][3] ="1";
        wagon[0][4][13][3] ="1";
        wagon[0][4][14][3] ="1";
        wagon[0][4][15][3] ="1";
        wagon[0][4][16][3] ="1";
        wagon[0][4][17][3] ="1";

        // "drawer_three_type"
        wagon[0][4][0][4] ="stk.";
        wagon[0][4][1][4] ="stk.";
        wagon[0][4][2][4] ="stk.";
        wagon[0][4][3][4] ="stk. af hverri stærð";
        wagon[0][4][4][4] ="stk.";
        wagon[0][4][5][4] ="stk.";
        wagon[0][4][6][4] ="stk.";
        wagon[0][4][7][4] ="stk.";
        wagon[0][4][8][4] ="stk.";
        wagon[0][4][9][4] ="stk.";
        wagon[0][4][10][4] ="stærðir, gul, appelsínugul, græn";
        wagon[0][4][11][4] ="stk.";
        wagon[0][4][12][4] ="stk.";
        wagon[0][4][13][4] ="stk.";
        wagon[0][4][14][4] ="túba";
        wagon[0][4][15][4] ="stk";
        wagon[0][4][16][4] =" ";
        wagon[0][4][17][4] ="Er á E6";




//--------------------------------------------------------------------------------
//6- Skúffa 4 /undirvagn:

// - name="drawer_four"Skúffa 4

        wagon[0][5][0][0] ="Stuðpadsar fyrir hjartarafstuðtæki og defi-Pads";
        wagon[0][5][1][0] ="Padsar til vara fyrir externa pacemacerkapal";
        wagon[0][5][2][0] ="Pappír fyrir defibrillator";
        wagon[0][5][3][0] ="Nýrnabakkar";
        wagon[0][5][4][0] ="Sæft vatn";
        wagon[0][5][5][0] ="Þrýstipoki";
        wagon[0][5][6][0] ="Pericardialsett á 14EG (er ekki á vagni E6 né á vagni 22A)";

        //   "drawer_four_quantity"
        wagon[0][5][0][3] ="1";
        wagon[0][5][1][3] ="2";
        wagon[0][5][2][3] ="1";
        wagon[0][5][3][3] ="1";
        wagon[0][5][4][3] ="1";
        wagon[0][5][5][3] ="1";
        wagon[0][5][6][3] ="1";

//    "drawer_four_type"
        wagon[0][5][0][4] =" ";
        wagon[0][5][1][4] ="stk.";
        wagon[0][5][2][4] =" ";
        wagon[0][5][3][4] =" ";
        wagon[0][5][4][4] =" ";
        wagon[0][5][5][4] =" ";
        wagon[0][5][6][4] =" ";

//--------------------------------------------------------------------------------
//7- Skúffa 5:

        wagon[0][6][0][0] ="Agilia vökvasett";
        wagon[0][6][1][0] ="Vökvasett, venjulegt með lofttappa";
        wagon[0][6][2][0] ="Framlengingarslanga";

        //      "drawer_five_quantity"
        wagon[0][6][0][3] ="2";
        wagon[0][6][1][3] ="2";
        wagon[0][6][2][3] ="2";

        //  "drawer_five_type"
        wagon[0][6][0][4] ="stk.";
        wagon[0][6][1][4] ="stk.";
        wagon[0][6][2][4] ="stk.";

//--------------------------------------------------------------------------------
//8- Skúffa 6:

        wagon[0][7][0][0] ="Inf. Lidokain 0,4%,";
        wagon[0][7][1][0] ="Inf. Ringer Acetat";
        wagon[0][7][2][0] ="Inf. Albumin 200g/l";

        //  "drawer_six_info"
        wagon[0][7][0][1] ="Lidocain";
        wagon[0][7][1][1] ="Na+, K+, Ca++, Mg++, Cl-, acetat";
        wagon[0][7][2][1] =" ";

        // "drawer_six_dose"
        wagon[0][7][0][2] ="500 ml";
        wagon[0][7][1][2] ="1000 ml";
        wagon[0][7][2][2] ="100 ml";

        //"drawer_six_quantity"
        wagon[0][7][0][3] ="1";
        wagon[0][7][1][3] ="1";
        wagon[0][7][2][3] ="1";

        // "drawer_six_type"
        wagon[0][7][0][4] ="poki";
        wagon[0][7][1][4] ="poki";
        wagon[0][7][2][4] ="poki";


//-------------------------------------------------------------------------------
//9- Skúffa 7:
//Skúffa 7
        //name="drawer_seven_items"
        wagon[0][8][0][0]="Inf. NaCl 0,9%";
        wagon[0][8][1][0]="Inf. NaCl 0,9%";
        wagon[0][8][2][0]="Inf. NaCl 0,9%";
        wagon[0][8][3][0]="Inf. Glúkósa 5%";
        wagon[0][8][4][0]="Inf. Glúkósa 5%";

        //name="drawer_seven_info"
        wagon[0][8][0][1]="Natriumklorið";
        wagon[0][8][1][1]="Natriumklorið";
        wagon[0][8][2][1]="Natriumklorið";
        wagon[0][8][3][1]="Glukosa";
        wagon[0][8][4][1]="Glukosa";

        //name="drawer_seven_dose"
        wagon[0][8][0][2]="100 ml";
        wagon[0][8][1][2]="500 ml";
        wagon[0][8][2][2]="1000 ml";
        wagon[0][8][3][2]="100 ml";
        wagon[0][8][4][2]="500 ml";

        //name="drawer_seven_quantity"
        wagon[0][8][0][3]="1";
        wagon[0][8][1][3]="1";
        wagon[0][8][2][3]="1";
        wagon[0][8][3][3]="1";
        wagon[0][8][4][3]="1";

        //name="drawer_seven_type"
        wagon[0][8][0][4]="poki";
        wagon[0][8][1][4]="poki";
        wagon[0][8][2][4]="poki";
        wagon[0][8][3][4]="poki";
        wagon[0][8][4][4]="poki";



//-------------------------------------------------------------------------------

// Drawer 8 - name="drawer_eight"Bráðabúnaður fyrir börn (í plastkassa neðst í vagni)

        wagon[0][9][0][0] ="Verkferill fyrir bráðveik börn";
        wagon[0][9][1][0] ="Barna AMBU-poki - millistærð";
        wagon[0][9][2][0] ="Barnamaski nr 0/0";
        wagon[0][9][3][0] ="Barnamaski nr 1/0";
        wagon[0][9][4][0] ="Barnamaski nr 2/0";
        wagon[0][9][5][0] ="Barnamaski nr 3/0";
        wagon[0][9][6][0] ="Laryngoscope";
        wagon[0][9][7][0] ="Blað nr. 1";
        wagon[0][9][8][0] ="Blað nr. 2";
        wagon[0][9][9][0] ="Defib pads f. börn";
        wagon[0][9][10][0] ="Leiðari fyrir barnatúbu nr. 2,2";
        wagon[0][9][11][0] ="Leiðari fyrir barnatúbu nr. 4,0";
        wagon[0][9][12][0] ="Kokrennur af stærðum 0, 1, 2";
        wagon[0][9][13][0] ="Endotracheal túbur nr. 3, 4, 5, 6";
        wagon[0][9][14][0] ="Sogleggur nr. 6";
        wagon[0][9][15][0] ="Sogleggur nr. 8";
        wagon[0][9][16][0] ="Sogleggur nr. 10";
        wagon[0][9][17][0] ="Magilstöng";
        wagon[0][9][18][0] ="Æðanálar nr 0,6";
        wagon[0][9][19][0] ="Æðanálar nr. 0,8";
        wagon[0][9][20][0] ="Intraosseusnál, rosa (15g, 15mm) (Er á E6 og 14EG)";
        wagon[0][9][21][0] ="Intraosseusnál, blá (18g, 25mm) (Er á E6 og 14EG)";
        wagon[0][9][22][0] ="Butterflynálar nr. 21G og 23G";
        wagon[0][9][23][0] ="Spelka";
        wagon[0][9][24][0] ="Ferill í sérhæfðri endurlífgun barna";
        wagon[0][9][25][0] ="Súrefnismettunarnemar og millistykki sem passa á LP";
        wagon[0][9][26][0] ="Spritt";

        //integer-array name="drawer_eight_quantity"
        wagon[0][9][0][3] ="1";
        wagon[0][9][1][3] ="1";
        wagon[0][9][2][3] ="1";
        wagon[0][9][3][3] ="1";
        wagon[0][9][4][3] ="1";
        wagon[0][9][5][3] ="1";
        wagon[0][9][6][3] ="1";
        wagon[0][9][7][3] ="1";
        wagon[0][9][8][3] ="1";
        wagon[0][9][9][3] ="1";
        wagon[0][9][10][3] ="1";
        wagon[0][9][11][3] ="1";
        wagon[0][9][12][3] ="1";
        wagon[0][9][13][3] ="1";
        wagon[0][9][14][3] ="1";
        wagon[0][9][15][3] ="3";
        wagon[0][9][16][3] ="1";
        wagon[0][9][17][3] ="1";
        wagon[0][9][18][3] ="3";
        wagon[0][9][19][3] ="2";
        wagon[0][9][20][3] ="1";
        wagon[0][9][21][3] ="1";
        wagon[0][9][22][3] ="2";
        wagon[0][9][23][3] ="1";
        wagon[0][9][24][3] ="1";
        wagon[0][9][25][3] ="2";
        wagon[0][9][26][3] ="1";

        //name="drawer_eight_type"
        wagon[0][9][0][4] ="stk.";
        wagon[0][9][1][4] ="stk.";
        wagon[0][9][2][4] ="stk.";
        wagon[0][9][3][4] ="stk.";
        wagon[0][9][4][4] ="stk.";
        wagon[0][9][5][4] ="stk.";
        wagon[0][9][6][4] ="stk.";
        wagon[0][9][7][4] ="stk.";
        wagon[0][9][8][4] ="stk.";
        wagon[0][9][9][4] ="stk.";
        wagon[0][9][10][4] ="stk.";
        wagon[0][9][11][4] ="stk.";
        wagon[0][9][12][4] ="stk.";
        wagon[0][9][13][4] ="stk.";
        wagon[0][9][14][4] ="stk.";
        wagon[0][9][15][4] ="stk.";
        wagon[0][9][16][4] ="stk.";
        wagon[0][9][17][4] ="stk.";
        wagon[0][9][18][4] ="stk.";
        wagon[0][9][19][4] ="stk.";
        wagon[0][9][20][4] ="stk.";
        wagon[0][9][21][4] ="stk.";
        wagon[0][9][22][4] ="stk.";
        wagon[0][9][23][4] ="stk.";
        wagon[0][9][24][4] ="stk.";
        wagon[0][9][25][4] ="stk.";
        wagon[0][9][26][4] ="stk.";

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<29;j++)
            {
                if(i==0){wagon[0][i][j][5] = "false";}
                else{wagon[0][i][j][5] = "true";}
            }
        }

        CompareWagon=wagon;
    }

 // ITEMS BELOW ARE NOT IN USE, JUST KEEPING IT FOR POSSIBLE FUTURE USE

}


/*
import java.util.ArrayList;
        import java.util.*;
        import java.util.List;
        import java.util.Arrays;
        import java.util.ArrayList;


public class ClassNameHere {
    public static void main(String[] args) {
        //ArrayList<Item> items = new ArrayList<Item>();

//      for(int i=0;i<)
        //   System.out.println(s);

        //   items.add(new Item(item, quantity, type));
        //-----------------------------------------------
                List<List<Object>> bogus = new ArrayList<List<Object>>();
       // bogus.add(new ArrayList<String>());
       //List<Object> sub=new List<Object>();

        int b=0;
        for (int i=0;i<3;i++) {
            System.out.println("New list");
             bogus.add(new ArrayList<Object>());
               bogus.get(i).add("Fyrst");
               bogus.get(i).add("Second");
               bogus.get(i).add(6);
               System.out.println("Loadup complete");
               System.out.println(bogus.get(i).get(i));
        }

        //----------------------------------------------------------------
        List<List<String>> bogus = new ArrayList<List<String>>();
        bogus.add(new ArrayList<String>());
        bogus.get(0).add("Hello");
        String result = bogus.get(0).get(0);
        bogus.add(new ArrayList<String>());
        bogus.get(1).add("Goodbye");
        for (List<String> l : bogus) {
            System.out.println("Start list");
            for (String s : l) {
                System.out.println("Entry:  " + s);
            }
        }
        //-------------------------------------------------------------------
 /*
      ArrayList main = new ArrayList();
     ArrayList second1 = new ArrayList();
     ArrayList second2 = new ArrayList();
     ArrayList sub1=new ArrayList();
     ArrayList sub2=new ArrayList();
     ArrayList sub3=new ArrayList();
     ArrayList sub4=new ArrayList();
     ArrayList temp=new ArrayList();


      sub1.add("sub1");
      sub1.add("sub1");
            second1.add(sub1);
      sub2.add("sub2");
      sub2.add("sub2");
            second1.add(sub2);
              main.add(second1);
      sub3.add("sub3");
      sub3.add("sub3");
            second2.add(sub3);
      sub4.add("sub4");
      sub4.add("sub4");
            second2.add(sub4);
             main.add(second2);

      for (int i=0;i<main.size();i++) {

      //   for (int j=0;j<4;j++) {
            System.out.println(main.get(i));//error line
            System.out.println(main.next());//error line
            temp=main.get(0);
            System.out.println(temp);
       //}
}
*/

//-------------------------------------------------------------------
      /*
      List<Object> stockList = new ArrayList<Object>();
        List<Object> stockList1 = new ArrayList<Object>();
        stockList.add("stock1");
        stockList.add("stock2");
       List<Object> stockList2 = new ArrayList<Object>();
        stockList.add("stock3");
        stockList.add("stock4");
      stockList.add(stockList1);
      stockList.add(stockList2);

Object[] stockArr = new Object[stockList.size()];
stockArr = stockList.toArray(stockArr);

for(Object s : stockArr)
    System.out.println(s);
   */

  //  }
//}
