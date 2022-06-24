package com.example.loto6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    int a,b,c,d,e,f;
    int ra,rb,rc,rd,re,rf;
    TextView tv1;
    Random random=new Random();
    String a1,b1,c1,d1,e1,f1;
    int p[]=new int[31];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        ed4=findViewById(R.id.ed4);
        ed5=findViewById(R.id.ed5);
        ed6=findViewById(R.id.ed6);
    }
    public void loto(View vi){
        a1=String.valueOf(ed1.getText());
        b1=String.valueOf(ed2.getText());
        c1=String.valueOf(ed3.getText());
        d1=String.valueOf(ed4.getText());
        e1=String.valueOf(ed5.getText());
        f1=String.valueOf(ed6.getText());
        a=Integer.parseInt(a1);
        b=Integer.parseInt(b1);
        c=Integer.parseInt(c1);
        d=Integer.parseInt(d1);
        e=Integer.parseInt(e1);
        f=Integer.parseInt(f1);
        while(true){
            ra=random.nextInt(42)+1;
            if(ra!=a&&ra!=b&&ra!=c&&ra!=d&&ra!=e&&ra!=f){
                break;
            }
        }
        while(true){
            rb=random.nextInt(42)+1;
            if(rb!=a&&rb!=b&&rb!=c&&rb!=d&&rb!=e&&rb!=f&&rb!=ra){
                break;
            }
        }
        while(true){
            rc=random.nextInt(42)+1;
            if(rc!=a&&rc!=b&&rc!=c&&rc!=d&&rc!=e&&rb!=f&&rc!=ra&&rc!=rb){
                break;
            }
        }
        while(true){
            rd=random.nextInt(42)+1;
            if(rd!=a&&rd!=b&&rd!=c&&rd!=d&&rd!=e&&rb!=f&&rd!=ra&&rd!=rb&&rd!=rc){
                break;
            }
        }
        while(true){
            re=random.nextInt(42)+1;
            if(re!=a&&re!=b&&re!=c&&re!=d&&re!=e&&rb!=f&&re!=ra&&re!=rb&&re!=rc&&re!=rd){
                break;
            }
        }
        while(true){
            rf=random.nextInt(42)+1;
            if(rf!=a&&rf!=b&&rf!=c&&rf!=d&&rf!=e&&rf!=f&&rf!=ra&&rf!=rb&&rf!=rc&&rf!=rd&&rf!=re){
                break;
            }
        }
        a1=String.valueOf(ra);
        b1=String.valueOf(rb);
        c1=String.valueOf(rc);
        d1=String.valueOf(rd);
        e1=String.valueOf(re);
        f1=String.valueOf(rf);
        tv1.setText(a1+","+b1+","+c1+","+d1+","+e1+","+f1);
    }
    public void choicePush(View vi){
        ArrayList<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        list.add("15");
        list.add("16");
        list.add("17");
        list.add("18");
        list.add("19");
        list.add("20");
        list.add("21");
        list.add("22");
        list.add("23");
        list.add("24");
        list.add("25");
        list.add("26");
        list.add("27");
        list.add("28");
        list.add("29");
        list.add("30");
        list.add("31");
        list.add("32");
        list.add("33");
        list.add("34");
        list.add("35");
        list.add("36");
        list.add("37");
        list.add("38");
        list.add("39");
        list.add("40");
        list.add("41");
        list.add("42");
        list.add("43");
        String snum1=ed1.getText().toString();
        String snum2=ed2.getText().toString();
        String snum3=ed3.getText().toString();
        String snum4=ed4.getText().toString();
        String snum5=ed5.getText().toString();
        String snum6=ed6.getText().toString();
        list.remove(snum1);
        list.remove(snum2);
        list.remove(snum3);
        list.remove(snum4);
        list.remove(snum5);
        list.remove(snum6);
        Collections.shuffle(list);
        String number1=list.get(0);
        String number2=list.get(1);
        String number3=list.get(2);
        String number4=list.get(3);
        String number5=list.get(4);
        String number6=list.get(5);
        tv1.setText(number1+","+number2+","+number3+","+number4+","+number5+","+number6);
    }

}