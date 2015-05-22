/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row;
import org.jooq.Row11;
import org.jooq.ateamcomp354.projectmanagerapp.tables.Activity;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ActivityRecord extends UpdatableRecordImpl<ActivityRecord> implements Record11<Integer, Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, String> {

	private static final long serialVersionUID = -76848006;

	/**
	 * Setter for <code>activity.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>activity.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>activity.project_id</code>.
	 */
	public void setProjectId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>activity.project_id</code>.
	 */
	public Integer getProjectId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>activity.status</code>.
	 */
	public void setStatus(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>activity.status</code>.
	 */
	public Integer getStatus() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>activity.earliest_start</code>.
	 */
	public void setEarliestStart(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>activity.earliest_start</code>.
	 */
	public Integer getEarliestStart() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>activity.earliest_finish</code>.
	 */
	public void setEarliestFinish(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>activity.earliest_finish</code>.
	 */
	public Integer getEarliestFinish() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>activity.label</code>.
	 */
	public void setLabel(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>activity.label</code>.
	 */
	public String getLabel() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>activity.latest_start</code>.
	 */
	public void setLatestStart(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>activity.latest_start</code>.
	 */
	public Integer getLatestStart() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>activity.latest_finish</code>.
	 */
	public void setLatestFinish(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>activity.latest_finish</code>.
	 */
	public Integer getLatestFinish() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>activity.duration</code>.
	 */
	public void setDuration(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>activity.duration</code>.
	 */
	public Integer getDuration() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>activity.max_duration</code>.
	 */
	public void setMaxDuration(Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>activity.max_duration</code>.
	 */
	public Integer getMaxDuration() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>activity.description</code>.
	 */
	public void setDescription(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>activity.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, String> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, String> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Activity.ACTIVITY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Activity.ACTIVITY.PROJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Activity.ACTIVITY.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Activity.ACTIVITY.EARLIEST_START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Activity.ACTIVITY.EARLIEST_FINISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Activity.ACTIVITY.LABEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return Activity.ACTIVITY.LATEST_START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Activity.ACTIVITY.LATEST_FINISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return Activity.ACTIVITY.DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return Activity.ACTIVITY.MAX_DURATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return Activity.ACTIVITY.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getEarliestStart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getEarliestFinish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getLabel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getLatestStart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getLatestFinish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getMaxDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value2(Integer value) {
		setProjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value3(Integer value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value4(Integer value) {
		setEarliestStart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value5(Integer value) {
		setEarliestFinish(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value6(String value) {
		setLabel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value7(Integer value) {
		setLatestStart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value8(Integer value) {
		setLatestFinish(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value9(Integer value) {
		setDuration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value10(Integer value) {
		setMaxDuration(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord value11(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivityRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6, Integer value7, Integer value8, Integer value9, Integer value10, String value11) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActivityRecord
	 */
	public ActivityRecord() {
		super(Activity.ACTIVITY);
	}

	/**
	 * Create a detached, initialised ActivityRecord
	 */
	public ActivityRecord(Integer id, Integer projectId, Integer status, Integer earliestStart, Integer earliestFinish, String label, Integer latestStart, Integer latestFinish, Integer duration, Integer maxDuration, String description) {
		super(Activity.ACTIVITY);

		setValue(0, id);
		setValue(1, projectId);
		setValue(2, status);
		setValue(3, earliestStart);
		setValue(4, earliestFinish);
		setValue(5, label);
		setValue(6, latestStart);
		setValue(7, latestFinish);
		setValue(8, duration);
		setValue(9, maxDuration);
		setValue(10, description);
	}
}
