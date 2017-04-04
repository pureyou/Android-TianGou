package com.xiao91.sky.utils;

/**
 * URL地址
 * Created by xiao on 2017/1/3 0003.
 */

public class TGUrls {

    // 主机地址
    public static final String HOST_URL = "http://192.168.1.102/Sky/Public/?service=";

    // 类型:1.推荐
    public static final String RECOMMEND = "recommend";
    // 2.段子
    public static final String JOKE = "joke";
    // 3.内涵图
    public static final String JOKE_IMAGE = "joke_image";
    // 4.美女高清图
    public static final String BEAUTI_GIRL = "beauti_girl";
    // 5.故事
    public static final String STORY = "story";
    // 6.漫画
    public static final String CARICATURE = "caricature";
    // 7.视频
    public static final String VIDEO = "video";

    // 图片地址
    public static final String IMAGE_URL = "http://192.168.1.102/Sky/upload/";

    // 登陆
    public static final String USER_LOGIN = HOST_URL + "User.Login";

    // 手机号注册
    public static final String USER_REGISTER_PHONE = HOST_URL + "User.RegisterWithPhone";

    // 更新用户信息
    public static final String USER_UPDATE_INFO = HOST_URL + "User.UpdateUserInfo";

    // 上传用户头像
    public static final String USER_PHOTO = HOST_URL + "User.UploadUserPhoto";

    // 首页请求所以内容
    public static final String CONTENT_ITEM = HOST_URL + "Content.GetContent";

    // 更多数据
    public static final  String CONTENT_MORE = HOST_URL + "Content.GetMore";

    // 更新点赞
    public static final String CONTENT_UPDATE_GOOD_COUNT = HOST_URL + "Content.UpdateBadCount";

    // 被踩
    public static final String CONTENT_UPDATE_BAD_COUNT = HOST_URL + "Content.UpdateGoodCount";

    // 获取最新和最热门评论
    public static final String COMMENT_HOT_NEW = HOST_URL + "Comment.GetHotAndNewComment";

    // 添加评论
    public static final String COMMENT_ADD = HOST_URL + "Comment.AddComment";

    // 更多最新评论
    public static final String COMMENT_MORE_COMMENT = HOST_URL + "Comment.GetMoreNewComment";

    // 用户评论被点赞次数
    public static final String COMMENT_GOOD_COUNT = HOST_URL + "Comment.UpdateCommentGoodCount";

    // Android信息
    public static final String ANDROID_INFO = HOST_URL + "Android.GetApkInfo";

    // 添加关注
    public static final String FOCUS_ADD = HOST_URL + "Focus.AddFocus";

    // 取消关注
    public static final String FOCUS_CANCEL = HOST_URL + "Focus.CancelFocus";

}