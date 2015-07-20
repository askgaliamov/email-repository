package com.galiamov.mailrepository;

import org.apache.commons.dbcp.BasicDataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static com.galiamov.mailrepository.db.Tables.EMAIL_REPOSITORY;

public class EmailRepository {

    private static BasicDataSource ds;
    private static DSLContext ctx;

    static {
        ds = new BasicDataSource();
        Configurator.configure(ds);
        ctx = DSL.using(ds, SQLDialect.MYSQL);
    }

    static int insert(Email email) {
        return ctx.insertInto(EMAIL_REPOSITORY, EMAIL_REPOSITORY.EMAIL, EMAIL_REPOSITORY.REPOSITORY)
                .values(email.getEmail(), email.getRepository())
                .onDuplicateKeyIgnore()
                .execute();
    }

}
