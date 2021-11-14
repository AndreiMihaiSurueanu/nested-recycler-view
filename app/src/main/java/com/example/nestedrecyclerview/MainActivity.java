package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nestedrecyclerview.adapter.MainRecyclerAdapter;
import com.example.nestedrecyclerview.model.AllCategory;
import com.example.nestedrecyclerview.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // added in first category
        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood1));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood2));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood3));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood4));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood5));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood6));

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Hollywood", categoryItemList));
        allCategoryList.add(new AllCategory("Best of Oscars"));
        allCategoryList.add(new AllCategory("Movies Dubbed in Hindi"));
        allCategoryList.add(new AllCategory("Category 4th"));
        allCategoryList.add(new AllCategory("Category 5th"));

        setMainCategoryRecycler(allCategoryList);

    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){

        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }
}
