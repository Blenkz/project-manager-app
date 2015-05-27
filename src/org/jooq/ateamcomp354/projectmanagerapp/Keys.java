/**
 * This class is generated by jOOQ
 */
package org.jooq.ateamcomp354.projectmanagerapp;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.ateamcomp354.projectmanagerapp.tables.ActivityTable;
import org.jooq.ateamcomp354.projectmanagerapp.tables.ProjectTable;
import org.jooq.ateamcomp354.projectmanagerapp.tables.UseractivitiesTable;
import org.jooq.ateamcomp354.projectmanagerapp.tables.UsersTable;
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.ActivityRecord;
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.ProjectRecord;
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.UseractivitiesRecord;
import org.jooq.ateamcomp354.projectmanagerapp.tables.records.UsersRecord;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code></code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<ActivityRecord> PK_ACTIVITY = UniqueKeys0.PK_ACTIVITY;
	public static final UniqueKey<ProjectRecord> PK_PROJECT = UniqueKeys0.PK_PROJECT;
	public static final UniqueKey<UsersRecord> PK_USERS = UniqueKeys0.PK_USERS;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<ActivityRecord, ProjectRecord> FK_ACTIVITY_PROJECT_1 = ForeignKeys0.FK_ACTIVITY_PROJECT_1;
	public static final ForeignKey<ProjectRecord, UsersRecord> FK_PROJECT_USERS_1 = ForeignKeys0.FK_PROJECT_USERS_1;
	public static final ForeignKey<UseractivitiesRecord, ActivityRecord> FK_USERACTIVITIES_ACTIVITY_1 = ForeignKeys0.FK_USERACTIVITIES_ACTIVITY_1;
	public static final ForeignKey<UseractivitiesRecord, UsersRecord> FK_USERACTIVITIES_USERS_1 = ForeignKeys0.FK_USERACTIVITIES_USERS_1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<ActivityRecord> PK_ACTIVITY = createUniqueKey(ActivityTable.ACTIVITY, ActivityTable.ACTIVITY.ID);
		public static final UniqueKey<ProjectRecord> PK_PROJECT = createUniqueKey(ProjectTable.PROJECT, ProjectTable.PROJECT.ID);
		public static final UniqueKey<UsersRecord> PK_USERS = createUniqueKey(UsersTable.USERS, UsersTable.USERS.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<ActivityRecord, ProjectRecord> FK_ACTIVITY_PROJECT_1 = createForeignKey(org.jooq.ateamcomp354.projectmanagerapp.Keys.PK_PROJECT, ActivityTable.ACTIVITY, ActivityTable.ACTIVITY.PROJECT_ID);
		public static final ForeignKey<ProjectRecord, UsersRecord> FK_PROJECT_USERS_1 = createForeignKey(org.jooq.ateamcomp354.projectmanagerapp.Keys.PK_USERS, ProjectTable.PROJECT, ProjectTable.PROJECT.PROJECT_MANAGER_ID);
		public static final ForeignKey<UseractivitiesRecord, ActivityRecord> FK_USERACTIVITIES_ACTIVITY_1 = createForeignKey(org.jooq.ateamcomp354.projectmanagerapp.Keys.PK_ACTIVITY, UseractivitiesTable.USERACTIVITIES, UseractivitiesTable.USERACTIVITIES.ACTIVITY_ID);
		public static final ForeignKey<UseractivitiesRecord, UsersRecord> FK_USERACTIVITIES_USERS_1 = createForeignKey(org.jooq.ateamcomp354.projectmanagerapp.Keys.PK_USERS, UseractivitiesTable.USERACTIVITIES, UseractivitiesTable.USERACTIVITIES.USER_ID);
	}
}
