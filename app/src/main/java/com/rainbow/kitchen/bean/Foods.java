package com.rainbow.kitchen.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tsngtso on 2016/12/26.
 */

public class Foods implements Serializable{


    /**
     * code : 0
     * msg : success
     * version : 4.33
     * timestamp : 1482740809000
     * data : {"page":"1","size":"20","total":"100","count":"20","top":[],"data":[{"series_id":17,"series_name":"#圣诞大餐#圣诞热红酒","image":"http://img.szzhangchu.com/1458097309449_4027356154.jpg","episode_sum":9,"charge_count":0,"tag":"","album":"圣诞大餐","album_logo":"http://img.szzhangchu.com/1458888613707_5888787967.png","episode":9,"play":130991},{"series_id":136,"series_name":"#拾味爸爸#排骨饭","image":"http://img.szzhangchu.com/1482484177632_1826968334.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"拾味爸爸","album_logo":"http://img.szzhangchu.com/1482484177864_7734338358.png","episode":1,"play":4287},{"series_id":135,"series_name":"#黎昕的阳光料理#Apple pie","image":"http://img.szzhangchu.com/1482396789522_5885918011.jpg","episode_sum":100,"charge_count":0,"tag":"","album":"黎昕的阳光料理","album_logo":"http://img.szzhangchu.com/1482396790026_6699062491.png","episode":1,"play":4810},{"series_id":98,"series_name":"#罐头视频# 炸鸡圣诞树","image":"http://img.szzhangchu.com/1482573625221_6242117898.jpg","episode_sum":60,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955517807_1105764108.jpg","episode":48,"play":227436},{"series_id":74,"series_name":"#好好ci#旋涡可可树桩蛋糕","image":"http://img.szzhangchu.com/1482485261457_4903697125.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955234746_2673268710.jpg","episode":21,"play":98350},{"series_id":75,"series_name":"#牙印生活#小鸡意面","image":"http://img.szzhangchu.com/1482561144861_8921767091.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955668827_5261364234.jpg","episode":19,"play":88079},{"series_id":109,"series_name":"#绵羊料理#经典肉酱意大利面","image":"http://img.szzhangchu.com/1482311088361_1338788408.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"绵羊料理","album_logo":"http://img.szzhangchu.com/1482311089939_1736041230.png","episode":19,"play":107088},{"series_id":121,"series_name":"#蓝猪坊#龙利鱼拌面","image":"http://img.szzhangchu.com/1482224552077_1638340788.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"蓝猪坊","album_logo":"http://img.szzhangchu.com/1482224552669_3907445301.gif","episode":13,"play":71281},{"series_id":134,"series_name":"#xing星男厨#黯然销魂饭","image":"http://img.szzhangchu.com/1482394756595_4127626605.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"xing星男厨","album_logo":"http://img.szzhangchu.com/1482394757016_1697184517.jpg","episode":1,"play":4892},{"series_id":133,"series_name":"#美美的美美-#草莓圣诞老人","image":"http://img.szzhangchu.com/1482566130475_6345987412.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"美美的美美-","album_logo":"http://img.szzhangchu.com/1482142534973_2267962182.png","episode":3,"play":12985},{"series_id":132,"series_name":"#胖子食堂#炫彩冬至饺子","image":"http://img.szzhangchu.com/1482308238700_2048310735.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"胖子食堂","album_logo":"http://img.szzhangchu.com/1481880125036_6202087330.png","episode":2,"play":8483},{"series_id":131,"series_name":"#辣妈来辣-小辣厨房#宝宝的第一口饭该怎么吃？","image":"http://img.szzhangchu.com/1482560755023_2363952425.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"辣妈来辣-小辣厨房","album_logo":"http://img.szzhangchu.com/1481792678876_7500022810.png","episode":2,"play":8541},{"series_id":130,"series_name":"#可可私厨#萝卜丝焖鱼","image":"http://img.szzhangchu.com/1482482647742_4171820363.jpg","episode_sum":100,"charge_count":0,"tag":"","album":"可可私厨","album_logo":"http://img.szzhangchu.com/1482482648420_6302552544.png","episode":5,"play":21774},{"series_id":58,"series_name":"#食行生鲜#纸包鱼","image":"http://img.szzhangchu.com/1481704999214_1157686170.jpg","episode_sum":100,"charge_count":0,"tag":"","album":"食行生鲜","album_logo":"http://img.szzhangchu.com/1479957615022_5564135560.jpg","episode":35,"play":169233},{"series_id":78,"series_name":"#Freesiaa Made#姜饼屋","image":"http://img.szzhangchu.com/1472527998723_8643221745.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"Freesiaa Made","album_logo":"http://img.szzhangchu.com/1472528000635_7006732497.png","episode":25,"play":87296},{"series_id":57,"series_name":"#开开的厨房#亲子法式吐司","image":"http://img.szzhangchu.com/1481360639753_5441838670.jpg","episode_sum":100,"charge_count":0,"tag":"","album":"开开的厨房","album_logo":"http://img.szzhangchu.com/1479958187988_3633506750.jpg","episode":20,"play":97430},{"series_id":72,"series_name":"#魔力美食#6种方法让牛奶更好喝","image":"http://img.szzhangchu.com/1482228991883_5659332440.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955466718_2747315288.jpg","episode":18,"play":85409},{"series_id":30,"series_name":"#膳小姐#呆萌南瓜饼","image":"http://img.szzhangchu.com/1480665188391_6694846128.jpg","episode_sum":30,"charge_count":0,"tag":"","album":"膳小姐","album_logo":"http://img.szzhangchu.com/1479958408633_8586882740.jpg","episode":24,"play":168495},{"series_id":31,"series_name":"#微在涨姿势#天啦噜，电饭煲竟然能做出这么多美味","image":"http://img.szzhangchu.com/1481536788272_1911870712.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"微在涨姿势","album_logo":"http://img.szzhangchu.com/1479957773341_2305137587.jpg","episode":32,"play":190193},{"series_id":84,"series_name":"#有料厨房#烤菠萝和猪脸肉","image":"http://img.szzhangchu.com/1481537612287_2323091168.jpg","episode_sum":30,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955794805_5981705520.jpg","episode":18,"play":83225}]}
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

    public static class DataBeanX implements Serializable{
        /**
         * page : 1
         * size : 20
         * total : 100
         * count : 20
         * top : []
         * data : [{"series_id":17,"series_name":"#圣诞大餐#圣诞热红酒","image":"http://img.szzhangchu.com/1458097309449_4027356154.jpg","episode_sum":9,"charge_count":0,"tag":"","album":"圣诞大餐","album_logo":"http://img.szzhangchu.com/1458888613707_5888787967.png","episode":9,"play":130991},{"series_id":136,"series_name":"#拾味爸爸#排骨饭","image":"http://img.szzhangchu.com/1482484177632_1826968334.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"拾味爸爸","album_logo":"http://img.szzhangchu.com/1482484177864_7734338358.png","episode":1,"play":4287},{"series_id":135,"series_name":"#黎昕的阳光料理#Apple pie","image":"http://img.szzhangchu.com/1482396789522_5885918011.jpg","episode_sum":100,"charge_count":0,"tag":"","album":"黎昕的阳光料理","album_logo":"http://img.szzhangchu.com/1482396790026_6699062491.png","episode":1,"play":4810},{"series_id":98,"series_name":"#罐头视频# 炸鸡圣诞树","image":"http://img.szzhangchu.com/1482573625221_6242117898.jpg","episode_sum":60,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955517807_1105764108.jpg","episode":48,"play":227436},{"series_id":74,"series_name":"#好好ci#旋涡可可树桩蛋糕","image":"http://img.szzhangchu.com/1482485261457_4903697125.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955234746_2673268710.jpg","episode":21,"play":98350},{"series_id":75,"series_name":"#牙印生活#小鸡意面","image":"http://img.szzhangchu.com/1482561144861_8921767091.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955668827_5261364234.jpg","episode":19,"play":88079},{"series_id":109,"series_name":"#绵羊料理#经典肉酱意大利面","image":"http://img.szzhangchu.com/1482311088361_1338788408.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"绵羊料理","album_logo":"http://img.szzhangchu.com/1482311089939_1736041230.png","episode":19,"play":107088},{"series_id":121,"series_name":"#蓝猪坊#龙利鱼拌面","image":"http://img.szzhangchu.com/1482224552077_1638340788.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"蓝猪坊","album_logo":"http://img.szzhangchu.com/1482224552669_3907445301.gif","episode":13,"play":71281},{"series_id":134,"series_name":"#xing星男厨#黯然销魂饭","image":"http://img.szzhangchu.com/1482394756595_4127626605.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"xing星男厨","album_logo":"http://img.szzhangchu.com/1482394757016_1697184517.jpg","episode":1,"play":4892},{"series_id":133,"series_name":"#美美的美美-#草莓圣诞老人","image":"http://img.szzhangchu.com/1482566130475_6345987412.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"美美的美美-","album_logo":"http://img.szzhangchu.com/1482142534973_2267962182.png","episode":3,"play":12985},{"series_id":132,"series_name":"#胖子食堂#炫彩冬至饺子","image":"http://img.szzhangchu.com/1482308238700_2048310735.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"胖子食堂","album_logo":"http://img.szzhangchu.com/1481880125036_6202087330.png","episode":2,"play":8483},{"series_id":131,"series_name":"#辣妈来辣-小辣厨房#宝宝的第一口饭该怎么吃？","image":"http://img.szzhangchu.com/1482560755023_2363952425.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"辣妈来辣-小辣厨房","album_logo":"http://img.szzhangchu.com/1481792678876_7500022810.png","episode":2,"play":8541},{"series_id":130,"series_name":"#可可私厨#萝卜丝焖鱼","image":"http://img.szzhangchu.com/1482482647742_4171820363.jpg","episode_sum":100,"charge_count":0,"tag":"","album":"可可私厨","album_logo":"http://img.szzhangchu.com/1482482648420_6302552544.png","episode":5,"play":21774},{"series_id":58,"series_name":"#食行生鲜#纸包鱼","image":"http://img.szzhangchu.com/1481704999214_1157686170.jpg","episode_sum":100,"charge_count":0,"tag":"","album":"食行生鲜","album_logo":"http://img.szzhangchu.com/1479957615022_5564135560.jpg","episode":35,"play":169233},{"series_id":78,"series_name":"#Freesiaa Made#姜饼屋","image":"http://img.szzhangchu.com/1472527998723_8643221745.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"Freesiaa Made","album_logo":"http://img.szzhangchu.com/1472528000635_7006732497.png","episode":25,"play":87296},{"series_id":57,"series_name":"#开开的厨房#亲子法式吐司","image":"http://img.szzhangchu.com/1481360639753_5441838670.jpg","episode_sum":100,"charge_count":0,"tag":"","album":"开开的厨房","album_logo":"http://img.szzhangchu.com/1479958187988_3633506750.jpg","episode":20,"play":97430},{"series_id":72,"series_name":"#魔力美食#6种方法让牛奶更好喝","image":"http://img.szzhangchu.com/1482228991883_5659332440.jpg","episode_sum":40,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955466718_2747315288.jpg","episode":18,"play":85409},{"series_id":30,"series_name":"#膳小姐#呆萌南瓜饼","image":"http://img.szzhangchu.com/1480665188391_6694846128.jpg","episode_sum":30,"charge_count":0,"tag":"","album":"膳小姐","album_logo":"http://img.szzhangchu.com/1479958408633_8586882740.jpg","episode":24,"play":168495},{"series_id":31,"series_name":"#微在涨姿势#天啦噜，电饭煲竟然能做出这么多美味","image":"http://img.szzhangchu.com/1481536788272_1911870712.jpg","episode_sum":50,"charge_count":0,"tag":"","album":"微在涨姿势","album_logo":"http://img.szzhangchu.com/1479957773341_2305137587.jpg","episode":32,"play":190193},{"series_id":84,"series_name":"#有料厨房#烤菠萝和猪脸肉","image":"http://img.szzhangchu.com/1481537612287_2323091168.jpg","episode_sum":30,"charge_count":0,"tag":"","album":"","album_logo":"http://img.szzhangchu.com/1479955794805_5981705520.jpg","episode":18,"play":83225}]
         */

        private String page;
        private String size;
        private String total;
        private String count;
        private List<?> top;
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

        public List<?> getTop() {
            return top;
        }

        public void setTop(List<?> top) {
            this.top = top;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable{
            /**
             * series_id : 17
             * series_name : #圣诞大餐#圣诞热红酒
             * image : http://img.szzhangchu.com/1458097309449_4027356154.jpg
             * episode_sum : 9
             * charge_count : 0
             * tag :
             * album : 圣诞大餐
             * album_logo : http://img.szzhangchu.com/1458888613707_5888787967.png
             * episode : 9
             * play : 130991
             */

            private int series_id;
            private String series_name;
            private String image;
            private int episode_sum;
            private int charge_count;
            private String tag;
            private String album;
            private String album_logo;
            private int episode;
            private int play;

            public int getSeries_id() {
                return series_id;
            }

            public void setSeries_id(int series_id) {
                this.series_id = series_id;
            }

            public String getSeries_name() {
                return series_name;
            }

            public void setSeries_name(String series_name) {
                this.series_name = series_name;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getEpisode_sum() {
                return episode_sum;
            }

            public void setEpisode_sum(int episode_sum) {
                this.episode_sum = episode_sum;
            }

            public int getCharge_count() {
                return charge_count;
            }

            public void setCharge_count(int charge_count) {
                this.charge_count = charge_count;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getAlbum() {
                return album;
            }

            public void setAlbum(String album) {
                this.album = album;
            }

            public String getAlbum_logo() {
                return album_logo;
            }

            public void setAlbum_logo(String album_logo) {
                this.album_logo = album_logo;
            }

            public int getEpisode() {
                return episode;
            }

            public void setEpisode(int episode) {
                this.episode = episode;
            }

            public int getPlay() {
                return play;
            }

            public void setPlay(int play) {
                this.play = play;
            }
        }
    }
}
