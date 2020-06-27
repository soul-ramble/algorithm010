package cn.study.practice.algorithm010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. 字母异位词分组
 *
 * @author yuqiang
 * @date 2020-06-27
 */
public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    if ( strs == null) {
      return null;
    }

    Map<String, List<String>> mapList = new HashMap();
    for (String str : strs) {
      char[] strArr = str.toCharArray();
      Arrays.sort(strArr);
      String key = String.valueOf(strArr);
      if (mapList.containsKey(key)) {
        mapList.get(key).add(str);
      } else {
        List<String> list = new ArrayList<String>();
        list.add(str);
        mapList.put(key, list);
      }
    }
    return new ArrayList(mapList.values());
  }
}
