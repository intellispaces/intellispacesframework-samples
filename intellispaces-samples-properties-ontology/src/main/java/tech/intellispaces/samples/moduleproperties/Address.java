package tech.intellispaces.samples.moduleproperties;

import tech.intellispaces.core.annotation.Data;
import tech.intellispaces.core.annotation.Domain;
import tech.intellispaces.core.annotation.Transition;

@Data
@Domain
public interface Address {

  @Transition("bb0a84a8-6aed-4235-86b7-0303da9bd6bc")
  String city();

  @Transition("30635fb7-2ec3-4bc9-b2d6-dc957de04c15")
  String street();
}
