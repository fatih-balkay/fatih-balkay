package com.fatih.balkay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {
    private BrandModel brand;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            brand = (BrandModel) getArguments().getSerializable("brand");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        TextView brandName = view.findViewById(R.id.brandName);
        TextView brandCountry = view.findViewById(R.id.brandCountry);
        ImageView brandImage = view.findViewById(R.id.brandImage);
        brandName.setText(brand.getName());
        brandCountry.setText(brand.getCountry());
        brandImage.setImageResource(brand.getResImage());
        return view;
    }
}