package com.galiamov.mailrepository.stepdefs

import static cucumber.api.groovy.EN.Then
import static cucumber.api.groovy.EN.When

When(~'^User save some random email and repository$') { ->
    emailRepository.saveRandom()
}

Then(~'^Pair are sored$') { ->
    emailRepository.checkCurrentEmailStored()
}

Then(~'^Do not save the same email and repository$') { ->
    emailRepository.saveSame()
}

