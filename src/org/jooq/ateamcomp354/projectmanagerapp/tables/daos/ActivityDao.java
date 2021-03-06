/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables.daos;


import ateamcomp354.projectmanagerapp.model.Status;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.ateamcomp354.projectmanagerapp.tables.ActivityTable;
import org.jooq.ateamcomp354.projectmanagerapp.tables.pojos.Activity;
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.ActivityRecord;
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
public class ActivityDao extends DAOImpl<ActivityRecord, Activity, Integer> {

	/**
	 * Create a new ActivityDao without any configuration
	 */
	public ActivityDao() {
		super(ActivityTable.ACTIVITY, Activity.class);
	}

	/**
	 * Create a new ActivityDao with an attached configuration
	 */
	public ActivityDao(Configuration configuration) {
		super(ActivityTable.ACTIVITY, Activity.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(Activity object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<Activity> fetchById(Integer... values) {
		return fetch(ActivityTable.ACTIVITY.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public Activity fetchOneById(Integer value) {
		return fetchOne(ActivityTable.ACTIVITY.ID, value);
	}

	/**
	 * Fetch records that have <code>project_id IN (values)</code>
	 */
	public List<Activity> fetchByProjectId(Integer... values) {
		return fetch(ActivityTable.ACTIVITY.PROJECT_ID, values);
	}

	/**
	 * Fetch records that have <code>status IN (values)</code>
	 */
	public List<Activity> fetchByStatus(Status... values) {
		return fetch(ActivityTable.ACTIVITY.STATUS, values);
	}

	/**
	 * Fetch records that have <code>earliest_start IN (values)</code>
	 */
	public List<Activity> fetchByEarliestStart(Integer... values) {
		return fetch(ActivityTable.ACTIVITY.EARLIEST_START, values);
	}

	/**
	 * Fetch records that have <code>earliest_finish IN (values)</code>
	 */
	public List<Activity> fetchByEarliestFinish(Integer... values) {
		return fetch(ActivityTable.ACTIVITY.EARLIEST_FINISH, values);
	}

	/**
	 * Fetch records that have <code>label IN (values)</code>
	 */
	public List<Activity> fetchByLabel(String... values) {
		return fetch(ActivityTable.ACTIVITY.LABEL, values);
	}

	/**
	 * Fetch records that have <code>latest_start IN (values)</code>
	 */
	public List<Activity> fetchByLatestStart(Integer... values) {
		return fetch(ActivityTable.ACTIVITY.LATEST_START, values);
	}

	/**
	 * Fetch records that have <code>latest_finish IN (values)</code>
	 */
	public List<Activity> fetchByLatestFinish(Integer... values) {
		return fetch(ActivityTable.ACTIVITY.LATEST_FINISH, values);
	}

	/**
	 * Fetch records that have <code>duration IN (values)</code>
	 */
	public List<Activity> fetchByDuration(Integer... values) {
		return fetch(ActivityTable.ACTIVITY.DURATION, values);
	}

	/**
	 * Fetch records that have <code>max_duration IN (values)</code>
	 */
	public List<Activity> fetchByMaxDuration(Integer... values) {
		return fetch(ActivityTable.ACTIVITY.MAX_DURATION, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public List<Activity> fetchByDescription(String... values) {
		return fetch(ActivityTable.ACTIVITY.DESCRIPTION, values);
	}
}
