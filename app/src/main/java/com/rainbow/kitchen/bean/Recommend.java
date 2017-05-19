package com.rainbow.kitchen.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by followlove on 2016/12/27:8:33.
 */

public class Recommend implements Parcelable {
    @Override
    public String toString() {
        return "Recommend{" +
                "code=" + code +
                ", msg=" + msg +
                ", timestamp=" + timestamp +
                ", data=" + data +
                '}';
    }

    /**
     * code : 0
     * msg : true
     * version : null
     * timestamp : 1482820801767
     * data : {"banner":[{"banner_id":88,"banner_title":"央视《食尚大转盘》，菜谱征集活动，开始啦~","banner_picture":"http://img.szzhangchu.com/1482722381163_1862260520.jpg","banner_link":"http://h5.izhangchu.com/topic_view/index.html?&topic_id=210","is_link":1,"refer_key":18,"type_id":1},{"banner_id":36,"banner_title":"芒果流心","banner_picture":"http://img.szzhangchu.com/1482747588550_1018496368.jpg","banner_link":"app://food_course_series#69#","is_link":1,"refer_key":11,"type_id":1},{"banner_id":76,"banner_title":"冬瓜仙贝粥","banner_picture":"http://img.szzhangchu.com/1482746043388_6146855210.jpg","banner_link":"app://food_course_series#125#","is_link":1,"refer_key":null,"type_id":1},{"banner_id":81,"banner_title":"小鸡意面","banner_picture":"http://img.szzhangchu.com/1482740486682_9773470352.jpg","banner_link":"http://h5.izhangchu.com/course/view.html?&type=2&series_id=155","is_link":1,"refer_key":null,"type_id":1},{"banner_id":79,"banner_title":"李莹牛排","banner_picture":"http://img.szzhangchu.com/1482745134261_5491707837.jpg","banner_link":"app://food_course_series#128#","is_link":1,"refer_key":1,"type_id":1}],"widgetList":[{"widget_id":32,"widget_type":1,"title":"猜你喜欢","title_link":null,"desc":null,"widget_data":[{"id":1,"type":"image","content":"http://img.szzhangchu.com/1456222953065_6855615159.png","link":"http://h5.izhangchu.com/Tour.html?app_hideheader=1"},{"id":2,"type":"text","content":"新手入门","link":null},{"id":3,"type":"image","content":"http://img.szzhangchu.com/1456222960944_9047013376.png","link":"app://foodmatch"},{"id":4,"type":"text","content":"食材搭配","link":null},{"id":5,"type":"image","content":"http://img.szzhangchu.com/1456222967767_5511783735.png","link":"app://scenelist"},{"id":6,"type":"text","content":"场景菜谱","link":null},{"id":7,"type":"image","content":"http://img.szzhangchu.com/1482542968387_5178412616.png","link":"http://www.meipai.com/live/6218019488781111297?from=groupmessage&isappinstalled=1"},{"id":8,"type":"text","content":"美食直播","link":null}]},{"widget_id":33,"widget_type":2,"title":"红包入口","title_link":null,"desc":"红包入口","widget_data":[{"id":1,"type":"image","content":"http://img.szzhangchu.com/1482227995529_5627671201.jpg","link":"http://h5.izhangchu.com/course/view.html?&type=2&series_id=165"},{"id":2,"type":"image","content":"http://img.szzhangchu.com/1482228213735_5885886190.jpg","link":"http://h5.izhangchu.com/course/view.html?&type=1&series_id=132"},{"id":3,"type":"image","content":"http://img.szzhangchu.com/1482227882525_7479219356.jpg","link":"http://h5.izhangchu.com/course/view.html?&type=2&series_id=167"},{"id":4,"type":"image","content":"http://img.szzhangchu.com/1482228359647_2895318955.jpg","link":"http://h5.izhangchu.com/course/view.html?&type=1&series_id=131"}]},{"widget_id":34,"widget_type":5,"title":"今日新品","title_link":"app://scene#51#","desc":"每天献上最新鲜的美食！","widget_data":[{"id":1,"type":"image","content":"http://img.szzhangchu.com/1439459968370_2552555320.JPG","link":"app://dish#6979#"},{"id":2,"type":"video","content":"http://video.szzhangchu.com/yiqianzhuduzhouA.mp4#http://video.szzhangchu.com/yiqianzhuduzhouB.mp4","link":""},{"id":3,"type":"text","content":"薏芡猪肚粥","link":""},{"id":4,"type":"text","content":"冬日里的清晨，一碗热乎乎的薏芡猪肚粥，香气扑鼻，暖心暖胃。","link":""},{"id":5,"type":"image","content":"http://img.szzhangchu.com/1441533621796_8919848613.JPG","link":"app://dish#13477#"},{"id":6,"type":"video","content":"http://video.szzhangchu.com/huluobojirouqiedingA.mp4#http://video.szzhangchu.com/huluobojirouqiedingB.mp4","link":""},{"id":7,"type":"text","content":"胡萝卜鸡肉茄丁","link":""},{"id":8,"type":"text","content":"入口即化的美味，自然而平凡，无需太多华丽的点缀，只需尽情享受","link":""},{"id":9,"type":"image","content":"http://img.szzhangchu.com/1464443971534_4524274245.JPG","link":"app://dish#15137#"},{"id":10,"type":"video","content":"http://video.szzhangchu.com/guihuatangdunxuelixingpuA.mp4#http://video.szzhangchu.com/guihuatangdunxuelixingpuB.mp4","link":""},{"id":11,"type":"text","content":"桂花糖炖雪梨杏脯","link":""},{"id":12,"type":"text","content":"来试试吧，从一碗炖雪梨开始滋润我们的肺，雪梨搭上杏脯，让我们的肺呼吸新鲜的空气，更好地去看世界。","link":""},{"id":13,"type":"image","content":"http://img.szzhangchu.com/1439445556492_8304249805.jpg","link":"app://dish#13232#"},{"id":14,"type":"video","content":"http://video.szzhangchu.com/dangshenyangrouhuoguoA.mp4#http://video.szzhangchu.com/dangshenyangrouhuoguoB.mp4","link":""},{"id":15,"type":"text","content":"党参羊肉火锅","link":""},{"id":16,"type":"text","content":"羊肉腥味重？别担心；身体廋弱，你需要它；不好吃？那绝不可能；鲜美的羊肉经过烹制，味道鲜美，嚼劲十足，保证吃了还想吃。","link":""}]},{"widget_id":36,"widget_type":3,"title":"下午茶情调","title_link":"app://scene#129#","desc":"最美的不是下午茶，是坐在我对面微笑的你。","widget_data":[{"id":1,"type":"image","content":"http://img.szzhangchu.com/1456975926070_4969755890.jpg","link":"app://scene#129#"},{"id":2,"type":"text","content":"下午茶情调","link":""},{"id":3,"type":"text","content":"50道菜","link":""},{"id":4,"type":"image","content":"http://img.szzhangchu.com/1441111942097_8170356966.jpg","link":"app://dish#10256#"},{"id":5,"type":"video","content":"http://video.szzhangchu.com/tianyuanfengguangpisaA.mp4#http://video.szzhangchu.com/tianyuanfengguangpisaB.mp4","link":""},{"id":6,"type":"image","content":"http://img.szzhangchu.com/1440990362262_7800025643.jpg","link":"app://dish#10941#"},{"id":7,"type":"video","content":"http://video.szzhangchu.com/qiaokelibeizidangaoA.mp4#http://video.szzhangchu.com/qiaokelibeizidangaoB.mp4","link":""},{"id":8,"type":"image","content":"http://img.szzhangchu.com/1439613754301_5858113397.JPG","link":"app://dish#7528#"},{"id":9,"type":"video","content":"http://video.szzhangchu.com/qingguaboheyinA.mp4#http://video.szzhangchu.com/qingguaboheyinB.mp4","link":""},{"id":10,"type":"image","content":"http://img.szzhangchu.com/1439474573106_4842651740.jpg","link":"app://dish#2186#"},{"id":11,"type":"video","content":"http://video.szzhangchu.com/luyaboA.mp4#http://video.szzhangchu.com/luyaboB.mp4","link":""},{"id":12,"type":"image","content":"http://img.szzhangchu.com/1439382968896_5975367539.JPG","link":"app://dish#12097#"},{"id":13,"type":"video","content":"http://video.szzhangchu.com/xuehayoumuguatiantangA.mp4#http://video.szzhangchu.com/xuehayoumuguatiantangB.mp4","link":""},{"id":14,"type":"image","content":"http://img.szzhangchu.com/1466228777691_2403944257.jpg","link":"app://dish#15501#"},{"id":15,"type":"video","content":"http://video.szzhangchu.com/zhishijuhongshuA.mp4#http://video.szzhangchu.com/zhishijuhongshuB.mp4","link":""},{"id":16,"type":"image","content":"http://img.szzhangchu.com/1441088937207_9810061344.jpg","link":"app://dish#11488#"},{"id":17,"type":"video","content":"http://video.szzhangchu.com/guguhuofuA.mp4#http://video.szzhangchu.com/guguhuofuB.mp4","link":""},{"id":18,"type":"image","content":"http://img.szzhangchu.com/1459330813369_3027882068.JPG","link":"app://dish#14912#"},{"id":19,"type":"video","content":"http://video.szzhangchu.com/yuanweimafenA.mp4#http://video.szzhangchu.com/yuanweimafenB.mp4","link":""},{"id":20,"type":"image","content":"http://img.szzhangchu.com/1439444752746_7566938874.jpg","link":"app://dish#9008#"},{"id":21,"type":"video","content":"http://video.szzhangchu.com/midiexiangjianjituiA.mp4#http://video.szzhangchu.com/midiexiangjianjituiB.mp4","link":""},{"id":22,"type":"image","content":"http://img.szzhangchu.com/1439438593881_5779931270.jpg","link":"app://dish#8966#"},{"id":23,"type":"video","content":"http://video.szzhangchu.com/mianhuadangaoA.mp4#http://video.szzhangchu.com/mianhuadangaoB.mp4","link":""},{"id":24,"type":"image","content":"http://img.szzhangchu.com/1439433867424_8888548733.JPG","link":"app://dish#8625#"},{"id":25,"type":"video","content":"http://video.szzhangchu.com/yinsijianbingA.mp4#http://video.szzhangchu.com/yinsijianbingB.mp4","link":""},{"id":26,"type":"image","content":"http://img.szzhangchu.com/1441099374697_2696743070.JPG","link":"app://dish#12190#"},{"id":27,"type":"video","content":"http://video.szzhangchu.com/danmaihuangtaopaiA.mp4#http://video.szzhangchu.com/danmaihuangtaopaiB.mp4","link":""},{"id":28,"type":"image","content":"http://img.szzhangchu.com/1439437308990_4225282490.JPG","link":"app://dish#3953#"},{"id":29,"type":"video","content":"http://video.szzhangchu.com/mianbaobudingA.mp4#http://video.szzhangchu.com/mianbaobudingB.mp4","link":""},{"id":30,"type":"image","content":"http://img.szzhangchu.com/1439372875296_9614814039.JPG","link":"app://dish#5099#"},{"id":31,"type":"video","content":"http://video.szzhangchu.com/ganjushanzhayinA.mp4#http://video.szzhangchu.com/ganjushanzhayinB.mp4","link":""},{"id":32,"type":"image","content":"http://img.szzhangchu.com/1453693402261_2287489903.jpg","link":"app://dish#14885#"},{"id":33,"type":"video","content":"http://video.szzhangchu.com/xiarenfupibaoA.mp4#http://video.szzhangchu.com/xiarenfupibaoB.mp4","link":""},{"id":34,"type":"image","content":"http://img.szzhangchu.com/1439468927003_9203297480.JPG","link":"app://dish#7389#"},{"id":35,"type":"video","content":"http://video.szzhangchu.com/yuanyangnaichaA.mp4#http://video.szzhangchu.com/yuanyangnaichaB.mp4","link":""},{"id":36,"type":"image","content":"http://img.szzhangchu.com/1441111587527_6762022209.jpg","link":"app://dish#10187#"},{"id":37,"type":"video","content":"http://video.szzhangchu.com/fengweiluobogaoA.mp4#http://video.szzhangchu.com/fengweiluobogaoB.mp4","link":""},{"id":38,"type":"image","content":"http://img.szzhangchu.com/1439462167818_7414763650.jpg","link":"app://dish#9796#"},{"id":39,"type":"video","content":"http://video.szzhangchu.com/yaoguoxiaosubingA.mp4#http://video.szzhangchu.com/yaoguoxiaosubingB.mp4","link":""},{"id":40,"type":"image","content":"http://img.szzhangchu.com/1439451592915_3317377657.jpg","link":"app://dish#11028#"},{"id":41,"type":"video","content":"http://video.szzhangchu.com/hongzaoniunaiyinA.mp4#http://video.szzhangchu.com/hongzaoniunaiyinB.mp4","link":""},{"id":42,"type":"image","content":"http://img.szzhangchu.com/1441098543285_5284153256.jpg","link":"app://dish#12148#"},{"id":43,"type":"video","content":"http://video.szzhangchu.com/kaoxiangyachiA.mp4#http://video.szzhangchu.com/kaoxiangyachiB.mp4","link":""},{"id":44,"type":"image","content":"http://img.szzhangchu.com/1439466487433_4706435052.jpg","link":"app://dish#7307#"},{"id":45,"type":"video","content":"http://video.szzhangchu.com/haitaidangaoA.mp4#http://video.szzhangchu.com/haitaidangaoB.mp4","link":""},{"id":46,"type":"image","content":"http://img.szzhangchu.com/1441525272925_7976370761.jpg","link":"app://dish#10960#"},{"id":47,"type":"video","content":"http://video.szzhangchu.com/hetaoxiangsuA.mp4#http://video.szzhangchu.com/hetaoxiangsuB.mp4","link":""},{"id":48,"type":"image","content":"http://img.szzhangchu.com/1439373600950_9846242131.JPG","link":"app://dish#5134#"},{"id":49,"type":"video","content":"http://video.szzhangchu.com/putaopingguozhiA.mp4#http://video.szzhangchu.com/putaopingguozhiB.mp4","link":""},{"id":50,"type":"image","content":"http://img.szzhangchu.com/1439446933264_8458933862.jpg","link":"app://dish#13307#"},{"id":51,"type":"video","content":"http://video.szzhangchu.com/yanshuizhucandouA.mp4#http://video.szzhangchu.com/yanshuizhucandouB.mp4","link":""},{"id":52,"type":"image","content":"http://img.szzhangchu.com/1440403334626_7449421589.jpg","link":"app://dish#10093#"},{"id":53,"type":"video","content":"http://video.szzhangchu.com/chaofangbianmianA.mp4#http://video.szzhangchu.com/chaofangbianmianB.mp4","link":""},{"id":54,"type":"image","content":"http://img.szzhangchu.com/1439393791242_5722303937.JPG","link":"app://dish#12527#"},{"id":55,"type":"video","content":"http://video.szzhangchu.com/huluobohuA.mp4#http://video.szzhangchu.com/huluobohuB.mp4","link":""},{"id":56,"type":"image","content":"http://img.szzhangchu.com/1440124369660_7223803805.JPG","link":"app://dish#7775#"},{"id":57,"type":"video","content":"http://video.szzhangchu.com/huolongguozhiA.mp4#http://video.szzhangchu.com/huolongguozhiB.mp4","link":""},{"id":58,"type":"image","content":"http://img.szzhangchu.com/1440397093408_6958410254.jpg","link":"app://dish#9702#"},{"id":59,"type":"video","content":"http://video.szzhangchu.com/shuangguashalaA.mp4#http://video.szzhangchu.com/shuangguashalaB.mp4","link":""},{"id":60,"type":"image","content":"http://img.szzhangchu.com/1439463331153_7056934803.jpg","link":"app://dish#9839#"},{"id":61,"type":"video","content":"http://video.szzhangchu.com/naiyoubingganA.mp4#http://video.szzhangchu.com/naiyoubingganB.mp4","link":""},{"id":62,"type":"image","content":"http://img.szzhangchu.com/1441104722327_6483608692.JPG","link":"app://dish#12718#"},{"id":63,"type":"video","content":"http://video.szzhangchu.com/geliqiaomaimianA.mp4#http://video.szzhangchu.com/geliqiaomaimianB.mp4","link":""},{"id":64,"type":"image","content":"http://img.szzhangchu.com/1441116709401_7032576910.jpg","link":"app://dish#10871#"},{"id":65,"type":"video","content":"http://video.szzhangchu.com/naixiangsudabingganA.mp4#http://video.szzhangchu.com/naixiangsudabingganB.mp4","link":""},{"id":66,"type":"image","content":"http://img.szzhangchu.com/1439460759389_5257256942.jpg","link":"app://dish#9760#"},{"id":67,"type":"video","content":"http://video.szzhangchu.com/lujizhuaA.mp4#http://video.szzhangchu.com/lujizhuaB.mp4","link":""},{"id":68,"type":"image","content":"http://img.szzhangchu.com/1441028341818_5257857503.jpg","link":"app://dish#10259#"},{"id":69,"type":"video","content":"http://video.szzhangchu.com/qincaitianjushalaA.mp4#http://video.szzhangchu.com/qincaitianjushalaB.mp4","link":""},{"id":70,"type":"image","content":"http://img.szzhangchu.com/1439381040706_5770188842.JPG","link":"app://dish#11997#"},{"id":71,"type":"video","content":"http://video.szzhangchu.com/kabuqinuobingkafeiA.mp4#http://video.szzhangchu.com/kabuqinuobingkafeiB.mp4","link":""},{"id":72,"type":"image","content":"http://img.szzhangchu.com/1441114608398_2405670669.jpg","link":"app://dish#10618#"},{"id":73,"type":"video","content":"http://video.szzhangchu.com/malinuodangaoA.mp4#http://video.szzhangchu.com/malinuodangaoB.mp4","link":""},{"id":74,"type":"image","content":"http://img.szzhangchu.com/1441097167760_9981124068.jpg","link":"app://dish#12054#"},{"id":75,"type":"video","content":"http://video.szzhangchu.com/kaomizhihetaoA.mp4#http://video.szzhangchu.com/kaomizhihetaoB.mp4","link":""},{"id":76,"type":"image","content":"http://img.szzhangchu.com/1441118155574_7669743009.jpg","link":"app://dish#11175#"},{"id":77,"type":"video","content":"http://video.szzhangchu.com/jiegengzhuhuashengA.mp4#http://video.szzhangchu.com/jiegengzhuhuashengB.mp4","link":""},{"id":78,"type":"image","content":"http://img.szzhangchu.com/1439387664265_3728867318.JPG","link":"app://dish#12348#"},{"id":79,"type":"video","content":"http://video.szzhangchu.com/rousongfantuanA.mp4#http://video.szzhangchu.com/rousongfantuanB.mp4","link":""},{"id":80,"type":"image","content":"http://img.szzhangchu.com/1441114840537_7716368105.JPG","link":"app://dish#10644#"},{"id":81,"type":"video","content":"http://video.szzhangchu.com/sucuihuashengbingganA.mp4#http://video.szzhangchu.com/sucuihuashengbingganB.mp4","link":""},{"id":82,"type":"image","content":"http://img.szzhangchu.com/1441102656605_7946293337.jpg","link":"app://dish#12682#"},{"id":83,"type":"video","content":"http://video.szzhangchu.com/caomeidantaA.mp4#http://video.szzhangchu.com/caomeidantaB.mp4","link":""},{"id":84,"type":"image","content":"http://img.szzhangchu.com/1439438462005_7933478050.jpg","link":"app://dish#8958#"},{"id":85,"type":"video","content":"http://video.szzhangchu.com/danmaishousibaoA.mp4#http://video.szzhangchu.com/danmaishousibaoB.mp4","link":""},{"id":86,"type":"image","content":"http://img.szzhangchu.com/1439373394595_1885435963.jpg","link":"app://dish#3079#"},{"id":87,"type":"video","content":"http://video.szzhangchu.com/fanshiliuxuelitangshuiA.mp4#http://video.szzhangchu.com/fanshiliuxuelitangshuiB.mp4","link":""},{"id":88,"type":"image","content":"http://img.szzhangchu.com/1441111416839_1070663353.jpg","link":"app://dish#10167#"},{"id":89,"type":"video","content":"http://video.szzhangchu.com/napolunqiancengsuA.mp4#http://video.szzhangchu.com/napolunqiancengsuB.mp4","link":""},{"id":90,"type":"image","content":"http://img.szzhangchu.com/1439453364757_5013835798.JPG","link":"app://dish#6787#"},{"id":91,"type":"video","content":"http://video.szzhangchu.com/boheningmengzhiA.mp4#http://video.szzhangchu.com/boheningmengzhiB.mp4","link":""},{"id":92,"type":"image","content":"http://img.szzhangchu.com/1439365473359_9317712817.JPG","link":"app://dish#11585#"},{"id":93,"type":"video","content":"http://video.szzhangchu.com/niunaifengmibingkafeiA.mp4#http://video.szzhangchu.com/niunaifengmibingkafeiB.mp4","link":""},{"id":94,"type":"image","content":"http://img.szzhangchu.com/1439375293146_2864132250.JPG","link":"app://dish#5168#"},{"id":95,"type":"video","content":"http://video.szzhangchu.com/shuangguomihoutaoshalaA.mp4#http://video.szzhangchu.com/shuangguomihoutaoshalaB.mp4","link":""},{"id":96,"type":"image","content":"http://img.szzhangchu.com/1439431627111_9104033183.jpg","link":"app://dish#8451#"},{"id":97,"type":"video","content":"http://video.szzhangchu.com/shatangbingganA.mp4#http://video.szzhangchu.com/shatangbingganB.mp4","link":""},{"id":98,"type":"image","content":"http://img.szzhangchu.com/1439453902822_5047239119.JPG","link":"app://dish#9542#"},{"id":99,"type":"video","content":"http://video.szzhangchu.com/huluobozhiA.mp4#http://video.szzhangchu.com/huluobozhiB.mp4","link":""},{"id":100,"type":"image","content":"http://img.szzhangchu.com/1439452416514_6574412293.JPG","link":"app://dish#6733#"},{"id":101,"type":"video","content":"http://video.szzhangchu.com/guiyuanhongzaonaichaA.mp4#http://video.szzhangchu.com/guiyuanhongzaonaichaB.mp4","link":""},{"id":102,"type":"image","content":"http://img.szzhangchu.com/1439474053764_1510520390.jpg","link":"app://dish#2166#"},{"id":103,"type":"video","content":"http://video.szzhangchu.com/laluhuashengA.mp4#http://video.szzhangchu.com/laluhuashengB.mp4","link":""}]},{"widget_id":35,"widget_type":3,"title":"寿司之神","title_link":"app://scene#79#","desc":"自己动手做，美味健康棒棒哒","widget_data":[{"id":1,"type":"image","content":"http://img.szzhangchu.com/1451123585788_6418332180.jpg","link":"app://scene#79#"},{"id":2,"type":"text","content":"寿司之神","link":""},{"id":3,"type":"text","content":"4道菜","link":""},{"id":4,"type":"image","content":"http://img.szzhangchu.com/1441024251278_1678479576.JPG","link":"app://dish#5454#"},{"id":5,"type":"video","content":"http://video.szzhangchu.com/zicaibaofanA.mp4#http://video.szzhangchu.com/zicaibaofanB.mp4","link":""},{"id":6,"type":"image","content":"http://img.szzhangchu.com/1441097599893_8646730627.jpg","link":"app://dish#12090#"},{"id":7,"type":"video","content":"http://video.szzhangchu.com/hanshipaocaishoujuanA.mp4#http://video.szzhangchu.com/hanshipaocaishoujuanB.mp4","link":""},{"id":8,"type":"image","content":"http://img.szzhangchu.com/1441112727148_7271417639.jpg","link":"app://dish#10385#"},{"id":9,"type":"video","content":"http://video.szzhangchu.com/zicaijuanA.mp4#http://video.szzhangchu.com/zicaijuanB.mp4","link":""},{"id":10,"type":"image","content":"http://img.szzhangchu.com/1439388608642_7475050647.JPG","link":"app://dish#12393#"},{"id":11,"type":"video","content":"http://video.szzhangchu.com/xieliushousixiaojuanA.mp4#http://video.szzhangchu.com/xieliushousixiaojuanB.mp4","link":""}]},{"widget_id":38,"widget_type":9,"title":"全部场景(140)","title_link":"app://scenelist","desc":null,"widget_data":null},{"widget_id":39,"widget_type":4,"title":"推荐达人","title_link":"app://recommendtalnet","desc":"推荐达人","widget_data":[{"id":1,"type":"image","content":"http://img.szzhangchu.com/IMG_20160603_134334.jpg","link":"app://talent#1278869#"},{"id":2,"type":"text","content":"风影含沙","link":""},{"id":3,"type":"text","content":"Judy and Julia 吃饭，我是认真的！<br />\n微信号：107401858<br />\n微信公众号：营养美食设计李晖<br />\n淘宝店铺号：3078878   食空间","link":""},{"id":4,"type":"text","content":"粉丝：3504","link":""},{"id":5,"type":"image","content":"http://q.qlogo.cn/qqapp/100956582/6234FCE90C6AD9C2B7246BF3E9D83DBD/100","link":"app://talent#1739935#"},{"id":6,"type":"text","content":"小樱塔塔","link":""},{"id":7,"type":"text","content":"金牛座的白衣天使","link":""},{"id":8,"type":"text","content":"粉丝：501","link":""},{"id":9,"type":"image","content":"http://img.szzhangchu.com/1455886491706_7676659441.jpg","link":"app://talent#1098436#"},{"id":10,"type":"text","content":"古古","link":""},{"id":11,"type":"text","content":"厨房，温暖你的胃，温暖你的心<br />\r\n<br />\n微博： weibo.com/gugu901","link":""},{"id":12,"type":"text","content":"粉丝：2588","link":""}]},{"widget_id":40,"widget_type":8,"title":"精选作品","title_link":"app://boutiquepost","desc":"晒美食，是对于平凡生活的热爱","widget_data":[{"id":1,"type":"image","content":"http://img.szzhangchu.com/1482762630600_2825397890.jpg","link":"app://post#90635#"},{"id":2,"type":"image","content":"http://wx.qlogo.cn/mmopen/8icN9mgVWGeyGeISyDDzzY5I6UCWpxTd4o0YhzZBfxVWHX4EfuqCP95PfqbanK7ficx9Ct4EibNGhHnUib6ibV3Cdrs2YZ6UYBibQe/0","link":"app://talent#1810345#"},{"id":3,"type":"text","content":"一念永恒","link":""},{"id":4,"type":"image","content":"http://img.szzhangchu.com/1482752925115_616465663.jpg","link":"app://post#90617#"},{"id":5,"type":"image","content":"http://img.szzhangchu.com/IMG_20160526_172404.jpg","link":"app://talent#1493102#"},{"id":6,"type":"text","content":"梦屿千寻","link":""},{"id":7,"type":"image","content":"http://img.szzhangchu.com/1482800034158_6886018889.jpg","link":"app://post#90662#"},{"id":8,"type":"image","content":"http://img.szzhangchu.com/1464479158573_0556988141.jpg","link":"app://talent#1151933#"},{"id":9,"type":"text","content":"miao . ❤","link":""}]},{"widget_id":43,"widget_type":7,"title":"美食专题","title_link":"app://subjectList","desc":"5分钟搞定美味主食","widget_data":[{"id":1,"type":"image","content":"http://img.szzhangchu.com/1445562134259_2885797887.jpg","link":"http://h5.izhangchu.com/topic_view/index.html?&topic_id=90"},{"id":2,"type":"text","content":"5分钟搞定美味主食","link":""},{"id":3,"type":"text","content":"上班族常常因为工作忙、时间紧而来不及吃早餐甚至是午餐，吃快餐又会太过油腻或者不太干净。","link":""},{"id":4,"type":"image","content":"http://img.szzhangchu.com/1447658381620_8270281600.png","link":"http://h5.izhangchu.com/topic_view/index.html?&topic_id=111"},{"id":5,"type":"text","content":"一个烤箱，一百道美味","link":""},{"id":6,"type":"text","content":"烤鸡翅，烤五花肉，烤蛋挞，现在只需要一个烤箱就够了，方便又健康！","link":""}]}]}
     */

    private int code;
    private boolean msg;
    private long timestamp;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isMsg() {
        return msg;
    }

    public void setMsg(boolean msg) {
        this.msg = msg;
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

    public static class DataBean implements Parcelable {
        private List<BannerBean> banner;
        private List<WidgetListBean> widgetList;

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<WidgetListBean> getWidgetList() {
            return widgetList;
        }

        public void setWidgetList(List<WidgetListBean> widgetList) {
            this.widgetList = widgetList;
        }

        public static class BannerBean implements Parcelable {
            /**
             * banner_id : 88
             * banner_title : 央视《食尚大转盘》，菜谱征集活动，开始啦~
             * banner_picture : http://img.szzhangchu.com/1482722381163_1862260520.jpg
             * banner_link : http://h5.izhangchu.com/topic_view/index.html?&topic_id=210
             * is_link : 1
             * refer_key : 18
             * type_id : 1
             */

            private int banner_id;
            private String banner_title;
            private String banner_picture;
            private String banner_link;
            private int is_link;
            private int refer_key;
            private int type_id;

            public int getBanner_id() {
                return banner_id;
            }

            public void setBanner_id(int banner_id) {
                this.banner_id = banner_id;
            }

            public String getBanner_title() {
                return banner_title;
            }

            public void setBanner_title(String banner_title) {
                this.banner_title = banner_title;
            }

            public String getBanner_picture() {
                return banner_picture;
            }

            public void setBanner_picture(String banner_picture) {
                this.banner_picture = banner_picture;
            }

            public String getBanner_link() {
                return banner_link;
            }

            public void setBanner_link(String banner_link) {
                this.banner_link = banner_link;
            }

            public int getIs_link() {
                return is_link;
            }

            public void setIs_link(int is_link) {
                this.is_link = is_link;
            }

            public int getRefer_key() {
                return refer_key;
            }

            public void setRefer_key(int refer_key) {
                this.refer_key = refer_key;
            }

            public int getType_id() {
                return type_id;
            }

            public void setType_id(int type_id) {
                this.type_id = type_id;
            }

            public BannerBean() {
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.banner_id);
                dest.writeString(this.banner_title);
                dest.writeString(this.banner_picture);
                dest.writeString(this.banner_link);
                dest.writeInt(this.is_link);
                dest.writeInt(this.refer_key);
                dest.writeInt(this.type_id);
            }

            protected BannerBean(Parcel in) {
                this.banner_id = in.readInt();
                this.banner_title = in.readString();
                this.banner_picture = in.readString();
                this.banner_link = in.readString();
                this.is_link = in.readInt();
                this.refer_key = in.readInt();
                this.type_id = in.readInt();
            }

            public static final Creator<BannerBean> CREATOR = new Creator<BannerBean>() {
                @Override
                public BannerBean createFromParcel(Parcel source) {
                    return new BannerBean(source);
                }

                @Override
                public BannerBean[] newArray(int size) {
                    return new BannerBean[size];
                }
            };
        }

        public static class WidgetListBean implements Parcelable {
            /**
             * widget_id : 32
             * widget_type : 1
             * title : 猜你喜欢
             * title_link : null
             * desc : null
             * widget_data : [{"id":1,"type":"image","content":"http://img.szzhangchu.com/1456222953065_6855615159.png","link":"http://h5.izhangchu.com/Tour.html?app_hideheader=1"},{"id":2,"type":"text","content":"新手入门","link":null},{"id":3,"type":"image","content":"http://img.szzhangchu.com/1456222960944_9047013376.png","link":"app://foodmatch"},{"id":4,"type":"text","content":"食材搭配","link":null},{"id":5,"type":"image","content":"http://img.szzhangchu.com/1456222967767_5511783735.png","link":"app://scenelist"},{"id":6,"type":"text","content":"场景菜谱","link":null},{"id":7,"type":"image","content":"http://img.szzhangchu.com/1482542968387_5178412616.png","link":"http://www.meipai.com/live/6218019488781111297?from=groupmessage&isappinstalled=1"},{"id":8,"type":"text","content":"美食直播","link":null}]
             */

            private int widget_id;
            private int widget_type;
            private String title;
            private String desc;
            private List<WidgetDataBean> widget_data;

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public int getWidget_id() {
                return widget_id;
            }

            public void setWidget_id(int widget_id) {
                this.widget_id = widget_id;
            }

            public int getWidget_type() {
                return widget_type;
            }

            public void setWidget_type(int widget_type) {
                this.widget_type = widget_type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<WidgetDataBean> getWidget_data() {
                return widget_data;
            }

            public void setWidget_data(List<WidgetDataBean> widget_data) {
                this.widget_data = widget_data;
            }

            public static class WidgetDataBean implements Parcelable {
                /**
                 * id : 1
                 * type : image
                 * content : http://img.szzhangchu.com/1456222953065_6855615159.png
                 * link : http://h5.izhangchu.com/Tour.html?app_hideheader=1
                 */

                private int id;
                private String type;
                private String content;
                private String link;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public WidgetDataBean() {
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.id);
                    dest.writeString(this.type);
                    dest.writeString(this.content);
                    dest.writeString(this.link);
                }

                protected WidgetDataBean(Parcel in) {
                    this.id = in.readInt();
                    this.type = in.readString();
                    this.content = in.readString();
                    this.link = in.readString();
                }

                public static final Creator<WidgetDataBean> CREATOR = new Creator<WidgetDataBean>() {
                    @Override
                    public WidgetDataBean createFromParcel(Parcel source) {
                        return new WidgetDataBean(source);
                    }

                    @Override
                    public WidgetDataBean[] newArray(int size) {
                        return new WidgetDataBean[size];
                    }
                };
            }

            public WidgetListBean() {
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.widget_id);
                dest.writeInt(this.widget_type);
                dest.writeString(this.title);
                dest.writeTypedList(this.widget_data);
            }

            protected WidgetListBean(Parcel in) {
                this.widget_id = in.readInt();
                this.widget_type = in.readInt();
                this.title = in.readString();
                this.widget_data = in.createTypedArrayList(WidgetDataBean.CREATOR);
            }

            public static final Creator<WidgetListBean> CREATOR = new Creator<WidgetListBean>() {
                @Override
                public WidgetListBean createFromParcel(Parcel source) {
                    return new WidgetListBean(source);
                }

                @Override
                public WidgetListBean[] newArray(int size) {
                    return new WidgetListBean[size];
                }
            };
        }

        public DataBean() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeTypedList(this.banner);
            dest.writeTypedList(this.widgetList);
        }

        protected DataBean(Parcel in) {
            this.banner = in.createTypedArrayList(BannerBean.CREATOR);
            this.widgetList = in.createTypedArrayList(WidgetListBean.CREATOR);
        }

        public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
            @Override
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            @Override
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
    }

    public Recommend() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.code);
        dest.writeByte(this.msg ? (byte) 1 : (byte) 0);
        dest.writeLong(this.timestamp);
        dest.writeParcelable(this.data, flags);
    }

    protected Recommend(Parcel in) {
        this.code = in.readInt();
        this.msg = in.readByte() != 0;
        this.timestamp = in.readLong();
        this.data = in.readParcelable(DataBean.class.getClassLoader());
    }

    public static final Creator<Recommend> CREATOR = new Creator<Recommend>() {
        @Override
        public Recommend createFromParcel(Parcel source) {
            return new Recommend(source);
        }

        @Override
        public Recommend[] newArray(int size) {
            return new Recommend[size];
        }
    };
}
