package com.example.makeupproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    ArrayList<String> cartItem;
    ArrayList<Double> itemPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button order = findViewById(R.id.con_order);
        order.setOnClickListener(v -> {
            Intent intent = new Intent(Cart.this, Delivery.class);
            startActivity(intent);
        });

        ImageView settin = findViewById(R.id.icon2);
        settin.setOnClickListener(v -> {
            Intent intent = new Intent(Cart.this, Setting.class);
            startActivity(intent);
        });

        cartItem = new ArrayList<>();
        cartItem.add("Lipstick Revlon");
        cartItem.add("Foundation Maybelline");
        cartItem.add("Concealer Tarte");

        itemPrice = new ArrayList<>();
        itemPrice.add(20.00);
        itemPrice.add(30.00);
        itemPrice.add(50.00);

        ListView listView = findViewById(R.id.cartListView);
        CartAdapter adapter = new CartAdapter(this, cartItem, itemPrice);
        listView.setAdapter(adapter);
    }

    public class CartAdapter extends BaseAdapter {

        Context context;
        ArrayList<String> names;
        ArrayList<Double> prices;
        LayoutInflater inflater;

        public CartAdapter(Context context, ArrayList<String> names, ArrayList<Double> prices) {
            this.context = context;
            this.names = names;
            this.prices = prices;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return names.size();
        }

        @Override
        public Object getItem(int position) {
            return names.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.cart_item, parent, false);
            }

            TextView nameText = convertView.findViewById(R.id.item_name);
            TextView priceText = convertView.findViewById(R.id.item_price);

            nameText.setText(names.get(position));
            priceText.setText("$" + prices.get(position));

            return convertView;
        }
    }
}
