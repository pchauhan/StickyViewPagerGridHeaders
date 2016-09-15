package com.sn;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        ItemListFragment.Callbacks {

    AppBarLayout appbarLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.materialup_tabs);
        ViewPager viewPager = (ViewPager) findViewById(R.id.materialup_viewpager);

        appbarLayout = (AppBarLayout) findViewById(R.id.materialup_appbar);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));

    }


    @Override
    public void onItemSelected(int position) {

    }

    class TabsAdapter extends FragmentPagerAdapter {
        public TabsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Fragment getItem(int i) {
            return ItemListFragment.newInstance();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "";
        }
    }

}
