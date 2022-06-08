package sg.edu.rp.c346.id21018193.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spnYesNo;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnYesNo = findViewById(R.id.spinner);
        tv = findViewById(R.id.textView);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        if (spnYesNo.getSelectedItem() == "Yes"){
                              spnYesNo.getSelectedItem().toString();
                              tv.setText((CharSequence) spnYesNo);
                        }
                        break;
                    case 1:
                        if (spnYesNo.getSelectedItem() == "No"){
                            spnYesNo.getSelectedItem().toString();
                            tv.setText((CharSequence) spnYesNo);
                        }
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }

        });
    }



}