/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity = 1;
    int pricePerCup = 5;
    public void submitOrder(View view)
    {

        CheckBox WhippedCream = (CheckBox) findViewById(R.id.whipped_cream);
        boolean hasWhippedCream = WhippedCream.isChecked();
        if (hasWhippedCream)
        {
            pricePerCup++;
        }

        CheckBox Chocolate = (CheckBox) findViewById(R.id.chocolate);
        boolean hasChocolate = Chocolate.isChecked();
        if (hasChocolate)
        {
            pricePerCup = pricePerCup + 2;
        }
        int price = calculatePrice(quantity, pricePerCup);
        EditText text = (EditText) findViewById(R.id.name);
        String name = text.getText().toString();

        String priceMessage = "Name:"+ name + "\nQuantity:" + quantity;
        priceMessage = priceMessage + "\nAdd Whipped Cream?" + hasWhippedCream;
        priceMessage = priceMessage + "\nAdd Chocolate?" + hasChocolate;
        priceMessage = priceMessage + "\nTotal $" + price + "\nThank You";

//        displayMessage(priceMessage);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        Uri uri = Uri.parse("mailto:nitajitrkl@gmail.com");
        intent.setData(uri);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java Order for " + name);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    private int calculatePrice(int quantity, int pricePerCup)
    {
        return quantity * pricePerCup;
    }
    public void increment(View view) {
        quantity++;
        display(quantity);
    }
    public void decrement(View view) {
        quantity--;
        display(quantity);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
//    private void displayMessage(String message) {
//        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText(message);
//    }
}