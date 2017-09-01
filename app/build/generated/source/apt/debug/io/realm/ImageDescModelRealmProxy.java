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

public class ImageDescModelRealmProxy extends org.fossasia.phimpme.data.local.ImageDescModel
    implements RealmObjectProxy, ImageDescModelRealmProxyInterface {

    static final class ImageDescModelColumnInfo extends ColumnInfo {
        long pathIndex;
        long descIndex;

        ImageDescModelColumnInfo(SharedRealm realm, Table table) {
            super(2);
            this.pathIndex = addColumnDetails(table, "path", RealmFieldType.STRING);
            this.descIndex = addColumnDetails(table, "desc", RealmFieldType.STRING);
        }

        ImageDescModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ImageDescModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ImageDescModelColumnInfo src = (ImageDescModelColumnInfo) rawSrc;
            final ImageDescModelColumnInfo dst = (ImageDescModelColumnInfo) rawDst;
            dst.pathIndex = src.pathIndex;
            dst.descIndex = src.descIndex;
        }
    }

    private ImageDescModelColumnInfo columnInfo;
    private ProxyState<org.fossasia.phimpme.data.local.ImageDescModel> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("path");
        fieldNames.add("desc");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    ImageDescModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ImageDescModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<org.fossasia.phimpme.data.local.ImageDescModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$path() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.pathIndex);
    }

    @Override
    public void realmSet$path(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'path' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$desc() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.descIndex);
    }

    @Override
    public void realmSet$desc(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.descIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.descIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.descIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.descIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("ImageDescModel")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("ImageDescModel");
            realmObjectSchema.add("path", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("desc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("ImageDescModel");
    }

    public static ImageDescModelColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_ImageDescModel")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'ImageDescModel' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_ImageDescModel");
        final long columnCount = table.getColumnCount();
        if (columnCount != 2) {
            if (columnCount < 2) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 2 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 2 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 2 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final ImageDescModelColumnInfo columnInfo = new ImageDescModelColumnInfo(sharedRealm, table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'path' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.pathIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field path");
            }
        }

        if (!columnTypes.containsKey("path")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'path' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("path") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'path' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.pathIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"@PrimaryKey field 'path' does not support null values in the existing Realm file. Migrate using RealmObjectSchema.setNullable(), or mark the field as @Required.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("path"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'path' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("desc")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'desc' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("desc") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'desc' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.descIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'desc' is required. Either set @Required to field 'desc' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_ImageDescModel";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static org.fossasia.phimpme.data.local.ImageDescModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        org.fossasia.phimpme.data.local.ImageDescModel obj = null;
        if (update) {
            Table table = realm.getTable(org.fossasia.phimpme.data.local.ImageDescModel.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("path")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("path"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.ImageDescModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.ImageDescModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("path")) {
                if (json.isNull("path")) {
                    obj = (io.realm.ImageDescModelRealmProxy) realm.createObjectInternal(org.fossasia.phimpme.data.local.ImageDescModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.ImageDescModelRealmProxy) realm.createObjectInternal(org.fossasia.phimpme.data.local.ImageDescModel.class, json.getString("path"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'path'.");
            }
        }
        if (json.has("desc")) {
            if (json.isNull("desc")) {
                ((ImageDescModelRealmProxyInterface) obj).realmSet$desc(null);
            } else {
                ((ImageDescModelRealmProxyInterface) obj).realmSet$desc((String) json.getString("desc"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static org.fossasia.phimpme.data.local.ImageDescModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        org.fossasia.phimpme.data.local.ImageDescModel obj = new org.fossasia.phimpme.data.local.ImageDescModel();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("path")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ImageDescModelRealmProxyInterface) obj).realmSet$path(null);
                } else {
                    ((ImageDescModelRealmProxyInterface) obj).realmSet$path((String) reader.nextString());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("desc")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((ImageDescModelRealmProxyInterface) obj).realmSet$desc(null);
                } else {
                    ((ImageDescModelRealmProxyInterface) obj).realmSet$desc((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'path'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static org.fossasia.phimpme.data.local.ImageDescModel copyOrUpdate(Realm realm, org.fossasia.phimpme.data.local.ImageDescModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (org.fossasia.phimpme.data.local.ImageDescModel) cachedRealmObject;
        } else {
            org.fossasia.phimpme.data.local.ImageDescModel realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(org.fossasia.phimpme.data.local.ImageDescModel.class);
                long pkColumnIndex = table.getPrimaryKey();
                String value = ((ImageDescModelRealmProxyInterface) object).realmGet$path();
                long rowIndex = Table.NO_MATCH;
                if (value == null) {
                    rowIndex = table.findFirstNull(pkColumnIndex);
                } else {
                    rowIndex = table.findFirstString(pkColumnIndex, value);
                }
                if (rowIndex != Table.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.ImageDescModel.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.ImageDescModelRealmProxy();
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

    public static org.fossasia.phimpme.data.local.ImageDescModel copy(Realm realm, org.fossasia.phimpme.data.local.ImageDescModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (org.fossasia.phimpme.data.local.ImageDescModel) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            org.fossasia.phimpme.data.local.ImageDescModel realmObject = realm.createObjectInternal(org.fossasia.phimpme.data.local.ImageDescModel.class, ((ImageDescModelRealmProxyInterface) newObject).realmGet$path(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((ImageDescModelRealmProxyInterface) realmObject).realmSet$desc(((ImageDescModelRealmProxyInterface) newObject).realmGet$desc());
            return realmObject;
        }
    }

    public static long insert(Realm realm, org.fossasia.phimpme.data.local.ImageDescModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(org.fossasia.phimpme.data.local.ImageDescModel.class);
        long tableNativePtr = table.getNativePtr();
        ImageDescModelColumnInfo columnInfo = (ImageDescModelColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.ImageDescModel.class);
        long pkColumnIndex = table.getPrimaryKey();
        String primaryKeyValue = ((ImageDescModelRealmProxyInterface) object).realmGet$path();
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
        String realmGet$desc = ((ImageDescModelRealmProxyInterface)object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(org.fossasia.phimpme.data.local.ImageDescModel.class);
        long tableNativePtr = table.getNativePtr();
        ImageDescModelColumnInfo columnInfo = (ImageDescModelColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.ImageDescModel.class);
        long pkColumnIndex = table.getPrimaryKey();
        org.fossasia.phimpme.data.local.ImageDescModel object = null;
        while (objects.hasNext()) {
            object = (org.fossasia.phimpme.data.local.ImageDescModel) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                String primaryKeyValue = ((ImageDescModelRealmProxyInterface) object).realmGet$path();
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
                String realmGet$desc = ((ImageDescModelRealmProxyInterface)object).realmGet$desc();
                if (realmGet$desc != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, org.fossasia.phimpme.data.local.ImageDescModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(org.fossasia.phimpme.data.local.ImageDescModel.class);
        long tableNativePtr = table.getNativePtr();
        ImageDescModelColumnInfo columnInfo = (ImageDescModelColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.ImageDescModel.class);
        long pkColumnIndex = table.getPrimaryKey();
        String primaryKeyValue = ((ImageDescModelRealmProxyInterface) object).realmGet$path();
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
        String realmGet$desc = ((ImageDescModelRealmProxyInterface)object).realmGet$desc();
        if (realmGet$desc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(org.fossasia.phimpme.data.local.ImageDescModel.class);
        long tableNativePtr = table.getNativePtr();
        ImageDescModelColumnInfo columnInfo = (ImageDescModelColumnInfo) realm.schema.getColumnInfo(org.fossasia.phimpme.data.local.ImageDescModel.class);
        long pkColumnIndex = table.getPrimaryKey();
        org.fossasia.phimpme.data.local.ImageDescModel object = null;
        while (objects.hasNext()) {
            object = (org.fossasia.phimpme.data.local.ImageDescModel) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                String primaryKeyValue = ((ImageDescModelRealmProxyInterface) object).realmGet$path();
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
                String realmGet$desc = ((ImageDescModelRealmProxyInterface)object).realmGet$desc();
                if (realmGet$desc != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.descIndex, rowIndex, realmGet$desc, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.descIndex, rowIndex, false);
                }
            }
        }
    }

    public static org.fossasia.phimpme.data.local.ImageDescModel createDetachedCopy(org.fossasia.phimpme.data.local.ImageDescModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        org.fossasia.phimpme.data.local.ImageDescModel unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (org.fossasia.phimpme.data.local.ImageDescModel)cachedObject.object;
            } else {
                unmanagedObject = (org.fossasia.phimpme.data.local.ImageDescModel)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new org.fossasia.phimpme.data.local.ImageDescModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((ImageDescModelRealmProxyInterface) unmanagedObject).realmSet$path(((ImageDescModelRealmProxyInterface) realmObject).realmGet$path());
        ((ImageDescModelRealmProxyInterface) unmanagedObject).realmSet$desc(((ImageDescModelRealmProxyInterface) realmObject).realmGet$desc());
        return unmanagedObject;
    }

    static org.fossasia.phimpme.data.local.ImageDescModel update(Realm realm, org.fossasia.phimpme.data.local.ImageDescModel realmObject, org.fossasia.phimpme.data.local.ImageDescModel newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((ImageDescModelRealmProxyInterface) realmObject).realmSet$desc(((ImageDescModelRealmProxyInterface) newObject).realmGet$desc());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ImageDescModel = proxy[");
        stringBuilder.append("{path:");
        stringBuilder.append(realmGet$path() != null ? realmGet$path() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{desc:");
        stringBuilder.append(realmGet$desc() != null ? realmGet$desc() : "null");
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
        ImageDescModelRealmProxy aImageDescModel = (ImageDescModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aImageDescModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aImageDescModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aImageDescModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
