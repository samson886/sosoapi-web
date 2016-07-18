package com.dev.base.constant;

/**
 * 
		* <p>Title: 应用相关常量</p>
		* <p>Description: 描述（简要描述类的职责、实现方式、使用注意事项等）</p>
		* <p>CreateDate: 2015年7月11日下午2:11:31</p>
 */
public class AppConstants {
	/**
	 * 保存到session中的用户key
	 */
	public static final String SESSION_KEY_USER = "userInfo";
	
	/**
	 * 注册相关验证码
	 */
	public static final String CAPTCHA_REGIST = "regist";
	
	/**
	 * 登陆相关验证码
	 */
	public static final String CAPTCHA_LOGIN = "login";
	
	/**
	 * nginx配置文件中的的用户真实ip变量名
	 */
	public final static String NGINX_REMOTE_ADDR = "nginx_remote_addr";
}