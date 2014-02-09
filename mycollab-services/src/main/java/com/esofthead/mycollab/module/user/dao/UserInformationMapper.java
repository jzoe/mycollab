package com.esofthead.mycollab.module.user.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.user.domain.UserInformation;
import com.esofthead.mycollab.module.user.domain.UserInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInformationMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int countByExample(UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int deleteByExample(UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int insert(UserInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int insertSelective(UserInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    List<UserInformation> selectByExample(UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    UserInformation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int updateByExampleSelective(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int updateByExample(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    int updateByPrimaryKeySelective(UserInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    Integer insertAndReturnKey(UserInformation value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user_information
     *
     * @mbggenerated Sun Feb 09 16:15:21 ICT 2014
     */
    void massUpdateWithSession(@Param("record") UserInformation record, @Param("primaryKeys") List primaryKeys);
}