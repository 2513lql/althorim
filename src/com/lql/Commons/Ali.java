package com.lql.Commons;

/**
 * Created by LQL on 2017/3/4.
 */
public class Ali {


    public static int position(String itemList, String itemPriceList, String itemId, double itemPrice){


        String [] itemsList = itemList.split(",");
        String [] itemPriceLists = itemPriceList.split(",");

        if (itemsList.length != itemPriceLists.length){
            return -1;
        }

        int low = 0,high = itemPriceLists.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            double curprice = Double.valueOf(itemPriceLists[mid]);
            if (curprice == itemPrice){
                if (itemId.equals(itemsList[mid])){
                    return mid;
                }else{
                    return -1;
                }
            }else if (curprice < itemPrice){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return 0;
    }

}
