package android.softices.com.myapplication;

import android.softices.com.mylibrary.CentralTendency;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tvdemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvdemo = (TextView) findViewById(R.id.tv_demo);
        ArrayList<Integer> numbers = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 15; i++) {
            numbers.add(r.nextInt(7) + 1);
        }

        double mean = CentralTendency.arithmeticMean(numbers).doubleValue();

        Collections.sort(numbers);

        String res = String.format("Numbers:\n\n%s\nMean: %.1f ", numbers, mean);


        tvdemo.setText(res);
    }
}
