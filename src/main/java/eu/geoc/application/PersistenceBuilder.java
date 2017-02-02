package eu.geoc.application;

/**
 * Copyright (C) 2016 Geotec. All right reserved.
 * Created by German Mendoza on 15/09/2016.
 */

public class PersistenceBuilder {
    private static PersistenceBuilder instance = null;

    public synchronized static PersistenceBuilder getInstance() {
        if (instance == null) {
            instance = new PersistenceBuilder();
        }
        return instance;
    }

    private MongoDatabaseManager mongoDatabaseManager;

    private PersistenceBuilder() {
    }

    public void defInit() {
        MongoDatabaseManager.MongoDBManagerConfig configsMGDB = new MongoDatabaseManager.MongoDBManagerConfig(
                "127.0.0.1", 27017, "surveys", "mainCollection");
        mongoDatabaseManager = new MongoDatabaseManager(configsMGDB);
    }

    public MongoDatabaseManager getMongoDatabaseManager() {
        return mongoDatabaseManager;
    }
}
