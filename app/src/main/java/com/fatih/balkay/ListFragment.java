package com.fatih.balkay;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import java.io.Serializable;
import java.util.ArrayList;

public class ListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView = view.findViewById(R.id.list);
        ArrayList<BrandModel> brands = new ArrayList<>();
        brands.add(new BrandModel("Audi", R.drawable.audi, "Almanya"));
        brands.add(new BrandModel("BMW", R.drawable.bmw, "Almanya"));
        brands.add(new BrandModel("Ferrari", R.drawable.ferrari, "İtalya"));
        brands.add(new BrandModel("Fiat", R.drawable.fiat, "İtalya"));
        brands.add(new BrandModel("Lamborghini", R.drawable.lamborghini, "İtalya"));
        brands.add(new BrandModel("Nissan", R.drawable.nissan, "Japonya"));
        brands.add(new BrandModel("Porsche", R.drawable.porsche, "Almanya"));
        brands.add(new BrandModel("Rolls-Royce", R.drawable.roll_royce, "İngiltere"));
        brands.add(new BrandModel("Tesla", R.drawable.tesla, "Amerika"));
        brands.add(new BrandModel("Volkswagen", R.drawable.volkswagen, "Almanya"));
        ArrayList<String> brandNames = new ArrayList<>();
        for (int i = 0; i < brands.size(); i++) {
            brandNames.add(brands.get(i).getName());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, brandNames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view1, position, id) -> {
            Bundle bundle = new Bundle();
            bundle.putSerializable("brand", (Serializable) brands.get(position));
            Log.e("IMAGE", String.valueOf(brands.get(position).getResImage()));
            Navigation.findNavController(view).navigate(R.id.action_listFragment_to_detailsFragment, bundle);
        });
        return view;
    }
}