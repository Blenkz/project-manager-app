/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.ateamcomp354.projectmanagerapp.tables.ProjectTable;
import org.jooq.ateamcomp354.projectmanagerapp.tables.pojos.Project;
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.ProjectRecord;
import org.jooq.impl.DAOImpl;


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
public class ProjectDao extends DAOImpl<ProjectRecord, Project, Integer> {

	/**
	 * Create a new ProjectDao without any configuration
	 */
	public ProjectDao() {
		super(ProjectTable.PROJECT, Project.class);
	}

	/**
	 * Create a new ProjectDao with an attached configuration
	 */
	public ProjectDao(Configuration configuration) {
		super(ProjectTable.PROJECT, Project.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(Project object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<Project> fetchById(Integer... values) {
		return fetch(ProjectTable.PROJECT.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public Project fetchOneById(Integer value) {
		return fetchOne(ProjectTable.PROJECT.ID, value);
	}

	/**
	 * Fetch records that have <code>project_name IN (values)</code>
	 */
	public List<Project> fetchByProjectName(String... values) {
		return fetch(ProjectTable.PROJECT.PROJECT_NAME, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public List<Project> fetchByDescription(String... values) {
		return fetch(ProjectTable.PROJECT.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>completed IN (values)</code>
	 */
	public List<Project> fetchByCompleted(Boolean... values) {
		return fetch(ProjectTable.PROJECT.COMPLETED, values);
	}
}
