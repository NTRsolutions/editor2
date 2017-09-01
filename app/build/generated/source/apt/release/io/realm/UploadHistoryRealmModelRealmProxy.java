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

public class UploadHistoryRealmModelRealmProxy extends org.fossasia.phimpme.data.local.UploadHistoryRealmModel
    implements RealmObjectProxy, UploadHistoryRealmModelRealmProxyInterface {

    static final class UploadHistoryRealmModelColumnInfo extends ColumnInfo {
        long nameIndex;
        long pathnameIndex;
        long datetimeIndex;

        UploadHistoryRealmModelColumnInfo(SharedRealm realm, Table table) {
            super(3);
            this.nameIndex = addColumnDetails(table, "name", RealmFieldType.STRING);
            this.pathnameIndex = addColumnDetails(table, "pathname", RealmFieldType.STRING);
            this.datetimeIndex = addColumnDetails(table, "datetime", RealmFieldType.STRING);
        }

        UploadHistoryRealmModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UploadHistoryRealmModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UploadHistoryRealmModelColumnInfo src = (UploadHistoryRealmModelColumnInfo) rawSrc;
            final UploadHistoryRealmModelColumnInfo dst = (UploadHistoryRealmModelColumnInfo) rawDst;
            dst.nameIndex = src.nameIndex;
            dst.pathnameIndex = src.pathnameIndex;
            dst.datetimeIndex = src.datetimeIndex;
        }
    }

    private UploadHistoryRealmModelColumnInfo columnInfo;
    private ProxyState<org.fossasia.phimpme.data.local.UploadHistoryRealmModel> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("name");
        fieldNames.add("pathname");
        fieldNames.add("datetime");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    UploadHistoryRealmModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UploadHistoryRealmModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<org.fossasia.phimpme.data.local.UploadHistoryRealmModel>(this);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$pathname() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.pathnameIndex);
    }

    @Override
    public void realmSet$pathname(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.pathnameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.pathnameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.pathnameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.pathnameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$datetime() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.datetimeIndex);
    }

    @Override
    public void realmSet$datetime(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.datetimeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.datetimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.datetimeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.datetimeIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("UploadHistoryRealmModel")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("UploadHistoryRealmModel");
            realmObjectSchema.add("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("pathname", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("datetime", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("UploadHistoryRealmModel");
    }

    public static UploadHistoryRealmModelColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_UploadHistoryRealmModel")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'UploadHistoryRealmModel' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_UploadHistoryRealmModel");
        final long columnCount = table.getColumnCount();
        if (columnCount != 3) {
            if (columnCount < 3) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 3 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 3 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 3 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final UploadHistoryRealmModelColumnInfo columnInfo = new UploadHistoryRealmModelColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("name")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'name' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("name") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'name' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.nameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'name' is required. Either set @Required to field 'name' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("pathname")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'pathname' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("pathname") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'pathname' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.pathnameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'pathname' is required. Either set @Required to field 'pathname' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("datetime")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'datetime' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("datetime") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'datetime' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.datetimeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'datetime' is required. Either set @Required to field 'datetime' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_UploadHistoryRealmModel";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static org.fossasia.phimpme.data.local.UploadHistoryRealmModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        org.fossasia.phimpme.data.local.UploadHistoryRealmModel obj = realm.createObjectInternal(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class, true, excludeFields);
        if (json.has("name")) {
            if (json.isNull("name")) {
                ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$name(null);
            } else {
                ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("pathname")) {
            if (json.isNull("pathname")) {
                ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$pathname(null);
            } else {
                ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$pathname((String) json.getString("pathname"));
            }
        }
        if (json.has("datetime")) {
            if (json.isNull("datetime")) {
                ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$datetime(null);
            } else {
                ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$datetime((String) json.getString("datetime"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static org.fossasia.phimpme.data.local.UploadHistoryRealmModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        org.fossasia.phimpme.data.local.UploadHistoryRealmModel obj = new org.fossasia.phimpme.data.local.UploadHistoryRealmModel();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$name(null);
                } else {
                    ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$name((String) reader.nextString());
                }
            } else if (name.equals("pathname")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$pathname(null);
                } else {
                    ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$pathname((String) reader.nextString());
                }
            } else if (name.equals("datetime")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$datetime(null);
                } else {
                    ((UploadHistoryRealmModelRealmProxyInterface) obj).realmSet$datetime((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static org.fossasia.phimpme.data.local.UploadHistoryRealmModel copyOrUpdate(Realm realm, org.fossasia.phimpme.data.local.UploadHistoryRealmModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) cachedRealmObject;
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static org.fossasia.phimpme.data.local.UploadHistoryRealmModel copy(Realm realm, org.fossasia.phimpme.data.local.UploadHistoryRealmModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            org.fossasia.phimpme.data.local.UploadHistoryRealmModel realmObject = realm.createObjectInternal(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class, false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((UploadHistoryRealmModelRealmProxyInterface) realmObject).realmSet$name(((UploadHistoryRealmModelRealmProxyInterface) newObject).realmGet$name());
            ((UploadHistoryRealmModelRealmProxyInterface) realmObject).realmSet$pathname(((UploadHistoryRealmModelRealmProxyInterface) newObject).realmGet$pathname());
            ((UploadHistoryRealmModelRealmProxyInterface) realmObject).realmSet$datetime(((UploadHistoryRealmModelRealmProxyInterface) newObject).realmGet$datetime());
            return realmObject;
        }
    }

    public static long insert(Realm realm, org.fossasia.phimpme.data.local.UploadHistoryRealmModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        long tableNativePtr = table.getNativePtr();
        UploadHistoryRealmModelColumnInfo columnInfo = (UploadHistoryRealmModelColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        long rowIndex = OsObject.createRow(realm.sharedRealm, table);
        cache.put(object, rowIndex);
        String realmGet$name = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$pathname = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$pathname();
        if (realmGet$pathname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pathnameIndex, rowIndex, realmGet$pathname, false);
        }
        String realmGet$datetime = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$datetime();
        if (realmGet$datetime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.datetimeIndex, rowIndex, realmGet$datetime, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        long tableNativePtr = table.getNativePtr();
        UploadHistoryRealmModelColumnInfo columnInfo = (UploadHistoryRealmModelColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        org.fossasia.phimpme.data.local.UploadHistoryRealmModel object = null;
        while (objects.hasNext()) {
            object = (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = OsObject.createRow(realm.sharedRealm, table);
                cache.put(object, rowIndex);
                String realmGet$name = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
                }
                String realmGet$pathname = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$pathname();
                if (realmGet$pathname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.pathnameIndex, rowIndex, realmGet$pathname, false);
                }
                String realmGet$datetime = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$datetime();
                if (realmGet$datetime != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.datetimeIndex, rowIndex, realmGet$datetime, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, org.fossasia.phimpme.data.local.UploadHistoryRealmModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        long tableNativePtr = table.getNativePtr();
        UploadHistoryRealmModelColumnInfo columnInfo = (UploadHistoryRealmModelColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        long rowIndex = OsObject.createRow(realm.sharedRealm, table);
        cache.put(object, rowIndex);
        String realmGet$name = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$pathname = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$pathname();
        if (realmGet$pathname != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.pathnameIndex, rowIndex, realmGet$pathname, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.pathnameIndex, rowIndex, false);
        }
        String realmGet$datetime = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$datetime();
        if (realmGet$datetime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.datetimeIndex, rowIndex, realmGet$datetime, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.datetimeIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        long tableNativePtr = table.getNativePtr();
        UploadHistoryRealmModelColumnInfo columnInfo = (UploadHistoryRealmModelColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        org.fossasia.phimpme.data.local.UploadHistoryRealmModel object = null;
        while (objects.hasNext()) {
            object = (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = OsObject.createRow(realm.sharedRealm, table);
                cache.put(object, rowIndex);
                String realmGet$name = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
                }
                String realmGet$pathname = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$pathname();
                if (realmGet$pathname != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.pathnameIndex, rowIndex, realmGet$pathname, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.pathnameIndex, rowIndex, false);
                }
                String realmGet$datetime = ((UploadHistoryRealmModelRealmProxyInterface)object).realmGet$datetime();
                if (realmGet$datetime != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.datetimeIndex, rowIndex, realmGet$datetime, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.datetimeIndex, rowIndex, false);
                }
            }
        }
    }

    public static org.fossasia.phimpme.data.local.UploadHistoryRealmModel createDetachedCopy(org.fossasia.phimpme.data.local.UploadHistoryRealmModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        org.fossasia.phimpme.data.local.UploadHistoryRealmModel unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (org.fossasia.phimpme.data.local.UploadHistoryRealmModel)cachedObject.object;
            } else {
                unmanagedObject = (org.fossasia.phimpme.data.local.UploadHistoryRealmModel)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new org.fossasia.phimpme.data.local.UploadHistoryRealmModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((UploadHistoryRealmModelRealmProxyInterface) unmanagedObject).realmSet$name(((UploadHistoryRealmModelRealmProxyInterface) realmObject).realmGet$name());
        ((UploadHistoryRealmModelRealmProxyInterface) unmanagedObject).realmSet$pathname(((UploadHistoryRealmModelRealmProxyInterface) realmObject).realmGet$pathname());
        ((UploadHistoryRealmModelRealmProxyInterface) unmanagedObject).realmSet$datetime(((UploadHistoryRealmModelRealmProxyInterface) realmObject).realmGet$datetime());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UploadHistoryRealmModel = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{pathname:");
        stringBuilder.append(realmGet$pathname() != null ? realmGet$pathname() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{datetime:");
        stringBuilder.append(realmGet$datetime() != null ? realmGet$datetime() : "null");
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
        UploadHistoryRealmModelRealmProxy aUploadHistoryRealmModel = (UploadHistoryRealmModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUploadHistoryRealmModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUploadHistoryRealmModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUploadHistoryRealmModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
