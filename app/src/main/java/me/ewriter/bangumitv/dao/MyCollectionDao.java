package me.ewriter.bangumitv.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MY_COLLECTION".
*/
public class MyCollectionDao extends AbstractDao<MyCollection, Long> {

    public static final String TABLENAME = "MY_COLLECTION";

    /**
     * Properties of entity MyCollection.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Collection_type = new Property(1, String.class, "collection_type", false, "COLLECTION_TYPE");
        public final static Property Category = new Property(2, String.class, "category", false, "CATEGORY");
        public final static Property Link_url = new Property(3, String.class, "link_url", false, "LINK_URL");
        public final static Property Image_url = new Property(4, String.class, "image_url", false, "IMAGE_URL");
        public final static Property Large_image_url = new Property(5, String.class, "large_image_url", false, "LARGE_IMAGE_URL");
        public final static Property Normal_name = new Property(6, String.class, "normal_name", false, "NORMAL_NAME");
        public final static Property Small_name = new Property(7, String.class, "small_name", false, "SMALL_NAME");
        public final static Property Info = new Property(8, String.class, "info", false, "INFO");
        public final static Property Rate_number = new Property(9, String.class, "rate_number", false, "RATE_NUMBER");
        public final static Property Rate_total = new Property(10, String.class, "rate_total", false, "RATE_TOTAL");
        public final static Property Comment = new Property(11, String.class, "comment", false, "COMMENT");
        public final static Property Air_day = new Property(12, String.class, "air_day", false, "AIR_DAY");
    };


    public MyCollectionDao(DaoConfig config) {
        super(config);
    }
    
    public MyCollectionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MY_COLLECTION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"COLLECTION_TYPE\" TEXT," + // 1: collection_type
                "\"CATEGORY\" TEXT," + // 2: category
                "\"LINK_URL\" TEXT," + // 3: link_url
                "\"IMAGE_URL\" TEXT," + // 4: image_url
                "\"LARGE_IMAGE_URL\" TEXT," + // 5: large_image_url
                "\"NORMAL_NAME\" TEXT," + // 6: normal_name
                "\"SMALL_NAME\" TEXT," + // 7: small_name
                "\"INFO\" TEXT," + // 8: info
                "\"RATE_NUMBER\" TEXT," + // 9: rate_number
                "\"RATE_TOTAL\" TEXT," + // 10: rate_total
                "\"COMMENT\" TEXT," + // 11: comment
                "\"AIR_DAY\" TEXT);"); // 12: air_day
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MY_COLLECTION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MyCollection entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String collection_type = entity.getCollection_type();
        if (collection_type != null) {
            stmt.bindString(2, collection_type);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(3, category);
        }
 
        String link_url = entity.getLink_url();
        if (link_url != null) {
            stmt.bindString(4, link_url);
        }
 
        String image_url = entity.getImage_url();
        if (image_url != null) {
            stmt.bindString(5, image_url);
        }
 
        String large_image_url = entity.getLarge_image_url();
        if (large_image_url != null) {
            stmt.bindString(6, large_image_url);
        }
 
        String normal_name = entity.getNormal_name();
        if (normal_name != null) {
            stmt.bindString(7, normal_name);
        }
 
        String small_name = entity.getSmall_name();
        if (small_name != null) {
            stmt.bindString(8, small_name);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(9, info);
        }
 
        String rate_number = entity.getRate_number();
        if (rate_number != null) {
            stmt.bindString(10, rate_number);
        }
 
        String rate_total = entity.getRate_total();
        if (rate_total != null) {
            stmt.bindString(11, rate_total);
        }
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(12, comment);
        }
 
        String air_day = entity.getAir_day();
        if (air_day != null) {
            stmt.bindString(13, air_day);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MyCollection entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String collection_type = entity.getCollection_type();
        if (collection_type != null) {
            stmt.bindString(2, collection_type);
        }
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(3, category);
        }
 
        String link_url = entity.getLink_url();
        if (link_url != null) {
            stmt.bindString(4, link_url);
        }
 
        String image_url = entity.getImage_url();
        if (image_url != null) {
            stmt.bindString(5, image_url);
        }
 
        String large_image_url = entity.getLarge_image_url();
        if (large_image_url != null) {
            stmt.bindString(6, large_image_url);
        }
 
        String normal_name = entity.getNormal_name();
        if (normal_name != null) {
            stmt.bindString(7, normal_name);
        }
 
        String small_name = entity.getSmall_name();
        if (small_name != null) {
            stmt.bindString(8, small_name);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(9, info);
        }
 
        String rate_number = entity.getRate_number();
        if (rate_number != null) {
            stmt.bindString(10, rate_number);
        }
 
        String rate_total = entity.getRate_total();
        if (rate_total != null) {
            stmt.bindString(11, rate_total);
        }
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(12, comment);
        }
 
        String air_day = entity.getAir_day();
        if (air_day != null) {
            stmt.bindString(13, air_day);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MyCollection readEntity(Cursor cursor, int offset) {
        MyCollection entity = new MyCollection( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // collection_type
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // category
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // link_url
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // image_url
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // large_image_url
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // normal_name
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // small_name
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // info
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // rate_number
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // rate_total
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // comment
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // air_day
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MyCollection entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCollection_type(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCategory(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLink_url(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImage_url(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLarge_image_url(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setNormal_name(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSmall_name(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setInfo(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setRate_number(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRate_total(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setComment(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setAir_day(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MyCollection entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MyCollection entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
