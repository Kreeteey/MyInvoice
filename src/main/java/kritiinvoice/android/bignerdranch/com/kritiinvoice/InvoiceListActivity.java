package kritiinvoice.android.bignerdranch.com.kritiinvoice;

import android.support.v4.app.Fragment;

public class InvoiceListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new InvoiceListFragment();
    }
}
