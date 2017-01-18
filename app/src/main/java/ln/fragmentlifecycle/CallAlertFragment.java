package ln.fragmentlifecycle;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by comp-1 on 18/1/17.
 */

public class CallAlertFragment extends Fragment {

    private Button btnCallAlert;
    FragmentManager fm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_call_alert, container, false);

        btnCallAlert = (Button) view.findViewById(R.id.btn_callalert);

        btnCallAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fm = getFragmentManager();

                AlertDialogFragment alertDialogFragment = new AlertDialogFragment();

                alertDialogFragment.show(fm, "Alert Dialog Fragment");

            }
        });


        return view;
    }
}
