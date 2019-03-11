package zybooks.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final int SLICES_PER_PIZZA = 8;

    private EditText mNumAttendEditText;
    private TextView mNumPizzasTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNumAttendEditText = findViewById(R.id.attendEditText);
        mNumPizzasTextView = findViewById(R.id.answerTextView);
    }

    public void calculateClick(View view) {
        String numAttendStr = mNumAttendEditText.getText().toString();
        int numAttend = Integer.parseInt(numAttendStr);

        int slicesPerPerson = 4;
        int totalPizzas = (int) Math.ceil(numAttend * slicesPerPerson /
                (double) SLICES_PER_PIZZA);
        mNumPizzasTextView.setText("Total pizzas: " + totalPizzas);
    }
}