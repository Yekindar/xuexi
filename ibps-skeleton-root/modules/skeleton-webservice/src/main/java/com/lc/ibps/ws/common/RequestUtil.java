package com.lc.ibps.ws.common;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import com.lc.ibps.base.core.constants.StringPool;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.string.StringUtil;
import com.lc.ibps.base.core.util.time.DateFormatUtil;

public class RequestUtil {

	private RequestUtil() {
	}
	
	/**
	 * 取字符串类型的参数。 如果取得的值为null，则返回默认字符串。
	 *
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @param b
	 *            是否替换'为''
	 * @return
	 */
	public static String getString(APIRequest request, String key, String defaultValue, boolean b) {
		String value = request.getParameter(key);
		if (StringUtil.isEmpty(value))
			return defaultValue;
		if (b) {
			return value.replace("'", "''").trim();
		} else {
			return value.trim();
		}
	}

	/**
	 * 取字符串类型的参数。 如果取得的值为null，则返回空字符串。
	 * 
	 * @param request
	 * @param key
	 *            字段名
	 * @return
	 */
	public static String getString(APIRequest request, String key) {
		return getString(request, key, "", false);
	}

	/**
	 * 取字符串类型的参数。 如果取得的值为null，则返回空字符串。
	 * 
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static String getString(APIRequest request, String key, boolean b) {
		return getString(request, key, "", b);
	}

	/**
	 * 取字符串类型的参数。 如果取得的值为null，则返回空字符串。
	 *
	 * @param request
	 * @param key
	 * @param defaultValue
	 *            默认值
	 * @return
	 */
	public static String getString(APIRequest request, String key, String defaultValue) {
		return getString(request, key, defaultValue, false);
	}
	
	/**
	 * 取得安全字符串。
	 * 
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static String getSecureString(APIRequest request, String key, String defaultValue) {
		String value = request.getParameter(key);
		if (StringUtil.isEmpty(value))
			return defaultValue;
		return filterInject(value);

	}

	/**
	 * 取得安全字符串，防止程序sql注入，脚本攻击。
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getSecureString(APIRequest request, String key) {
		return getSecureString(request, key, "");
	}

	/**
	 * 过滤script|iframe|\\||;|exec|insert|select|delete|update|count|chr|truncate
	 * |char字符串 防止SQL注入
	 * 
	 * @param str
	 * @return
	 */
	public static String filterInject(String str) {
		String injectstr = "\\||;|exec|insert|select|delete|update|count|chr|truncate|char";
		Pattern regex = Pattern.compile(injectstr,
				Pattern.CANON_EQ | Pattern.DOTALL | Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
		Matcher matcher = regex.matcher(str);
		str = matcher.replaceAll("");
		str = str.replace("'", "''");
		str = str.replace("-", "—");
		str = str.replace("(", "（");
		str = str.replace(")", "）");
		str = str.replace("%", "％");

		return str;
	}

	/**
	 * 从Request中取得指定的小写值
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String getLowercaseString(APIRequest request, String key) {
		return getString(request, key).toLowerCase();
	}

	/**
	 * 从request中取得int值
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static int getInt(APIRequest request, String key) {
		return getInt(request, key, 0);
	}

	/**
	 * 从request中取得int值,如果无值则返回缺省值
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static int getInt(APIRequest request, String key, int defaultValue) {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Integer.parseInt(str);

	}

	/**
	 * 从Request中取得long值
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static long getLong(APIRequest request, String key) {
		return getLong(request, key, 0);
	}

	/**
	 * 根据一串逗号分隔的长整型字符串取得长整形数组
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static Long[] getLongAryByStr(APIRequest request, String key) {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return null;
		str = str.replace("[", "");
		str = str.replace("]", "");
		String[] aryId = str.split(",");
		Long[] lAryId = new Long[aryId.length];
		for (int i = 0; i < aryId.length; i++) {
			lAryId[i] = Long.parseLong(aryId[i]);
		}
		return lAryId;
	}

	/**
	 * 根据一串逗号分隔的字符串取得字符串形数组
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static String[] getStringAryByStr(APIRequest request, String key) {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return null;
		String[] aryId = str.split(",");
		String[] lAryId = new String[aryId.length];
		for (int i = 0; i < aryId.length; i++) {
			lAryId[i] = (aryId[i]);
		}
		return lAryId;
	}

	/**
	 * 从Request中取得long值,如果无值则返回缺省值
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static long getLong(APIRequest request, String key, long defaultValue) {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Long.parseLong(str.trim());
	}

	/**
	 * 从Request中取得long值,如果无值则返回缺省值
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static Long getLong(APIRequest request, String key, Long defaultValue) {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Long.parseLong(str.trim());
	}

	/**
	 * 从Request中取得float值
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static float getFloat(APIRequest request, String key) {
		return getFloat(request, key, 0);
	}

	/**
	 * 从Request中取得float值,如无值则返回缺省值
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static float getFloat(APIRequest request, String key, float defaultValue) {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Float.parseFloat(request.getParameter(key));
	}

	/**
	 * 从Request中取得boolean值,如无值则返回缺省值 false, 如值为数字1，则返回true
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static boolean getBoolean(APIRequest request, String key) {
		return getBoolean(request, key, false);
	}

	/**
	 * 从Request中取得boolean值 对字符串,如无值则返回缺省值, 如值为数字1，则返回true
	 * 
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static boolean getBoolean(APIRequest request, String key, boolean defaultValue) {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		if (StringUtil.isNumeric(str))
			return (Integer.parseInt(str) == 1 ? true : false);
		return Boolean.parseBoolean(str);
	}

	/**
	 * 从Request中取得boolean值,如无值则返回缺省值 0
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static Short getShort(APIRequest request, String key) {
		return getShort(request, key, (short) 0);
	}

	/**
	 * 从Request中取得Short值 对字符串,如无值则返回缺省值
	 * 
	 * @param request
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static Short getShort(APIRequest request, String key, Short defaultValue) {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return defaultValue;
		return Short.parseShort(str);
	}

	/**
	 * 从Request中取得Date值,如无值则返回缺省值,如有值则返回 yyyy-MM-dd HH:mm:ss 格式的日期,或者自定义格式的日期
	 * 
	 * @param request
	 * @param key
	 * @param style
	 * @return
	 * @throws ParseException
	 */
	public static Date getDate(APIRequest request, String key, String style) throws ParseException {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return null;
		if (StringUtil.isEmpty(style))
			style = StringPool.DATE_FORMAT_DATETIME;
		return (Date) DateFormatUtil.parse(str, style);
	}

	/**
	 * 从Request中取得Date值,如无值则返回缺省值null, 如果有值则返回 yyyy-MM-dd 格式的日期
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws ParseException
	 */
	public static Date getDate(APIRequest request, String key) throws ParseException {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return null;
		return (Date) DateFormatUtil.parseDate(str);

	}

	/**
	 * 从Request中取得Date值,如无值则返回缺省值 <br/>
	 * 如有值则返回 yyyy-MM-dd HH:mm:ss 格式的日期
	 * 
	 * @param request
	 * @param key
	 * @return
	 * @throws ParseException
	 */
	public static Date getTimestamp(APIRequest request, String key) throws ParseException {
		String str = request.getParameter(key);
		if (StringUtil.isEmpty(str))
			return null;
		return DateFormatUtil.parseDateTime(str);
	}
	
	/**
	 * 根据参数名称前缀获取参数值，返回map。
	 * 
	 * <pre>
	 * 如：prefix=attr_
	 * request：attr_xl、attr_gl
	 * 返回：{xl:'本科',gl:2}
	 * </pre>
	 * 
	 * @param request
	 * @param prefix
	 * @return
	 */
	public static Map<String, Object> getMapByProfix(APIRequest request, String prefix) {
		List<APIRequestParameter> paramters = request.getParameters();
		Map<String,Object> result = new HashMap<String,Object>();
		if(BeanUtils.isEmpty(paramters)) {
			return result;
		}
		
		for (APIRequestParameter paramter : paramters) {
			if(paramter.getKey().startsWith(prefix)){
				String values = paramter.getValue();
	        	result.put(paramter.getKey().replace(prefix, ""), values);
			}
		}
		
		return result;
	}
	
	//###################### HttpServletRequest
	
	/**
	 * 获取IP地址 不使用request.getRemoteAddr();的原因是有可能用户使用了代理软件方式避免真实IP地址,<br>
	 * 
	 * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值，究竟哪个才是真正的用户端的真实IP呢？
	 * 答案是取X-Forwarded-For中第一个非unknown的有效IP字符串。
	 * 
	 * 如：X-Forwarded-For：192.168.1.110,192.168.1.120,192.168.1.130,192.168.1.100
	 * 
	 * 用户真实IP为： 192.168.1.110
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		return getIpAddrByHttpServletRequest(request);
	}
	
	public static String getIpAddrByHttpServletRequest(HttpServletRequest request) {
		if(BeanUtils.isEmpty(request)) {
			return "未获得request";
		}
		String ipAddress = request.getHeader("X-Forwarded-For");
		if (StringUtil.isBlank(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("X-Real-IP");
		}
		if (StringUtil.isBlank(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("Proxy-Client-IP");
		}
		if (StringUtil.isBlank(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("WL-Proxy-Client-IP");
		}
		if (StringUtil.isBlank(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("HTTP_CLIENT_IP");
		}
		if (StringUtil.isBlank(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (StringUtil.isBlank(ipAddress) || "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getRemoteAddr();
			if ("127.0.0.1".equals(ipAddress) || "0:0:0:0:0:0:0:1".equals(ipAddress)) {
				InetAddress inet = null; // 根据网卡取本机配置的IP
				try {
					inet = InetAddress.getLocalHost();
					ipAddress = inet.getHostAddress();
				} catch (UnknownHostException e) {
				}
			}
		}
		// 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
		if (StringUtil.isNotBlank(ipAddress) && ipAddress.length() > 15) { // "***.***.***.***".length()=15
			if (ipAddress.indexOf(",") > 0)
				ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
		}
		return ipAddress;
	}
	
}
