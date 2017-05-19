package com.rainbow.kitchen.bean.recipe_recommenditem;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by followlove on 2017/1/9:11:42.
 */

public class RecipeType1Item {

    /**
     * code : 0
     * msg : success
     * version : 4.0
     * timestamp : 1483929730000
     * data : {"logos":[{"id":"7","name":"食材选储","type":2,"logo":"http://img.szzhangchu.com/1462847693264_6753686672.png"},{"id":"5","name":"食材处理","type":1,"logo":"http://img.szzhangchu.com/1462765476030_7114284859.png"},{"id":"8","name":"手工自制","type":2,"logo":"http://img.szzhangchu.com/1465006389038_3277876080.png"},{"id":"9","name":"烹饪技巧","type":2,"logo":"http://img.szzhangchu.com/1465031322357_5730856252.png"},{"id":"10","name":"厨房神器","type":2,"logo":"http://img.szzhangchu.com/1465194419552_1662326453.png"},{"id":"11","name":"食用保健","type":2,"logo":"http://img.szzhangchu.com/1465200752185_5439128870.png"},{"id":"12","name":"变废为宝","type":2,"logo":"http://img.szzhangchu.com/1465203981137_1080155175.png"},{"id":"13","name":"烘焙宝典","type":2,"logo":"http://img.szzhangchu.com/1465205789027_2706749662.png"}]}
     */

    private String code;
    private String msg;
    private String version;
    private long timestamp;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<LogosBean> logos;

        public List<LogosBean> getLogos() {
            return logos;
        }

        public void setLogos(List<LogosBean> logos) {
            this.logos = logos;
        }

        public static class LogosBean implements Parcelable {
            /**
             * id : 7
             * name : 食材选储
             * type : 2
             * logo : http://img.szzhangchu.com/1462847693264_6753686672.png
             */

            private String id;
            private String name;
            private int type;
            private String logo;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.id);
                dest.writeString(this.name);
                dest.writeInt(this.type);
                dest.writeString(this.logo);
            }

            public LogosBean() {
            }

            protected LogosBean(Parcel in) {
                this.id = in.readString();
                this.name = in.readString();
                this.type = in.readInt();
                this.logo = in.readString();
            }

            public static final Parcelable.Creator<LogosBean> CREATOR = new Parcelable.Creator<LogosBean>() {
                @Override
                public LogosBean createFromParcel(Parcel source) {
                    return new LogosBean(source);
                }

                @Override
                public LogosBean[] newArray(int size) {
                    return new LogosBean[size];
                }
            };
        }
    }
}
