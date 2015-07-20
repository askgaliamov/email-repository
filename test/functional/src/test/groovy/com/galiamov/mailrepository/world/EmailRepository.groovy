package com.galiamov.mailrepository.world

import com.galiamov.mailrepository.world.mysql.MySQL
import com.google.inject.Inject
import com.netflix.governator.annotations.AutoBindSingleton
import groovy.sql.Sql
import groovyx.net.http.RESTClient

import static groovyx.net.http.ContentType.JSON

@AutoBindSingleton
public class EmailRepository {

    def client = new RESTClient('http://localhost:4567/')
    def random = new Random()

    def String currentEmail

    @Inject
    @MySQL(databaseName = "email_repository")
    private Sql emailRepositorySql

    def saveRandom() {
        currentEmail = createEmail()
        def ans = client.post(
                path: 'emails',
                body: [email: currentEmail, repository: 'repository_name'],
                requestContentType: JSON
            )
        assert ans.status == 200
        assert ans.data == """{"added":1}"""
    }

    def saveSame() {
        def ans = client.post(
                path: 'emails',
                body: [email: currentEmail, repository: 'repository_name'],
                requestContentType: JSON
            )
        assert ans.status == 200
        assert ans.data == """{"added":0}"""
    }

    def checkCurrentEmailStored() {
        def storedEmail = emailRepositorySql.firstRow "select email from email_repository where email = ${currentEmail}"
        assert storedEmail != null
    }


    def String createEmail() {
        "user_${System.currentTimeMillis()}_${random.nextInt()}@test.com"
    }

}
