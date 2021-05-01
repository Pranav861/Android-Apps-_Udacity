package com.example.booklisting;

public class Book {

    //global variable for title
    public  String mTitle;

    //global variable for Author
    public String mAuthor;


    //global variable for price
    private double mPrice;

    //global variable for URL
    private String mUrl;

    //global variable for currency
    private String mCurrency;

    //global variable for thumbnail
    private String mThumbnail;

    //Constructor
    public Book(String title, String author, double price, String url, String currency, String thumbnail) {
        mTitle = title;
        mAuthor = author;
        mPrice = price;
        mUrl = url;
        mCurrency = currency;
        mThumbnail = thumbnail;
    }


    /**
     * Get the  Title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the author Name
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Get the URL
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Return the PRice
     */
    public double getPrice() {
        return mPrice;
    }

    /**
     * Return the Currency
     */
    public String getCurrency() {
        return mCurrency;
    }

    /**
     * returns thumbnail for the book
     */
    public String getThumbnail(){
        return mThumbnail;
    }
}

