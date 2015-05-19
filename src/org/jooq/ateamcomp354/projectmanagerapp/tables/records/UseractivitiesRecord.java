/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.ateamcomp354.projectmanagerapp.tables.Useractivities;
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
public class UseractivitiesRecord extends UpdatableRecordImpl<UseractivitiesRecord> implements Record2<Integer, Integer> {

	private static final long serialVersionUID = 377694326;

	/**
	 * Setter for <code>userActivities.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>userActivities.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>userActivities.user_id</code>.
	 */
	public void setUserId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>userActivities.user_id</code>.
	 */
	public Integer getUserId() {
		return (Integer) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Useractivities.USERACTIVITIES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Useractivities.USERACTIVITIES.USER_ID;
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
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UseractivitiesRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UseractivitiesRecord value2(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UseractivitiesRecord values(Integer value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UseractivitiesRecord
	 */
	public UseractivitiesRecord() {
		super(Useractivities.USERACTIVITIES);
	}

	/**
	 * Create a detached, initialised UseractivitiesRecord
	 */
	public UseractivitiesRecord(Integer id, Integer userId) {
		super(Useractivities.USERACTIVITIES);

		setValue(0, id);
		setValue(1, userId);
	}
}
