package com.moozhy.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author 陆逊
 */
@Data
@Entity
@DynamicUpdate
@DynamicInsert
public class Picture {

    @Id
    @GeneratedValue
    private Integer picId;
    private String picUrl;
    private String picMessage;
    private Date picCreate;
}
