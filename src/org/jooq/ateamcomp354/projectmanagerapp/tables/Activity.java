/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.ateamcomp354.projectmanagerapp.DefaultSchema;
import org.jooq.ateamcomp354.projectmanagerapp.Keys;
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.ActivityRecord;
import org.jooq.impl.TableImpl;


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
public class Activity extends TableImpl<ActivityRecord> {

	private static final long serialVersionUID = -72609644;

	/**
	 * The reference instance of <code>activity</code>
	 */
	public static final Activity ACTIVITY = new Activity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ActivityRecord> getRecordType() {
		return ActivityRecord.class;
	}

	/**
	 * The column <code>activity.id</code>.
	 */
	public final TableField<ActivityRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activity.project_id</code>.
	 */
	public final TableField<ActivityRecord, Integer> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activity.earliest_start</code>.
	 */
	public final TableField<ActivityRecord, Integer> EARLIEST_START = createField("earliest_start", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activity.earliest_finish</code>.
	 */
	public final TableField<ActivityRecord, Integer> EARLIEST_FINISH = createField("earliest_finish", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activity.label</code>.
	 */
	public final TableField<ActivityRecord, String> LABEL = createField("label", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>activity.latest_start</code>.
	 */
	public final TableField<ActivityRecord, Integer> LATEST_START = createField("latest_start", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activity.latest_finish</code>.
	 */
	public final TableField<ActivityRecord, Integer> LATEST_FINISH = createField("latest_finish", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activity.duration</code>.
	 */
	public final TableField<ActivityRecord, Integer> DURATION = createField("duration", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activity.max_duration</code>.
	 */
	public final TableField<ActivityRecord, Integer> MAX_DURATION = createField("max_duration", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>activity</code> table reference
	 */
	public Activity() {
		this("activity", null);
	}

	/**
	 * Create an aliased <code>activity</code> table reference
	 */
	public Activity(String alias) {
		this(alias, ACTIVITY);
	}

	private Activity(String alias, Table<ActivityRecord> aliased) {
		this(alias, aliased, null);
	}

	private Activity(String alias, Table<ActivityRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ActivityRecord> getPrimaryKey() {
		return Keys.PK_ACTIVITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ActivityRecord>> getKeys() {
		return Arrays.<UniqueKey<ActivityRecord>>asList(Keys.PK_ACTIVITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ActivityRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ActivityRecord, ?>>asList(Keys.FK_ACTIVITY_PROJECT_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Activity as(String alias) {
		return new Activity(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Activity rename(String name) {
		return new Activity(name, null);
	}
}
