/*
 * This file is generated by jOOQ.
*/
package ch.mytodo.jooq.codegen;


import ch.mytodo.jooq.codegen.tables.SchemaVersion;
import ch.mytodo.jooq.codegen.tables.ToDoList;
import ch.mytodo.jooq.codegen.tables.records.SchemaVersionRecord;
import ch.mytodo.jooq.codegen.tables.records.ToDoListRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ToDoListRecord, Long> IDENTITY_TO_DO_LIST = Identities0.IDENTITY_TO_DO_LIST;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ToDoListRecord> CONSTRAINT_F = UniqueKeys0.CONSTRAINT_F;
    public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ToDoListRecord, Long> IDENTITY_TO_DO_LIST = createIdentity(ToDoList.TO_DO_LIST, ToDoList.TO_DO_LIST.TO_DO_LIST_NO);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ToDoListRecord> CONSTRAINT_F = createUniqueKey(ToDoList.TO_DO_LIST, "CONSTRAINT_F", ToDoList.TO_DO_LIST.TO_DO_LIST_NO);
        public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "schema_version_pk", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
    }
}
