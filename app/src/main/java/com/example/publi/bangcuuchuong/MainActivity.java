package com.example.publi.bangcuuchuong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button tinh;
    TextView ketqua;
    EditText a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=(EditText)findViewById(R.id.editText);
        ketqua=(TextView)findViewById(R.id.textView2);
        tinh=(Button)findViewById(R.id.button);

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi="";
                int soa=Integer.parseInt(a.getText().toString());
                if(soa>9||soa<1){
                    ketqua.setText("Chi Nhap tu 1-9");
                }
                else
                for(int i=1;i<10;i++){
                    int kq=soa*i;
                    chuoi+=(soa+"x" +i+"="+kq+"\n");
                    ketqua.setText(chuoi);
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
