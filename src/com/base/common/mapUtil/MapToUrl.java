package com.base.common.mapUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
/**
 * map相关工具类
 * @author Administrator
 *
 */
public class MapToUrl {

	/**
	 * map转成 kye=value&key=value&...形式
	 * @param map
	 * @return
	 */
	public String buildMap(Map<String, String> map) {
        StringBuffer sb = new StringBuffer();
        if (map.size() > 0) {
            for (String key : map.keySet()) {
                sb.append(key + "=");
//                if (StringUtils.isEmpty(map.get(key))) {
                if (map.get(key) == null || "".equals(map.get(key))) {
                    sb.append("&");
                } else {
                    String value = map.get(key);
                    try {
                        value = URLEncoder.encode(value, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    sb.append(value + "&");
                }
            }
        }
        return sb.toString();
    }

	/**
	 * jsonObject转成map转成 kye=value&key=value&...形式
	 * jsonObject不能强转为String
	 * @param map
	 * @return
	 */
	public String buildMapFromJson(Map<String, String> map) {
        StringBuffer sb = new StringBuffer();
        if (map.size() > 0) {
            for (String key : map.keySet()) {
                sb.append(key + "=");
//                if (StringUtils.isEmpty(map.get(key))) {
                if (map.get(key) == null || "".equals(map.get(key))) {
                    sb.append("&");
                } else {
                    Object value = map.get(key);
                    try {
                        value = URLEncoder.encode(value.toString(), "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    sb.append(value + "&");
                }
            }
        }
        return sb.toString();
    }

}
