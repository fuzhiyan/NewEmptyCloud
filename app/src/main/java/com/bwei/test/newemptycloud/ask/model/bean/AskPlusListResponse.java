package com.bwei.test.newemptycloud.ask.model.bean;

//import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public class AskPlusListResponse implements Serializable {


    /**
     * list : [{"aid":468,"sid":"xkycs","title":"热门评论容易出现么？","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201707/10/85bdf628-319f-4446-8969-f25fa00160e3.jpg","beginTime":"2017-06-30 00:00:00","endTime":"2017-07-28 00:00:00","authorID":4165208,"authorName":"test","authorTitle":"test","authorDesc":"stes","authorFace":"","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"isFollow":0},{"aid":467,"sid":"xkycs","title":"问答测试","tag":"测试了","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201706/30/d1639eb7-ad67-42cd-8a9f-ffe0a7d09ff7.jpg","beginTime":"2017-06-28 00:00:00","endTime":"2017-07-08 00:00:00","authorID":4460970,"authorName":"肖伟","authorTitle":"短简介有了么的地方地方","authorDesc":"短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方短简介有了么的地方地方","authorFace":"http://img.newaircloud.com/xkycs/upload/201706/30/16843a83-6809-42af-a83c-2ec5af4735d9.png","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":464,"sid":"xkycs","title":"问题数测试","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201706/26/b67a3cd2-d40b-471f-a6a0-3821705b7419.jpg","beginTime":"2017-06-01 00:00:00","endTime":"2017-06-30 00:00:00","authorID":4099834,"authorName":"很长很长","authorTitle":"这里显示短简介","authorDesc":"这里显示长简介","authorFace":"","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":453,"sid":"xkycs","title":"客户端显示问题","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201705/10/bc386abf-fb1a-4133-99b5-44f0a61d9f8a.gif","beginTime":"2017-05-10 00:00:00","endTime":"2017-05-31 00:00:00","authorID":4170182,"authorName":"客户端显示","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201705/10/1d3a5a57-5e2b-41ec-b1be-311edf0c4810.gif","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":466,"sid":"xkycs","title":"问答测试了","tag":"测试","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201706/30/cc284953-f6ce-49d7-bd02-9483fde3b4ff.jpg","beginTime":"2017-06-29 00:00:00","endTime":"2017-07-09 00:00:00","authorID":83,"authorName":"zhangsan","authorTitle":"","authorDesc":"","authorFace":"","askTime":"","orderID":5,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":442,"sid":"xkycs","title":"测试新空Pro","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/10/da369840-6c2f-4876-8acb-ed1737de24ad.jpg","beginTime":"2017-04-10 00:00:00","endTime":"2017-04-15 00:00:00","authorID":4110708,"authorName":"dsad","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/10/e1fe22d4-9a01-461d-8026-762df055cddd.jpg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":438,"sid":"xkycs","title":"新建完成测试","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/10/8533dfed-75b1-4530-a1de-087317d37154.jpg","beginTime":"2017-04-13 00:00:00","endTime":"2017-04-16 00:00:00","authorID":4110616,"authorName":"ssli","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/10/23592234-2191-454c-b22b-f75931e2bf04.jpg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":437,"sid":"xkycs","title":"dafda","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/07/03e2b50e-230e-491f-84be-46f3a48b7926.jpg","beginTime":"2017-04-08 00:00:00","endTime":"2017-04-09 00:00:00","authorID":4110274,"authorName":"新建测试完成","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/07/4d2f552e-57b6-4912-998a-ac2c2570242f.jpeg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":436,"sid":"xkycs","title":"dafda","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/07/03e2b50e-230e-491f-84be-46f3a48b7926.jpg","beginTime":"2017-04-08 00:00:00","endTime":"2017-04-09 00:00:00","authorID":4110274,"authorName":"新建测试完成","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/07/4d2f552e-57b6-4912-998a-ac2c2570242f.jpeg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":435,"sid":"xkycs","title":"xinjian","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/07/df09990a-de4b-43f8-a31c-4548b4bb3d23.jpg","beginTime":"2017-04-08 00:00:00","endTime":"2017-04-09 00:00:00","authorID":4110272,"authorName":"测试新建完成","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/07/bbef2983-e658-444f-9d2f-54c1275ae9da.jpg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":434,"sid":"xkycs","title":"新建再测试","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/07/7db3933c-bdd4-464e-b97f-9a739fa61d14.jpg","beginTime":"2017-04-06 00:00:00","endTime":"2017-04-09 00:00:00","authorID":4110268,"authorName":"新建再次测试","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/07/f26e59f5-1878-4ff3-9ce2-291e62b724bf.jpeg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":433,"sid":"xkycs","title":"新建再测试","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/07/7db3933c-bdd4-464e-b97f-9a739fa61d14.jpg","beginTime":"2017-04-06 00:00:00","endTime":"2017-04-09 00:00:00","authorID":4110268,"authorName":"新建再次测试","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/07/f26e59f5-1878-4ff3-9ce2-291e62b724bf.jpeg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":432,"sid":"xkycs","title":"新建测试账号","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/07/c289efb0-a7a3-46c7-a1f1-7f61bb801d74.jpg","beginTime":"2017-04-07 00:00:00","endTime":"2017-04-09 00:00:00","authorID":4110263,"authorName":"新建测试账号","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/07/cdc7fd1d-f238-4e15-8485-ae56715b4ca8.png","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":429,"sid":"xkycs","title":"新建问答测试","tag":"测试","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/07/b5754371-12e5-438f-a532-551067bcdb2c.jpg","beginTime":"2017-04-08 00:00:00","endTime":"2017-04-09 00:00:00","authorID":4110185,"authorName":"dafd","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/07/84adb7ee-e1cb-4e39-83db-825a43b50e32.jpg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":424,"sid":"xkycs","title":"新建问答测试","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/06/78986777-7317-4e19-b44c-2bd46ede93fd.jpg","beginTime":"2017-04-11 00:00:00","endTime":"2017-04-14 00:00:00","authorID":1,"authorName":"显示你好","authorTitle":"","authorDesc":"","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/06/7d16312f-292a-4d83-abbe-14299ef1d0cd.jpg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":385,"sid":"xkycs","title":"dafda11","tag":"","description":"dsafdsa11","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/05/851c9ff2-b3be-4484-92e1-7632a2b50f65.jpg","beginTime":"2017-04-09 00:00:00","endTime":"2017-04-16 00:00:00","authorID":4109164,"authorName":"eddfa","authorTitle":"啊","authorDesc":"的","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/05/a1d1e165-8079-4b58-9afd-0fe7d831a11a.jpg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":384,"sid":"xkycs","title":"xinidafkdj","tag":"fs","description":"dfadf","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/05/cfef4c99-c970-4140-8c2a-6ba62c178af6.jpg","beginTime":"2017-04-04 00:00:00","endTime":"2017-04-09 00:00:00","authorID":195,"authorName":"","authorTitle":"","authorDesc":"","authorFace":"/app/v1/common/img/askPlus_detail_user.png","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":383,"sid":"xkycs","title":"dfad","tag":"","description":"dsafdasfda","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/05/06ba5054-7b86-496d-8f03-8717cf08ae1a.jpg","beginTime":"2017-04-01 00:00:00","endTime":"2017-04-14 00:00:00","authorID":3965040,"authorName":"肖伟","authorTitle":"丰富的单纯","authorDesc":"丰富的单纯","authorFace":"","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":382,"sid":"xkycs","title":"新建问答人测试1123","tag":"测试123","description":"123新建测试","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/05/f7b4559a-0ed6-4c6f-a2f8-f8e7242b91ff.jpg","beginTime":"2017-04-05 00:00:00","endTime":"2017-04-15 00:00:00","authorID":149,"authorName":"Linda","authorTitle":"创建问答信息","authorDesc":"用来创建问答，提问，评论，推送","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/05/a1d1e165-8079-4b58-9afd-0fe7d831a11a.jpg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0},{"aid":380,"sid":"xkycs","title":"ios测试","tag":"1/1/1/1/1","description":"问答说明","imgUrl":"http://img.newaircloud.com/xkycs/upload/201704/05/0a0e4d04-c8d4-473e-8521-1350836beb22.jpg","beginTime":"2017-04-06 00:00:00","endTime":"2017-04-08 00:00:00","authorID":4109126,"authorName":"显示姓名","authorTitle":"短简介","authorDesc":"长简介","authorFace":"http://img.newaircloud.com/xkycs/upload/201704/05/dd99bd2c-5869-407c-853d-35bdd5f030bc.jpg","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0}]
     * success : true
     * notFind : false
     */

    public boolean success;
    public boolean notFind;
    public List<ListBean> list;

    public static AskPlusListResponse objectFromData(String str) {

        return new Gson().fromJson(str, AskPlusListResponse.class);
    }

    public static class ListBean implements Serializable{
        /**
         * aid : 468
         * sid : xkycs
         * title : 热门评论容易出现么？
         * tag :
         * description :
         * imgUrl : http://img.newaircloud.com/xkycs/upload/201707/10/85bdf628-319f-4446-8969-f25fa00160e3.jpg
         * beginTime : 2017-06-30 00:00:00
         * endTime : 2017-07-28 00:00:00
         * authorID : 4165208
         * authorName : test
         * authorTitle : test
         * authorDesc : stes
         * authorFace :
         * askTime :
         * orderID : 0
         * publishStatus : 1
         * askCount : 1
         * interestCount : 3
         * isFollow : 0
         * readCount : 0
         */

        public int aid;
        public String sid;
        public String title;
        public String tag;
        public String description;
        public String imgUrl;
        public String beginTime;
        public String endTime;
        public int authorID;
        public String authorName;
        public String authorTitle;
        public String authorDesc;
        public String authorFace;
        public String askTime;
        public int orderID;
        public int publishStatus;
        public int askCount;
        public int interestCount;
        public int isFollow;
        public int readCount;

        public static ListBean objectFromData(String str) {

            return new Gson().fromJson(str, ListBean.class);
        }
    }
}
