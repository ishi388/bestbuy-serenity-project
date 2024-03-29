package com.bestbuy.constants;

public class EndPoints {

    //End points for products
    public static final String GET_ALL_PRODUCTS = "/products";

    public static final String CREATE_PRODUCT = "/products";

    public static final String GET_SINGLE_PRODUCT_BY_ID = "/{productID}";

    public static final String UPDATE_PRODUCT_BY_ID = "/{productID}";

    public static final String DELETE_PRODUCT_BY_ID = "/{productID}";

    //End points for stores


    public static final String GET_ALL_STORES = "/stores";
    public static final String CREATE_ALL_STORES = "/stores";
    public static final String GET_SINGLE_STORE_BY_ID = "/{storeID}";
    public static final String UPDATE_STORE_BY_ID = "/{storeID}";
    public static final String DELETE_STORE_BY_ID = "/{storeID}";



}
