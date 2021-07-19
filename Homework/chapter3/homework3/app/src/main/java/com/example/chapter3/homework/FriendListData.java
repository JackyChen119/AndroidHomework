package com.example.chapter3.homework;

import java.util.ArrayList;
import java.util.List;

public class FriendListData {

    public static List<FriendList> getData() {
        List<FriendList> Infor = new ArrayList();
        Infor.add(new FriendList("昨晚比赛看了吗？", "刚刚", "小明"));
        Infor.add(new FriendList("在家不？", "15:07", "小王"));
        Infor.add(new FriendList("[斜眼笑]", "15:07","小张"));
        Infor.add(new FriendList("[动画表情]", "14:55","小陈"));
        Infor.add(new FriendList("hhh", "14:33","小李"));
        Infor.add(new FriendList("[捂脸]", "14:01","爷爷"));
        Infor.add(new FriendList("好的", "12:09","奶奶"));
        Infor.add(new FriendList("中午记得来单位吃饭", "10:29","爸爸"));
        Infor.add(new FriendList("[图片]", "10:13","妈妈"));
        Infor.add(new FriendList("[视频]", "9:12","外公"));
        Infor.add(new FriendList("上号上号！", "9:10","外婆"));
        return Infor;
    }

}
