package com.company.project.domain;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table post
 */
public class Post implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.Id
     *
     * @mbg.generated Tue Oct 02 21:45:37 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table post
     *
     * @mbg.generated Tue Oct 02 21:45:37 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.Id
     *
     * @return the value of post.Id
     *
     * @mbg.generated Tue Oct 02 21:45:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.Id
     *
     * @param id the value for post.Id
     *
     * @mbg.generated Tue Oct 02 21:45:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }
}