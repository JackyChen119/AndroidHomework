package com.example.test.recycler;

import java.util.ArrayList;
import java.util.List;

public class TestDataSet {

    public static List<TestDemo> getData() {
        List<TestDemo> result = new ArrayList();
        result.add(new TestDemo("李佳琦直播", "524.6w"));
        result.add(new TestDemo("南京夫子庙女子穿和服", "433.6w"));
        result.add(new TestDemo("吴亦凡工作室发澄清", "357.8w"));
        result.add(new TestDemo("我是真的爱你", "333.6w"));
        result.add(new TestDemo("熊猫的生活日常", "285.6w"));
        result.add(new TestDemo("中国演出行业协会发声", "183.2w"));
        result.add(new TestDemo("男孩开冰可乐被炸伤", "139.4w"));
        result.add(new TestDemo("乐华全家福", "75.6w"));
        result.add(new TestDemo("有偶像包袱的小鹿", "55w"));
        result.add(new TestDemo("刘国梁用脚丈量奥运场地", "43w"));
        result.add(new TestDemo("炸宽粉有多好吃", "22.2w"));
        return result;
    }

}
