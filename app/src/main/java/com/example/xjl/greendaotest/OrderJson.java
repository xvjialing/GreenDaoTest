package com.example.xjl.greendaotest;

import java.util.List;

/**
 * Created by xjl on 17-2-23.
 */

public class OrderJson {

    /**
     * recycler_id : 212412412
     * recycler_payment_pwd : nwehnfiwe
     * user_id : 31414141
     * devices_id : 124141412
     * integral : 412
     * data : [{"recycled_goods_id":"1313124124","recycled_goods_weight":"31"},{"recycled_goods_id":"1313124124","recycled_goods_weight":"31"}]
     */

    private String recycler_id;
    private String recycler_payment_pwd;
    private String user_id;
    private String devices_id;
    private String integral;
    private List<DataBean> data;

    public String getRecycler_id() {
        return recycler_id;
    }

    public void setRecycler_id(String recycler_id) {
        this.recycler_id = recycler_id;
    }

    public String getRecycler_payment_pwd() {
        return recycler_payment_pwd;
    }

    public void setRecycler_payment_pwd(String recycler_payment_pwd) {
        this.recycler_payment_pwd = recycler_payment_pwd;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDevices_id() {
        return devices_id;
    }

    public void setDevices_id(String devices_id) {
        this.devices_id = devices_id;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * recycled_goods_id : 1313124124
         * recycled_goods_weight : 31
         */

        private String recycled_goods_id;
        private String recycled_goods_weight;

        public String getRecycled_goods_id() {
            return recycled_goods_id;
        }

        public void setRecycled_goods_id(String recycled_goods_id) {
            this.recycled_goods_id = recycled_goods_id;
        }

        public String getRecycled_goods_weight() {
            return recycled_goods_weight;
        }

        public void setRecycled_goods_weight(String recycled_goods_weight) {
            this.recycled_goods_weight = recycled_goods_weight;
        }
    }
}
