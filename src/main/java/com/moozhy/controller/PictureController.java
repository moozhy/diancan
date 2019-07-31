package com.moozhy.controller;

import com.moozhy.exception.SellException;
import com.moozhy.form.PictureForm;
import com.moozhy.model.Picture;
import com.moozhy.pojo.vo.ResultVO;
import com.moozhy.repository.PictureRepository;
import com.moozhy.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * @author 陆逊
 * <p>
 * 用户相关
 */
@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Autowired
    PictureRepository repository;


    @GetMapping("/getAll")
    public ResultVO getUserInfo() {
        List<Picture> pictures = repository.findAll();
        return ResultVOUtil.success(pictures);
    }

    /**
     * 页面相关
     *
     * @param map
     * @return
     */
    @GetMapping("/list")
    public ModelAndView list(Map<String, Object> map) {
        List<Picture> pictures = repository.findAll();
        map.put("categoryList", pictures);
        return new ModelAndView("picture/list", map);
    }

    /**
     * 图片详情
     *
     * @param picId
     * @param map
     * @return
     */
    @GetMapping("/index")
    public ModelAndView index(@RequestParam(value = "picId", required = false) Integer picId,
                              Map<String, Object> map) {
        Picture picture = repository.findByPicId(picId);
        map.put("category", picture);

        return new ModelAndView("picture/index", map);
    }

    /**
     * 保存/更新
     */
    @PostMapping("/save")
    public ModelAndView save(@Valid PictureForm form,
                             BindingResult bindingResult,
                             Map<String, Object> map) {
        log.info("SellerForm={}", form);
        if (bindingResult.hasErrors()) {
            map.put("msg", bindingResult.getFieldError().getDefaultMessage());
            map.put("url", "/sell/picture/index");
            return new ModelAndView("common/error", map);
        }
        Picture picture = new Picture();
        try {
            if (form.getPicId() != null) {
                picture = repository.findByPicId(form.getPicId());
            }
            BeanUtils.copyProperties(form, picture);
            repository.save(picture);
        } catch (SellException e) {
            map.put("msg", e.getMessage());
            map.put("url", "/sell/picture/index");
            return new ModelAndView("common/error", map);
        }

        map.put("url", "/sell/picture/list");
        return new ModelAndView("common/success", map);
    }


    /**
     * 图片删除
     *
     * @param picId
     * @param map
     * @return
     */
    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam(value = "picId") Integer picId,
                               Map<String, Object> map) {
        Picture picture = repository.findByPicId(picId);
        if (picture != null) {
            try{
                repository.delete(picId);
            }catch (Exception e){
                map.put("msg", e.getMessage());
                map.put("url", "/sell/picture/list");
                return new ModelAndView("common/error", map);
            }
        }

        map.put("url", "/sell/picture/list");
        return new ModelAndView("common/success", map);
    }
}
