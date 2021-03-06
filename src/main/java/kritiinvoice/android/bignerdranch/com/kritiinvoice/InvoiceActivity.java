package kritiinvoice.android.bignerdranch.com.kritiinvoice;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class InvoiceActivity extends kritiinvoice.android.bignerdranch.com.kritiinvoice.SingleFragmentActivity {
    private static final String EXTRA_INVOICE_ID = "kritiinvoice.android.bignerdranch.com.kritiinvoice.invoice_id";
    public static Intent newIntent(Context packageContext, UUID invoiceId) {
        Intent intent = new Intent(packageContext, InvoiceActivity.class);
        intent.putExtra(EXTRA_INVOICE_ID, invoiceId);
        return intent;
    }
    @Override
    protected Fragment createFragment() {
        UUID invoiceId = (UUID) getIntent().getSerializableExtra(EXTRA_INVOICE_ID);
        return kritiinvoice.android.bignerdranch.com.kritiinvoice.InvoiceFragment.newInstance(invoiceId);
    }


}
