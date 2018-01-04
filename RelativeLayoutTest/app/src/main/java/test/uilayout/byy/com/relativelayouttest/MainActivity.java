package test.uilayout.byy.com.relativelayouttest;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button buttonOne;
    private Button buttonTwo;
    private String TAG = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(this);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonOne:
                Log.d(TAG, "ButtonOne");
                Toast.makeText(MainActivity.this, "Click ButtonOne", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonTwo:
                Log.d(TAG, "ButtonTwo");
                Toast.makeText(MainActivity.this, "Click ButtonTwo", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
