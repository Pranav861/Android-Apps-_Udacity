package com.example.citytour;

public class Word {

        private String mNameTextView;

        private String mDescriptionTextView;

        private int mImageResourceId;

        public Word(String nameTextView, String descriptionTextView, int imageResourceId){
                    mNameTextView = nameTextView;
                    mDescriptionTextView = descriptionTextView;
                    mImageResourceId = imageResourceId;
        }

        public String getNameTextView(){
            return mNameTextView;
        }

        public String getDescriptionTextView(){
            return mDescriptionTextView;
        }

        public int getImageResourceId(){
            return mImageResourceId;
        }
}
