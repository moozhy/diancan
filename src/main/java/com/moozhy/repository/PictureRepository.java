package com.moozhy.repository;

import com.moozhy.model.Picture;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 陆逊
 */
public interface PictureRepository extends JpaRepository<Picture, Integer> {
    Picture findByPicId(Integer picId);
}
