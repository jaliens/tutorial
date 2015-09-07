package jongyeop.viewpagertuto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jongyeop on 2015-09-06.
 */
public class Fragment1 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}
