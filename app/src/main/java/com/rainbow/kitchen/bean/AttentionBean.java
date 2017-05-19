package com.rainbow.kitchen.bean;

import java.util.List;

/**
 * Created by Administrator on 2017.1.9.
 */

public class AttentionBean {

    /**
     * code : 0
     * msg : success
     * version : 4.0
     * timestamp : 1483955735000
     * data : {"page":"1","size":"20","total":"6","count":"6","data":[{"user_id_be_follow":"983812","user_id":"983812","be_follow":0,"count_fensi":2525,"nick":"小萝莉","head_img":"http://img.szzhangchu.com/1447138097824_2955653167.jpg","istalent":0},{"user_id_be_follow":"1153857","user_id":"1153857","be_follow":0,"count_fensi":31,"nick":"kiny-谷采霓","head_img":"http://wx.qlogo.cn/mmopen/RmLI7RnVg7Ntib7zm5wQafBYkK0O6ee04dwKT2icKiacPyiaCiaSiaOzGzEp6ibNdsvvkRmzlRDicuPGg3xAzVDKFWK6WmKgNOSE5BuH/0","istalent":0},{"user_id_be_follow":"1151765","user_id":"1151765","be_follow":0,"count_fensi":523,"nick":"花小萌","head_img":"http://img.szzhangchu.com/1450355652124_5410631947.jpg","istalent":0},{"user_id_be_follow":"1151517","user_id":"1151517","be_follow":0,"count_fensi":347,"nick":"悠游","head_img":"http://wx.qlogo.cn/mmopen/ajNVdqHZLLA9lib76sXJBot3QxBtrRfpSR6Sl4O8Ccqon1HgIiaCSX9OVGub4oTElGLHClzKvvKJT7uMQUJ68YHnI4pyWgTewAX2xUgTfr4CE/0","istalent":0},{"user_id_be_follow":"1148139","user_id":"1148139","be_follow":0,"count_fensi":751,"nick":"Mocha","head_img":"http://wx.qlogo.cn/mmopen/VwiaLEdthMSgHIOSSUG48FRz5qJ8NOxibWXtwficSySicbqBzXAANEibqOAdtxOx2OQIOfQ6iaF1SGFj2vmA1icRHVzckdYbyZYoEZF/0","istalent":0},{"user_id_be_follow":"1151652","user_id":"1151652","be_follow":0,"count_fensi":29,"nick":"Jenny","head_img":"http://img.szzhangchu.com/1450340597106_8256874364.jpg","istalent":0}]}
     */

    private String code;
    private String msg;
    private String version;
    private long timestamp;
    private DataBeanX data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * page : 1
         * size : 20
         * total : 6
         * count : 6
         * data : [{"user_id_be_follow":"983812","user_id":"983812","be_follow":0,"count_fensi":2525,"nick":"小萝莉","head_img":"http://img.szzhangchu.com/1447138097824_2955653167.jpg","istalent":0},{"user_id_be_follow":"1153857","user_id":"1153857","be_follow":0,"count_fensi":31,"nick":"kiny-谷采霓","head_img":"http://wx.qlogo.cn/mmopen/RmLI7RnVg7Ntib7zm5wQafBYkK0O6ee04dwKT2icKiacPyiaCiaSiaOzGzEp6ibNdsvvkRmzlRDicuPGg3xAzVDKFWK6WmKgNOSE5BuH/0","istalent":0},{"user_id_be_follow":"1151765","user_id":"1151765","be_follow":0,"count_fensi":523,"nick":"花小萌","head_img":"http://img.szzhangchu.com/1450355652124_5410631947.jpg","istalent":0},{"user_id_be_follow":"1151517","user_id":"1151517","be_follow":0,"count_fensi":347,"nick":"悠游","head_img":"http://wx.qlogo.cn/mmopen/ajNVdqHZLLA9lib76sXJBot3QxBtrRfpSR6Sl4O8Ccqon1HgIiaCSX9OVGub4oTElGLHClzKvvKJT7uMQUJ68YHnI4pyWgTewAX2xUgTfr4CE/0","istalent":0},{"user_id_be_follow":"1148139","user_id":"1148139","be_follow":0,"count_fensi":751,"nick":"Mocha","head_img":"http://wx.qlogo.cn/mmopen/VwiaLEdthMSgHIOSSUG48FRz5qJ8NOxibWXtwficSySicbqBzXAANEibqOAdtxOx2OQIOfQ6iaF1SGFj2vmA1icRHVzckdYbyZYoEZF/0","istalent":0},{"user_id_be_follow":"1151652","user_id":"1151652","be_follow":0,"count_fensi":29,"nick":"Jenny","head_img":"http://img.szzhangchu.com/1450340597106_8256874364.jpg","istalent":0}]
         */

        private String page;
        private String size;
        private String total;
        private String count;
        private List<DataBean> data;

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * user_id_be_follow : 983812
             * user_id : 983812
             * be_follow : 0
             * count_fensi : 2525
             * nick : 小萝莉
             * head_img : http://img.szzhangchu.com/1447138097824_2955653167.jpg
             * istalent : 0
             */

            private String user_id_be_follow;
            private String user_id;
            private int be_follow;
            private int count_fensi;
            private String nick;
            private String head_img;
            private int istalent;

            public String getUser_id_be_follow() {
                return user_id_be_follow;
            }

            public void setUser_id_be_follow(String user_id_be_follow) {
                this.user_id_be_follow = user_id_be_follow;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public int getBe_follow() {
                return be_follow;
            }

            public void setBe_follow(int be_follow) {
                this.be_follow = be_follow;
            }

            public int getCount_fensi() {
                return count_fensi;
            }

            public void setCount_fensi(int count_fensi) {
                this.count_fensi = count_fensi;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getHead_img() {
                return head_img;
            }

            public void setHead_img(String head_img) {
                this.head_img = head_img;
            }

            public int getIstalent() {
                return istalent;
            }

            public void setIstalent(int istalent) {
                this.istalent = istalent;
            }
        }
    }
}
