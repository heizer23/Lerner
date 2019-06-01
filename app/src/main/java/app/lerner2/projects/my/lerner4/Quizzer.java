package app.lerner2.projects.my.lerner4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Quizzer extends AppCompatActivity implements FragMC.OnUpdateListener {



    /**
     * The serialization (saved instance state) Bundle key representing the
     * current dropdown position.
     */
    private static final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";

    private TextView tvO1;
    private TextView tvO2;
    private TextView tvu1;
    private TextView tvu2;
    private TextView tvu3;
    private TextView tvu4;
    private TextView tvu5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzer);

        tvO1 = (TextView) findViewById(R.id.tv_o1);
        tvO2 = (TextView) findViewById(R.id.tv_o2);
        tvu1 = (TextView) findViewById(R.id.tv_u1);
        tvu2 = (TextView) findViewById(R.id.tv_u2);
        tvu3 = (TextView) findViewById(R.id.tv_u3);
        tvu4 = (TextView) findViewById(R.id.tv_u4);
        tvu5 = (TextView) findViewById(R.id.tv_u5);

        getFragmentManager().beginTransaction()
                .replace(R.id.container, new FragMC())
                .commit();


    }


//    @Override
//    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        // Restore the previously serialized current dropdown position.
//        if (savedInstanceState.containsKey(STATE_SELECTED_NAVIGATION_ITEM)) {
//            getSupportActionBar().setSelectedNavigationItem(
//                    savedInstanceState.getInt(STATE_SELECTED_NAVIGATION_ITEM));
//        }
//    }
//
//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        // Serialize the current dropdown position.
//        outState.putInt(STATE_SELECTED_NAVIGATION_ITEM,
//                getSupportActionBar().getSelectedNavigationIndex());
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quizzer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case  R.id.action_settings:

            Intent openLerner1 = new Intent("lerner.lerner.SETTINGS");
                startActivity(openLerner1);
            break;
            case  R.id.action_lections:
                Intent openLerner2 = new Intent("lerner.lerner.LEKAUSWAHL");
                startActivity(openLerner2);
                break;
            case  R.id.action_info:
                Intent openLerner3 = new Intent("lerner.lerner.OVERVIEW");
                startActivity(openLerner3);
                break;


        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onUpdate(String[] infoStrings) {
        tvO1.setText(infoStrings[0]);
        tvO2.setText(infoStrings[1]);
        tvu1.setText(infoStrings[2]);
        tvu2.setText(infoStrings[3]);
        tvu3.setText(infoStrings[4]);
        tvu4.setText(infoStrings[5]);
        tvu5.setText(infoStrings[6]);
    }
}
