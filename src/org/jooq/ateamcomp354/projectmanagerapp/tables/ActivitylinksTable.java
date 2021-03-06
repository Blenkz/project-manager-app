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
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.ActivitylinksRecord;
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
public class ActivitylinksTable extends TableImpl<ActivitylinksRecord> {

	private static final long serialVersionUID = 1198090872;

	/**
	 * The reference instance of <code>activityLinks</code>
	 */
	public static final ActivitylinksTable ACTIVITYLINKS = new ActivitylinksTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ActivitylinksRecord> getRecordType() {
		return ActivitylinksRecord.class;
	}

	/**
	 * The column <code>activityLinks.id</code>.
	 */
	public final TableField<ActivitylinksRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activityLinks.from_activity_id</code>.
	 */
	public final TableField<ActivitylinksRecord, Integer> FROM_ACTIVITY_ID = createField("from_activity_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>activityLinks.to_activity_id</code>.
	 */
	public final TableField<ActivitylinksRecord, Integer> TO_ACTIVITY_ID = createField("to_activity_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>activityLinks</code> table reference
	 */
	public ActivitylinksTable() {
		this("activityLinks", null);
	}

	/**
	 * Create an aliased <code>activityLinks</code> table reference
	 */
	public ActivitylinksTable(String alias) {
		this(alias, ACTIVITYLINKS);
	}

	private ActivitylinksTable(String alias, Table<ActivitylinksRecord> aliased) {
		this(alias, aliased, null);
	}

	private ActivitylinksTable(String alias, Table<ActivitylinksRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ActivitylinksRecord> getPrimaryKey() {
		return Keys.PK_ACTIVITYLINKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ActivitylinksRecord>> getKeys() {
		return Arrays.<UniqueKey<ActivitylinksRecord>>asList(Keys.PK_ACTIVITYLINKS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ActivitylinksRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ActivitylinksRecord, ?>>asList(Keys.FK_ACTIVITYLINKS_ACTIVITY_2, Keys.FK_ACTIVITYLINKS_ACTIVITY_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActivitylinksTable as(String alias) {
		return new ActivitylinksTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ActivitylinksTable rename(String name) {
		return new ActivitylinksTable(name, null);
	}
}
