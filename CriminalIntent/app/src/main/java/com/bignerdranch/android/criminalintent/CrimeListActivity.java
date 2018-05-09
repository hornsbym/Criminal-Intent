package com.bignerdranch.android.criminalintent;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return new CrimeListFragment();
    }
}