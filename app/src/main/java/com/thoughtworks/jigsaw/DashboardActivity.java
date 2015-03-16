package com.thoughtworks.jigsaw;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class DashboardActivity extends ActionBarActivity {
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        ListView mDrawerList = (ListView) findViewById(R.id.drawerList);

        mDrawerList.setAdapter(new ArrayAdapter<>(this, R.layout.drawer_list_item,
                getResources().getStringArray(R.array.options)));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
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

    private class DrawerItemClickListener implements android.widget.AdapterView.OnItemClickListener {
        private DashboardActivity mContext;

        public DrawerItemClickListener(DashboardActivity context) {
            mContext = context;
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String message = Integer.toString(position);
            Toast toast =  Toast.makeText(mContext, message, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
