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
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.ProjectRecord;
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
public class Project extends TableImpl<ProjectRecord> {

	private static final long serialVersionUID = 482067173;

	/**
	 * The reference instance of <code>project</code>
	 */
	public static final Project PROJECT = new Project();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProjectRecord> getRecordType() {
		return ProjectRecord.class;
	}

	/**
	 * The column <code>project.id</code>.
	 */
	public final TableField<ProjectRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>project.project_name</code>.
	 */
	public final TableField<ProjectRecord, String> PROJECT_NAME = createField("project_name", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>project.project_manager_id</code>.
	 */
	public final TableField<ProjectRecord, Integer> PROJECT_MANAGER_ID = createField("project_manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>project.member_list_id</code>.
	 */
	public final TableField<ProjectRecord, Integer> MEMBER_LIST_ID = createField("member_list_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>project.project_activities_id</code>.
	 */
	public final TableField<ProjectRecord, Integer> PROJECT_ACTIVITIES_ID = createField("project_activities_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>project</code> table reference
	 */
	public Project() {
		this("project", null);
	}

	/**
	 * Create an aliased <code>project</code> table reference
	 */
	public Project(String alias) {
		this(alias, PROJECT);
	}

	private Project(String alias, Table<ProjectRecord> aliased) {
		this(alias, aliased, null);
	}

	private Project(String alias, Table<ProjectRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProjectRecord> getPrimaryKey() {
		return Keys.PK_PROJECT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProjectRecord>> getKeys() {
		return Arrays.<UniqueKey<ProjectRecord>>asList(Keys.PK_PROJECT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ProjectRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ProjectRecord, ?>>asList(Keys.FK_PROJECT_USERS_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Project as(String alias) {
		return new Project(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Project rename(String name) {
		return new Project(name, null);
	}
}