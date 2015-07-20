package com.galiamov.mailrepository.world

import com.netflix.governator.annotations.AutoBindSingleton
import groovy.transform.CompileStatic

import javax.inject.Inject

@AutoBindSingleton
@CompileStatic
public class WorldWithDependencies {

    @Inject
    EmailRepository emailRepository

}
