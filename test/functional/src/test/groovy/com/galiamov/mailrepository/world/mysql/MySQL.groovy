package com.galiamov.mailrepository.world.mysql

import com.google.inject.BindingAnnotation
import com.netflix.governator.annotations.AutoBind

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER])
@BindingAnnotation
@AutoBind
@interface MySQL {

    String databaseName()

}
