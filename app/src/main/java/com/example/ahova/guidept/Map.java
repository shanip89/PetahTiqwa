package com.example.ahova.guidept;

public class Map {

    private int imageLogo;
    private String textInfo;
    private String knowThis;
    private int imageMap;
    private String linkMap;

    public Map (int mImageLogo, String mTextInfo, String mknowThis, int mImagemap, String mLinkMap){
        imageLogo = mImageLogo;
        textInfo = mTextInfo;
        knowThis = mknowThis;
        imageMap = mImagemap;
        linkMap = mLinkMap;
    }

    public int getImageLogo() {
        return imageLogo;
    }

    public String getTextInfo() {
        return textInfo;
    }

    public String getKnowThis() {
        return knowThis;
    }


    public int getImageMap() {
        return imageMap;
    }

    public String getLinkMap() {
        return linkMap;
    }
}
