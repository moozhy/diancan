package com.moozhy.form;

import java.util.Date;

import lombok.Data;

/**
 * @author 陆逊
 */
@Data
public class PictureForm {

    private Integer picId;
    private String picUrl;
    private String picMessage;
    private Date picCreate;
}
