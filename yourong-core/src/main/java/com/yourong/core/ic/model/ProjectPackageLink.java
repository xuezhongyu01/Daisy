package com.yourong.core.ic.model;

import com.yourong.common.domain.AbstractBaseObject;

public class ProjectPackageLink extends AbstractBaseObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1142050947737524385L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ic_project_package_link.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ic_project_package_link.project_package_id
     *
     * @mbggenerated
     */
    private Long projectPackageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ic_project_package_link.project_id
     *
     * @mbggenerated
     */
    private Long projectId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ic_project_package_link.id
     *
     * @return the value of ic_project_package_link.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ic_project_package_link.id
     *
     * @param id the value for ic_project_package_link.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ic_project_package_link.project_package_id
     *
     * @return the value of ic_project_package_link.project_package_id
     *
     * @mbggenerated
     */
    public Long getProjectPackageId() {
        return projectPackageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ic_project_package_link.project_package_id
     *
     * @param projectPackageId the value for ic_project_package_link.project_package_id
     *
     * @mbggenerated
     */
    public void setProjectPackageId(Long projectPackageId) {
        this.projectPackageId = projectPackageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ic_project_package_link.project_id
     *
     * @return the value of ic_project_package_link.project_id
     *
     * @mbggenerated
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ic_project_package_link.project_id
     *
     * @param projectId the value for ic_project_package_link.project_id
     *
     * @mbggenerated
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}