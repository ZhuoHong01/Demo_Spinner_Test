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
    }

    spnYesNo.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            switch(position){
                case 0:
                    if (spnYesNo == "Yes"){
                        String spinnerItems
                    }
                    break;
                case 1:
                    if (spnYesNo == "No"){

                    }
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent){

        }

    };
}