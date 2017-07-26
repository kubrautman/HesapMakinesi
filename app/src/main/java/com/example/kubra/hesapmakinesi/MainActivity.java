package com.example.kubra.hesapmakinesi;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText sonuc;
    Button dugme0;
    Button dugme1;
    Button dugme2;
    Button dugme3;
    Button dugme4;
    Button dugme5;
    Button dugme6;
    Button dugme7;
    Button dugme8;
    Button dugme9;
    Button dugmeArti;
    Button dugmeEksi;
    Button dugmeEsit;
    Button dugmeSil;
    Button dugmeBolu;
    Button dugmeHafizadanSil;
    Button  dugmeHafizayaAl;
    Button dugmeHafizayiGoster;
    Button dugmeCarpi;
    Button dugmeHafizayaEkle;
    Button dugmeHafizadanCıkar;
    public  char oncekiIslem;
    public int oncekiSayi;
    public  int sayi;
    public int hafiza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonuc=(EditText) findViewById(R.id.Sonuc);
        dugme0=(Button)findViewById(R.id.Dugme0);
        dugme1=(Button)findViewById(R.id.Dugme1);
        dugme2=(Button)findViewById(R.id.Dugme2);
        dugme3=(Button)findViewById(R.id.Dugme3);
        dugme4=(Button)findViewById(R.id.Dugme4);
        dugme5=(Button)findViewById(R.id.Dugme5);
        dugme6=(Button)findViewById(R.id.Dugme6);
        dugme7=(Button)findViewById(R.id.Dugme7);
        dugme8=(Button)findViewById(R.id.Dugme8);
        dugme9=(Button)findViewById(R.id.Dugme9);
        dugmeArti=(Button)findViewById(R.id.DugmeArti);
        dugmeEksi=(Button) findViewById(R.id.DugmeEksi);
        dugmeEsit=(Button)findViewById(R.id.DugmeEsit);
        dugmeBolu=(Button)findViewById(R.id.DugmeBolu);
        dugmeSil=(Button)findViewById(R.id.DugmeSil);
        dugmeCarpi=(Button)findViewById(R.id.DugmeCarpi);
        dugmeHafizayaEkle=(Button)findViewById(R.id.HafizayaEkle);
        dugmeHafizayiGoster=(Button)findViewById(R.id.DugmeHafizayiGoster);
        dugmeHafizadanSil=(Button)findViewById(R.id.DugmeHafizayiSil);
        dugmeHafizayaAl=(Button)findViewById(R.id.DugmeHafizayiGoster);
        dugmeHafizadanCıkar=(Button)findViewById(R.id.DugmeHafizadanCikar);

       dugme0.setOnClickListener(dugme0Tikla);
        dugme1.setOnClickListener(dugme1Tikla);
        dugme2.setOnClickListener(dugme2Tikla);
        dugme3.setOnClickListener(dugme3Tikla);
        dugme4.setOnClickListener(dugme4Tikla);
        dugme5.setOnClickListener(dugme5Tikla);
        dugme6.setOnClickListener(dugme6Tikla);
        dugme7.setOnClickListener(dugme7Tikla);
        dugme8.setOnClickListener(dugme8Tikla);
        dugme9.setOnClickListener(dugme9Tikla);
        dugmeArti.setOnClickListener(dugmeArtiTikla);
        dugmeEksi.setOnClickListener(dugmeEksiTikla);
        dugmeEsit.setOnClickListener(dugmeEsitTikla);
        dugmeBolu.setOnClickListener(dugmeBoluTikla);
        dugmeCarpi.setOnClickListener(dugmeCarpiTikla);
        dugmeSil.setOnClickListener(dugmeSilTikla);
        dugmeHafizayaEkle.setOnClickListener(dugmeHafizayaEkleTikla);
        dugmeHafizadanSil.setOnClickListener(dugmeHafizadanSilTikla);
        dugmeHafizayiGoster.setOnClickListener(dugmeHafizayiGosterTikla);
        dugmeHafizadanCıkar.setOnClickListener(dugmeHafizadanCıkarTikla);
   oncekiIslem ='=';
        oncekiSayi=0;
        sayi=0;
        hafiza=0;


    }

    private  void  ekrandaGoster(int sayi){
        sonuc.setText(String.format("%d",sayi));
    }
    private void sayiEkle(int rakam ){
        sayi=sayi*10+rakam;
        ekrandaGoster(sayi);

    }
    private  void islemYap(char islem){
        switch (oncekiIslem){
            case '+':
                oncekiSayi=oncekiSayi+sayi;
                break;
            case  '-':
                oncekiSayi=oncekiSayi-sayi;
                break;

            case  '*':
                oncekiSayi=oncekiSayi*sayi;
                break;
            case  '/':
                oncekiSayi=oncekiSayi/sayi;
                break;

            case '=':
                oncekiSayi=sayi;
                break;
        }
        oncekiIslem=islem;
        sayi=0;
        ekrandaGoster(oncekiSayi);
    }
    public View.OnClickListener dugmeTikla=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    public View.OnClickListener dugme0Tikla= new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(0);
        }
    };
    public View.OnClickListener dugme1Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(1);
        }
    };
    public View.OnClickListener dugme2Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(2);
        }
    };
    public View.OnClickListener dugme3Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(3);
        }
    };
    public View.OnClickListener dugme4Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(4);
        }
    };
    public View.OnClickListener dugme5Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(5);
        }
    };
    public View.OnClickListener dugme6Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(6);
        }
    };
    public View.OnClickListener dugme7Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(7);
        }
    };
    public View.OnClickListener dugme8Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(8);
        }
    };
    public View.OnClickListener dugme9Tikla=new View.OnClickListener(){
        public  void onClick(View v){
            sayiEkle(9);
        }
    };
    public View.OnClickListener dugmeArtiTikla=new View.OnClickListener(){
        public  void onClick(View v){
         islemYap('+');
        }
    };
    public View.OnClickListener dugmeBoluTikla=new View.OnClickListener(){
        public  void onClick(View v){
            islemYap('/');
        }
    };
    public View.OnClickListener dugmeCarpiTikla=new View.OnClickListener(){
        public  void onClick(View v){
            islemYap('*');
        }
    };
    public View.OnClickListener dugmeEksiTikla=new View.OnClickListener(){
        public  void onClick(View v){
            islemYap('-');
        }
    };
    public View.OnClickListener dugmeEsitTikla=new View.OnClickListener(){
        public  void onClick(View v){
            islemYap('=');
            sayi=oncekiSayi;
            oncekiSayi=0;

        }

    };

    public View.OnClickListener dugmeSilTikla=new View.OnClickListener(){
        public  void onClick(View v){
         sayi=0;
            ekrandaGoster(sayi);
        }
    };

    public View.OnClickListener dugmeHafizadanCıkarTikla=new View.OnClickListener(){
        public  void onClick(View view){
            hafiza-=sayi;
            sayi=0;
        }
    };

    public View.OnClickListener dugmeHafizayaEkleTikla=new View.OnClickListener(){
        public  void onClick(View v){
            hafiza+=sayi;
            sayi=0;
        }
    };
    public View.OnClickListener dugmeHafizayiGosterTikla=new View.OnClickListener(){
        public  void onClick(View v){
            hafiza=sayi;
           ekrandaGoster(sayi);
        }
    };
    public View.OnClickListener dugmeHafizadanSilTikla=new View.OnClickListener(){
        public  void onClick(View v){
           hafiza=0;
        }
    };





}
