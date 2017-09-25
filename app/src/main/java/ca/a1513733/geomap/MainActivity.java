package ca.a1513733.geomap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tview1,tview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        tview1=(TextView) findViewById(R.id.text);
        tview2=(TextView) findViewById(R.id.text2);
    }

    public void showMap(View v) {
        tview2.setText(tview1.getText().toString());
        //sendGoogleMapsUri();
    }

    public void sendGoogleMapsUri(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
