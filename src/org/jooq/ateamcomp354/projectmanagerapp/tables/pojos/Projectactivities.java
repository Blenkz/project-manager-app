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
public class Projectactivities implements Serializable {

	private static final long serialVersionUID = -1546262596;

	private Integer projectActivitiesId;
	private Integer projectId;
	private Integer activityId;

	public Projectactivities() {}

	public Projectactivities(Projectactivities value) {
		this.projectActivitiesId = value.projectActivitiesId;
		this.projectId = value.projectId;
		this.activityId = value.activityId;
	}

	public Projectactivities(
		Integer projectActivitiesId,
		Integer projectId,
		Integer activityId
	) {
		this.projectActivitiesId = projectActivitiesId;
		this.projectId = projectId;
		this.activityId = activityId;
	}

	public Integer getProjectActivitiesId() {
		return this.projectActivitiesId;
	}

	public void setProjectActivitiesId(Integer projectActivitiesId) {
		this.projectActivitiesId = projectActivitiesId;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
}