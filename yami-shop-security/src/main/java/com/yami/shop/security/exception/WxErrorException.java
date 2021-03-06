/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.security.exception;

/**
 * 密码不正确
 */
public class WxErrorException extends YamiAuth2Exception{
    public WxErrorException(String msg) {
        super(msg);
    }

    @Override
    public String getOAuth2ErrorCode() {
        return "wx_error_exception";
    }
}
