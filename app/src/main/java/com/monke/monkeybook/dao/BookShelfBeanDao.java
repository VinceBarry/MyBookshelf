package com.monke.monkeybook.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.monke.monkeybook.bean.BookShelfBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_SHELF_BEAN".
*/
public class BookShelfBeanDao extends AbstractDao<BookShelfBean, String> {

    public static final String TABLENAME = "BOOK_SHELF_BEAN";

    /**
     * Properties of entity BookShelfBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property NoteUrl = new Property(0, String.class, "noteUrl", true, "NOTE_URL");
        public final static Property DurChapter = new Property(1, Integer.class, "durChapter", false, "DUR_CHAPTER");
        public final static Property DurChapterPage = new Property(2, Integer.class, "durChapterPage", false, "DUR_CHAPTER_PAGE");
        public final static Property FinalDate = new Property(3, Long.class, "finalDate", false, "FINAL_DATE");
        public final static Property HasUpdate = new Property(4, Boolean.class, "hasUpdate", false, "HAS_UPDATE");
        public final static Property NewChapters = new Property(5, Integer.class, "newChapters", false, "NEW_CHAPTERS");
        public final static Property Tag = new Property(6, String.class, "tag", false, "TAG");
        public final static Property SerialNumber = new Property(7, Integer.class, "serialNumber", false, "SERIAL_NUMBER");
        public final static Property FinalRefreshData = new Property(8, Long.class, "finalRefreshData", false, "FINAL_REFRESH_DATA");
        public final static Property Group = new Property(9, Integer.class, "group", false, "GROUP");
        public final static Property DurChapterName = new Property(10, String.class, "durChapterName", false, "DUR_CHAPTER_NAME");
        public final static Property LastChapterName = new Property(11, String.class, "lastChapterName", false, "LAST_CHAPTER_NAME");
        public final static Property ChapterListSize = new Property(12, Integer.class, "chapterListSize", false, "CHAPTER_LIST_SIZE");
        public final static Property CustomCoverPath = new Property(13, String.class, "customCoverPath", false, "CUSTOM_COVER_PATH");
        public final static Property AllowUpdate = new Property(14, Boolean.class, "allowUpdate", false, "ALLOW_UPDATE");
    }


    public BookShelfBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookShelfBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_SHELF_BEAN\" (" + //
                "\"NOTE_URL\" TEXT PRIMARY KEY NOT NULL ," + // 0: noteUrl
                "\"DUR_CHAPTER\" INTEGER," + // 1: durChapter
                "\"DUR_CHAPTER_PAGE\" INTEGER," + // 2: durChapterPage
                "\"FINAL_DATE\" INTEGER," + // 3: finalDate
                "\"HAS_UPDATE\" INTEGER," + // 4: hasUpdate
                "\"NEW_CHAPTERS\" INTEGER," + // 5: newChapters
                "\"TAG\" TEXT," + // 6: tag
                "\"SERIAL_NUMBER\" INTEGER," + // 7: serialNumber
                "\"FINAL_REFRESH_DATA\" INTEGER," + // 8: finalRefreshData
                "\"GROUP\" INTEGER," + // 9: group
                "\"DUR_CHAPTER_NAME\" TEXT," + // 10: durChapterName
                "\"LAST_CHAPTER_NAME\" TEXT," + // 11: lastChapterName
                "\"CHAPTER_LIST_SIZE\" INTEGER," + // 12: chapterListSize
                "\"CUSTOM_COVER_PATH\" TEXT," + // 13: customCoverPath
                "\"ALLOW_UPDATE\" INTEGER);"); // 14: allowUpdate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_SHELF_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookShelfBean entity) {
        stmt.clearBindings();
 
        String noteUrl = entity.getNoteUrl();
        if (noteUrl != null) {
            stmt.bindString(1, noteUrl);
        }
 
        Integer durChapter = entity.getDurChapter();
        if (durChapter != null) {
            stmt.bindLong(2, durChapter);
        }
 
        Integer durChapterPage = entity.getDurChapterPage();
        if (durChapterPage != null) {
            stmt.bindLong(3, durChapterPage);
        }
 
        Long finalDate = entity.getFinalDate();
        if (finalDate != null) {
            stmt.bindLong(4, finalDate);
        }
 
        Boolean hasUpdate = entity.getHasUpdate();
        if (hasUpdate != null) {
            stmt.bindLong(5, hasUpdate ? 1L: 0L);
        }
 
        Integer newChapters = entity.getNewChapters();
        if (newChapters != null) {
            stmt.bindLong(6, newChapters);
        }
 
        String tag = entity.getTag();
        if (tag != null) {
            stmt.bindString(7, tag);
        }
 
        Integer serialNumber = entity.getSerialNumber();
        if (serialNumber != null) {
            stmt.bindLong(8, serialNumber);
        }
 
        Long finalRefreshData = entity.getFinalRefreshData();
        if (finalRefreshData != null) {
            stmt.bindLong(9, finalRefreshData);
        }
 
        Integer group = entity.getGroup();
        if (group != null) {
            stmt.bindLong(10, group);
        }
 
        String durChapterName = entity.getDurChapterName();
        if (durChapterName != null) {
            stmt.bindString(11, durChapterName);
        }
 
        String lastChapterName = entity.getLastChapterName();
        if (lastChapterName != null) {
            stmt.bindString(12, lastChapterName);
        }
 
        Integer chapterListSize = entity.getChapterListSize();
        if (chapterListSize != null) {
            stmt.bindLong(13, chapterListSize);
        }
 
        String customCoverPath = entity.getCustomCoverPath();
        if (customCoverPath != null) {
            stmt.bindString(14, customCoverPath);
        }
 
        Boolean allowUpdate = entity.getAllowUpdate();
        if (allowUpdate != null) {
            stmt.bindLong(15, allowUpdate ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookShelfBean entity) {
        stmt.clearBindings();
 
        String noteUrl = entity.getNoteUrl();
        if (noteUrl != null) {
            stmt.bindString(1, noteUrl);
        }
 
        Integer durChapter = entity.getDurChapter();
        if (durChapter != null) {
            stmt.bindLong(2, durChapter);
        }
 
        Integer durChapterPage = entity.getDurChapterPage();
        if (durChapterPage != null) {
            stmt.bindLong(3, durChapterPage);
        }
 
        Long finalDate = entity.getFinalDate();
        if (finalDate != null) {
            stmt.bindLong(4, finalDate);
        }
 
        Boolean hasUpdate = entity.getHasUpdate();
        if (hasUpdate != null) {
            stmt.bindLong(5, hasUpdate ? 1L: 0L);
        }
 
        Integer newChapters = entity.getNewChapters();
        if (newChapters != null) {
            stmt.bindLong(6, newChapters);
        }
 
        String tag = entity.getTag();
        if (tag != null) {
            stmt.bindString(7, tag);
        }
 
        Integer serialNumber = entity.getSerialNumber();
        if (serialNumber != null) {
            stmt.bindLong(8, serialNumber);
        }
 
        Long finalRefreshData = entity.getFinalRefreshData();
        if (finalRefreshData != null) {
            stmt.bindLong(9, finalRefreshData);
        }
 
        Integer group = entity.getGroup();
        if (group != null) {
            stmt.bindLong(10, group);
        }
 
        String durChapterName = entity.getDurChapterName();
        if (durChapterName != null) {
            stmt.bindString(11, durChapterName);
        }
 
        String lastChapterName = entity.getLastChapterName();
        if (lastChapterName != null) {
            stmt.bindString(12, lastChapterName);
        }
 
        Integer chapterListSize = entity.getChapterListSize();
        if (chapterListSize != null) {
            stmt.bindLong(13, chapterListSize);
        }
 
        String customCoverPath = entity.getCustomCoverPath();
        if (customCoverPath != null) {
            stmt.bindString(14, customCoverPath);
        }
 
        Boolean allowUpdate = entity.getAllowUpdate();
        if (allowUpdate != null) {
            stmt.bindLong(15, allowUpdate ? 1L: 0L);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookShelfBean readEntity(Cursor cursor, int offset) {
        BookShelfBean entity = new BookShelfBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // noteUrl
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // durChapter
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // durChapterPage
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // finalDate
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // hasUpdate
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // newChapters
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // tag
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // serialNumber
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // finalRefreshData
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // group
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // durChapterName
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // lastChapterName
            cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12), // chapterListSize
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // customCoverPath
            cursor.isNull(offset + 14) ? null : cursor.getShort(offset + 14) != 0 // allowUpdate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookShelfBean entity, int offset) {
        entity.setNoteUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setDurChapter(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setDurChapterPage(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setFinalDate(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setHasUpdate(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setNewChapters(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setTag(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSerialNumber(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setFinalRefreshData(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setGroup(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setDurChapterName(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setLastChapterName(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setChapterListSize(cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12));
        entity.setCustomCoverPath(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setAllowUpdate(cursor.isNull(offset + 14) ? null : cursor.getShort(offset + 14) != 0);
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookShelfBean entity, long rowId) {
        return entity.getNoteUrl();
    }
    
    @Override
    public String getKey(BookShelfBean entity) {
        if(entity != null) {
            return entity.getNoteUrl();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookShelfBean entity) {
        return entity.getNoteUrl() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
