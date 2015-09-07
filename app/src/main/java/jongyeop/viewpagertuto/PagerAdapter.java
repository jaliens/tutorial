package jongyeop.viewpagertuto;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    public PagerAdapter(android.support.v4.app.FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }


    @Override
    public Fragment getItem(int i) {
        return this.fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return this.fragmentList.size();
    }
}
