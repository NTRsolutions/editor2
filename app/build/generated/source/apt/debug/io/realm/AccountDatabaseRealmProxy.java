package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.LinkView;
import io.realm.internal.OsObject;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AccountDatabaseRealmProxy extends org.fossasia.phimpme.data.local.AccountDatabase
    implements RealmObjectProxy, AccountDatabaseRealmProxyInterface {

    static final class AccountDatabaseColumnInfo extends ColumnInfo {
        long nameIndex;
        long usernameIndex;
        long userIdIndex;
        long tokenIndex;
        long tokenSecretIndex;
        long passwordIndex;
        long serverUrlIndex;
        long accountnameIndex;
        long secretIndex;

        AccountDatabaseColumnInfo(SharedRealm realm, Table table) {
            super(9);
            this.nameIndex = addColumnDetails(table, "name", RealmFieldType.STRING);
            this.usernameIndex = addColumnDetails(table, "username", RealmFieldType.STRING);
            this.userIdIndex = addColumnDetails(table, "userId", RealmFieldType.STRING);
            this.tokenIndex = addColumnDetails(table, "token", RealmFieldType.STRING);
            this.tokenSecretIndex = addColumnDetails(table, "tokenSecret", RealmFieldType.STRING);
            this.passwordIndex = addColumnDetails(table, "password", RealmFieldType.STRING);
            this.serverUrlIndex = addColumnDetails(table, "serverUrl", RealmFieldType.STRING);
            this.accountnameIndex = addColumnDetails(table, "accountname", RealmFieldType.STRING);
            this.secretIndex = addColumnDetails(table, "secret", RealmFieldType.STRING);
        }

        AccountDatabaseColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AccountDatabaseColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AccountDatabaseColumnInfo src = (AccountDatabaseColumnInfo) rawSrc;
            final AccountDatabaseColumnInfo dst = (AccountDatabaseColumnInfo) rawDst;
            dst.nameIndex = src.nameIndex;
            dst.usernameIndex = src.usernameIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.tokenIndex = src.tokenIndex;
            dst.tokenSecretIndex = src.tokenSecretIndex;
            dst.passwordIndex = src.passwordIndex;
            dst.serverUrlIndex = src.serverUrlIndex;
            dst.accountnameIndex = src.accountnameIndex;
            dst.secretIndex = src.secretIndex;
        }
    }

    private AccountDatabaseColumnInfo columnInfo;
    private ProxyState<org.fossasia.phimpme.data.local.AccountDatabase> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("name");
        fieldNames.add("username");
        fieldNames.add("userId");
        fieldNames.add("token");
        fieldNames.add("tokenSecret");
        fieldNames.add("password");
        fieldNames.add("serverUrl");
        fieldNames.add("accountname");
        fieldNames.add("secret");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    AccountDatabaseRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AccountDatabaseColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<org.fossasia.phimpme.data.local.AccountDatabase>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'name' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$username() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.usernameIndex);
    }

    @Override
    public void realmSet$username(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.usernameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.usernameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.usernameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.usernameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$token() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenIndex);
    }

    @Override
    public void realmSet$token(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tokenIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tokenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tokenIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tokenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tokenSecret() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenSecretIndex);
    }

    @Override
    public void realmSet$tokenSecret(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tokenSecretIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tokenSecretIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tokenSecretIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tokenSecretIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$password() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwordIndex);
    }

    @Override
    public void realmSet$password(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwordIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwordIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwordIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwordIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$serverUrl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.serverUrlIndex);
    }

    @Override
    public void realmSet$serverUrl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.serverUrlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.serverUrlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.serverUrlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.serverUrlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$accountname() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.accountnameIndex);
    }

    @Override
    public void realmSet$accountname(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.accountnameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.accountnameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.accountnameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.accountnameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$secret() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.secretIndex);
    }

    @Override
    public void realmSet$secret(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.secretIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.secretIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.secretIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.secretIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("AccountDatabase")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("AccountDatabase");
            realmObjectSchema.add("name", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("username", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("token", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("tokenSecret", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("password", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("serverUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("accountname", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("secret", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("AccountDatabase");
    }

    public static AccountDatabaseColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_AccountDatabase")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'AccountDatabase' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_AccountDatabase");
        final long columnCount = table.getColumnCount();
        if (columnCount != 9) {
            if (columnCount < 9) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 9 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 9 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 9 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final AccountDatabaseColumnInfo columnInfo = new AccountDatabaseColumnInfo(sharedRealm, table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'name' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.nameIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field name");
            }
        }

        if (!columnTypes.containsKey("name")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'name' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("name") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'name' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.nameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"@PrimaryKey field 'name' does not support null values in the existing Realm file. Migrate using RealmObjectSchema.setNullable(), or mark the field as @Required.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("name"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'name' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("username")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'username' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("username") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'username' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.usernameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'username' is required. Either set @Required to field 'username' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("userId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'userId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("userId") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'userId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.userIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'userId' is required. Either set @Required to field 'userId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("token")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'token' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("token") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'token' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.tokenIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'token' is required. Either set @Required to field 'token' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("tokenSecret")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'tokenSecret' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("tokenSecret") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'tokenSecret' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.tokenSecretIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'tokenSecret' is required. Either set @Required to field 'tokenSecret' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("password")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'password' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("password") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'password' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.passwordIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'password' is required. Either set @Required to field 'password' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("serverUrl")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'serverUrl' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("serverUrl") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'serverUrl' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.serverUrlIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'serverUrl' is required. Either set @Required to field 'serverUrl' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("accountname")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'accountname' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("accountname") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'accountname' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.accountnameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'accountname' is required. Either set @Required to field 'accountname' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("secret")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'secret' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("secret") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'secret' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.secretIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'secret' is required. Either set @Required to field 'secret' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_AccountDatabase";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static org.fossasia.phimpme.data.local.AccountDatabase createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        org.fossasia.phimpme.data.local.AccountDatabase obj = null;
        if (update) {
            Table table = realm.getTable(org.fossasia.phimpme.data.local.AccountDatabase.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("name")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("name"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.AccountDatabase.class), false, Collections.<String> emptyList());
                    obj = new io.realm.AccountDatabaseRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("name")) {
                if (json.isNull("name")) {
                    obj = (io.realm.AccountDatabaseRealmProxy) realm.createObjectInternal(org.fossasia.phimpme.data.local.AccountDatabase.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.AccountDatabaseRealmProxy) realm.createObjectInternal(org.fossasia.phimpme.data.local.AccountDatabase.class, json.getString("name"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'name'.");
            }
        }
        if (json.has("username")) {
            if (json.isNull("username")) {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$username(null);
            } else {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$username((String) json.getString("username"));
            }
        }
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$userId(null);
            } else {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("token")) {
            if (json.isNull("token")) {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$token(null);
            } else {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$token((String) json.getString("token"));
            }
        }
        if (json.has("tokenSecret")) {
            if (json.isNull("tokenSecret")) {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$tokenSecret(null);
            } else {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$tokenSecret((String) json.getString("tokenSecret"));
            }
        }
        if (json.has("password")) {
            if (json.isNull("password")) {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$password(null);
            } else {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$password((String) json.getString("password"));
            }
        }
        if (json.has("serverUrl")) {
            if (json.isNull("serverUrl")) {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$serverUrl(null);
            } else {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$serverUrl((String) json.getString("serverUrl"));
            }
        }
        if (json.has("accountname")) {
            if (json.isNull("accountname")) {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$accountname(null);
            } else {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$accountname((String) json.getString("accountname"));
            }
        }
        if (json.has("secret")) {
            if (json.isNull("secret")) {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$secret(null);
            } else {
                ((AccountDatabaseRealmProxyInterface) obj).realmSet$secret((String) json.getString("secret"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static org.fossasia.phimpme.data.local.AccountDatabase createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        org.fossasia.phimpme.data.local.AccountDatabase obj = new org.fossasia.phimpme.data.local.AccountDatabase();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$name(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$name((String) reader.nextString());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("username")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$username(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$username((String) reader.nextString());
                }
            } else if (name.equals("userId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$userId(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$userId((String) reader.nextString());
                }
            } else if (name.equals("token")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$token(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$token((String) reader.nextString());
                }
            } else if (name.equals("tokenSecret")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$tokenSecret(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$tokenSecret((String) reader.nextString());
                }
            } else if (name.equals("password")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$password(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$password((String) reader.nextString());
                }
            } else if (name.equals("serverUrl")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$serverUrl(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$serverUrl((String) reader.nextString());
                }
            } else if (name.equals("accountname")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$accountname(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$accountname((String) reader.nextString());
                }
            } else if (name.equals("secret")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$secret(null);
                } else {
                    ((AccountDatabaseRealmProxyInterface) obj).realmSet$secret((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'name'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static org.fossasia.phimpme.data.local.AccountDatabase copyOrUpdate(Realm realm, org.fossasia.phimpme.data.local.AccountDatabase object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (org.fossasia.phimpme.data.local.AccountDatabase) cachedRealmObject;
        } else {
            org.fossasia.phimpme.data.local.AccountDatabase realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(org.fossasia.phimpme.data.local.AccountDatabase.class);
                long pkColumnIndex = table.getPrimaryKey();
                String value = ((AccountDatabaseRealmProxyInterface) object).realmGet$name();
                long rowIndex = Table.NO_MATCH;
                if (value == null) {
                    rowIndex = table.findFirstNull(pkColumnIndex);
                } else {
                    rowIndex = table.findFirstString(pkColumnIndex, value);
                }
                if (rowIndex != Table.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.AccountDatabase.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.AccountDatabaseRealmProxy();
                        cache.put(object, (RealmObjectProxy) realmObject);
                    } finally {
                        objectContext.clear();
                    }
                } else {
                    canUpdate = false;
                }
            }

            if (canUpdate) {
                return update(realm, realmObject, object, cache);
            } else {
                return copy(realm, object, update, cache);
            }
        }
    }

    public static org.fossasia.phimpme.data.local.AccountDatabase copy(Realm realm, org.fossasia.phimpme.data.local.AccountDatabase newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (org.fossasia.phimpme.data.local.AccountDatabase) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            org.fossasia.phimpme.data.local.AccountDatabase realmObject = realm.createObjectInternal(org.fossasia.phimpme.data.local.AccountDatabase.class, ((AccountDatabaseRealmProxyInterface) newObject).realmGet$name(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$username(((AccountDatabaseRealmProxyInterface) newObject).realmGet$username());
            ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$userId(((AccountDatabaseRealmProxyInterface) newObject).realmGet$userId());
            ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$token(((AccountDatabaseRealmProxyInterface) newObject).realmGet$token());
            ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$tokenSecret(((AccountDatabaseRealmProxyInterface) newObject).realmGet$tokenSecret());
            ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$password(((AccountDatabaseRealmProxyInterface) newObject).realmGet$password());
            ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$serverUrl(((AccountDatabaseRealmProxyInterface) newObject).realmGet$serverUrl());
            ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$accountname(((AccountDatabaseRealmProxyInterface) newObject).realmGet$accountname());
            ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$secret(((AccountDatabaseRealmProxyInterface) newObject).realmGet$secret());
            return realmObject;
        }
    }

    public static long insert(Realm realm, org.fossasia.phimpme.data.local.AccountDatabase object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(org.fossasia.phimpme.data.local.AccountDatabase.class);
        long tableNativePtr = table.getNativePtr();
        AccountDatabaseColumnInfo columnInfo = (AccountDatabaseColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.AccountDatabase.class);
        long pkColumnIndex = table.getPrimaryKey();
        String primaryKeyValue = ((AccountDatabaseRealmProxyInterface) object).realmGet$name();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$username = ((AccountDatabaseRealmProxyInterface)object).realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usernameIndex, rowIndex, realmGet$username, false);
        }
        String realmGet$userId = ((AccountDatabaseRealmProxyInterface)object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        }
        String realmGet$token = ((AccountDatabaseRealmProxyInterface)object).realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenIndex, rowIndex, realmGet$token, false);
        }
        String realmGet$tokenSecret = ((AccountDatabaseRealmProxyInterface)object).realmGet$tokenSecret();
        if (realmGet$tokenSecret != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenSecretIndex, rowIndex, realmGet$tokenSecret, false);
        }
        String realmGet$password = ((AccountDatabaseRealmProxyInterface)object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
        }
        String realmGet$serverUrl = ((AccountDatabaseRealmProxyInterface)object).realmGet$serverUrl();
        if (realmGet$serverUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.serverUrlIndex, rowIndex, realmGet$serverUrl, false);
        }
        String realmGet$accountname = ((AccountDatabaseRealmProxyInterface)object).realmGet$accountname();
        if (realmGet$accountname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accountnameIndex, rowIndex, realmGet$accountname, false);
        }
        String realmGet$secret = ((AccountDatabaseRealmProxyInterface)object).realmGet$secret();
        if (realmGet$secret != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.secretIndex, rowIndex, realmGet$secret, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(org.fossasia.phimpme.data.local.AccountDatabase.class);
        long tableNativePtr = table.getNativePtr();
        AccountDatabaseColumnInfo columnInfo = (AccountDatabaseColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.AccountDatabase.class);
        long pkColumnIndex = table.getPrimaryKey();
        org.fossasia.phimpme.data.local.AccountDatabase object = null;
        while (objects.hasNext()) {
            object = (org.fossasia.phimpme.data.local.AccountDatabase) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                String primaryKeyValue = ((AccountDatabaseRealmProxyInterface) object).realmGet$name();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, primaryKeyValue);
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$username = ((AccountDatabaseRealmProxyInterface)object).realmGet$username();
                if (realmGet$username != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.usernameIndex, rowIndex, realmGet$username, false);
                }
                String realmGet$userId = ((AccountDatabaseRealmProxyInterface)object).realmGet$userId();
                if (realmGet$userId != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
                }
                String realmGet$token = ((AccountDatabaseRealmProxyInterface)object).realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.tokenIndex, rowIndex, realmGet$token, false);
                }
                String realmGet$tokenSecret = ((AccountDatabaseRealmProxyInterface)object).realmGet$tokenSecret();
                if (realmGet$tokenSecret != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.tokenSecretIndex, rowIndex, realmGet$tokenSecret, false);
                }
                String realmGet$password = ((AccountDatabaseRealmProxyInterface)object).realmGet$password();
                if (realmGet$password != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
                }
                String realmGet$serverUrl = ((AccountDatabaseRealmProxyInterface)object).realmGet$serverUrl();
                if (realmGet$serverUrl != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.serverUrlIndex, rowIndex, realmGet$serverUrl, false);
                }
                String realmGet$accountname = ((AccountDatabaseRealmProxyInterface)object).realmGet$accountname();
                if (realmGet$accountname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.accountnameIndex, rowIndex, realmGet$accountname, false);
                }
                String realmGet$secret = ((AccountDatabaseRealmProxyInterface)object).realmGet$secret();
                if (realmGet$secret != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.secretIndex, rowIndex, realmGet$secret, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, org.fossasia.phimpme.data.local.AccountDatabase object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(org.fossasia.phimpme.data.local.AccountDatabase.class);
        long tableNativePtr = table.getNativePtr();
        AccountDatabaseColumnInfo columnInfo = (AccountDatabaseColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.AccountDatabase.class);
        long pkColumnIndex = table.getPrimaryKey();
        String primaryKeyValue = ((AccountDatabaseRealmProxyInterface) object).realmGet$name();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$username = ((AccountDatabaseRealmProxyInterface)object).realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usernameIndex, rowIndex, realmGet$username, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.usernameIndex, rowIndex, false);
        }
        String realmGet$userId = ((AccountDatabaseRealmProxyInterface)object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        String realmGet$token = ((AccountDatabaseRealmProxyInterface)object).realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenIndex, rowIndex, realmGet$token, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenIndex, rowIndex, false);
        }
        String realmGet$tokenSecret = ((AccountDatabaseRealmProxyInterface)object).realmGet$tokenSecret();
        if (realmGet$tokenSecret != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenSecretIndex, rowIndex, realmGet$tokenSecret, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenSecretIndex, rowIndex, false);
        }
        String realmGet$password = ((AccountDatabaseRealmProxyInterface)object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwordIndex, rowIndex, false);
        }
        String realmGet$serverUrl = ((AccountDatabaseRealmProxyInterface)object).realmGet$serverUrl();
        if (realmGet$serverUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.serverUrlIndex, rowIndex, realmGet$serverUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.serverUrlIndex, rowIndex, false);
        }
        String realmGet$accountname = ((AccountDatabaseRealmProxyInterface)object).realmGet$accountname();
        if (realmGet$accountname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.accountnameIndex, rowIndex, realmGet$accountname, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.accountnameIndex, rowIndex, false);
        }
        String realmGet$secret = ((AccountDatabaseRealmProxyInterface)object).realmGet$secret();
        if (realmGet$secret != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.secretIndex, rowIndex, realmGet$secret, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.secretIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(org.fossasia.phimpme.data.local.AccountDatabase.class);
        long tableNativePtr = table.getNativePtr();
        AccountDatabaseColumnInfo columnInfo = (AccountDatabaseColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.AccountDatabase.class);
        long pkColumnIndex = table.getPrimaryKey();
        org.fossasia.phimpme.data.local.AccountDatabase object = null;
        while (objects.hasNext()) {
            object = (org.fossasia.phimpme.data.local.AccountDatabase) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                String primaryKeyValue = ((AccountDatabaseRealmProxyInterface) object).realmGet$name();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$username = ((AccountDatabaseRealmProxyInterface)object).realmGet$username();
                if (realmGet$username != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.usernameIndex, rowIndex, realmGet$username, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.usernameIndex, rowIndex, false);
                }
                String realmGet$userId = ((AccountDatabaseRealmProxyInterface)object).realmGet$userId();
                if (realmGet$userId != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
                }
                String realmGet$token = ((AccountDatabaseRealmProxyInterface)object).realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.tokenIndex, rowIndex, realmGet$token, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.tokenIndex, rowIndex, false);
                }
                String realmGet$tokenSecret = ((AccountDatabaseRealmProxyInterface)object).realmGet$tokenSecret();
                if (realmGet$tokenSecret != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.tokenSecretIndex, rowIndex, realmGet$tokenSecret, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.tokenSecretIndex, rowIndex, false);
                }
                String realmGet$password = ((AccountDatabaseRealmProxyInterface)object).realmGet$password();
                if (realmGet$password != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.passwordIndex, rowIndex, false);
                }
                String realmGet$serverUrl = ((AccountDatabaseRealmProxyInterface)object).realmGet$serverUrl();
                if (realmGet$serverUrl != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.serverUrlIndex, rowIndex, realmGet$serverUrl, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.serverUrlIndex, rowIndex, false);
                }
                String realmGet$accountname = ((AccountDatabaseRealmProxyInterface)object).realmGet$accountname();
                if (realmGet$accountname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.accountnameIndex, rowIndex, realmGet$accountname, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.accountnameIndex, rowIndex, false);
                }
                String realmGet$secret = ((AccountDatabaseRealmProxyInterface)object).realmGet$secret();
                if (realmGet$secret != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.secretIndex, rowIndex, realmGet$secret, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.secretIndex, rowIndex, false);
                }
            }
        }
    }

    public static org.fossasia.phimpme.data.local.AccountDatabase createDetachedCopy(org.fossasia.phimpme.data.local.AccountDatabase realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        org.fossasia.phimpme.data.local.AccountDatabase unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (org.fossasia.phimpme.data.local.AccountDatabase)cachedObject.object;
            } else {
                unmanagedObject = (org.fossasia.phimpme.data.local.AccountDatabase)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new org.fossasia.phimpme.data.local.AccountDatabase();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$name(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$name());
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$username(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$username());
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$userId(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$userId());
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$token(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$token());
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$tokenSecret(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$tokenSecret());
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$password(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$password());
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$serverUrl(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$serverUrl());
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$accountname(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$accountname());
        ((AccountDatabaseRealmProxyInterface) unmanagedObject).realmSet$secret(((AccountDatabaseRealmProxyInterface) realmObject).realmGet$secret());
        return unmanagedObject;
    }

    static org.fossasia.phimpme.data.local.AccountDatabase update(Realm realm, org.fossasia.phimpme.data.local.AccountDatabase realmObject, org.fossasia.phimpme.data.local.AccountDatabase newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$username(((AccountDatabaseRealmProxyInterface) newObject).realmGet$username());
        ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$userId(((AccountDatabaseRealmProxyInterface) newObject).realmGet$userId());
        ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$token(((AccountDatabaseRealmProxyInterface) newObject).realmGet$token());
        ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$tokenSecret(((AccountDatabaseRealmProxyInterface) newObject).realmGet$tokenSecret());
        ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$password(((AccountDatabaseRealmProxyInterface) newObject).realmGet$password());
        ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$serverUrl(((AccountDatabaseRealmProxyInterface) newObject).realmGet$serverUrl());
        ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$accountname(((AccountDatabaseRealmProxyInterface) newObject).realmGet$accountname());
        ((AccountDatabaseRealmProxyInterface) realmObject).realmSet$secret(((AccountDatabaseRealmProxyInterface) newObject).realmGet$secret());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AccountDatabase = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{username:");
        stringBuilder.append(realmGet$username() != null ? realmGet$username() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{token:");
        stringBuilder.append(realmGet$token() != null ? realmGet$token() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tokenSecret:");
        stringBuilder.append(realmGet$tokenSecret() != null ? realmGet$tokenSecret() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{password:");
        stringBuilder.append(realmGet$password() != null ? realmGet$password() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{serverUrl:");
        stringBuilder.append(realmGet$serverUrl() != null ? realmGet$serverUrl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{accountname:");
        stringBuilder.append(realmGet$accountname() != null ? realmGet$accountname() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{secret:");
        stringBuilder.append(realmGet$secret() != null ? realmGet$secret() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDatabaseRealmProxy aAccountDatabase = (AccountDatabaseRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAccountDatabase.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAccountDatabase.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAccountDatabase.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
