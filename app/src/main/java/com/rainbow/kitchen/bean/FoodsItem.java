package com.rainbow.kitchen.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tsngtso on 2016/12/27.
 */

public class FoodsItem implements Serializable{

    /**
     * code : 0
     * msg : success
     * version : 4.4
     * timestamp : 1482805572000
     * data : {"series_id":"136","series_name":"#拾味爸爸#排骨饭","series_title":"简单却不失美味的排骨饭","create_time":"2016-12-23 17:09:38","last_update":"2016-12-26 16:59:52","order_no":"1","tag":"","episode":1,"series_image":"http://img.szzhangchu.com/1482484177632_1826968334.jpg","share_title":null,"share_description":null,"share_image":null,"album":"拾味爸爸","album_logo":"1482484177864_7734338358.png","relate_activity":"177","data":[{"course_id":2256,"course_video":"http://video.szzhangchu.com/1482216058312_2493856551.mp4","episode":1,"course_name":"排骨饭","course_subject":"简单却不失美味的排骨饭","course_image":"http://img.szzhangchu.com/1482484270517_2735597370.jpg","ischarge":"0","price":"0","video_watchcount":4287,"course_introduce":"","is_collect":0,"is_like":0}],"play":4287,"share_url":"http://m.izhangchu.com/micro/shike.php?&material_id=136"}
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
         * series_id : 136
         * series_name : #拾味爸爸#排骨饭
         * series_title : 简单却不失美味的排骨饭
         * create_time : 2016-12-23 17:09:38
         * last_update : 2016-12-26 16:59:52
         * order_no : 1
         * tag :
         * episode : 1
         * series_image : http://img.szzhangchu.com/1482484177632_1826968334.jpg
         * share_title : null
         * share_description : null
         * share_image : null
         * album : 拾味爸爸
         * album_logo : 1482484177864_7734338358.png
         * relate_activity : 177
         * data : [{"course_id":2256,"course_video":"http://video.szzhangchu.com/1482216058312_2493856551.mp4","episode":1,"course_name":"排骨饭","course_subject":"简单却不失美味的排骨饭","course_image":"http://img.szzhangchu.com/1482484270517_2735597370.jpg","ischarge":"0","price":"0","video_watchcount":4287,"course_introduce":"","is_collect":0,"is_like":0}]
         * play : 4287
         * share_url : http://m.izhangchu.com/micro/shike.php?&material_id=136
         */

        private String series_id;
        private String series_name;
        private String series_title;
        private String create_time;
        private String last_update;
        private String order_no;
        private String tag;
        private int episode;
        private String series_image;
        private Object share_title;
        private Object share_description;
        private Object share_image;
        private String album;
        private String album_logo;
        private String relate_activity;
        private int play;
        private String share_url;
        private List<DataBean> data;

        public String getSeries_id() {
            return series_id;
        }

        public void setSeries_id(String series_id) {
            this.series_id = series_id;
        }

        public String getSeries_name() {
            return series_name;
        }

        public void setSeries_name(String series_name) {
            this.series_name = series_name;
        }

        public String getSeries_title() {
            return series_title;
        }

        public void setSeries_title(String series_title) {
            this.series_title = series_title;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getLast_update() {
            return last_update;
        }

        public void setLast_update(String last_update) {
            this.last_update = last_update;
        }

        public String getOrder_no() {
            return order_no;
        }

        public void setOrder_no(String order_no) {
            this.order_no = order_no;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public int getEpisode() {
            return episode;
        }

        public void setEpisode(int episode) {
            this.episode = episode;
        }

        public String getSeries_image() {
            return series_image;
        }

        public void setSeries_image(String series_image) {
            this.series_image = series_image;
        }

        public Object getShare_title() {
            return share_title;
        }

        public void setShare_title(Object share_title) {
            this.share_title = share_title;
        }

        public Object getShare_description() {
            return share_description;
        }

        public void setShare_description(Object share_description) {
            this.share_description = share_description;
        }

        public Object getShare_image() {
            return share_image;
        }

        public void setShare_image(Object share_image) {
            this.share_image = share_image;
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

        public String getRelate_activity() {
            return relate_activity;
        }

        public void setRelate_activity(String relate_activity) {
            this.relate_activity = relate_activity;
        }

        public int getPlay() {
            return play;
        }

        public void setPlay(int play) {
            this.play = play;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable{
            /**
             * course_id : 2256
             * course_video : http://video.szzhangchu.com/1482216058312_2493856551.mp4
             * episode : 1
             * course_name : 排骨饭
             * course_subject : 简单却不失美味的排骨饭
             * course_image : http://img.szzhangchu.com/1482484270517_2735597370.jpg
             * ischarge : 0
             * price : 0
             * video_watchcount : 4287
             * course_introduce :
             * is_collect : 0
             * is_like : 0
             */

            private int course_id;
            private String course_video;
            private int episode;
            private String course_name;
            private String course_subject;
            private String course_image;
            private String ischarge;
            private String price;
            private int video_watchcount;
            private String course_introduce;
            private int is_collect;
            private int is_like;

            public int getCourse_id() {
                return course_id;
            }

            public void setCourse_id(int course_id) {
                this.course_id = course_id;
            }

            public String getCourse_video() {
                return course_video;
            }

            public void setCourse_video(String course_video) {
                this.course_video = course_video;
            }

            public int getEpisode() {
                return episode;
            }

            public void setEpisode(int episode) {
                this.episode = episode;
            }

            public String getCourse_name() {
                return course_name;
            }

            public void setCourse_name(String course_name) {
                this.course_name = course_name;
            }

            public String getCourse_subject() {
                return course_subject;
            }

            public void setCourse_subject(String course_subject) {
                this.course_subject = course_subject;
            }

            public String getCourse_image() {
                return course_image;
            }

            public void setCourse_image(String course_image) {
                this.course_image = course_image;
            }

            public String getIscharge() {
                return ischarge;
            }

            public void setIscharge(String ischarge) {
                this.ischarge = ischarge;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getVideo_watchcount() {
                return video_watchcount;
            }

            public void setVideo_watchcount(int video_watchcount) {
                this.video_watchcount = video_watchcount;
            }

            public String getCourse_introduce() {
                return course_introduce;
            }

            public void setCourse_introduce(String course_introduce) {
                this.course_introduce = course_introduce;
            }

            public int getIs_collect() {
                return is_collect;
            }

            public void setIs_collect(int is_collect) {
                this.is_collect = is_collect;
            }

            public int getIs_like() {
                return is_like;
            }

            public void setIs_like(int is_like) {
                this.is_like = is_like;
            }
        }
    }
}
