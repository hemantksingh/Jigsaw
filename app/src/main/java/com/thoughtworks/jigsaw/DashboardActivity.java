package com.thoughtworks.jigsaw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.thoughtworks.core.HomeController;
import com.thoughtworks.core.IHomeActivity;
import com.thoughtworks.core.Option;


public class DashboardActivity extends ActionBarActivity implements IHomeActivity {
    DrawerLayout mDrawerLayout;
    ListView mDrawerList;
    private HomeController mHomeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.mHomeController = new HomeController(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mDrawerList = (ListView) findViewById(R.id.drawerList);
        mDrawerList.setAdapter(new ArrayAdapter<>(this, R.layout.drawer_list_item,
                getAllOptions()));
        mDrawerList.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mHomeController.onOptionSelected(position);
            }
        });
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

    @Override
    public void createOptionView(Option option) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mainContent, createFragment(option))
                .commit();

        mDrawerList.setItemChecked(option.Number, true);
        setTitle(option.Name);
    }

    private Fragment createFragment(Option option) {
        Fragment fragment;
        switch (option.Name) {
            case "Projects":
                fragment = new ProjectsFragment();
                break;
            default:
                fragment = new ProfileFragment();
                break;
        }

        Bundle args = new Bundle();
        args.putInt("option_number", option.Number);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public String[] getAllOptions() {
        return getResources().getStringArray(R.array.options);
    }

    @Override
    public void closeDrawer() {
        mDrawerLayout.closeDrawer(mDrawerList);
    }
}
