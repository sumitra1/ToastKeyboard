package com.sumitrakumarishaw.toastkeyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    protected Button q;
    protected Button w;
    protected Button e;
    protected Button r;
    protected Button t;
    protected Button y;
    protected Button u;
    protected Button i;
    protected Button o;
    protected Button p;
    protected Button a;
    protected Button s;
    protected Button d;
    protected Button f;
    protected Button g;
    protected Button h;
    protected Button j;
    protected Button k;
    protected Button l;
    protected Button z;
    protected Button x;
    protected Button c;
    protected Button v;
    protected Button b;
    protected Button n;
    protected Button m;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        q=(Button)findViewById ( R.id.btnq );
        w=(Button)findViewById ( R.id.btnw );
        e=(Button)findViewById ( R.id.btne );
        r=(Button)findViewById ( R.id.btnr );
        t=(Button)findViewById ( R.id.btnt );
        y=(Button)findViewById ( R.id.btny );
        u=(Button)findViewById ( R.id.btnu );
        i=(Button)findViewById ( R.id.btni );
        o=(Button)findViewById ( R.id.btno );
        p=(Button)findViewById ( R.id.btnp );
        a=(Button)findViewById ( R.id.btnl );
        s=(Button)findViewById ( R.id.btnk );
        d=(Button)findViewById ( R.id.btnj );
        f=(Button)findViewById ( R.id.btnh );
        g=(Button)findViewById ( R.id.btng );
        h=(Button)findViewById ( R.id.btnf );
        j =(Button)findViewById ( R.id.btnd );
        k=(Button)findViewById ( R.id.btns );
        l=(Button)findViewById ( R.id.btna );
        z=(Button)findViewById ( R.id.btnz );
        x=(Button)findViewById ( R.id.btnx );
        c=(Button)findViewById ( R.id.btnc );
        v=(Button)findViewById ( R.id.btnv );
        b=(Button)findViewById ( R.id.btnb );
        n=(Button)findViewById ( R.id.btnn );
        m=(Button)findViewById ( R.id.btnm );






        q.setOnClickListener ( new clik () );
        w.setOnClickListener ( new clik () );
        e.setOnClickListener ( new clik () );
        r.setOnClickListener ( new clik () );
        t.setOnClickListener ( new clik () );
        y.setOnClickListener ( new clik () );
        u.setOnClickListener ( new clik () );
        i.setOnClickListener ( new clik () );
        o.setOnClickListener ( new clik () );
        p.setOnClickListener ( new clik () );
        a.setOnClickListener ( new clik () );
        s.setOnClickListener ( new clik () );
        d.setOnClickListener ( new clik () );
        f.setOnClickListener ( new clik () );
        g.setOnClickListener ( new clik () );
        h.setOnClickListener ( new clik () );
        j.setOnClickListener ( new clik () );
        k.setOnClickListener ( new clik () );
        l.setOnClickListener ( new clik () );
        z.setOnClickListener ( new clik () );
        x.setOnClickListener ( new clik () );
        c.setOnClickListener ( new clik () );
        v.setOnClickListener ( new clik () );
        b.setOnClickListener ( new clik () );
        n.setOnClickListener ( new clik () );
        m.setOnClickListener ( new clik () );














    }
    public class clik implements View.OnClickListener{
        public  void onClick(View v)
        {
            switch (v.getId ()){
                case R.id.btnq:
                    Toast.makeText (getApplicationContext (),"Q is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnw:
                    Toast.makeText (getApplicationContext (),"W is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btne:
                    Toast.makeText (getApplicationContext (),"E is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnr:
                    Toast.makeText (getApplicationContext (),"R is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnt:
                    Toast.makeText (getApplicationContext (),"T is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btny:
                    Toast.makeText (getApplicationContext (),"Y is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnu:
                    Toast.makeText (getApplicationContext (),"U is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btni:
                    Toast.makeText (getApplicationContext (),"I is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btno:
                    Toast.makeText (getApplicationContext (),"O is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnp:
                    Toast.makeText (getApplicationContext (),"P is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btna:
                    Toast.makeText (getApplicationContext (),"A is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btns:
                    Toast.makeText (getApplicationContext (),"S is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnd:
                    Toast.makeText (getApplicationContext (),"D is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnf:
                    Toast.makeText (getApplicationContext (),"F is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btng:
                    Toast.makeText (getApplicationContext (),"G is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnh:
                    Toast.makeText (getApplicationContext (),"H is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnj:
                    Toast.makeText (getApplicationContext (),"J is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnk:
                    Toast.makeText (getApplicationContext (),"K is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnl:
                    Toast.makeText (getApplicationContext (),"L is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnz:
                    Toast.makeText (getApplicationContext (),"Z is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnx:
                    Toast.makeText (getApplicationContext (),"X is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnc:
                    Toast.makeText (getApplicationContext (),"C is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnv:
                    Toast.makeText (getApplicationContext (),"V is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnb:
                    Toast.makeText (getApplicationContext (),"B is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnn:
                    Toast.makeText (getApplicationContext (),"N is pressed",Toast.LENGTH_LONG).show ();
                    break;
                case R.id.btnm:
                    Toast.makeText (getApplicationContext (),"M is pressed",Toast.LENGTH_LONG).show ();
                    break;










            }
        }
    }




}
