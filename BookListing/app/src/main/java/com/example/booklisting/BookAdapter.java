package com.example.booklisting;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import androidx.core.content.ContextCompat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

//custom ArrayAdapter
public class BookAdapter extends ArrayAdapter<Book> {



    public BookAdapter(Context context, ArrayList<Book> books){
        super(context,0 ,books);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }


        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = listItemView.findViewById(R.id.book_title);
        String title = currentBook.getTitle();
        titleView.setText(title);

        // Find the TextView with view ID author
        TextView authorView = listItemView.findViewById(R.id.author_name);
        String author = currentBook.getAuthor();
        authorView.setText(author);

        // Find the TextView with view ID price
        TextView priceView = listItemView.findViewById(R.id.price_text_view);
        priceView.setText(String.valueOf(formatPrice(currentBook.getPrice())));

        // Find the TextView with view ID currency
        TextView currencyView = listItemView.findViewById(R.id.currency_text_view);
        String currency = currentBook.getCurrency();
        currencyView.setText(currency);

        ImageView coverImageView = listItemView.findViewById(R.id.cover_image);
        Picasso.with(getContext()).load(currentBook.getThumbnail()).into(coverImageView);

        // Return the list item view that is now showing the appropriate data
        return listItemView;

    }

    // Format with two decimal places for price value
    private String formatPrice(double price) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.00");
        return magnitudeFormat.format(price);
    }

}