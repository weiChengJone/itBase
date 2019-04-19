package com.base.common.mapUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
/**
 * map��ع�����
 * @author Administrator
 *
 */
public class MapToUrl {

	/**
	 * mapת�� kye=value&key=value&...��ʽ
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
	 * jsonObjectת��mapת�� kye=value&key=value&...��ʽ
	 * jsonObject����ǿתΪString
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
