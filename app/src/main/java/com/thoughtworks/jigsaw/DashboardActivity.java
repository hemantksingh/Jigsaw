package com.thoughtworks.jigsaw;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
        Fragment fragment = new OptionFragment();
        Bundle args = new Bundle();
        args.putInt(OptionFragment.OPTION_NUMBER, option.Number);
        fragment.setArguments(args);

        getFragmentManager().beginTransaction()
                .replace(R.id.mainContent, fragment)
                .commit();

        mDrawerList.setItemChecked(option.Number, true);
        setTitle(option.Name);
    }

    @Override
    public String[] getAllOptions() {
        return getResources().getStringArray(R.array.options);
    }

    @Override
    public void closeDrawer() {
        mDrawerLayout.closeDrawer(mDrawerList);
    }

    /**
     * Fragment that appears in the "content_frame", shows a profile
     */
    public static class OptionFragment extends Fragment {
        public static final String OPTION_NUMBER = "option_number";

        public OptionFragment() {
            // Empty constructor required for fragment subclasses
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            /*Passing false indicates the view (fragment) is ready to be attached to the
            container but not actually attached at this point. This tells Android where
            this view needs to be placed when it is laid out. The actual layout is
            handled by Android*/
            View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
            return rootView;

        }
    }
}
