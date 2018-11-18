package com.example.zhakonze.rsa_tourapp;


public class Des
{
    private String mName;
    private String mAdd;
    private String mDes;
    private String mSche;
    private String mPrice;
    private String mPhone;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Des(String Name, String Add, String Des, String Sched, String Price, String phone, int ImgRes)
    {
        mName = Name;
        mAdd = Add;
        mDes = Des;
        mSche = Sched;
        mPrice = Price;
        mPhone = phone;
        mImageResourceId = ImgRes;
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAdd() {
        return mAdd;
    }

    public void setmAdd(String mAdd) {
        this.mAdd = mAdd;
    }

    public String getmDes() {
        return mDes;
    }

    public void setmDes(String mDes) {
        this.mDes = mDes;
    }

    public String getmSche() {
        return mSche;
    }

    public void setmSche(String mSche) {
        this.mSche = mSche;
    }

    public String getmPrice() {
        return mPrice;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}