package com.example.arnold.hello;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

/**
 * Created by ARNOLD on 6/3/2016.
 */
public class world extends Activity {
    TextView  newresult,helloresult,passresult,failresult,extinctresult;
@Override
 protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.world_activity);

    newresult = (TextView) findViewById(R.id.txtresult);
    helloresult = (TextView) findViewById(R.id.hellotxt);
    passresult = (TextView) findViewById(R.id.passtxt);
    failresult = (TextView) findViewById(R.id.failtxt);
    extinctresult = (TextView) findViewById(R.id.extincttxt);

    int mark;
    mark = 0;
    Random r = new Random();
    mark = r.nextInt(100);
    mark++;

    helloresult.setText("Hello world\n");
    newresult.append("\nYour mark is \n" +mark);

    if(mark >= 50 ){
        newresult.append("\nyou have passed\n");
    }

    if(mark < 50 ){
        failresult.append("\nyou have failed\n");
    }else if(mark >= 50 && mark <= 60 ){
        passresult.append("\nwell done you passed\n");
    }else{
        extinctresult.append("\nBrilliant you got a distinction\n");
    }

}
}
