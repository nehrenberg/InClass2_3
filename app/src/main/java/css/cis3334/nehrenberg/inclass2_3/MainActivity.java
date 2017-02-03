package css.cis3334.nehrenberg.inclass2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextAmount;
    EditText editTextNumber;
    TextView textViewTotal;
    TextView textViewTipPerPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAmount = (EditText) findViewById((R.id.editTextAmount));
        editTextNumber = (EditText) findViewById((R.id.editTextNumber));
        textViewTotal = (TextView) findViewById((R.id.textViewTotal));
        textViewTipPerPerson = (TextView) findViewById((R.id.textViewTipPerPerson));

    }

    public void onClick(View view) {
        Double b = Double.parseDouble(editTextAmount.getText().toString());
        Double p = Double.parseDouble(editTextNumber.getText().toString());
        double tip = b * .10;
        double person = tip / p;

        textViewTotal.setText("Total Tip: $" + tip);
        textViewTipPerPerson.setText("Each person should tip: $" + person);
    }
}
