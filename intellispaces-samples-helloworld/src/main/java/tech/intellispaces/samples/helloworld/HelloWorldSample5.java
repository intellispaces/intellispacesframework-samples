package tech.intellispaces.samples.helloworld;

import intellispaces.ixora.cli.Console;
import intellispaces.ixora.cli.MovableConsoleHandle;
import tech.intellispaces.core.IntellispacesFramework;
import tech.intellispaces.core.annotation.Inject;
import tech.intellispaces.core.annotation.Module;
import tech.intellispaces.core.annotation.Startup;
import tech.intellispaces.core.space.transition.TransitionFunctions;
import tech.intellispaces.ixora.cli.CliConfiguration;

/**
 * This module demonstrates the output to the console.<p/>
 *
 * Unit {@link CliConfiguration} is included to this module. In this unit the projection with name 'console' and referred to module CLI console is defined.
 */
@Module(units = CliConfiguration.class)
public class HelloWorldSample5 {

  /**
   * This method will be invoked automatically after the module is started.<p/>
   *
   * The values of method arguments will be injected automatically.
   *
   * @param console value of the projection named 'console'.
   */
  @Startup
  public void startup(@Inject MovableConsoleHandle console) {
    // Get identifier of the transition 'Console::println'
    String tid = TransitionFunctions.getTransitionId(Console.class, Console::println, "");

    // Move CLI console through transition defined by ID tid
    console.moveThru(tid, "Hello, world!");
  }

  /**
   * In the main method, we load and run the IntelliSpaces framework module.
   */
  public static void main(String[] args) {
    IntellispacesFramework.loadModule(HelloWorldSample5.class, args);
  }
}
