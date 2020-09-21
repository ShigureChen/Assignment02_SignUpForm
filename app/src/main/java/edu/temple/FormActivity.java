package edu.temple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class FormActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputname, inputemail, inputpassword, inputpassword2;

                EditText name = (EditText) findViewById(R.id.name);
                inputname = name.getText().toString();
                EditText email = (EditText) findViewById(R.id.email);
                inputemail = email.getText().toString();
                EditText password = (EditText) findViewById(R.id.password);
                inputpassword = password.getText().toString();
                EditText password2 = (EditText) findViewById(R.id.password2);
                inputpassword2 = password2.getText().toString();

                Context context = getApplicationContext();

                if(inputname.matches(""))
                {
                    Toast toast = Toast.makeText(context, "Please input user name and try again", Toast.LENGTH_LONG);
                    toast.show();
                }
                else if(TextUtils.isEmpty(inputemail))
                {
                    Toast toast = Toast.makeText(context, "Please input email and try again", Toast.LENGTH_LONG);
                    toast.show();
                }
                else if(TextUtils.isEmpty(inputpassword))
                {
                    Toast toast = Toast.makeText(context, "Please input password and try again", Toast.LENGTH_LONG);
                    toast.show();
                }
                else if(!inputpassword.equals(inputpassword2))
                {
                    Toast toast = Toast.makeText(context, "The passwords do not match, Please try again", Toast.LENGTH_LONG);
                    toast.show();
                }
                else
                {
                    Toast toast = Toast.makeText(context, "Welcome, " + inputname + ", to the SignUpApp", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }


}