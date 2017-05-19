package com.rainbow.kitchen.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by followlove on 2016/12/27:8:34.
 */

public class Ingredients implements Parcelable {

    /**
     * code : 0
     * msg : success
     * version : 4.0
     * timestamp : 1482799145000
     * data : {"id":1,"text":"食材大全","name":"crowd_type_tree","data":[{"id":"39","text":"常见食材","image":"http://pub.szzhangchu.com/web/images/material_type/1changjianshicai.jpg","data":[{"id":"2","text":"菠菜","image":"http://img.szzhangchu.com/20141107110043154.jpg"},{"id":"3","text":"菜心","image":"http://img.szzhangchu.com/20141230150657647.jpg"},{"id":"5","text":"小白菜","image":"http://img.szzhangchu.com/20141107103757137.jpg"},{"id":"6","text":"上海青","image":"http://img.szzhangchu.com/1439782526400_9389049634.jpg"},{"id":"8","text":"生菜","image":"http://img.szzhangchu.com/20141107105347572.jpg"},{"id":"35","text":"西蓝花","image":"http://img.szzhangchu.com/20150518151207847.jpg"},{"id":"37","text":"胡萝卜","image":"http://img.szzhangchu.com/20141107101536959.jpg"},{"id":"41","text":"莲藕","image":"http://img.szzhangchu.com/20150413094130659.jpg"},{"id":"42","text":"芦笋","image":"http://img.szzhangchu.com/2015051815160675.jpg"},{"id":"44","text":"山药","image":"http://img.szzhangchu.com/20141107102023496.jpg"},{"id":"45","text":"土豆","image":"http://img.szzhangchu.com/20141107101800229.jpg"},{"id":"47","text":"洋葱","image":"http://img.szzhangchu.com/20141107095705968.jpg"},{"id":"48","text":"玉米","image":"http://img.szzhangchu.com/20150413100811690.jpg"},{"id":"52","text":"蒜头","image":"http://img.szzhangchu.com/20150413100345395.jpg"},{"id":"53","text":"生姜","image":"http://img.szzhangchu.com/20150518151740428.jpg"},{"id":"55","text":"黄瓜","image":"http://img.szzhangchu.com/20141107104529623.jpg"},{"id":"57","text":"青椒","image":"http://img.szzhangchu.com/20150418103625297.jpg"},{"id":"59","text":"彩椒","image":"http://img.szzhangchu.com/20150418103505845.jpg"},{"id":"62","text":"茄子","image":"http://img.szzhangchu.com/20141107110900207.jpg"},{"id":"63","text":"丝瓜","image":"http://img.szzhangchu.com/20141107110435278.jpg"},{"id":"64","text":"西红柿","image":"http://img.szzhangchu.com/1439718049593_3151099996.jpg"},{"id":"81","text":"豆腐","image":"http://img.szzhangchu.com/20141107103210151.jpg"},{"id":"92","text":"香菇","image":"http://img.szzhangchu.com/20141107164744880.jpg"},{"id":"93","text":"平菇","image":"http://img.szzhangchu.com/20150413101822528.jpg"},{"id":"94","text":"金针菇","image":"http://img.szzhangchu.com/20150413101613115.jpg"},{"id":"100","text":"杏鲍菇","image":"http://img.szzhangchu.com/20141107165643255.jpg"},{"id":"103","text":"猪肉","image":"http://img.szzhangchu.com/20141107102317371.jpg"},{"id":"119","text":"牛肉","image":"http://img.szzhangchu.com/20141107102627560.jpg"},{"id":"132","text":"鸭肉","image":"http://img.szzhangchu.com/20141107102815921.jpg"},{"id":"138","text":"鸡蛋","image":"http://img.szzhangchu.com/2014110710253590.jpg"},{"id":"145","text":"草鱼","image":"http://img.szzhangchu.com/2014110709091341.jpg"},{"id":"212","text":"花生","image":"http://img.szzhangchu.com/20150413111004526.jpg"},{"id":"221","text":"粉丝","image":"http://img.szzhangchu.com/20150418135656191.jpg"},{"id":"240","text":"面粉","image":"http://img.szzhangchu.com/20150418165721363.jpg"},{"id":"246","text":"大米","image":"http://img.szzhangchu.com/20141107095925575.jpg"},{"id":"251","text":"牛奶","image":"http://img.szzhangchu.com/20150530161229599.jpg"},{"id":"265","text":"面条","image":"http://img.szzhangchu.com/20150418170004365.jpg"},{"id":"485","text":"鲫鱼","image":"http://img.szzhangchu.com/1440139100663_7811167460.jpg"},{"id":"488","text":"鸡肉","image":"http://img.szzhangchu.com/1439643177463_8570501229.jpg"}]},{"id":"40","text":"当季食材","image":"http://pub.szzhangchu.com/web/images/material_type/5dangjishicai.jpg","data":[{"id":"36","text":"白萝卜","image":"http://img.szzhangchu.com/20141107102837569.jpg"},{"id":"38","text":"红薯","image":"http://img.szzhangchu.com/20150413111319332.jpg"},{"id":"40","text":"茭白","image":"http://img.szzhangchu.com/2015051815103094.jpg"},{"id":"44","text":"山药","image":"http://img.szzhangchu.com/20141107102023496.jpg"},{"id":"48","text":"玉米","image":"http://img.szzhangchu.com/20150413100811690.jpg"},{"id":"60","text":"南瓜","image":"http://img.szzhangchu.com/20141107100251102.jpg"},{"id":"62","text":"茄子","image":"http://img.szzhangchu.com/20141107110900207.jpg"},{"id":"100","text":"杏鲍菇","image":"http://img.szzhangchu.com/20141107165643255.jpg"},{"id":"132","text":"鸭肉","image":"http://img.szzhangchu.com/20141107102815921.jpg"},{"id":"168","text":"螃蟹","image":"http://img.szzhangchu.com/20141107095450295.jpg"},{"id":"184","text":"橘子","image":"http://img.szzhangchu.com/20150418110150216.jpg"},{"id":"186","text":"梨","image":"http://img.szzhangchu.com/20150413105411627.jpg"},{"id":"192","text":"柚子","image":"http://img.szzhangchu.com/20150413110419282.jpg"},{"id":"198","text":"哈密瓜","image":"http://img.szzhangchu.com/20150413105803124.jpg"},{"id":"204","text":"板栗","image":"http://img.szzhangchu.com/20150518163238610.jpg"},{"id":"206","text":"红枣","image":"http://img.szzhangchu.com/20140904090345337.jpg"},{"id":"212","text":"花生","image":"http://img.szzhangchu.com/20150413111004526.jpg"},{"id":"269","text":"小米","image":"http://img.szzhangchu.com/1439880727576_5506580167.jpg"},{"id":"302","text":"秋葵","image":"http://img.szzhangchu.com/1439717315096_5268122823.jpg"},{"id":"488","text":"鸡肉","image":"http://img.szzhangchu.com/1439643177463_8570501229.jpg"}]},{"id":"21","text":"蔬菜-茎叶类","image":"http://pub.szzhangchu.com/web/images/material_type/14shucaijinyelei.jpg","data":[{"id":"2","text":"菠菜","image":"http://img.szzhangchu.com/20141107110043154.jpg"},{"id":"3","text":"菜心","image":"http://img.szzhangchu.com/20141230150657647.jpg"},{"id":"4","text":"奶白菜","image":"http://img.szzhangchu.com/20150418102923296.jpg"},{"id":"5","text":"小白菜","image":"http://img.szzhangchu.com/20141107103757137.jpg"},{"id":"6","text":"上海青","image":"http://img.szzhangchu.com/1439782526400_9389049634.jpg"},{"id":"7","text":"油麦菜","image":"http://img.szzhangchu.com/20141230151007701.jpg"},{"id":"8","text":"生菜","image":"http://img.szzhangchu.com/20141107105347572.jpg"},{"id":"11","text":"芥菜","image":"http://img.szzhangchu.com/1445499190435_2475364438.jpg"},{"id":"13","text":"韭菜","image":"http://img.szzhangchu.com/20141107104503423.jpg"},{"id":"14","text":"韭菜花","image":"http://img.szzhangchu.com/20150418105918902.jpg"},{"id":"23","text":"茼蒿","image":"http://img.szzhangchu.com/20150418105652208.jpg"},{"id":"26","text":"苋菜","image":"http://img.szzhangchu.com/20150413095610573.jpg"},{"id":"28","text":"香椿","image":"http://img.szzhangchu.com/20150518151308182.jpg"},{"id":"29","text":"雪里蕻","image":"http://img.szzhangchu.com/20150530153237844.jpg"},{"id":"30","text":"紫甘蓝","image":"http://img.szzhangchu.com/20150530153051256.jpg"},{"id":"31","text":"紫苏","image":"http://img.szzhangchu.com/20150418110024798.jpg"},{"id":"33","text":"黄花菜","image":"http://img.szzhangchu.com/20150420090832416.jpg"},{"id":"34","text":"花菜","image":"http://img.szzhangchu.com/20150418105815428.jpg"},{"id":"35","text":"西蓝花","image":"http://img.szzhangchu.com/20150518151207847.jpg"},{"id":"40","text":"茭白","image":"http://img.szzhangchu.com/2015051815103094.jpg"},{"id":"42","text":"芦笋","image":"http://img.szzhangchu.com/2015051815160675.jpg"},{"id":"46","text":"莴笋","image":"http://img.szzhangchu.com/20150420090314332.jpg"},{"id":"232","text":"鱼腥草","image":"http://img.szzhangchu.com/20150420090931138.jpg"},{"id":"233","text":"蕨菜","image":"http://img.szzhangchu.com/2015041309584913.jpg"},{"id":"241","text":"藠头","image":"http://img.szzhangchu.com/20150530152349256.jpg"},{"id":"280","text":"枸杞叶","image":"http://img.szzhangchu.com/20150420091028380.jpg"},{"id":"303","text":"苤蓝","image":"http://img.szzhangchu.com/20150420090145530.jpg"},{"id":"385","text":"薄荷叶","image":"http://img.szzhangchu.com/20150530144434821.jpg"},{"id":"411","text":"苦菊","image":"http://img.szzhangchu.com/20150530152612562.jpg"},{"id":"453","text":"芦荟","image":"http://img.szzhangchu.com/20150420085846600.jpg"},{"id":"455","text":"萝卜缨","image":"http://img.szzhangchu.com/20150530152756530.jpg"},{"id":"486","text":"白菜","image":"http://img.szzhangchu.com/1439642455400_6714813740.jpg"}]},{"id":"23","text":"蔬菜-块根类","image":"http://pub.szzhangchu.com/web/images/material_type/15shucaikuaigenlei.jpg","data":[{"id":"36","text":"白萝卜","image":"http://img.szzhangchu.com/20141107102837569.jpg"},{"id":"37","text":"胡萝卜","image":"http://img.szzhangchu.com/20141107101536959.jpg"},{"id":"38","text":"红薯","image":"http://img.szzhangchu.com/20150413111319332.jpg"},{"id":"39","text":"紫薯","image":"http://img.szzhangchu.com/20150418103327279.jpg"},{"id":"41","text":"莲藕","image":"http://img.szzhangchu.com/20150413094130659.jpg"},{"id":"43","text":"马蹄","image":"http://img.szzhangchu.com/2015042010084044.jpg"},{"id":"44","text":"山药","image":"http://img.szzhangchu.com/20141107102023496.jpg"},{"id":"45","text":"土豆","image":"http://img.szzhangchu.com/20141107101800229.jpg"},{"id":"47","text":"洋葱","image":"http://img.szzhangchu.com/20141107095705968.jpg"},{"id":"50","text":"芋头","image":"http://img.szzhangchu.com/20141107101003538.jpg"},{"id":"51","text":"竹笋","image":"http://img.szzhangchu.com/20150413100152196.jpg"},{"id":"52","text":"蒜头","image":"http://img.szzhangchu.com/20150413100345395.jpg"},{"id":"53","text":"生姜","image":"http://img.szzhangchu.com/20150518151740428.jpg"},{"id":"227","text":"凉薯","image":"http://img.szzhangchu.com/20150413100530251.jpg"},{"id":"229","text":"鲜百合","image":"http://img.szzhangchu.com/20150518152002591.jpg"},{"id":"267","text":"心里美萝卜","image":"http://img.szzhangchu.com/20150518152143503.jpg"},{"id":"273","text":"牛蒡","image":"http://img.szzhangchu.com/20150518151854270.jpg"},{"id":"484","text":"黑蒜","image":"http://img.szzhangchu.com/1439726615097_4478613585.jpg"},{"id":"491","text":"魔芋","image":"http://img.szzhangchu.com/1439556670803_8630239118.JPG"}]},{"id":"24","text":"蔬菜-瓜果类","image":"http://pub.szzhangchu.com/web/images/material_type/13shucaiguaguolei.jpg","data":[{"id":"48","text":"玉米","image":"http://img.szzhangchu.com/20150413100811690.jpg"},{"id":"54","text":"冬瓜","image":"http://img.szzhangchu.com/20141107105916743.jpg"},{"id":"55","text":"黄瓜","image":"http://img.szzhangchu.com/20141107104529623.jpg"},{"id":"56","text":"苦瓜","image":"http://img.szzhangchu.com/20141107105055921.jpg"},{"id":"57","text":"青椒","image":"http://img.szzhangchu.com/20150418103625297.jpg"},{"id":"59","text":"彩椒","image":"http://img.szzhangchu.com/20150418103505845.jpg"},{"id":"60","text":"南瓜","image":"http://img.szzhangchu.com/20141107100251102.jpg"},{"id":"62","text":"茄子","image":"http://img.szzhangchu.com/20141107110900207.jpg"},{"id":"63","text":"丝瓜","image":"http://img.szzhangchu.com/20141107110435278.jpg"},{"id":"64","text":"西红柿","image":"http://img.szzhangchu.com/1439718049593_3151099996.jpg"},{"id":"65","text":"西葫芦","image":"http://img.szzhangchu.com/20150518152500692.jpg"},{"id":"66","text":"佛手瓜","image":"http://img.szzhangchu.com/20150530155427544.jpg"},{"id":"248","text":"葫芦瓜","image":"http://img.szzhangchu.com/20150413100919790.jpg"},{"id":"255","text":"节瓜","image":"http://img.szzhangchu.com/20150530153841214.jpg"},{"id":"302","text":"秋葵","image":"http://img.szzhangchu.com/1439717315096_5268122823.jpg"}]},{"id":"25","text":"蔬菜-豆类","image":"http://pub.szzhangchu.com/web/images/material_type/12shucaidoulei.jpg","data":[{"id":"67","text":"豆角","image":"http://img.szzhangchu.com/20150413101145145.jpg"},{"id":"68","text":"四季豆","image":"http://img.szzhangchu.com/20150413101259236.jpg"},{"id":"70","text":"豌豆","image":"http://img.szzhangchu.com/20141107101221529.jpg"},{"id":"76","text":"蚕豆","image":"http://img.szzhangchu.com/20150413101037558.jpg"},{"id":"81","text":"豆腐","image":"http://img.szzhangchu.com/20141107103210151.jpg"}]},{"id":"26","text":"菌菇类","image":"http://pub.szzhangchu.com/web/images/material_type/8jungulei.jpg","data":[{"id":"89","text":"黑木耳","image":"http://img.szzhangchu.com/20141107165143482.jpg"},{"id":"90","text":"银耳","image":"http://img.szzhangchu.com/20141107101138139.jpg"},{"id":"91","text":"竹荪","image":"http://img.szzhangchu.com/20150413102154874.jpg"},{"id":"92","text":"香菇","image":"http://img.szzhangchu.com/20141107164744880.jpg"},{"id":"93","text":"平菇","image":"http://img.szzhangchu.com/20150413101822528.jpg"},{"id":"94","text":"金针菇","image":"http://img.szzhangchu.com/20150413101613115.jpg"},{"id":"95","text":"滑子菇","image":"http://img.szzhangchu.com/20150413101513961.jpg"},{"id":"96","text":"口蘑","image":"http://img.szzhangchu.com/20150518153003605.jpg"},{"id":"97","text":"草菇","image":"http://img.szzhangchu.com/1439810532718_2385779439.jpg"},{"id":"98","text":"茶树菇","image":"http://img.szzhangchu.com/20141107170057395.jpg"},{"id":"99","text":"鸡腿菇","image":"http://img.szzhangchu.com/20150413101716446.jpg"},{"id":"100","text":"杏鲍菇","image":"http://img.szzhangchu.com/20141107165643255.jpg"},{"id":"307","text":"猴头菇","image":"http://img.szzhangchu.com/20150413101418171.jpg"},{"id":"358","text":"白灵菇","image":"http://img.szzhangchu.com/20150418103754674.jpg"},{"id":"592","text":"黄蘑","image":"http://img.szzhangchu.com/1439726461728_1874844191.jpg"},{"id":"594","text":"元蘑","image":"http://img.szzhangchu.com/1439709900068_8138641992.jpg"},{"id":"595","text":"榛蘑","image":"http://img.szzhangchu.com/1439715111415_3169538189.jpg"}]},{"id":"27","text":"畜肉类","image":"http://pub.szzhangchu.com/web/images/material_type/3churoulei.jpg","data":[{"id":"103","text":"猪肉","image":"http://img.szzhangchu.com/20141107102317371.jpg"},{"id":"104","text":"腊肉","image":"http://img.szzhangchu.com/20141229145611252.jpg"},{"id":"105","text":"火腿","image":"http://img.szzhangchu.com/20150413102702977.jpg"},{"id":"106","text":"猪肝","image":"http://img.szzhangchu.com/20150413102824670.jpg"},{"id":"108","text":"猪蹄","image":"http://img.szzhangchu.com/1439959651849_8806664786.jpg"},{"id":"109","text":"猪尾","image":"http://img.szzhangchu.com/20150530164447745.jpg"},{"id":"110","text":"猪腰","image":"http://img.szzhangchu.com/20150518154013924.jpg"},{"id":"111","text":"猪耳","image":"http://img.szzhangchu.com/20150413102322968.jpg"},{"id":"112","text":"猪血","image":"http://img.szzhangchu.com/20150518153923253.jpg"},{"id":"113","text":"猪肠","image":"http://img.szzhangchu.com/20150413102521428.jpg"},{"id":"114","text":"腊肠","image":"http://img.szzhangchu.com/20150418103934869.jpg"},{"id":"115","text":"猪肚","image":"http://img.szzhangchu.com/20141107102920513.jpg"},{"id":"116","text":"猪心","image":"http://img.szzhangchu.com/20150518153834357.jpg"},{"id":"117","text":"猪肺","image":"http://img.szzhangchu.com/2015051815355503.jpg"},{"id":"119","text":"牛肉","image":"http://img.szzhangchu.com/20141107102627560.jpg"},{"id":"120","text":"牛肚","image":"http://img.szzhangchu.com/20150518153219856.jpg"},{"id":"121","text":"牛排","image":"http://img.szzhangchu.com/20141107162053461.jpg"},{"id":"123","text":"羊肉","image":"http://img.szzhangchu.com/20141107103156474.jpg"},{"id":"124","text":"羊排","image":"http://img.szzhangchu.com/20150413102759805.jpg"},{"id":"125","text":"狗肉","image":"http://img.szzhangchu.com/20150518155217760.jpg"},{"id":"292","text":"培根","image":"http://img.szzhangchu.com/20150418104102952.jpg"},{"id":"435","text":"牛心","image":"http://img.szzhangchu.com/20150530164617219.jpg"},{"id":"436","text":"牛尾","image":"http://img.szzhangchu.com/20150413103127184.jpg"},{"id":"437","text":"猪脾","image":"http://img.szzhangchu.com/20150418104305638.jpg"},{"id":"466","text":"牛骨","image":"http://img.szzhangchu.com/20150530155842182.jpg"},{"id":"487","text":"牛腩","image":"http://img.szzhangchu.com/1439716963767_8571690621.jpg"},{"id":"490","text":"排骨","image":"http://img.szzhangchu.com/1439612428445_4939115310.jpg"},{"id":"492","text":"五花肉","image":"http://img.szzhangchu.com/1439708986860_7224216276.jpg"},{"id":"509","text":"猪皮","image":"http://img.szzhangchu.com/1439717130625_5206228802.jpg"},{"id":"519","text":"羊肚","image":"http://img.szzhangchu.com/1439717879881_3896683883.jpg"}]},{"id":"28","text":"禽肉类","image":"http://pub.szzhangchu.com/web/images/material_type/11qinroulei.jpg","data":[{"id":"127","text":"鸡爪","image":"http://img.szzhangchu.com/20150413103730593.jpg"},{"id":"128","text":"鸡翅","image":"http://img.szzhangchu.com/20150413103537506.jpg"},{"id":"129","text":"鸡腿","image":"http://img.szzhangchu.com/20150413103639429.jpg"},{"id":"130","text":"鸡杂","image":"http://img.szzhangchu.com/20150413103836263.jpg"},{"id":"131","text":"乌鸡","image":"http://img.szzhangchu.com/20150413103325275.jpg"},{"id":"132","text":"鸭肉","image":"http://img.szzhangchu.com/20141107102815921.jpg"},{"id":"133","text":"鸭掌","image":"http://img.szzhangchu.com/20150413103231761.jpg"},{"id":"136","text":"鸽肉","image":"http://img.szzhangchu.com/20150518160341756.jpg"},{"id":"137","text":"鹌鹑","image":"http://img.szzhangchu.com/20150518161424202.jpg"},{"id":"470","text":"鸭血","image":"http://img.szzhangchu.com/20150518161051934.jpg"},{"id":"488","text":"鸡肉","image":"http://img.szzhangchu.com/1439643177463_8570501229.jpg"},{"id":"489","text":"鹅肉","image":"http://img.szzhangchu.com/1439726085063_2373353066.jpg"},{"id":"644","text":"鹅肝","image":"http://img.szzhangchu.com/2015053017210066.jpg"},{"id":"650","text":"鸭胗","image":"http://img.szzhangchu.com/1439643659774_5925134675.jpg"}]},{"id":"29","text":"蛋类","image":"http://pub.szzhangchu.com/web/images/material_type/4danlei.jpg","data":[{"id":"138","text":"鸡蛋","image":"http://img.szzhangchu.com/2014110710253590.jpg"},{"id":"139","text":"鸭蛋","image":"http://img.szzhangchu.com/20141107103101387.jpg"},{"id":"142","text":"鹌鹑蛋","image":"http://img.szzhangchu.com/20141107102448595.jpg"},{"id":"226","text":"咸蛋","image":"http://img.szzhangchu.com/20150413103959604.jpg"}]},{"id":"30","text":"水产类","image":"http://pub.szzhangchu.com/web/images/material_type/16shuichanlei.jpg","data":[{"id":"143","text":"鲤鱼","image":"http://img.szzhangchu.com/1440139026476_2416522890.jpg"},{"id":"145","text":"草鱼","image":"http://img.szzhangchu.com/2014110709091341.jpg"},{"id":"154","text":"鳕鱼","image":"http://img.szzhangchu.com/20150413105104547.jpg"},{"id":"156","text":"甲鱼","image":"http://img.szzhangchu.com/1440138999334_2376640320.jpg"},{"id":"163","text":"秋刀鱼","image":"http://img.szzhangchu.com/20150413104334118.jpg"},{"id":"165","text":"泥鳅","image":"http://img.szzhangchu.com/20150413104533175.jpg"},{"id":"166","text":"牛蛙","image":"http://img.szzhangchu.com/2014110709405275.jpg"},{"id":"168","text":"螃蟹","image":"http://img.szzhangchu.com/20141107095450295.jpg"},{"id":"173","text":"扇贝","image":"http://img.szzhangchu.com/20150413104705821.jpg"},{"id":"176","text":"海参","image":"http://img.szzhangchu.com/20141107090121514.jpg"},{"id":"177","text":"鲍鱼","image":"http://img.szzhangchu.com/20141107092804710.jpg"},{"id":"178","text":"海带","image":"http://img.szzhangchu.com/20141107100420285.jpg"},{"id":"180","text":"紫菜","image":"http://img.szzhangchu.com/20141107100658143.jpg"},{"id":"290","text":"黄脚立鱼","image":"http://img.szzhangchu.com/20150530160601859.jpg"},{"id":"415","text":"海藻","image":"http://img.szzhangchu.com/1439716626513_7186011056.jpg"},{"id":"423","text":"鱼丸","image":"http://img.szzhangchu.com/20150418104459894.jpg"},{"id":"447","text":"九肚鱼","image":"http://img.szzhangchu.com/20150530160414218.jpg"},{"id":"448","text":"金枪鱼","image":"http://img.szzhangchu.com/20141107204334451.jpg"},{"id":"479","text":"虾仁","image":"http://img.szzhangchu.com/1439643619835_2842941638.jpg"},{"id":"480","text":"小龙虾","image":"http://img.szzhangchu.com/1439713719675_3776918513.jpg"},{"id":"483","text":"河虾","image":"http://img.szzhangchu.com/1439715262634_1797907547.jpg"},{"id":"485","text":"鲫鱼","image":"http://img.szzhangchu.com/1440139100663_7811167460.jpg"},{"id":"493","text":"基围虾","image":"http://img.szzhangchu.com/1439712380070_9942188343.jpg"}]},{"id":"31","text":"水果类","image":"http://pub.szzhangchu.com/web/images/material_type/17shuiguolei.jpg","data":[{"id":"181","text":"苹果","image":"http://img.szzhangchu.com/20141107104400193.jpg"},{"id":"182","text":"香蕉","image":"http://img.szzhangchu.com/20150413105712913.jpg"},{"id":"183","text":"木瓜","image":"http://img.szzhangchu.com/20141107104454648.jpg"},{"id":"184","text":"橘子","image":"http://img.szzhangchu.com/20150418110150216.jpg"},{"id":"185","text":"火龙果","image":"http://img.szzhangchu.com/20150413110116696.jpg"},{"id":"186","text":"梨","image":"http://img.szzhangchu.com/20150413105411627.jpg"},{"id":"188","text":"菠萝","image":"http://img.szzhangchu.com/20150413105308769.jpg"},{"id":"189","text":"柠檬","image":"http://img.szzhangchu.com/2015041311022581.jpg"},{"id":"190","text":"西瓜","image":"http://img.szzhangchu.com/20141107104311571.jpg"},{"id":"191","text":"橙子","image":"http://img.szzhangchu.com/20150413110622767.jpg"},{"id":"192","text":"柚子","image":"http://img.szzhangchu.com/20150413110419282.jpg"},{"id":"193","text":"椰子","image":"http://img.szzhangchu.com/20150413110313444.jpg"},{"id":"194","text":"草莓","image":"http://img.szzhangchu.com/20150413105516387.jpg"},{"id":"195","text":"樱桃","image":"http://img.szzhangchu.com/20150413105907726.jpg"},{"id":"197","text":"桃子","image":"http://img.szzhangchu.com/20141107104227470.jpg"},{"id":"198","text":"哈密瓜","image":"http://img.szzhangchu.com/20150413105803124.jpg"},{"id":"199","text":"榴莲","image":"http://img.szzhangchu.com/20150413110514740.jpg"},{"id":"200","text":"荔枝","image":"http://img.szzhangchu.com/20150413111511539.jpg"},{"id":"343","text":"葡萄","image":"http://img.szzhangchu.com/1440491724362_1726819755.jpg"},{"id":"640","text":"覆盆子","image":"http://img.szzhangchu.com/1439718063667_5200416267.jpg"}]},{"id":"32","text":"干果类","image":"http://pub.szzhangchu.com/web/images/material_type/6ganguolei.jpg","data":[{"id":"204","text":"板栗","image":"http://img.szzhangchu.com/20150518163238610.jpg"},{"id":"206","text":"红枣","image":"http://img.szzhangchu.com/20140904090345337.jpg"},{"id":"208","text":"松仁","image":"http://img.szzhangchu.com/20150413110859547.jpg"},{"id":"212","text":"花生","image":"http://img.szzhangchu.com/20150413111004526.jpg"},{"id":"213","text":"核桃","image":"http://img.szzhangchu.com/20150518163942489.jpg"},{"id":"214","text":"芝麻","image":"http://img.szzhangchu.com/20150418105151563.jpg"},{"id":"332","text":"榛子","image":"http://img.szzhangchu.com/2015051816333139.jpg"},{"id":"340","text":"葡萄干","image":"http://img.szzhangchu.com/20150418105026900.jpg"},{"id":"482","text":"开心果","image":"http://img.szzhangchu.com/1439714001016_8267569874.jpg"}]},{"id":"33","text":"其他","image":"http://pub.szzhangchu.com/web/images/material_type/10qita.jpg","data":[{"id":"234","text":"西米","image":"http://img.szzhangchu.com/20150530161111845.jpg"},{"id":"251","text":"牛奶","image":"http://img.szzhangchu.com/20150530161229599.jpg"},{"id":"311","text":"蜂蜜","image":"http://img.szzhangchu.com/20150116162344816.jpg"},{"id":"389","text":"红酒","image":"http://img.szzhangchu.com/20150530161545629.jpg"},{"id":"396","text":"咖啡豆","image":"http://img.szzhangchu.com/20150530161411669.jpg"},{"id":"593","text":"食用油","image":"http://img.szzhangchu.com/1439720057916_9074636489.jpg"},{"id":"627","text":"雪蛤油","image":"http://img.szzhangchu.com/1439719891261_8735299911.jpg"}]},{"id":"34","text":"常见中药材","image":"http://pub.szzhangchu.com/web/images/material_type/2changjianzhongyaocai.jpg","data":[{"id":"205","text":"枸杞","image":"http://img.szzhangchu.com/20150418190147278.jpg"},{"id":"223","text":"燕窝","image":"http://img.szzhangchu.com/20141110102153296.jpg"},{"id":"275","text":"党参","image":"http://img.szzhangchu.com/20150604100700352.jpg"},{"id":"286","text":"西洋参","image":"http://img.szzhangchu.com/20141107210849928.jpg"},{"id":"289","text":"黄芪","image":"http://img.szzhangchu.com/20150418190052247.jpg"},{"id":"313","text":"人参","image":"http://img.szzhangchu.com/20141110102410239.jpg"},{"id":"354","text":"鹿茸","image":"http://img.szzhangchu.com/2015041818583334.jpg"},{"id":"405","text":"冬虫夏草","image":"http://img.szzhangchu.com/20141107211019730.jpg"}]},{"id":"35","text":"烘焙类","image":"http://pub.szzhangchu.com/web/images/material_type/7hongpei.jpg","data":[{"id":"372","text":"奶油","image":"http://img.szzhangchu.com/20150530163015463.jpg"},{"id":"373","text":"巧克力","image":"http://img.szzhangchu.com/20150530163509965.jpg"},{"id":"376","text":"抹茶粉","image":"http://img.szzhangchu.com/20150530174835834.jpg"},{"id":"378","text":"奶酪","image":"http://img.szzhangchu.com/20150530162907434.jpg"},{"id":"379","text":"绿茶粉","image":"http://img.szzhangchu.com/20150530174614347.jpg"},{"id":"380","text":"草莓酱","image":"http://img.szzhangchu.com/20150530162010183.jpg"},{"id":"382","text":"芒果酱","image":"http://img.szzhangchu.com/20150530174716281.jpg"},{"id":"384","text":"白兰地","image":"http://img.szzhangchu.com/20150530161847177.jpg"},{"id":"400","text":"果冻粉","image":"http://img.szzhangchu.com/20150530162409715.jpg"},{"id":"402","text":"吉利丁","image":"http://img.szzhangchu.com/20150530162647797.jpg"},{"id":"642","text":"起酥油","image":"http://img.szzhangchu.com/1442981008009_2272293879.jpg"}]},{"id":"36","text":"粮豆米面类","image":"http://pub.szzhangchu.com/web/images/material_type/9liangdoumimian.jpg","data":[{"id":"72","text":"扁豆","image":"http://img.szzhangchu.com/20150518164107883.jpg"},{"id":"74","text":"黄豆","image":"http://img.szzhangchu.com/20141107103349640.jpg"},{"id":"75","text":"绿豆","image":"http://img.szzhangchu.com/20141107103853939.jpg"},{"id":"78","text":"红豆","image":"http://img.szzhangchu.com/2014110710293271.jpg"},{"id":"79","text":"黑豆","image":"http://img.szzhangchu.com/20141107102542884.jpg"},{"id":"221","text":"粉丝","image":"http://img.szzhangchu.com/20150418135656191.jpg"},{"id":"222","text":"年糕","image":"http://img.szzhangchu.com/2015041816584821.jpg"},{"id":"224","text":"薏米","image":"http://img.szzhangchu.com/20141107110445671.jpg"},{"id":"228","text":"汤圆","image":"http://img.szzhangchu.com/20150418135821812.jpg"},{"id":"236","text":"黑米","image":"http://img.szzhangchu.com/20150413111117885.jpg"},{"id":"240","text":"面粉","image":"http://img.szzhangchu.com/20150418165721363.jpg"},{"id":"242","text":"糙米","image":"http://img.szzhangchu.com/20141229150006840.jpg"},{"id":"246","text":"大米","image":"http://img.szzhangchu.com/20141107095925575.jpg"},{"id":"250","text":"红米","image":"http://img.szzhangchu.com/20150413111210125.jpg"},{"id":"265","text":"面条","image":"http://img.szzhangchu.com/20150418170004365.jpg"},{"id":"269","text":"小米","image":"http://img.szzhangchu.com/1439880727576_5506580167.jpg"},{"id":"306","text":"玉米粉","image":"http://img.szzhangchu.com/20150418105353173.jpg"},{"id":"309","text":"燕麦","image":"http://img.szzhangchu.com/20141107105452802.jpg"},{"id":"431","text":"黄米","image":"http://img.szzhangchu.com/20150418105538935.jpg"},{"id":"481","text":"白扁豆","image":"http://img.szzhangchu.com/1439716992720_1853871570.jpg"},{"id":"538","text":"大麦","image":"http://img.szzhangchu.com/1439713379371_6862288650.jpg"}]}]}
     */

    private String code;
    private String msg;
    private String version;
    private long timestamp;
    private DataBeanXX data;

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

    public DataBeanXX getData() {
        return data;
    }

    public void setData(DataBeanXX data) {
        this.data = data;
    }

    public static class DataBeanXX implements Parcelable {
        /**
         * id : 1
         * text : 食材大全
         * name : crowd_type_tree
         * data : [{"id":"39","text":"常见食材","image":"http://pub.szzhangchu.com/web/images/material_type/1changjianshicai.jpg","data":[{"id":"2","text":"菠菜","image":"http://img.szzhangchu.com/20141107110043154.jpg"},{"id":"3","text":"菜心","image":"http://img.szzhangchu.com/20141230150657647.jpg"},{"id":"5","text":"小白菜","image":"http://img.szzhangchu.com/20141107103757137.jpg"},{"id":"6","text":"上海青","image":"http://img.szzhangchu.com/1439782526400_9389049634.jpg"},{"id":"8","text":"生菜","image":"http://img.szzhangchu.com/20141107105347572.jpg"},{"id":"35","text":"西蓝花","image":"http://img.szzhangchu.com/20150518151207847.jpg"},{"id":"37","text":"胡萝卜","image":"http://img.szzhangchu.com/20141107101536959.jpg"},{"id":"41","text":"莲藕","image":"http://img.szzhangchu.com/20150413094130659.jpg"},{"id":"42","text":"芦笋","image":"http://img.szzhangchu.com/2015051815160675.jpg"},{"id":"44","text":"山药","image":"http://img.szzhangchu.com/20141107102023496.jpg"},{"id":"45","text":"土豆","image":"http://img.szzhangchu.com/20141107101800229.jpg"},{"id":"47","text":"洋葱","image":"http://img.szzhangchu.com/20141107095705968.jpg"},{"id":"48","text":"玉米","image":"http://img.szzhangchu.com/20150413100811690.jpg"},{"id":"52","text":"蒜头","image":"http://img.szzhangchu.com/20150413100345395.jpg"},{"id":"53","text":"生姜","image":"http://img.szzhangchu.com/20150518151740428.jpg"},{"id":"55","text":"黄瓜","image":"http://img.szzhangchu.com/20141107104529623.jpg"},{"id":"57","text":"青椒","image":"http://img.szzhangchu.com/20150418103625297.jpg"},{"id":"59","text":"彩椒","image":"http://img.szzhangchu.com/20150418103505845.jpg"},{"id":"62","text":"茄子","image":"http://img.szzhangchu.com/20141107110900207.jpg"},{"id":"63","text":"丝瓜","image":"http://img.szzhangchu.com/20141107110435278.jpg"},{"id":"64","text":"西红柿","image":"http://img.szzhangchu.com/1439718049593_3151099996.jpg"},{"id":"81","text":"豆腐","image":"http://img.szzhangchu.com/20141107103210151.jpg"},{"id":"92","text":"香菇","image":"http://img.szzhangchu.com/20141107164744880.jpg"},{"id":"93","text":"平菇","image":"http://img.szzhangchu.com/20150413101822528.jpg"},{"id":"94","text":"金针菇","image":"http://img.szzhangchu.com/20150413101613115.jpg"},{"id":"100","text":"杏鲍菇","image":"http://img.szzhangchu.com/20141107165643255.jpg"},{"id":"103","text":"猪肉","image":"http://img.szzhangchu.com/20141107102317371.jpg"},{"id":"119","text":"牛肉","image":"http://img.szzhangchu.com/20141107102627560.jpg"},{"id":"132","text":"鸭肉","image":"http://img.szzhangchu.com/20141107102815921.jpg"},{"id":"138","text":"鸡蛋","image":"http://img.szzhangchu.com/2014110710253590.jpg"},{"id":"145","text":"草鱼","image":"http://img.szzhangchu.com/2014110709091341.jpg"},{"id":"212","text":"花生","image":"http://img.szzhangchu.com/20150413111004526.jpg"},{"id":"221","text":"粉丝","image":"http://img.szzhangchu.com/20150418135656191.jpg"},{"id":"240","text":"面粉","image":"http://img.szzhangchu.com/20150418165721363.jpg"},{"id":"246","text":"大米","image":"http://img.szzhangchu.com/20141107095925575.jpg"},{"id":"251","text":"牛奶","image":"http://img.szzhangchu.com/20150530161229599.jpg"},{"id":"265","text":"面条","image":"http://img.szzhangchu.com/20150418170004365.jpg"},{"id":"485","text":"鲫鱼","image":"http://img.szzhangchu.com/1440139100663_7811167460.jpg"},{"id":"488","text":"鸡肉","image":"http://img.szzhangchu.com/1439643177463_8570501229.jpg"}]},{"id":"40","text":"当季食材","image":"http://pub.szzhangchu.com/web/images/material_type/5dangjishicai.jpg","data":[{"id":"36","text":"白萝卜","image":"http://img.szzhangchu.com/20141107102837569.jpg"},{"id":"38","text":"红薯","image":"http://img.szzhangchu.com/20150413111319332.jpg"},{"id":"40","text":"茭白","image":"http://img.szzhangchu.com/2015051815103094.jpg"},{"id":"44","text":"山药","image":"http://img.szzhangchu.com/20141107102023496.jpg"},{"id":"48","text":"玉米","image":"http://img.szzhangchu.com/20150413100811690.jpg"},{"id":"60","text":"南瓜","image":"http://img.szzhangchu.com/20141107100251102.jpg"},{"id":"62","text":"茄子","image":"http://img.szzhangchu.com/20141107110900207.jpg"},{"id":"100","text":"杏鲍菇","image":"http://img.szzhangchu.com/20141107165643255.jpg"},{"id":"132","text":"鸭肉","image":"http://img.szzhangchu.com/20141107102815921.jpg"},{"id":"168","text":"螃蟹","image":"http://img.szzhangchu.com/20141107095450295.jpg"},{"id":"184","text":"橘子","image":"http://img.szzhangchu.com/20150418110150216.jpg"},{"id":"186","text":"梨","image":"http://img.szzhangchu.com/20150413105411627.jpg"},{"id":"192","text":"柚子","image":"http://img.szzhangchu.com/20150413110419282.jpg"},{"id":"198","text":"哈密瓜","image":"http://img.szzhangchu.com/20150413105803124.jpg"},{"id":"204","text":"板栗","image":"http://img.szzhangchu.com/20150518163238610.jpg"},{"id":"206","text":"红枣","image":"http://img.szzhangchu.com/20140904090345337.jpg"},{"id":"212","text":"花生","image":"http://img.szzhangchu.com/20150413111004526.jpg"},{"id":"269","text":"小米","image":"http://img.szzhangchu.com/1439880727576_5506580167.jpg"},{"id":"302","text":"秋葵","image":"http://img.szzhangchu.com/1439717315096_5268122823.jpg"},{"id":"488","text":"鸡肉","image":"http://img.szzhangchu.com/1439643177463_8570501229.jpg"}]},{"id":"21","text":"蔬菜-茎叶类","image":"http://pub.szzhangchu.com/web/images/material_type/14shucaijinyelei.jpg","data":[{"id":"2","text":"菠菜","image":"http://img.szzhangchu.com/20141107110043154.jpg"},{"id":"3","text":"菜心","image":"http://img.szzhangchu.com/20141230150657647.jpg"},{"id":"4","text":"奶白菜","image":"http://img.szzhangchu.com/20150418102923296.jpg"},{"id":"5","text":"小白菜","image":"http://img.szzhangchu.com/20141107103757137.jpg"},{"id":"6","text":"上海青","image":"http://img.szzhangchu.com/1439782526400_9389049634.jpg"},{"id":"7","text":"油麦菜","image":"http://img.szzhangchu.com/20141230151007701.jpg"},{"id":"8","text":"生菜","image":"http://img.szzhangchu.com/20141107105347572.jpg"},{"id":"11","text":"芥菜","image":"http://img.szzhangchu.com/1445499190435_2475364438.jpg"},{"id":"13","text":"韭菜","image":"http://img.szzhangchu.com/20141107104503423.jpg"},{"id":"14","text":"韭菜花","image":"http://img.szzhangchu.com/20150418105918902.jpg"},{"id":"23","text":"茼蒿","image":"http://img.szzhangchu.com/20150418105652208.jpg"},{"id":"26","text":"苋菜","image":"http://img.szzhangchu.com/20150413095610573.jpg"},{"id":"28","text":"香椿","image":"http://img.szzhangchu.com/20150518151308182.jpg"},{"id":"29","text":"雪里蕻","image":"http://img.szzhangchu.com/20150530153237844.jpg"},{"id":"30","text":"紫甘蓝","image":"http://img.szzhangchu.com/20150530153051256.jpg"},{"id":"31","text":"紫苏","image":"http://img.szzhangchu.com/20150418110024798.jpg"},{"id":"33","text":"黄花菜","image":"http://img.szzhangchu.com/20150420090832416.jpg"},{"id":"34","text":"花菜","image":"http://img.szzhangchu.com/20150418105815428.jpg"},{"id":"35","text":"西蓝花","image":"http://img.szzhangchu.com/20150518151207847.jpg"},{"id":"40","text":"茭白","image":"http://img.szzhangchu.com/2015051815103094.jpg"},{"id":"42","text":"芦笋","image":"http://img.szzhangchu.com/2015051815160675.jpg"},{"id":"46","text":"莴笋","image":"http://img.szzhangchu.com/20150420090314332.jpg"},{"id":"232","text":"鱼腥草","image":"http://img.szzhangchu.com/20150420090931138.jpg"},{"id":"233","text":"蕨菜","image":"http://img.szzhangchu.com/2015041309584913.jpg"},{"id":"241","text":"藠头","image":"http://img.szzhangchu.com/20150530152349256.jpg"},{"id":"280","text":"枸杞叶","image":"http://img.szzhangchu.com/20150420091028380.jpg"},{"id":"303","text":"苤蓝","image":"http://img.szzhangchu.com/20150420090145530.jpg"},{"id":"385","text":"薄荷叶","image":"http://img.szzhangchu.com/20150530144434821.jpg"},{"id":"411","text":"苦菊","image":"http://img.szzhangchu.com/20150530152612562.jpg"},{"id":"453","text":"芦荟","image":"http://img.szzhangchu.com/20150420085846600.jpg"},{"id":"455","text":"萝卜缨","image":"http://img.szzhangchu.com/20150530152756530.jpg"},{"id":"486","text":"白菜","image":"http://img.szzhangchu.com/1439642455400_6714813740.jpg"}]},{"id":"23","text":"蔬菜-块根类","image":"http://pub.szzhangchu.com/web/images/material_type/15shucaikuaigenlei.jpg","data":[{"id":"36","text":"白萝卜","image":"http://img.szzhangchu.com/20141107102837569.jpg"},{"id":"37","text":"胡萝卜","image":"http://img.szzhangchu.com/20141107101536959.jpg"},{"id":"38","text":"红薯","image":"http://img.szzhangchu.com/20150413111319332.jpg"},{"id":"39","text":"紫薯","image":"http://img.szzhangchu.com/20150418103327279.jpg"},{"id":"41","text":"莲藕","image":"http://img.szzhangchu.com/20150413094130659.jpg"},{"id":"43","text":"马蹄","image":"http://img.szzhangchu.com/2015042010084044.jpg"},{"id":"44","text":"山药","image":"http://img.szzhangchu.com/20141107102023496.jpg"},{"id":"45","text":"土豆","image":"http://img.szzhangchu.com/20141107101800229.jpg"},{"id":"47","text":"洋葱","image":"http://img.szzhangchu.com/20141107095705968.jpg"},{"id":"50","text":"芋头","image":"http://img.szzhangchu.com/20141107101003538.jpg"},{"id":"51","text":"竹笋","image":"http://img.szzhangchu.com/20150413100152196.jpg"},{"id":"52","text":"蒜头","image":"http://img.szzhangchu.com/20150413100345395.jpg"},{"id":"53","text":"生姜","image":"http://img.szzhangchu.com/20150518151740428.jpg"},{"id":"227","text":"凉薯","image":"http://img.szzhangchu.com/20150413100530251.jpg"},{"id":"229","text":"鲜百合","image":"http://img.szzhangchu.com/20150518152002591.jpg"},{"id":"267","text":"心里美萝卜","image":"http://img.szzhangchu.com/20150518152143503.jpg"},{"id":"273","text":"牛蒡","image":"http://img.szzhangchu.com/20150518151854270.jpg"},{"id":"484","text":"黑蒜","image":"http://img.szzhangchu.com/1439726615097_4478613585.jpg"},{"id":"491","text":"魔芋","image":"http://img.szzhangchu.com/1439556670803_8630239118.JPG"}]},{"id":"24","text":"蔬菜-瓜果类","image":"http://pub.szzhangchu.com/web/images/material_type/13shucaiguaguolei.jpg","data":[{"id":"48","text":"玉米","image":"http://img.szzhangchu.com/20150413100811690.jpg"},{"id":"54","text":"冬瓜","image":"http://img.szzhangchu.com/20141107105916743.jpg"},{"id":"55","text":"黄瓜","image":"http://img.szzhangchu.com/20141107104529623.jpg"},{"id":"56","text":"苦瓜","image":"http://img.szzhangchu.com/20141107105055921.jpg"},{"id":"57","text":"青椒","image":"http://img.szzhangchu.com/20150418103625297.jpg"},{"id":"59","text":"彩椒","image":"http://img.szzhangchu.com/20150418103505845.jpg"},{"id":"60","text":"南瓜","image":"http://img.szzhangchu.com/20141107100251102.jpg"},{"id":"62","text":"茄子","image":"http://img.szzhangchu.com/20141107110900207.jpg"},{"id":"63","text":"丝瓜","image":"http://img.szzhangchu.com/20141107110435278.jpg"},{"id":"64","text":"西红柿","image":"http://img.szzhangchu.com/1439718049593_3151099996.jpg"},{"id":"65","text":"西葫芦","image":"http://img.szzhangchu.com/20150518152500692.jpg"},{"id":"66","text":"佛手瓜","image":"http://img.szzhangchu.com/20150530155427544.jpg"},{"id":"248","text":"葫芦瓜","image":"http://img.szzhangchu.com/20150413100919790.jpg"},{"id":"255","text":"节瓜","image":"http://img.szzhangchu.com/20150530153841214.jpg"},{"id":"302","text":"秋葵","image":"http://img.szzhangchu.com/1439717315096_5268122823.jpg"}]},{"id":"25","text":"蔬菜-豆类","image":"http://pub.szzhangchu.com/web/images/material_type/12shucaidoulei.jpg","data":[{"id":"67","text":"豆角","image":"http://img.szzhangchu.com/20150413101145145.jpg"},{"id":"68","text":"四季豆","image":"http://img.szzhangchu.com/20150413101259236.jpg"},{"id":"70","text":"豌豆","image":"http://img.szzhangchu.com/20141107101221529.jpg"},{"id":"76","text":"蚕豆","image":"http://img.szzhangchu.com/20150413101037558.jpg"},{"id":"81","text":"豆腐","image":"http://img.szzhangchu.com/20141107103210151.jpg"}]},{"id":"26","text":"菌菇类","image":"http://pub.szzhangchu.com/web/images/material_type/8jungulei.jpg","data":[{"id":"89","text":"黑木耳","image":"http://img.szzhangchu.com/20141107165143482.jpg"},{"id":"90","text":"银耳","image":"http://img.szzhangchu.com/20141107101138139.jpg"},{"id":"91","text":"竹荪","image":"http://img.szzhangchu.com/20150413102154874.jpg"},{"id":"92","text":"香菇","image":"http://img.szzhangchu.com/20141107164744880.jpg"},{"id":"93","text":"平菇","image":"http://img.szzhangchu.com/20150413101822528.jpg"},{"id":"94","text":"金针菇","image":"http://img.szzhangchu.com/20150413101613115.jpg"},{"id":"95","text":"滑子菇","image":"http://img.szzhangchu.com/20150413101513961.jpg"},{"id":"96","text":"口蘑","image":"http://img.szzhangchu.com/20150518153003605.jpg"},{"id":"97","text":"草菇","image":"http://img.szzhangchu.com/1439810532718_2385779439.jpg"},{"id":"98","text":"茶树菇","image":"http://img.szzhangchu.com/20141107170057395.jpg"},{"id":"99","text":"鸡腿菇","image":"http://img.szzhangchu.com/20150413101716446.jpg"},{"id":"100","text":"杏鲍菇","image":"http://img.szzhangchu.com/20141107165643255.jpg"},{"id":"307","text":"猴头菇","image":"http://img.szzhangchu.com/20150413101418171.jpg"},{"id":"358","text":"白灵菇","image":"http://img.szzhangchu.com/20150418103754674.jpg"},{"id":"592","text":"黄蘑","image":"http://img.szzhangchu.com/1439726461728_1874844191.jpg"},{"id":"594","text":"元蘑","image":"http://img.szzhangchu.com/1439709900068_8138641992.jpg"},{"id":"595","text":"榛蘑","image":"http://img.szzhangchu.com/1439715111415_3169538189.jpg"}]},{"id":"27","text":"畜肉类","image":"http://pub.szzhangchu.com/web/images/material_type/3churoulei.jpg","data":[{"id":"103","text":"猪肉","image":"http://img.szzhangchu.com/20141107102317371.jpg"},{"id":"104","text":"腊肉","image":"http://img.szzhangchu.com/20141229145611252.jpg"},{"id":"105","text":"火腿","image":"http://img.szzhangchu.com/20150413102702977.jpg"},{"id":"106","text":"猪肝","image":"http://img.szzhangchu.com/20150413102824670.jpg"},{"id":"108","text":"猪蹄","image":"http://img.szzhangchu.com/1439959651849_8806664786.jpg"},{"id":"109","text":"猪尾","image":"http://img.szzhangchu.com/20150530164447745.jpg"},{"id":"110","text":"猪腰","image":"http://img.szzhangchu.com/20150518154013924.jpg"},{"id":"111","text":"猪耳","image":"http://img.szzhangchu.com/20150413102322968.jpg"},{"id":"112","text":"猪血","image":"http://img.szzhangchu.com/20150518153923253.jpg"},{"id":"113","text":"猪肠","image":"http://img.szzhangchu.com/20150413102521428.jpg"},{"id":"114","text":"腊肠","image":"http://img.szzhangchu.com/20150418103934869.jpg"},{"id":"115","text":"猪肚","image":"http://img.szzhangchu.com/20141107102920513.jpg"},{"id":"116","text":"猪心","image":"http://img.szzhangchu.com/20150518153834357.jpg"},{"id":"117","text":"猪肺","image":"http://img.szzhangchu.com/2015051815355503.jpg"},{"id":"119","text":"牛肉","image":"http://img.szzhangchu.com/20141107102627560.jpg"},{"id":"120","text":"牛肚","image":"http://img.szzhangchu.com/20150518153219856.jpg"},{"id":"121","text":"牛排","image":"http://img.szzhangchu.com/20141107162053461.jpg"},{"id":"123","text":"羊肉","image":"http://img.szzhangchu.com/20141107103156474.jpg"},{"id":"124","text":"羊排","image":"http://img.szzhangchu.com/20150413102759805.jpg"},{"id":"125","text":"狗肉","image":"http://img.szzhangchu.com/20150518155217760.jpg"},{"id":"292","text":"培根","image":"http://img.szzhangchu.com/20150418104102952.jpg"},{"id":"435","text":"牛心","image":"http://img.szzhangchu.com/20150530164617219.jpg"},{"id":"436","text":"牛尾","image":"http://img.szzhangchu.com/20150413103127184.jpg"},{"id":"437","text":"猪脾","image":"http://img.szzhangchu.com/20150418104305638.jpg"},{"id":"466","text":"牛骨","image":"http://img.szzhangchu.com/20150530155842182.jpg"},{"id":"487","text":"牛腩","image":"http://img.szzhangchu.com/1439716963767_8571690621.jpg"},{"id":"490","text":"排骨","image":"http://img.szzhangchu.com/1439612428445_4939115310.jpg"},{"id":"492","text":"五花肉","image":"http://img.szzhangchu.com/1439708986860_7224216276.jpg"},{"id":"509","text":"猪皮","image":"http://img.szzhangchu.com/1439717130625_5206228802.jpg"},{"id":"519","text":"羊肚","image":"http://img.szzhangchu.com/1439717879881_3896683883.jpg"}]},{"id":"28","text":"禽肉类","image":"http://pub.szzhangchu.com/web/images/material_type/11qinroulei.jpg","data":[{"id":"127","text":"鸡爪","image":"http://img.szzhangchu.com/20150413103730593.jpg"},{"id":"128","text":"鸡翅","image":"http://img.szzhangchu.com/20150413103537506.jpg"},{"id":"129","text":"鸡腿","image":"http://img.szzhangchu.com/20150413103639429.jpg"},{"id":"130","text":"鸡杂","image":"http://img.szzhangchu.com/20150413103836263.jpg"},{"id":"131","text":"乌鸡","image":"http://img.szzhangchu.com/20150413103325275.jpg"},{"id":"132","text":"鸭肉","image":"http://img.szzhangchu.com/20141107102815921.jpg"},{"id":"133","text":"鸭掌","image":"http://img.szzhangchu.com/20150413103231761.jpg"},{"id":"136","text":"鸽肉","image":"http://img.szzhangchu.com/20150518160341756.jpg"},{"id":"137","text":"鹌鹑","image":"http://img.szzhangchu.com/20150518161424202.jpg"},{"id":"470","text":"鸭血","image":"http://img.szzhangchu.com/20150518161051934.jpg"},{"id":"488","text":"鸡肉","image":"http://img.szzhangchu.com/1439643177463_8570501229.jpg"},{"id":"489","text":"鹅肉","image":"http://img.szzhangchu.com/1439726085063_2373353066.jpg"},{"id":"644","text":"鹅肝","image":"http://img.szzhangchu.com/2015053017210066.jpg"},{"id":"650","text":"鸭胗","image":"http://img.szzhangchu.com/1439643659774_5925134675.jpg"}]},{"id":"29","text":"蛋类","image":"http://pub.szzhangchu.com/web/images/material_type/4danlei.jpg","data":[{"id":"138","text":"鸡蛋","image":"http://img.szzhangchu.com/2014110710253590.jpg"},{"id":"139","text":"鸭蛋","image":"http://img.szzhangchu.com/20141107103101387.jpg"},{"id":"142","text":"鹌鹑蛋","image":"http://img.szzhangchu.com/20141107102448595.jpg"},{"id":"226","text":"咸蛋","image":"http://img.szzhangchu.com/20150413103959604.jpg"}]},{"id":"30","text":"水产类","image":"http://pub.szzhangchu.com/web/images/material_type/16shuichanlei.jpg","data":[{"id":"143","text":"鲤鱼","image":"http://img.szzhangchu.com/1440139026476_2416522890.jpg"},{"id":"145","text":"草鱼","image":"http://img.szzhangchu.com/2014110709091341.jpg"},{"id":"154","text":"鳕鱼","image":"http://img.szzhangchu.com/20150413105104547.jpg"},{"id":"156","text":"甲鱼","image":"http://img.szzhangchu.com/1440138999334_2376640320.jpg"},{"id":"163","text":"秋刀鱼","image":"http://img.szzhangchu.com/20150413104334118.jpg"},{"id":"165","text":"泥鳅","image":"http://img.szzhangchu.com/20150413104533175.jpg"},{"id":"166","text":"牛蛙","image":"http://img.szzhangchu.com/2014110709405275.jpg"},{"id":"168","text":"螃蟹","image":"http://img.szzhangchu.com/20141107095450295.jpg"},{"id":"173","text":"扇贝","image":"http://img.szzhangchu.com/20150413104705821.jpg"},{"id":"176","text":"海参","image":"http://img.szzhangchu.com/20141107090121514.jpg"},{"id":"177","text":"鲍鱼","image":"http://img.szzhangchu.com/20141107092804710.jpg"},{"id":"178","text":"海带","image":"http://img.szzhangchu.com/20141107100420285.jpg"},{"id":"180","text":"紫菜","image":"http://img.szzhangchu.com/20141107100658143.jpg"},{"id":"290","text":"黄脚立鱼","image":"http://img.szzhangchu.com/20150530160601859.jpg"},{"id":"415","text":"海藻","image":"http://img.szzhangchu.com/1439716626513_7186011056.jpg"},{"id":"423","text":"鱼丸","image":"http://img.szzhangchu.com/20150418104459894.jpg"},{"id":"447","text":"九肚鱼","image":"http://img.szzhangchu.com/20150530160414218.jpg"},{"id":"448","text":"金枪鱼","image":"http://img.szzhangchu.com/20141107204334451.jpg"},{"id":"479","text":"虾仁","image":"http://img.szzhangchu.com/1439643619835_2842941638.jpg"},{"id":"480","text":"小龙虾","image":"http://img.szzhangchu.com/1439713719675_3776918513.jpg"},{"id":"483","text":"河虾","image":"http://img.szzhangchu.com/1439715262634_1797907547.jpg"},{"id":"485","text":"鲫鱼","image":"http://img.szzhangchu.com/1440139100663_7811167460.jpg"},{"id":"493","text":"基围虾","image":"http://img.szzhangchu.com/1439712380070_9942188343.jpg"}]},{"id":"31","text":"水果类","image":"http://pub.szzhangchu.com/web/images/material_type/17shuiguolei.jpg","data":[{"id":"181","text":"苹果","image":"http://img.szzhangchu.com/20141107104400193.jpg"},{"id":"182","text":"香蕉","image":"http://img.szzhangchu.com/20150413105712913.jpg"},{"id":"183","text":"木瓜","image":"http://img.szzhangchu.com/20141107104454648.jpg"},{"id":"184","text":"橘子","image":"http://img.szzhangchu.com/20150418110150216.jpg"},{"id":"185","text":"火龙果","image":"http://img.szzhangchu.com/20150413110116696.jpg"},{"id":"186","text":"梨","image":"http://img.szzhangchu.com/20150413105411627.jpg"},{"id":"188","text":"菠萝","image":"http://img.szzhangchu.com/20150413105308769.jpg"},{"id":"189","text":"柠檬","image":"http://img.szzhangchu.com/2015041311022581.jpg"},{"id":"190","text":"西瓜","image":"http://img.szzhangchu.com/20141107104311571.jpg"},{"id":"191","text":"橙子","image":"http://img.szzhangchu.com/20150413110622767.jpg"},{"id":"192","text":"柚子","image":"http://img.szzhangchu.com/20150413110419282.jpg"},{"id":"193","text":"椰子","image":"http://img.szzhangchu.com/20150413110313444.jpg"},{"id":"194","text":"草莓","image":"http://img.szzhangchu.com/20150413105516387.jpg"},{"id":"195","text":"樱桃","image":"http://img.szzhangchu.com/20150413105907726.jpg"},{"id":"197","text":"桃子","image":"http://img.szzhangchu.com/20141107104227470.jpg"},{"id":"198","text":"哈密瓜","image":"http://img.szzhangchu.com/20150413105803124.jpg"},{"id":"199","text":"榴莲","image":"http://img.szzhangchu.com/20150413110514740.jpg"},{"id":"200","text":"荔枝","image":"http://img.szzhangchu.com/20150413111511539.jpg"},{"id":"343","text":"葡萄","image":"http://img.szzhangchu.com/1440491724362_1726819755.jpg"},{"id":"640","text":"覆盆子","image":"http://img.szzhangchu.com/1439718063667_5200416267.jpg"}]},{"id":"32","text":"干果类","image":"http://pub.szzhangchu.com/web/images/material_type/6ganguolei.jpg","data":[{"id":"204","text":"板栗","image":"http://img.szzhangchu.com/20150518163238610.jpg"},{"id":"206","text":"红枣","image":"http://img.szzhangchu.com/20140904090345337.jpg"},{"id":"208","text":"松仁","image":"http://img.szzhangchu.com/20150413110859547.jpg"},{"id":"212","text":"花生","image":"http://img.szzhangchu.com/20150413111004526.jpg"},{"id":"213","text":"核桃","image":"http://img.szzhangchu.com/20150518163942489.jpg"},{"id":"214","text":"芝麻","image":"http://img.szzhangchu.com/20150418105151563.jpg"},{"id":"332","text":"榛子","image":"http://img.szzhangchu.com/2015051816333139.jpg"},{"id":"340","text":"葡萄干","image":"http://img.szzhangchu.com/20150418105026900.jpg"},{"id":"482","text":"开心果","image":"http://img.szzhangchu.com/1439714001016_8267569874.jpg"}]},{"id":"33","text":"其他","image":"http://pub.szzhangchu.com/web/images/material_type/10qita.jpg","data":[{"id":"234","text":"西米","image":"http://img.szzhangchu.com/20150530161111845.jpg"},{"id":"251","text":"牛奶","image":"http://img.szzhangchu.com/20150530161229599.jpg"},{"id":"311","text":"蜂蜜","image":"http://img.szzhangchu.com/20150116162344816.jpg"},{"id":"389","text":"红酒","image":"http://img.szzhangchu.com/20150530161545629.jpg"},{"id":"396","text":"咖啡豆","image":"http://img.szzhangchu.com/20150530161411669.jpg"},{"id":"593","text":"食用油","image":"http://img.szzhangchu.com/1439720057916_9074636489.jpg"},{"id":"627","text":"雪蛤油","image":"http://img.szzhangchu.com/1439719891261_8735299911.jpg"}]},{"id":"34","text":"常见中药材","image":"http://pub.szzhangchu.com/web/images/material_type/2changjianzhongyaocai.jpg","data":[{"id":"205","text":"枸杞","image":"http://img.szzhangchu.com/20150418190147278.jpg"},{"id":"223","text":"燕窝","image":"http://img.szzhangchu.com/20141110102153296.jpg"},{"id":"275","text":"党参","image":"http://img.szzhangchu.com/20150604100700352.jpg"},{"id":"286","text":"西洋参","image":"http://img.szzhangchu.com/20141107210849928.jpg"},{"id":"289","text":"黄芪","image":"http://img.szzhangchu.com/20150418190052247.jpg"},{"id":"313","text":"人参","image":"http://img.szzhangchu.com/20141110102410239.jpg"},{"id":"354","text":"鹿茸","image":"http://img.szzhangchu.com/2015041818583334.jpg"},{"id":"405","text":"冬虫夏草","image":"http://img.szzhangchu.com/20141107211019730.jpg"}]},{"id":"35","text":"烘焙类","image":"http://pub.szzhangchu.com/web/images/material_type/7hongpei.jpg","data":[{"id":"372","text":"奶油","image":"http://img.szzhangchu.com/20150530163015463.jpg"},{"id":"373","text":"巧克力","image":"http://img.szzhangchu.com/20150530163509965.jpg"},{"id":"376","text":"抹茶粉","image":"http://img.szzhangchu.com/20150530174835834.jpg"},{"id":"378","text":"奶酪","image":"http://img.szzhangchu.com/20150530162907434.jpg"},{"id":"379","text":"绿茶粉","image":"http://img.szzhangchu.com/20150530174614347.jpg"},{"id":"380","text":"草莓酱","image":"http://img.szzhangchu.com/20150530162010183.jpg"},{"id":"382","text":"芒果酱","image":"http://img.szzhangchu.com/20150530174716281.jpg"},{"id":"384","text":"白兰地","image":"http://img.szzhangchu.com/20150530161847177.jpg"},{"id":"400","text":"果冻粉","image":"http://img.szzhangchu.com/20150530162409715.jpg"},{"id":"402","text":"吉利丁","image":"http://img.szzhangchu.com/20150530162647797.jpg"},{"id":"642","text":"起酥油","image":"http://img.szzhangchu.com/1442981008009_2272293879.jpg"}]},{"id":"36","text":"粮豆米面类","image":"http://pub.szzhangchu.com/web/images/material_type/9liangdoumimian.jpg","data":[{"id":"72","text":"扁豆","image":"http://img.szzhangchu.com/20150518164107883.jpg"},{"id":"74","text":"黄豆","image":"http://img.szzhangchu.com/20141107103349640.jpg"},{"id":"75","text":"绿豆","image":"http://img.szzhangchu.com/20141107103853939.jpg"},{"id":"78","text":"红豆","image":"http://img.szzhangchu.com/2014110710293271.jpg"},{"id":"79","text":"黑豆","image":"http://img.szzhangchu.com/20141107102542884.jpg"},{"id":"221","text":"粉丝","image":"http://img.szzhangchu.com/20150418135656191.jpg"},{"id":"222","text":"年糕","image":"http://img.szzhangchu.com/2015041816584821.jpg"},{"id":"224","text":"薏米","image":"http://img.szzhangchu.com/20141107110445671.jpg"},{"id":"228","text":"汤圆","image":"http://img.szzhangchu.com/20150418135821812.jpg"},{"id":"236","text":"黑米","image":"http://img.szzhangchu.com/20150413111117885.jpg"},{"id":"240","text":"面粉","image":"http://img.szzhangchu.com/20150418165721363.jpg"},{"id":"242","text":"糙米","image":"http://img.szzhangchu.com/20141229150006840.jpg"},{"id":"246","text":"大米","image":"http://img.szzhangchu.com/20141107095925575.jpg"},{"id":"250","text":"红米","image":"http://img.szzhangchu.com/20150413111210125.jpg"},{"id":"265","text":"面条","image":"http://img.szzhangchu.com/20150418170004365.jpg"},{"id":"269","text":"小米","image":"http://img.szzhangchu.com/1439880727576_5506580167.jpg"},{"id":"306","text":"玉米粉","image":"http://img.szzhangchu.com/20150418105353173.jpg"},{"id":"309","text":"燕麦","image":"http://img.szzhangchu.com/20141107105452802.jpg"},{"id":"431","text":"黄米","image":"http://img.szzhangchu.com/20150418105538935.jpg"},{"id":"481","text":"白扁豆","image":"http://img.szzhangchu.com/1439716992720_1853871570.jpg"},{"id":"538","text":"大麦","image":"http://img.szzhangchu.com/1439713379371_6862288650.jpg"}]}]
         */

        private int id;
        private String text;
        private String name;
        private List<DataBeanX> data;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<DataBeanX> getData() {
            return data;
        }

        public void setData(List<DataBeanX> data) {
            this.data = data;
        }

        public static class DataBeanX implements Parcelable {
            /**
             * id : 39
             * text : 常见食材
             * image : http://pub.szzhangchu.com/web/images/material_type/1changjianshicai.jpg
             * data : [{"id":"2","text":"菠菜","image":"http://img.szzhangchu.com/20141107110043154.jpg"},{"id":"3","text":"菜心","image":"http://img.szzhangchu.com/20141230150657647.jpg"},{"id":"5","text":"小白菜","image":"http://img.szzhangchu.com/20141107103757137.jpg"},{"id":"6","text":"上海青","image":"http://img.szzhangchu.com/1439782526400_9389049634.jpg"},{"id":"8","text":"生菜","image":"http://img.szzhangchu.com/20141107105347572.jpg"},{"id":"35","text":"西蓝花","image":"http://img.szzhangchu.com/20150518151207847.jpg"},{"id":"37","text":"胡萝卜","image":"http://img.szzhangchu.com/20141107101536959.jpg"},{"id":"41","text":"莲藕","image":"http://img.szzhangchu.com/20150413094130659.jpg"},{"id":"42","text":"芦笋","image":"http://img.szzhangchu.com/2015051815160675.jpg"},{"id":"44","text":"山药","image":"http://img.szzhangchu.com/20141107102023496.jpg"},{"id":"45","text":"土豆","image":"http://img.szzhangchu.com/20141107101800229.jpg"},{"id":"47","text":"洋葱","image":"http://img.szzhangchu.com/20141107095705968.jpg"},{"id":"48","text":"玉米","image":"http://img.szzhangchu.com/20150413100811690.jpg"},{"id":"52","text":"蒜头","image":"http://img.szzhangchu.com/20150413100345395.jpg"},{"id":"53","text":"生姜","image":"http://img.szzhangchu.com/20150518151740428.jpg"},{"id":"55","text":"黄瓜","image":"http://img.szzhangchu.com/20141107104529623.jpg"},{"id":"57","text":"青椒","image":"http://img.szzhangchu.com/20150418103625297.jpg"},{"id":"59","text":"彩椒","image":"http://img.szzhangchu.com/20150418103505845.jpg"},{"id":"62","text":"茄子","image":"http://img.szzhangchu.com/20141107110900207.jpg"},{"id":"63","text":"丝瓜","image":"http://img.szzhangchu.com/20141107110435278.jpg"},{"id":"64","text":"西红柿","image":"http://img.szzhangchu.com/1439718049593_3151099996.jpg"},{"id":"81","text":"豆腐","image":"http://img.szzhangchu.com/20141107103210151.jpg"},{"id":"92","text":"香菇","image":"http://img.szzhangchu.com/20141107164744880.jpg"},{"id":"93","text":"平菇","image":"http://img.szzhangchu.com/20150413101822528.jpg"},{"id":"94","text":"金针菇","image":"http://img.szzhangchu.com/20150413101613115.jpg"},{"id":"100","text":"杏鲍菇","image":"http://img.szzhangchu.com/20141107165643255.jpg"},{"id":"103","text":"猪肉","image":"http://img.szzhangchu.com/20141107102317371.jpg"},{"id":"119","text":"牛肉","image":"http://img.szzhangchu.com/20141107102627560.jpg"},{"id":"132","text":"鸭肉","image":"http://img.szzhangchu.com/20141107102815921.jpg"},{"id":"138","text":"鸡蛋","image":"http://img.szzhangchu.com/2014110710253590.jpg"},{"id":"145","text":"草鱼","image":"http://img.szzhangchu.com/2014110709091341.jpg"},{"id":"212","text":"花生","image":"http://img.szzhangchu.com/20150413111004526.jpg"},{"id":"221","text":"粉丝","image":"http://img.szzhangchu.com/20150418135656191.jpg"},{"id":"240","text":"面粉","image":"http://img.szzhangchu.com/20150418165721363.jpg"},{"id":"246","text":"大米","image":"http://img.szzhangchu.com/20141107095925575.jpg"},{"id":"251","text":"牛奶","image":"http://img.szzhangchu.com/20150530161229599.jpg"},{"id":"265","text":"面条","image":"http://img.szzhangchu.com/20150418170004365.jpg"},{"id":"485","text":"鲫鱼","image":"http://img.szzhangchu.com/1440139100663_7811167460.jpg"},{"id":"488","text":"鸡肉","image":"http://img.szzhangchu.com/1439643177463_8570501229.jpg"}]
             */

            private String id;
            private String text;
            private String image;
            private List<DataBean> data;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class DataBean implements Parcelable {
                /**
                 * id : 2
                 * text : 菠菜
                 * image : http://img.szzhangchu.com/20141107110043154.jpg
                 */

                private String id;
                private String text;
                private String image;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.id);
                    dest.writeString(this.text);
                    dest.writeString(this.image);
                }

                public DataBean() {
                }

                protected DataBean(Parcel in) {
                    this.id = in.readString();
                    this.text = in.readString();
                    this.image = in.readString();
                }

                public static final Parcelable.Creator<DataBean> CREATOR = new Parcelable.Creator<DataBean>() {
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

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.id);
                dest.writeString(this.text);
                dest.writeString(this.image);
                dest.writeTypedList(this.data);
            }

            public DataBeanX() {
            }

            protected DataBeanX(Parcel in) {
                this.id = in.readString();
                this.text = in.readString();
                this.image = in.readString();
                this.data = in.createTypedArrayList(DataBean.CREATOR);
            }

            public static final Parcelable.Creator<DataBeanX> CREATOR = new Parcelable.Creator<DataBeanX>() {
                @Override
                public DataBeanX createFromParcel(Parcel source) {
                    return new DataBeanX(source);
                }

                @Override
                public DataBeanX[] newArray(int size) {
                    return new DataBeanX[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.id);
            dest.writeString(this.text);
            dest.writeString(this.name);
            dest.writeTypedList(this.data);
        }

        public DataBeanXX() {
        }

        protected DataBeanXX(Parcel in) {
            this.id = in.readInt();
            this.text = in.readString();
            this.name = in.readString();
            this.data = in.createTypedArrayList(DataBeanX.CREATOR);
        }

        public static final Parcelable.Creator<DataBeanXX> CREATOR = new Parcelable.Creator<DataBeanXX>() {
            @Override
            public DataBeanXX createFromParcel(Parcel source) {
                return new DataBeanXX(source);
            }

            @Override
            public DataBeanXX[] newArray(int size) {
                return new DataBeanXX[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.msg);
        dest.writeString(this.version);
        dest.writeLong(this.timestamp);
        dest.writeParcelable(this.data, flags);
    }

    public Ingredients() {
    }

    protected Ingredients(Parcel in) {
        this.code = in.readString();
        this.msg = in.readString();
        this.version = in.readString();
        this.timestamp = in.readLong();
        this.data = in.readParcelable(DataBeanXX.class.getClassLoader());
    }

    public static final Parcelable.Creator<Ingredients> CREATOR = new Parcelable.Creator<Ingredients>() {
        @Override
        public Ingredients createFromParcel(Parcel source) {
            return new Ingredients(source);
        }

        @Override
        public Ingredients[] newArray(int size) {
            return new Ingredients[size];
        }
    };
}
