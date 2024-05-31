package tech.intellispacesframework.samples.moduleproperties.model;

import tech.intellispacesframework.core.annotation.Data;
import tech.intellispacesframework.core.annotation.Domain;

@Data
@Domain
public interface Address {

  String city();

  String street();
}