package org.example.android.sqllitetest1;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SQLiteDatabase sqliteDatabase = getBaseContext().openOrCreateDatabase("sqlite-test-1.db",MODE_PRIVATE, null);
//        sqliteDatabase.execSQL("CREATE TABLE contacts(name Text,phone INTEGER,email Text");
//        sqliteDatabase.execSQL("INSERT INTO contacts VALUES('tim','2345','sri@email/com');");
//        sqliteDatabase.execSQL("INSERT INTO contacts VALUES('bala','45334','bala@email/com');");
//        sqliteDatabase.execSQL("INSERT INTO contacts VALUES('king','45334','@email/com');");
//        Cursor query =sqliteDatabase.rawQuery("SELECT * from contacts",null);
//        if(query.moveToFirstD()) {
//        String name=query.getString(0);
//        int phone=query.getInt(1);
//            String email=query.getString(2);
//            Toast.makeText(getBaseContext(),Name)
//        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
