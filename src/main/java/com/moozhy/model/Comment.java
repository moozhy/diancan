package com.moozhy.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 *  @author 陆逊
 *
 * desc:
 */
@Entity
@Data
@DynamicUpdate
@DynamicInsert
public class Comment {

    @Id
    @GeneratedValue
    private int commentId;
    private String openid;
    private String name;
    private String avatarUrl;//头像
    private String content;
    private Date createTime;



}
