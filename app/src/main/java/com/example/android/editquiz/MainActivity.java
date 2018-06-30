package com.example.android.editquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton Male, Female;
    private Button button;
    private EditText enterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        radioGroup = (RadioGroup) findViewById(R.id.rgroup);

        Male = (RadioButton) findViewById(R.id.male_radio_button);
        Female = (RadioButton) findViewById(R.id.female_radio_button);
        enterName = (EditText) findViewById(R.id.name_view);
        button = (Button) findViewById(R.id.btnId);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                //Find out which button is checked or selected
                if (selectedId == Male.getId() && enterName.length() > 1) {
                    Intent myIntent = new Intent(MainActivity.this, MaleActivity.class);
                    MainActivity.this.startActivity(myIntent);
                } else if (selectedId == Female.getId() && enterName.length() > 1) {
                    Intent myIntent = new Intent(MainActivity.this, FemaleActivity.class);
                    MainActivity.this.startActivity(myIntent);
                } else {
                    Toast.makeText(MainActivity.this, "Please enter name and select a gender", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}

//        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
//
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                //find which radio button is selected
//                if (checkedId == R.id.male_radio_button){
//                    Toast.makeText(MainActivity.this, "I am male Yo!", Toast.LENGTH_SHORT).show();
//                } else if (checkedId == R.id.female_radio_button) {
//                    Toast.makeText(MainActivity.this, "I am female divas", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Please indicate your gender", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


//    }

//    public void onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.male_radio_button:
//                if (checked){
//                    Intent myIntent = new Intent(MainActivity.this, MaleActivity.class);
//                    MainActivity.this.startActivity(myIntent);
//                }
//                    // Pirates are the best
//                    break;
//            case R.id.female_radio_button:
//                if (checked) {
//                    Intent myIntent = new Intent(MainActivity.this, FemaleActivity.class);
//                    MainActivity.this.startActivity(myIntent);
//                }
//                    // Ninjas rule
//                    break;
//
//        }

//        RadioButton maleRadioButton = (RadioButton) findViewById(R.id.male_radio_button);
//        Boolean maleChecked = maleRadioButton.isChecked();
//
//        RadioButton femaleRadioButton = (RadioButton) findViewById(R.id.female_radio_button);
//        Boolean femaleChecked = femaleRadioButton.isChecked();



//    public void quiz(boolean maleChecked, boolean femaleChecked) {
//        if (maleChecked == true){
//            Intent myIntent = new Intent(MainActivity.this, MaleActivity.class);
//            MainActivity.this.startActivity(myIntent);
//        } else if (femaleChecked == true) {
//            Intent myIntent = new Intent(MainActivity.this, FemaleActivity.class);
//            MainActivity.this.startActivity(myIntent);
//        } else {
//            Toast.makeText(this, "Please indicate your gender", Toast.LENGTH_SHORT).show();
//        }
//    }
//}
