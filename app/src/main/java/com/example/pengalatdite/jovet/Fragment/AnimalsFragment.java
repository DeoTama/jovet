package com.example.pengalatdite.jovet.Fragment;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.example.pengalatdite.jovet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalsFragment extends Fragment {

    private static final String TAG = AnimalsFragment.class.getSimpleName();

    CardView mCardView;
    SeekBar mRadiusSeekBar;
    SeekBar mElevationSeekBar;

    protected RecyclerView mRecyclerView;

//    public static AnimalsFragment newInstance(){
//        AnimalsFragment fragment = new AnimalsFragment();
//        fragment.setRetainInstance(true);
//        return fragment;
//    }

    public AnimalsFragment() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animals, container, false);
//
//        mRecyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view);
    }

    public void onViewCreated(View view, Bundle savedInstance){
        super.onViewCreated(view, savedInstance);
        mCardView = (CardView) view.findViewById(R.id.cardView);
//        mRadiusSeekBar = (SeekBar) view.findViewById(R.id.cardView_radius_seekbar);
//        mRadiusSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                Log.d(TAG, String.format("Seekbar Radius progress : %id", progress));
//                mCardView.setRadius(progress);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        }
//        );

//        mElevationSeekBar = (SeekBar) view.findViewById(R.id.cardView_elevation_seekbar);
//        mElevationSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                Log.d(TAG, String.format("SeekBar Elevation progress : %id", progress));
//                mCardView.setElevation(progress);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });

    }

}
