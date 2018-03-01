package cz.uhk.fim.labs;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import cz.uhk.fim.labs.model.MistnostHolder;
import cz.uhk.fim.labs.model.MistnostInfo;

/**
 * A fragment representing a single Hodina detail screen.
 * This fragment is either contained in a {@link MistnostListActivity}
 * in two-pane mode (on tablets) or a {@link MistnostDetailActivity}
 * on handsets.
 */
public class MistnostDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "cisloMistnosti";

    TextView tvCislo;
    TextView tvKatedra;
    TextView tvKapacita;
    TextView tvPoznamka;

    /**
     * The dummy content this fragment is presenting.
     */
    private MistnostInfo mistnost;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MistnostDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mistnost = MistnostHolder.getMisnostByCislo(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mistnost.cisloMistnosti);
            }
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mistnost_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mistnost != null) {
            tvPoznamka = (TextView) rootView.findViewById(R.id.tvPoznamka);
            tvCislo = (TextView) rootView.findViewById(R.id.tvCislo);
            tvKapacita = (TextView) rootView.findViewById(R.id.tvKapacita);
            tvKatedra = (TextView) rootView.findViewById(R.id.tvKatedra);
            tvCislo.setText(mistnost.cisloMistnosti);
            tvKapacita.setText(String.valueOf(mistnost.kapacita));
            tvKatedra.setText(mistnost.katedra);
            tvPoznamka.setText(mistnost.poznamka);
        }

        return rootView;
    }
}
