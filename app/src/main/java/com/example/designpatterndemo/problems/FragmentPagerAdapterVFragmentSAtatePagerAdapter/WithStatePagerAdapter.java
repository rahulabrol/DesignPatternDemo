package com.example.designpatterndemo.problems.FragmentPagerAdapterVFragmentSAtatePagerAdapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.designpatterndemo.R;

/*
With State Pager Adapter

Go to Fragment 1
Fragment1: onAttach
Fragment1: onCreate
Fragment2: onAttach
Fragment2: onCreate
Fragment1: onCreateView
Fragment1: onActivityCreated
Fragment2: onCreateView
Fragment2: onActivityCreated

Go to Fragment 2
Fragment3: onAttach
Fragment3: onCreate
Fragment3: onCreateView
Fragment3: onActivityCreated

Go to Fragment 3
Fragment4: onAttach
Fragment4: onCreate
Fragment1: onDestroyView
Fragment1: onDestroy
Fragment1: onDetach
Fragment4: onCreateView
Fragment4: onActivityCreated

Go to Fragment 4
Fragment2: onDestroyView
Fragment2: onDestroy
Fragment2: onDetach


 */
public class WithStatePagerAdapter extends AppCompatActivity {

    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 4;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = findViewById(R.id.viewPager);
        pagerAdapter = new StatePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }


    /**
     * A simple pager adapter that represents 4 Fragment objects, in
     * sequence.
     */
    private class StatePagerAdapter extends FragmentStatePagerAdapter {

        StatePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                default:
                case 0:
                    return Fragment1.getInstance();
                case 1:
                    return Fragment2.getInstance();
                case 2:
                    return Fragment3.getInstance();
                case 3:
                    return Fragment4.getInstance();
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
