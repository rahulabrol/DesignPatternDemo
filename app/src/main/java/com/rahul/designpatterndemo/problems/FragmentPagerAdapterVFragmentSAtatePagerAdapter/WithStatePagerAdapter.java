package com.rahul.designpatterndemo.problems.FragmentPagerAdapterVFragmentSAtatePagerAdapter;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.rahul.designpatterndemo.R;

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
        mPager.setOffscreenPageLimit(4);
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

        private final String TAG = "StatePagerAdapter";

        StatePagerAdapter(FragmentManager fm) {
            super(fm);
            Log.e(TAG, "Constructor");
        }

        @Override
        public Fragment getItem(int position) {
//            Log.e(TAG, "getItem");
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
//            Log.e(TAG, "getCount");
            return NUM_PAGES;
        }
    }
}
