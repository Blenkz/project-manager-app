/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Project implements Serializable {

	private static final long serialVersionUID = -673649129;

	private Integer id;
	private String  projectName;
	private Integer projectManagerId;
	private Integer memberListId;
	private Integer projectActivitiesId;

	public Project() {}

	public Project(Project value) {
		this.id = value.id;
		this.projectName = value.projectName;
		this.projectManagerId = value.projectManagerId;
		this.memberListId = value.memberListId;
		this.projectActivitiesId = value.projectActivitiesId;
	}

	public Project(
		Integer id,
		String  projectName,
		Integer projectManagerId,
		Integer memberListId,
		Integer projectActivitiesId
	) {
		this.id = id;
		this.projectName = projectName;
		this.projectManagerId = projectManagerId;
		this.memberListId = memberListId;
		this.projectActivitiesId = projectActivitiesId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getProjectManagerId() {
		return this.projectManagerId;
	}

	public void setProjectManagerId(Integer projectManagerId) {
		this.projectManagerId = projectManagerId;
	}

	public Integer getMemberListId() {
		return this.memberListId;
	}

	public void setMemberListId(Integer memberListId) {
		this.memberListId = memberListId;
	}

	public Integer getProjectActivitiesId() {
		return this.projectActivitiesId;
	}

	public void setProjectActivitiesId(Integer projectActivitiesId) {
		this.projectActivitiesId = projectActivitiesId;
	}
}
