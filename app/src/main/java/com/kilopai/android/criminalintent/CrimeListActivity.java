package com.kilopai.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by taoyt.zhang on 2016/9/10.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
