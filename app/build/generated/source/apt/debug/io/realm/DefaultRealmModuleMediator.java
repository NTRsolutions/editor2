package io.realm;


import android.util.JsonReader;
import io.realm.RealmObjectSchema;
import io.realm.internal.ColumnInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>();
        modelClasses.add(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class);
        modelClasses.add(org.fossasia.phimpme.data.local.AccountDatabase.class);
        modelClasses.add(org.fossasia.phimpme.data.local.ImageDescModel.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public RealmObjectSchema createRealmObjectSchema(Class<? extends RealmModel> clazz, RealmSchema realmSchema) {
        checkClass(clazz);

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            return io.realm.UploadHistoryRealmModelRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            return io.realm.AccountDatabaseRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            return io.realm.ImageDescModelRealmProxy.createRealmObjectSchema(realmSchema);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public ColumnInfo validateTable(Class<? extends RealmModel> clazz, SharedRealm sharedRealm, boolean allowExtraColumns) {
        checkClass(clazz);

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            return io.realm.UploadHistoryRealmModelRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            return io.realm.AccountDatabaseRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            return io.realm.ImageDescModelRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            return io.realm.UploadHistoryRealmModelRealmProxy.getFieldNames();
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            return io.realm.AccountDatabaseRealmProxy.getFieldNames();
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            return io.realm.ImageDescModelRealmProxy.getFieldNames();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getTableName(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            return io.realm.UploadHistoryRealmModelRealmProxy.getTableName();
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            return io.realm.AccountDatabaseRealmProxy.getTableName();
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            return io.realm.ImageDescModelRealmProxy.getTableName();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
                return clazz.cast(new io.realm.UploadHistoryRealmModelRealmProxy());
            }
            if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
                return clazz.cast(new io.realm.AccountDatabaseRealmProxy());
            }
            if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
                return clazz.cast(new io.realm.ImageDescModelRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            return clazz.cast(io.realm.UploadHistoryRealmModelRealmProxy.copyOrUpdate(realm, (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) obj, update, cache));
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            return clazz.cast(io.realm.AccountDatabaseRealmProxy.copyOrUpdate(realm, (org.fossasia.phimpme.data.local.AccountDatabase) obj, update, cache));
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            return clazz.cast(io.realm.ImageDescModelRealmProxy.copyOrUpdate(realm, (org.fossasia.phimpme.data.local.ImageDescModel) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            io.realm.UploadHistoryRealmModelRealmProxy.insert(realm, (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) object, cache);
        } else if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            io.realm.AccountDatabaseRealmProxy.insert(realm, (org.fossasia.phimpme.data.local.AccountDatabase) object, cache);
        } else if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            io.realm.ImageDescModelRealmProxy.insert(realm, (org.fossasia.phimpme.data.local.ImageDescModel) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
                io.realm.UploadHistoryRealmModelRealmProxy.insert(realm, (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) object, cache);
            } else if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
                io.realm.AccountDatabaseRealmProxy.insert(realm, (org.fossasia.phimpme.data.local.AccountDatabase) object, cache);
            } else if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
                io.realm.ImageDescModelRealmProxy.insert(realm, (org.fossasia.phimpme.data.local.ImageDescModel) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
                    io.realm.UploadHistoryRealmModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
                    io.realm.AccountDatabaseRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
                    io.realm.ImageDescModelRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            io.realm.UploadHistoryRealmModelRealmProxy.insertOrUpdate(realm, (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) obj, cache);
        } else if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            io.realm.AccountDatabaseRealmProxy.insertOrUpdate(realm, (org.fossasia.phimpme.data.local.AccountDatabase) obj, cache);
        } else if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            io.realm.ImageDescModelRealmProxy.insertOrUpdate(realm, (org.fossasia.phimpme.data.local.ImageDescModel) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
                io.realm.UploadHistoryRealmModelRealmProxy.insertOrUpdate(realm, (org.fossasia.phimpme.data.local.UploadHistoryRealmModel) object, cache);
            } else if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
                io.realm.AccountDatabaseRealmProxy.insertOrUpdate(realm, (org.fossasia.phimpme.data.local.AccountDatabase) object, cache);
            } else if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
                io.realm.ImageDescModelRealmProxy.insertOrUpdate(realm, (org.fossasia.phimpme.data.local.ImageDescModel) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
                    io.realm.UploadHistoryRealmModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
                    io.realm.AccountDatabaseRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
                    io.realm.ImageDescModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            return clazz.cast(io.realm.UploadHistoryRealmModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            return clazz.cast(io.realm.AccountDatabaseRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            return clazz.cast(io.realm.ImageDescModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            return clazz.cast(io.realm.UploadHistoryRealmModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            return clazz.cast(io.realm.AccountDatabaseRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            return clazz.cast(io.realm.ImageDescModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(org.fossasia.phimpme.data.local.UploadHistoryRealmModel.class)) {
            return clazz.cast(io.realm.UploadHistoryRealmModelRealmProxy.createDetachedCopy((org.fossasia.phimpme.data.local.UploadHistoryRealmModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.AccountDatabase.class)) {
            return clazz.cast(io.realm.AccountDatabaseRealmProxy.createDetachedCopy((org.fossasia.phimpme.data.local.AccountDatabase) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(org.fossasia.phimpme.data.local.ImageDescModel.class)) {
            return clazz.cast(io.realm.ImageDescModelRealmProxy.createDetachedCopy((org.fossasia.phimpme.data.local.ImageDescModel) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
