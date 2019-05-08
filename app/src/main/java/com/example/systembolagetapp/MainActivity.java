package com.example.systembolagetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import com.example.systembolagetapp.domain.Product;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private List<Product> products;
    private ListView listView;
    private ArrayAdapter<Product> adapter;


    private void createFakedProducts() {
        products = new ArrayList<>();
        Product p1 = new Product.Builder()
                .alcohol(4.4)
                .name("Pilsner Urquell")
                .nr(1234)
                .productGroup("Öl")
                .type("Öl")
                .volume(330).build();
        Product p2 = new Product.Builder()
                .alcohol(4.4)
                .name("Baron Trenk")
                .nr(1234)
                .productGroup("Öl")
                .type("Öl")
                .volume(330).build();
        products.add(p1);
        products.add(p2);
    }
    private void setupListView() {
        // look up a reference to the ListView object
        listView = findViewById(R.id.product_list);

        // create an adapter (with the faked products)
        adapter = new ArrayAdapter<Product>(this,
                android.R.layout.simple_list_item_1,
                products);

        // Set listView's adapter to the new adapter
        listView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up faked products
        createFakedProducts();

        setupListView();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar_menu, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_search:
                Log.d(LOG_TAG, "user pressed SEARCH");
                break;
            default:
                Log.d(LOG_TAG, "uh oh ;)");
                break;
        }
        return true;
    }
}
