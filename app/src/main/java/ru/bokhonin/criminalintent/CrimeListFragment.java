package ru.bokhonin.criminalintent;

import android.app.ListFragment;
import android.os.Bundle;

import java.util.List;

public class CrimeListFragment extends ListFragment {
    private List<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();
    }
}
