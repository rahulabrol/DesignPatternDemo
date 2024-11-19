package com.rahul.designpatterndemo.problems.FragmentPagerAdapterVFragmentSAtatePagerAdapter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.rahul.designpatterndemo.R;

/*
With Pager Adapter
GO to Fragment 1

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
Fragment4: onCreateView
Fragment4: onActivityCreated

Go to Fragment 4

Fragment2: onDestroyView
 */
public class WithPagerAdapterActivity extends AppCompatActivity {

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
    private class StatePagerAdapter extends FragmentPagerAdapter {

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
