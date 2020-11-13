package com.sino.pojo;

import java.io.Serializable;
import java.util.Date;

public class UmsMember implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.id
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.member_level_id
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Long memberLevelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.username
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.password
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.nickname
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.phone
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.status
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.create_time
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.icon
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.gender
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.birthday
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.city
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.job
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.personalized_signature
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private String personalizedSignature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.source_type
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Integer sourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.integration
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Integer integration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.growth
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Integer growth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.luckey_count
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Integer luckeyCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.history_integration
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private Integer historyIntegration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.id
     *
     * @return the value of ums_member.id
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.id
     *
     * @param id the value for ums_member.id
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.member_level_id
     *
     * @return the value of ums_member.member_level_id
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.member_level_id
     *
     * @param memberLevelId the value for ums_member.member_level_id
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.username
     *
     * @return the value of ums_member.username
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.username
     *
     * @param username the value for ums_member.username
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.password
     *
     * @return the value of ums_member.password
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.password
     *
     * @param password the value for ums_member.password
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.nickname
     *
     * @return the value of ums_member.nickname
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.nickname
     *
     * @param nickname the value for ums_member.nickname
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.phone
     *
     * @return the value of ums_member.phone
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.phone
     *
     * @param phone the value for ums_member.phone
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.status
     *
     * @return the value of ums_member.status
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.status
     *
     * @param status the value for ums_member.status
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.create_time
     *
     * @return the value of ums_member.create_time
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.create_time
     *
     * @param createTime the value for ums_member.create_time
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.icon
     *
     * @return the value of ums_member.icon
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.icon
     *
     * @param icon the value for ums_member.icon
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.gender
     *
     * @return the value of ums_member.gender
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.gender
     *
     * @param gender the value for ums_member.gender
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.birthday
     *
     * @return the value of ums_member.birthday
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.birthday
     *
     * @param birthday the value for ums_member.birthday
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.city
     *
     * @return the value of ums_member.city
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.city
     *
     * @param city the value for ums_member.city
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.job
     *
     * @return the value of ums_member.job
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.job
     *
     * @param job the value for ums_member.job
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.personalized_signature
     *
     * @return the value of ums_member.personalized_signature
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.personalized_signature
     *
     * @param personalizedSignature the value for ums_member.personalized_signature
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.source_type
     *
     * @return the value of ums_member.source_type
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.source_type
     *
     * @param sourceType the value for ums_member.source_type
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.integration
     *
     * @return the value of ums_member.integration
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.integration
     *
     * @param integration the value for ums_member.integration
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.growth
     *
     * @return the value of ums_member.growth
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.growth
     *
     * @param growth the value for ums_member.growth
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.luckey_count
     *
     * @return the value of ums_member.luckey_count
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.luckey_count
     *
     * @param luckeyCount the value for ums_member.luckey_count
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.history_integration
     *
     * @return the value of ums_member.history_integration
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.history_integration
     *
     * @param historyIntegration the value for ums_member.history_integration
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", icon=").append(icon);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", city=").append(city);
        sb.append(", job=").append(job);
        sb.append(", personalizedSignature=").append(personalizedSignature);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", luckeyCount=").append(luckeyCount);
        sb.append(", historyIntegration=").append(historyIntegration);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}