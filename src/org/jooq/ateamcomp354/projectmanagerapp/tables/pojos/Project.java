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

	private static final long serialVersionUID = -2003978628;

	private Integer id;
	private String  projectName;
	private String  description;
	private Boolean completed;

	public Project() {}

	public Project(Project value) {
		this.id = value.id;
		this.projectName = value.projectName;
		this.description = value.description;
		this.completed = value.completed;
	}

	public Project(
		Integer id,
		String  projectName,
		String  description,
		Boolean completed
	) {
		this.id = id;
		this.projectName = projectName;
		this.description = description;
		this.completed = completed;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getCompleted() {
		return this.completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
}
